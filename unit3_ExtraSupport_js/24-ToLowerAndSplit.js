/*let city=['YGN', 'MDY', 'POL', 'TG', 'KALAW'];
let cities='Cities are ';
for (let i = 0; i < city.length; i++) {
    cities += city[i].toLocaleLowerCase()+ ' , ';// i=0
    console.log(cities);
}*/

//split // ko ma lo chin tae 'symbol' htae ka sartar tway htae ga har ko phyat htote tr

//let myContact='WinHtut GreenHackers VijjA';
//let arr = myContact.split(' ');
/*let myContact='WinHtut:GreenHackers:VijjA';
let arr = myContact.split(':');*/
/*let myContact='WinHtut GreenHackers@VijjA';
let arr = myContact.split('@');*/
/*let myContact='WinHtut Green Hackers Vij jA';//split lote p array ta ku a nay nae pyan save
let arr = myContact.split(' ',3);// two parameters , first one is to remove, second one is limit */
/*let myContact='WinHtut Green Hackers Vij jA';//split lote p array ta ku a nay nae pyan save
let arr = myContact.split('Green');// two parameters , first one is to remove, second one is limit */
/*let myContact='WinHtut Green Hackers Green Vij jA';//split lote p array ta ku a nay nae pyan save
let arr = myContact.split('Green',2);*/
let myContact='WinHtut Green Hackers Green Vij jA';//split lote p array ta ku a nay nae pyan save
let arr = myContact.split('Green',4);
console.log(arr);