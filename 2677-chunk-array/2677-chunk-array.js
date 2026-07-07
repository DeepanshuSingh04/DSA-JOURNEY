/**
 * @param {Array} arr
 * @param {number} size
 * @return {Array}
 */
var chunk = function(arr, size) {
    let ans = [];
    let temp = [];

    for(let i=0;i <arr.length; i++){
        temp.push(arr[i]);

        if(temp.length === size){
            ans.push(temp);
            temp = [];
        }
    }
    //ab jo baki ke bache ho elements
    if(temp.length > 0){
        ans.push(temp);
    }
    return ans;
};
