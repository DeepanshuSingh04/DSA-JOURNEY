/**
 * @param {integer} init
 * @return { increment: Function, decrement: Function, reset: Function }
 */
var createCounter = function(init) {
    const original = init;
    let current  = init;
    return {
        increment(){
           return ++current ; 
        },
        decrement(){
            return --current ;
        },
        reset(){
            current = original
            return original ;
        }
    }
};

/**
 * const counter = createCounter(5)
 * counter.increment(); // 6
 * counter.reset(); // 5
 * counter.decrement(); // 4
 */