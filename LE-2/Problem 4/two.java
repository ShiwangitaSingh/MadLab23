class two extends one 
{
    // if we don't write the below lines of code compiler will show error:
    // class two extends one 
    // required: int
    // found: no arguments
    // reason: actual and formal argument lists differ in length
    // 1 error
    two(int x){
        super(x);
    }
    // by adding these lines it will make this child class constructor compatible 
    // with the mother class
}