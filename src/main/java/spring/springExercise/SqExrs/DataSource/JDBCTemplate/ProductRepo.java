package spring.springExercise.SqExrs.DataSource.JDBCTemplate;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProductRepo {

    private JdbcTemplate jdbcTemplate;

    public ProductRepo(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void save(Product product){
        String query="INSERT INTO product(name, price) VALUES (?, ?)";
        jdbcTemplate.update(query,product.getName(),product.getPrice());
    }

    public List<Product>getAllProduct(){
        String query="SELECT * FROM product";

        RowMapper<Product>productRowMapper=(rs,index)->{
            Product product=new Product();
            product.setId(rs.getInt("id"));
            product.setName(rs.getString("name"));
            product.setPrice((rs.getFloat("price")));

            return product;
        };
        return jdbcTemplate.query(query,productRowMapper);
    }
}
