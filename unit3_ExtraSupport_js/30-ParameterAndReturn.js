function print(){
    console.log('This function not return')
}


/*function add(a,b,c){
    let result = a+b+c;
    //console.log(a);
    //return result;
    console.log(result);
}

//console.log(add(1));//result ga NaN// b nae c ga undefined
//console.log(add(1,2,4));
add(1,2,3);
print();
//data tway a myar gyee htae chin yin tot List tway Object use lite yin ya tl
*/


function add(a,b,c){
    let result = a+b+c;
    return result;
    //console.log(result); // return ma pyan pl console.log nae htot yin NaN pl hwat lr ml
}

let funData = add(1,2,4)+10;
console.log(funData);
print();
//data tway a myar gyee htae chin yin tot List tway Object use lite yin ya tl
