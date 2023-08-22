import { Button } from "react-bootstrap";
import NotificationIcon from "../../../assets/images/notification.svg";

const NotificationButton = () => {
    return ( 
        <Button>
            <img src={NotificationIcon} alt="" />
        </Button>
     );
}
 
export default NotificationButton;