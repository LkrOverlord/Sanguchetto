import { Button } from "react-bootstrap";
import NotificationIcon from "../../../assets/images/notification.svg";

const Notification = () => {
    return ( 
        <Button>
            <img src={NotificationIcon} alt="" />
        </Button>
     );
}
 
export default Notification;