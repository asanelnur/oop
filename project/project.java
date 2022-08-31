import java.util.Scanner;

public class project{
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String className = input.nextLine();
        
        // Checking the implementation of the Position class
        if(className.equals("Position")){
            Position p1 = new Position(input.nextInt(), input.nextInt());
            System.out.println(p1);
            p1.setX(5);
            System.out.println(p1.getX());
            
            Position p2 = new Position(5, 10);
            System.out.println(p1.equals(p2));            
        }
        
        // Checking the implementation of the Map class
        else if(className.equals("Map")){
            try{
                Map map = new Map(input);
                map.print();
                int size = map.getSize();
                System.out.println(size);		
                System.out.println(map.getValueAt(size/2, size/2)); 
            }
            catch(Exception e){}
        }
        
        // Checking the Player interface and the MyPlayer class
        else if(className.equals("Player")){
            Player player = new MyPlayer();
            System.out.println(Player.class.isInterface());  
            System.out.println(player instanceof Player);
            System.out.println(player instanceof MyPlayer);
        }
        
        // Checking the InvalidMapException class
        else if(className.equals("Exception")){
            try{
                throw new InvalidMapException("Some message");
            }
            catch(InvalidMapException e){
                System.out.println(e.getMessage());
            }
        }
        
        // Checking the Game class and all of its components
        else if(className.equals("Game")){
            
            // Initialize player, map, and the game
            Player player = new MyPlayer();
            Game game = null;

            try{
                game = new Game(new Map(input));
            }
            catch(InvalidMapException e){ // custom exception
                System.out.println(e.getMessage());
                System.exit(0);
            }

            game.addPlayer(player);

            // Make the player move based on the commands given in the input
            String moves = input.next();
            char move;
            for(int i=0; i<moves.length(); i++){
                move = moves.charAt(i);
                switch(move){
                    case 'R':
                        player.moveRight();
                        break;
                    case 'L':
                        player.moveLeft();
                        break;
                    case 'U':
                        player.moveUp();
                        break;
                    case 'D':
                        player.moveDown();
                        break;
                }
            }

            // Determine the final position of the player after completing all the moves above
            Position playerPosition = player.getPosition();
            System.out.println("Player final position");
            System.out.println("Row: " + playerPosition.getY());
            System.out.println("Col: " + playerPosition.getX());
        }
	}
}

class Game{
    public Map map;
    public Player player;

    public Game(Map map){
        this.map=map;
    }

    public void setMap(Map map){
        this.map=map;
    }

    public void addPlayer(Player p){
        int x=0,y=0;
        for(int i=0;i<map.getSize();i++){
            for(int j=0;j<map.getSize();j++){
                if(map.getValueAt(i, j).equals("P")){
                    y=i;
                    x=j;
                    break;
                }
            }
        }
        this.player=p;
        player.setMap(map);
        player.getPosition().setX(x);
        player.getPosition().setY(y);
    }
}

class Map{
    public String[][] list;
    private int size;
    public Map(){}
    public Map(Scanner input) throws InvalidMapException{
        size=input.nextInt();
        if(size==0){
            throw new InvalidMapException("Map size can not be zero");
        }else{
            try{
                list=new String[size][size];
                for(int i=0;i<size;i++){
                    for(int j=0;j<size;j++){
                        list[i][j]=input.next();
                    }
                }
            }catch(Exception e){
                throw new InvalidMapException("Not enough map elements");
            }
        }
    }
    public int getSize(){
        return size;
    }
    public String getValueAt(int i,int j){
        return list[i][j];
    }
    public void print(){
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                System.out.print(list[i][j]+" ");
            }
            System.out.print("\n");
        }
    }
}

class MyPlayer implements Player{
    public Map map;
    public Position position;
    public MyPlayer(){
        position=new Position(0,0);
    };
    public MyPlayer(Position p){
        position=p;
    }
    @Override
    public void setMap(Map m){
        map=m;
    }
    @Override
    public void moveRight(){
        int x=position.getX();
        int y=position.getY();
        if(x<map.getSize()-1){
            if(!map.getValueAt(y,x+1).equals("1")){
                position.setX(x+1);
            }
        }
    }
    @Override
    public void moveLeft(){
        int x=position.getX();
        int y=position.getY();
        if(x>0){
            if(!map.getValueAt(y,x-1).equals("1")){
                position.setX(x-1);
            }
        }
    }
    @Override
    public void moveDown(){
        int x=position.getX();
        int y=position.getY();
        if(y<map.getSize()-1){
            if(!map.getValueAt(y+1,x).equals("1")){
                position.setY(y+1);
            }
        }
    }
    @Override
    public void moveUp(){
        int x=position.getX();
        int y=position.getY();
        if(y>0){
            if(!map.getValueAt(y-1,x).equals("1")){
                position.setY(y-1);
            }
        }
    }
    public Position getPosition(){
        return position;
    }
}

interface Player{
    public abstract void moveRight();
    public abstract void moveLeft();
    public abstract void moveDown();
    public abstract void moveUp() ;
    public abstract void setMap(Map m);
    public abstract Position getPosition();
}

class Position{
    private int x;
    private int y;
    public Position(int x,int y){
        this.x=x;
        this.y=y;
    }
    public void setX(int x){
        this.x=x;
    }
    public void setY(int y){
        this.y=y;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public boolean equals(Position p){
        if(p.getX()==x && p.getY()==y){
            return true;
        }
        else return false;
    }
    @Override 
    public String toString(){
        return "("+x+","+y+")";
    }
}

class InvalidMapException extends Exception{
    public InvalidMapException(String message1){
        super(message1);
    }
}