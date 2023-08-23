import './StyledWrapper.css';

const StyledWrapper = ({children}) => {
    return ( 
        <div className="styled-component">
            {children}
        </div>
     );
}
 
export default StyledWrapper;