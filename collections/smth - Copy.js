//

var game = {};

game.snake = {};

game.snake.x = 0;
game.snake.y = 0;
game.snake.direction = "right";
game.snake.length = 10;
game.snake.body = [];
game.snake.body.push([game.snake.x, game.snake.y]);
game.snake.color = "black";
game.snake.speed = 10;
game.snake.alive = true;
game.snake.score = 0;

game.food = {};
game.food.x = 0;
game.food.y = 0;
game.food.color = "green";

game.food.generate = function () {
  game.food.x = Math.floor(Math.random() * (canvas.width - 10));
  game.food.y = Math.floor(Math.random() * (canvas.height - 10));
};

game.food.draw = function () {
  ctx.fillStyle = game.food.color;
  ctx.fillRect(game.food.x, game.food.y, 10, 10);
};

game.snake.generate = function () {
  game.snake.body.push([game.snake.x, game.snake.y]);
  game.snake.length++;
};

game.snake.move = function () {
  if (game.snake.direction === "right") {
    game.snake.x++;
  } else if (game.snake.direction === "left") {
    game.snake.x--;
  } else if (game.snake.direction === "up") {
    game.snake.y--;
  } else if (game.snake.direction === "down") {
    game.snake.y++;
  }
  game.snake.body.push([game.snake.x, game.snake.y]);
  game.snake.body.shift();
};

game.snake.eat = function () {
  if (game.snake.x === game.food.x && game.snake.y === game.food.y) {
    game.snake.generate();
    game.food.generate();
    game.snake.score++;
  }
};
