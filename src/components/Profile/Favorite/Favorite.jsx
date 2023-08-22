import { Button } from "react-bootstrap";
import FavoriteIcon from "../../../assets/images/favorite.svg"

const Favorite = () => {
    return ( 
        <Button>
            <img src={FavoriteIcon} alt="" />
        </Button>
     );
}
 
export default Favorite;