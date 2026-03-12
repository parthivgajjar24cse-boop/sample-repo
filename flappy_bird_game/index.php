<!DOCTYPE html>
<html>
<head>
<title>Flappy Bird - PHP Version</title>
<style>
body{
    text-align:center;
    background:#70c5ce;
    font-family:Arial;
}
canvas{
    background:#fff;
    border:2px solid #000;
}
</style>
</head>
<body>

<h2>Flappy Bird (PHP + JS)</h2>
<canvas id="game" width="400" height="500"></canvas>

<script>

const canvas = document.getElementById("game");
const ctx = canvas.getContext("2d");

let bird = {
    x: 50,
    y: 150,
    width: 30,
    height: 30,
    gravity: 0.6,
    lift: -10,
    velocity: 0
};

let pipes = [];
let frame = 0;
let score = 0;

document.addEventListener("keydown", function(e){
    if(e.code === "Space"){
        bird.velocity = bird.lift;
    }
});

function drawBird(){
    ctx.fillStyle = "yellow";
    ctx.fillRect(bird.x, bird.y, bird.width, bird.height);
}

function drawPipes(){
    pipes.forEach(pipe => {
        ctx.fillStyle = "green";
        ctx.fillRect(pipe.x, 0, pipe.width, pipe.top);
        ctx.fillRect(pipe.x, pipe.bottom, pipe.width, canvas.height);

        pipe.x -= 2;

        if(pipe.x + pipe.width < 0){
            pipes.shift();
            score++;
        }

        // collision
        if(
            bird.x < pipe.x + pipe.width &&
            bird.x + bird.width > pipe.x &&
            (bird.y < pipe.top || bird.y + bird.height > pipe.bottom)
        ){
            gameOver();
        }
    });
}

function gameOver(){
    fetch("save_score.php?score="+score);
    alert("Game Over! Score: " + score);
    location.reload();
}

function update(){
    ctx.clearRect(0,0,canvas.width,canvas.height);

    bird.velocity += bird.gravity;
    bird.y += bird.velocity;

    if(bird.y + bird.height >= canvas.height){
        gameOver();
    }

    if(frame % 90 === 0){
        let gap = 120;
        let top = Math.random()*200+50;

        pipes.push({
            x: canvas.width,
            width: 50,
            top: top,
            bottom: top + gap
        });
    }

    drawBird();
    drawPipes();

    ctx.fillStyle="black";
    ctx.fillText("Score: "+score,10,20);

    frame++;
    requestAnimationFrame(update);
}

update();

</script>

</body>
</html>
