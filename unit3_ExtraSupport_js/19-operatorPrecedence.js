let a=10;
let b=5;
let c=3;

//operator ga 21 ku lout shi tl , Grouping operator is important

let answer1 = a+b*c;// * ga higt moh a yin * tl // operator precedence
console.log('answer1', answer1);
let answer2 = a+(b*c); // () kat tr ko grouping operator // () is the most of operator precedence// operator a nay nae call yin grouopiing operator loe kaw tl
console.log('answer2', answer2);
let answer3 = (a+b)*c; // () kat tr ko grouping operator
console.log('answer3', answer3);

let test = (a+b)-(b*c)+(b-c); // () myar yin = nae a nee sone kg the operator precedence phyit pr tl, thu ko a yin sone lote ga ml, p yin thu nout ga kg lr ml
console.log(test);


// ko project mhar a yin sone a lote lote say chin tae a kg twae so () lay kat pay lite, p mha thu nout ga kg tway ga lite lain ml

//javascript operator precedence// more details on google search




