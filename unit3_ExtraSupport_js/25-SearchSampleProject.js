// Local Database a thu create ml
let LocalDatabaseData=['win:12345','htut:345622','vij:@#@#$$', 'Ja:78yu'];
let Userinput='vij';
let SearchData=Userinput.toLowerCase();

for (let i = 0; i < LocalDatabaseData.length; i++) {
    let splitContactArr=LocalDatabaseData[i].split(":");
    //splitContactArr=['win','12345']
    if(splitContactArr[0].toLowerCase() === SearchData){
        console.log(splitContactArr[0] + ' Number is '  + splitContactArr[1]);
        break;
    }/*else{
        console.log(Userinput+ ' is not found');// 4 times result hwat nay tl
    }*/

    //console.log(LocalDatabaseData.length); //4
    if(i===LocalDatabaseData.length-1){
        console.log(Userinput+' is not found');
    }
}