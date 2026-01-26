package spring.springExercise.SqExrs.RestServices.WLT.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import spring.springExercise.SqExrs.RestServices.WLT.DTO.CreateWalletRequest;
import spring.springExercise.SqExrs.RestServices.WLT.DTO.WalletResponse;
import spring.springExercise.SqExrs.RestServices.WLT.Service.WalletService;

@RestController
@RequestMapping("/api")
public class WalletController {

    private final WalletService walletService;

    public WalletController(WalletService walletService) {
        this.walletService = walletService;
    }

    @PostMapping("/wallets")
    public ResponseEntity<?>createWalletRequestResponseEntity(
            @RequestBody  CreateWalletRequest createWalletRequest){
        var wallet=walletService.createWallet(createWalletRequest);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .header("ID",String.valueOf(wallet.getId()))
                .body(wallet);

    }

    @GetMapping("/wallets/{id}")
    public ResponseEntity<?>getWalletByID(@PathVariable int id){
       var wallet= walletService.getWalledByID(id);
       return ResponseEntity
               .ok(wallet);
    }
}
