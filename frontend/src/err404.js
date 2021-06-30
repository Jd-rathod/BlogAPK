import { Link } from "react-router-dom"

const NotFound = () => {
    return ( 
        <div className="not-found">
            <h2>Sorry :(</h2>
            <p>Requested Page doesn't exists!!!</p>
            <Link to="/blogs">Back to the Home Page...</Link>
        </div>
     );
}
 
export default NotFound;