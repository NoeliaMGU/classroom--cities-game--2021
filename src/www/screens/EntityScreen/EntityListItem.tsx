import { useCallback } from "react";
import {useAppDispatch, useDispatchForm} from "www/store/hooks";
import { screenPushed } from "www/widgets/ScreenStackWidget/actions";
import {houseOrdered} from "../../components/HouseComponent/actions";

export function EntityListItem({ entity }: any) {
  const dispatch = useAppDispatch();
  const go = useCallback(
    () => dispatch(screenPushed("entity", entity.id)),
    [dispatch, entity]
  );
  const buildHouse = useDispatchForm(houseOrdered, entity.id)

  return (
    <li onClick={go}>
      {entity.type}: {entity.name} of {entity.owner}
      {entity.type === "HOUSE" &&
      <button onClick ={buildHouse}>Create house</button>}
    </li>
  );
}
