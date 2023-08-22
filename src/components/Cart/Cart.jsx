import { Button } from "react-bootstrap";
import CartIcon from "../../assets/images/cart.svg"
const Cart = () => {
return ( 
    <Button>
        <img src={CartIcon} alt="" />
    </Button>
 );

}
 
export default Cart;