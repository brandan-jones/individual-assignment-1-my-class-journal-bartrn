package edu.uc.cech.soit.myclassjournal;

import org.springframework.web.bind.annotation.RequestMapping;

public class MyClassJournalController {
    /** html */
    /** checkpoint 3 */

    /**
     * Handle the / endpoint
     * @return
     */
    @RequestMapping("/")

    
    public String index() {
        return "start";
    }/** html code */


}
