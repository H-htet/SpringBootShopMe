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
        PyinOoLwin:{temp:30, humandity:20, condition:'cool'},
        NayPyiDaw:{temp:40, human:30, condition:'hot'}
    },
    Yangon:{

    },
 };

 console.log(mmWeather.Mandalay.PyinOoLwin.condition);
