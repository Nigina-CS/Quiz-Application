package uz.jl.utils.validator;

import org.bson.types.ObjectId;
import uz.jl.dto.question.QuestionCreateDto;
import uz.jl.dto.question.QuestionUpdateDto;
import uz.jl.utils.BaseUtils;

public class QuestionValidator extends BaseValidator<QuestionCreateDto, QuestionUpdateDto, ObjectId> {
    public QuestionValidator(BaseUtils utils) {
        super(utils);
    }

    @Override
    public void validKey(ObjectId key) throws IllegalArgumentException {

    }

    @Override
    public void validOnCreate(QuestionCreateDto dto) throws IllegalArgumentException {
        if (dto.getVariants().size()==0){
            System.out.println("validator");
        }
    }

    @Override
    public void validOnUpdate(QuestionUpdateDto dto) throws IllegalArgumentException {

    }
}
