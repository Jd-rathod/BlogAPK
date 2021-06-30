import BlogList from './BlogList';
import useFetch from './fetch';
//import BlogDataService from './Services/services'

const Home = () => {
    const {data, isLoading, error} = useFetch('http://localhost:8080/api/blogs');

    return ( 
        <div className="home">
        {error && <p>{error}</p>}
        {isLoading && <p>Loading...</p>}
        {data && <BlogList blogs={data}/>}
        </div>
     );
}
 
export default Home;