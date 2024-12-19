//7 - Create the function. It should accept two string parameters and return the longer one


// Your code here
function longerString(strOne, strTow) {
    if(strOne.lenght> strTow.lenght){
        return strOne;
    }else{
        return strTow;
    }
    
}
  
console.log(longerString('codemify', 'test')) // codemify
console.log(longerString('automation', 'coding')) // automation
console.log(longerString('automation', 'the codemify')) // the codemify