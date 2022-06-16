// variables catch by DOM
var number = document.getElementById("number");
var increment = document.getElementById("btn-increment");
var decrement = document.getElementById("btn-decrement");
var reset = document.getElementById("btn-reset");
let numberCounter = parseInt(number.innerHTML);

// function to change the color of the number
function changeNumberColor(numberCounter) {
    var color = "";
    if (numberCounter < 0) {
        color = "red";
    } else if (numberCounter > 0) {
        color = "green";
    } else {
        color = "#34495E";
    }
    return color;
}

// function when click in reset button 
reset.addEventListener("click", function () {
    number.innerHTML = 0;
    var n = number.textContent;
    number.style.color = changeNumberColor(n);
});


// function when click in increment button
increment.addEventListener("click", function () {
    numberCounter++;
    number.innerHTML = numberCounter.toString();
    number.style.color = changeNumberColor(numberCounter);
});

// function when click in decrement button
decrement.addEventListener("click", function () {
    numberCounter--;
    number.innerHTML = numberCounter.toString();
    number.style.color = changeNumberColor(numberCounter);
});