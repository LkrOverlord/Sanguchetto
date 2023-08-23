import { Button } from "react-bootstrap";
import CartIcon from "../../assets/images/cart.svg"
const CartButton = () => {
return ( 
    <Button>
        <img src={CartIcon} alt="" />
    </Button>
 );

}
 
export default CartButton;