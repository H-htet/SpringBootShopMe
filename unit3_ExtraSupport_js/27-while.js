/*let i=10;
while (i<20) {//true or false
    console.log('i lessthan 20 ' + i);//a sone ma shi run nay tr ga computer hand han twar tae a chain, memory mhar pyae twar tae a chain stop twar lain ml
    //i++;// or other way
    if(i===15){
        break;
    }
    i++;
}*/


/*let i=10;
let count = 0;
while (i<20) {//true or false
    count ++;
    console.log('i lessthan ' + i + ' '+count);//a sone ma shi run nay tr ga computer hand han twar tae a chain, memory mhar pyae twar tae a chain stop twar lain ml
    //i++;// or other way
    if(i===15){
        break;
    }
    i++;
}*/


let i=10;
let count = 0;
while (i<20) {//true or false
    count ++;
    console.log('i lessthan ' + i + ' '+count);//a sone ma shi run nay tr ga computer hand han twar tae a chain, memory mhar pyae twar tae a chain stop twar lain ml
    //i++;// or other way
    if(i===15){
        continue;// while ko pyan twar p loop nay tr, thu out ga kg twae ko kya sat ma lote buu
    }
    i++;
}