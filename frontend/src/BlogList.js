import { Link } from "react-router-dom";
import "../node_modules/bootstrap/dist/css/bootstrap.min.css";

const BlogList = ({blogs}) => {

    return ( 
        <div className="blog-list">
            {blogs.map((obj) => (
            <div className="blog-preview" key={obj.id}>
                <Link to={`/blogs/${obj.id}`}>
                <h2>{ obj.title }</h2>
                { obj.body}
                <p> By <b><i>{obj.author}</i></b></p>
                </Link>
            </div>
            ))};
        </div>
     )

};
  /*
  
   */
export default BlogList;