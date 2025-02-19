function setRating(value) {
    document.getElementById('estrelas').value = value;
    const stars = document.getElementsByClassName('star');
    for(let i = 0; i < stars.length; i++) {
        stars[i].style.color = i < value ? 'gold' : 'gray';
    }
} 