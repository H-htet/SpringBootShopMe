//(condition) ? exp1 : exp2; // ternary operator

/*let men=false;
let gender=(men) ? 'He is a man' : 'We dont know';
console.log(gender);*/


let age=20;
let men=true;
if(age<20){
    men=false;
}else{
    men=true;
}

let gender=(men) ? 'He is a man' : 'We dont know';
console.log(gender);