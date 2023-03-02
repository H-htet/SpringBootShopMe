//Property Accessors? Obj ta ku yae properties twae ko swal hote pho mhar ko call tr
//There are two type of property accessors
//1 - Dot notation or Dot property accessor( . )
//2 - Brackect Notation or Brackect property accessor[]

// thu ko yay tae syntax ga
//syntax
// expression.identifier(object.objecthtaegaPropertiesyaename)

 //let car = {name:"MarkII"}// car obj // name is identifier or properties loe kaw tl

 //let car = {parperty:'driving'};
 //console.log(car.parperty);//get driving value

 //object.property1.property2

 /*let car = {// It is called object and anothe one is json coz it is like to json type
    male:{driver:'mgmg'},/// driver is male propertits yae propertie
    female:{driver:'susu'}
 };
//JSON Javascript Object Notation// JSON is a kind of datatype
 console.log(car.male.driver);
 */

 //weather api ta ku ko twar yu yin di lo myo pyan pay tr


 let mmWeather={
    Mandalay:{
        'PyinOoLwin':{temp:30, humandity:20, condition:'cool'},
        'PyinOoLwin-3':{temp:30, humandity:20, condition:'cool'},// . nae output yin Nan error tat ml
        //'NayPyiDaw':{temp:40, human:30, condition:'hot'}//property name the number tway mu ma mhan tr twae use yin . ko use loe ma ya buu
        '3':{temp:40, human:30, condition:'hot'}//. nae output yin  syntax error tat ml
    },
    Yangon:{

    },
 };

 console.log(mmWeather.Mandalay);
 console.log(mmWeather.Mandalay.PyinOoLwin);
 console.log(mmWeather.Mandalay.PyinOoLwin1);//underfined
 console.log(mmWeather.Mandalay.PyinOoLwin-3);// NaN
 console.log(mmWeather.Mandalay["PyinOoLwin-3"]);// . nae tat tae problem ko [] use yin ok tl
 console.log(mmWeather.Mandalay["3"].condition);
//There are three type of Javascript error. They are NaN, underfined, syntax error. 
// Nan = not a number
//NaN is global object or global variable that is why it show NaN.