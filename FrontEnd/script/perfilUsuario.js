// function ligarDesliga(){

//     var imagem = document.getElementById('estrela').src;

//     var imagem_ligado = 'imgs/estrelaLigada.png';
//     var imagem_desligado = 'imgs/estrelaApagada.png';

//     if(imagem == imagem_ligado){
//         document.getElementById('estrela').src = imagem_desligado;
//     }
//     else{
//         document.getElementById('estrela').src = imagem_ligado;
//     }
// }
// document.getElementById("estrela").addEventListener("click", ligarDesliga);

function adicionarAmigo() {
    swal("Você enviou seu pedido de amizade, aguarde!")
}

function seguindo() {
    swal("Você começou a seguir este usuario!")
}

function avaliacao() {
    swal("Faça um comentario abaixo ou apenas avalie o usuario.")
}

function enviando() {
    window.alert("Sua avaliação foi enviada! Muito Obrigado pelo Feedback")
}

function Avaliar(estrela) {
    
    var url = window.location;
    url = url.toString()
    url = url.split("perfilAvaliacao.html");
    url = url[0];
   
    var s1 = document.getElementById("s1").src;
    var s2 = document.getElementById("s2").src;
    var s3 = document.getElementById("s3").src;
    var s4 = document.getElementById("s4").src;
    var s5 = document.getElementById("s5").src;
    var avaliacao = 0;
   
   if (estrela == 5){ 
    if (s5 == url + "img/star0.png") {
    document.getElementById("s1").src = "imgs/star1.png";
    document.getElementById("s2").src = "imgs/star1.png";
    document.getElementById("s3").src = "imgs/star1.png";
    document.getElementById("s4").src = "imgs/star1.png";
    document.getElementById("s5").src = "imgs/star1.png";
    avaliacao = 5;
    } else {
    document.getElementById("s1").src = "imgs/star1.png";
    document.getElementById("s2").src = "imgs/star1.png";
    document.getElementById("s3").src = "imgs/star1.png";
    document.getElementById("s4").src = "imgs/star1.png";
    document.getElementById("s5").src = "imgs/star1.png";
    avaliacao = 4;
   }}
    
    //ESTRELA 4
   if (estrela == 4){ 
    if (s4 == url + "img/star0.png") {
    document.getElementById("s1").src = "imgs/star1.png";
    document.getElementById("s2").src = "imgs/star1.png";
    document.getElementById("s3").src = "imgs/star1.png";
    document.getElementById("s4").src = "imgs/star1.png";
    document.getElementById("s5").src = "imgs/star0.png";
    avaliacao = 4;
    } else {
    document.getElementById("s1").src = "imgs/star1.png";
    document.getElementById("s2").src = "imgs/star1.png";
    document.getElementById("s3").src = "imgs/star1.png";
    document.getElementById("s4").src = "imgs/star1.png";
    document.getElementById("s5").src = "imgs/star0.png";
    avaliacao = 3;
   }}
   
   //ESTRELA 3
   if (estrela == 3){ 
    if (s3 == url + "img/star0.png") {
    document.getElementById("s1").src = "imgs/star1.png";
    document.getElementById("s2").src = "imgs/star1.png";
    document.getElementById("s3").src = "imgs/star1.png";
    document.getElementById("s4").src = "imgs/star0.png";
    document.getElementById("s5").src = "imgs/star0.png";
    avaliacao = 3;
    } else {
    document.getElementById("s1").src = "imgs/star1.png";
    document.getElementById("s2").src = "imgs/star1.png";
    document.getElementById("s3").src = "imgs/star1.png";
    document.getElementById("s4").src = "imgs/star0.png";
    document.getElementById("s5").src = "imgs/star0.png";
    avaliacao = 2;
   }}
    
   //ESTRELA 2
   if (estrela == 2){ 
    if (s2 == url + "img/star0.png") {
    document.getElementById("s1").src = "imgs/star1.png";
    document.getElementById("s2").src = "imgs/star1.png";
    document.getElementById("s3").src = "imgs/star0.png";
    document.getElementById("s4").src = "imgs/star0.png";
    document.getElementById("s5").src = "imgs/star0.png";
    avaliacao = 2;
    } else {
    document.getElementById("s1").src = "imgs/star1.png";
    document.getElementById("s2").src = "imgs/star1.png";
    document.getElementById("s3").src = "imgs/star0.png";
    document.getElementById("s4").src = "imgs/star0.png";
    document.getElementById("s5").src = "imgs/star0.png";
    avaliacao = 1;
   }}
    
    //ESTRELA 1
   if (estrela == 1){ 
    if (s1 == url + "img/star0.png") {
    document.getElementById("s1").src = "imgs/star1.png";
    document.getElementById("s2").src = "imgs/star0.png";
    document.getElementById("s3").src = "imgs/star0.png";
    document.getElementById("s4").src = "imgs/star0.png";
    document.getElementById("s5").src = "imgs/star0.png";
    avaliacao = 1;
    } else {
    document.getElementById("s1").src = "imgs/star1.png";
    document.getElementById("s2").src = "imgs/star0.png";
    document.getElementById("s3").src = "imgs/star0.png";
    document.getElementById("s4").src = "imgs/star0.png";
    document.getElementById("s5").src = "imgs/star0.png";
    avaliacao = 0;
   }}

}





