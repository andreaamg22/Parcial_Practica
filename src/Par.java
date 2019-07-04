public class Par <E> extends Tupla<E>{
  public E first;
  public E second;
  public Par (E prim, E seg){
      this.first = prim;
      this.second = seg;

  }
   public Par<E> Aplicar(Function<E> function){
       return new Par<E> (function.Aplicar(this.first),function.Aplicar(this.second));
       //l

   }

}

