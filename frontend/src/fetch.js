import { useState, useEffect} from 'react';
const useFetch = (url) => {
    const [data,setData] = useState(null);
    const [isLoading, setIsLoading] = useState(true);
    const [error, setError] = useState(null);

    useEffect(()=> {
        const abortTask = new AbortController();
        setTimeout(()=> 
        {
            fetch(url, {
                mode: "no-cors",
                signal:abortTask.signal})
                .then(res => {
                    if(!res.ok){
                        throw Error('Could not fetch the data :(');
                    }
                    return res.json();})
                .then(data => {setData(data);setIsLoading(false);setError(null);})
                .catch(err => {
                    if(err.name === 'AbortError')
                    {console.log('Task Aborted!!!');}
                    else
                    {setIsLoading(false);setError(err.message);}
                });
        },1000);
        return () => abortTask.abort();
        },[url]);
    
    return { data, isLoading, error} 
}

export default useFetch;