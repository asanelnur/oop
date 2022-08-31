//Second task:
abstract class Operator {
    public int initialValue;
    public Operator(){};
    public abstract void execute(int anotherValue);
}

class Add extends Operator{
    @Override
    public void execute(int anotherValue){
        super.initialValue+=anotherValue;
    }
}

class Subtract extends Operator{
    @Override
    public void execute(int anotherValue){
        super.initialValue-=anotherValue;
    }
}

class Multiply extends Operator{
    @Override
    public void execute(int anotherValue){
        super.initialValue*=anotherValue;
    }
}

class Delete extends Operator{
    @Override
    public void execute(int anotherValue){
        super.initialValue/=anotherValue;
    }
}

class Clear extends Operator{
    @Override
    public void execute(int anotherValue){
        super.initialValue=0;
    }
}