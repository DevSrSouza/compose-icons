package compose.icons.fluentuiicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.FilledGroup

public val FilledGroup.FoodChickenLeg: ImageVector
    get() {
        if (_foodChickenLeg != null) {
            return _foodChickenLeg!!
        }
        _foodChickenLeg = Builder(name = "FoodChickenLeg", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 7.9999f)
                curveTo(22.0f, 4.6862f, 19.3137f, 1.9999f, 16.0f, 1.9999f)
                curveTo(13.0636f, 1.9999f, 10.6213f, 4.1084f, 10.1018f, 6.8939f)
                curveTo(9.5335f, 8.7345f, 9.0189f, 9.7365f, 8.7367f, 10.2025f)
                lineTo(6.2196f, 12.7196f)
                curveTo(6.0051f, 12.9341f, 5.941f, 13.2567f, 6.0571f, 13.537f)
                curveTo(6.1404f, 13.7382f, 6.305f, 13.8892f, 6.5035f, 13.9583f)
                lineTo(4.4615f, 16.0002f)
                curveTo(3.0986f, 16.0208f, 2.0f, 17.1321f, 2.0f, 18.5f)
                curveTo(2.0f, 19.3379f, 2.413f, 20.0795f, 3.0433f, 20.5319f)
                curveTo(3.2054f, 20.6482f, 3.3517f, 20.7945f, 3.468f, 20.9566f)
                curveTo(3.9204f, 21.5869f, 4.662f, 22.0f, 5.5f, 22.0f)
                curveTo(6.8697f, 22.0f, 7.9821f, 20.8985f, 7.9998f, 19.533f)
                lineTo(10.0403f, 17.4926f)
                curveTo(10.1087f, 17.6928f, 10.2604f, 17.8589f, 10.4629f, 17.9428f)
                curveTo(10.7432f, 18.0589f, 11.0658f, 17.9948f, 11.2803f, 17.7803f)
                lineTo(13.8043f, 15.2563f)
                curveTo(14.2765f, 14.9727f, 15.2823f, 14.4606f, 17.1187f, 13.8956f)
                curveTo(19.8978f, 13.3711f, 22.0f, 10.9318f, 22.0f, 7.9999f)
                close()
                moveTo(8.5831f, 13.9999f)
                horizontalLineTo(10.0f)
                verticalLineTo(15.4115f)
                lineTo(6.8843f, 18.5272f)
                curveTo(6.5898f, 18.8217f, 6.5f, 19.1994f, 6.5f, 19.5f)
                curveTo(6.5f, 20.0523f, 6.0523f, 20.5f, 5.5f, 20.5f)
                curveTo(5.1656f, 20.5f, 4.8694f, 20.3366f, 4.6866f, 20.082f)
                curveTo(4.4751f, 19.7873f, 4.2127f, 19.5248f, 3.918f, 19.3133f)
                curveTo(3.6634f, 19.1306f, 3.5f, 18.8343f, 3.5f, 18.5f)
                curveTo(3.5f, 17.9477f, 3.9477f, 17.5f, 4.5f, 17.5f)
                curveTo(4.7989f, 17.5f, 5.173f, 17.4101f, 5.4648f, 17.1183f)
                lineTo(8.5831f, 13.9999f)
                close()
            }
        }
        .build()
        return _foodChickenLeg!!
    }

private var _foodChickenLeg: ImageVector? = null
