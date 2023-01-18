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

public val FilledGroup.Communication: ImageVector
    get() {
        if (_communication != null) {
            return _communication!!
        }
        _communication = Builder(name = "Communication", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 5.0f)
                curveTo(7.5817f, 5.0f, 4.0f, 8.5817f, 4.0f, 13.0f)
                curveTo(4.0f, 15.2068f, 4.8922f, 17.2033f, 6.338f, 18.6517f)
                curveTo(6.7281f, 19.0425f, 6.7275f, 19.6757f, 6.3367f, 20.0659f)
                curveTo(5.9458f, 20.456f, 5.3126f, 20.4555f, 4.9225f, 20.0646f)
                curveTo(3.1177f, 18.2565f, 2.0f, 15.7578f, 2.0f, 13.0f)
                curveTo(2.0f, 7.4771f, 6.4771f, 3.0f, 12.0f, 3.0f)
                curveTo(17.5228f, 3.0f, 22.0f, 7.4771f, 22.0f, 13.0f)
                curveTo(22.0f, 15.7578f, 20.8823f, 18.2565f, 19.0775f, 20.0646f)
                curveTo(18.6874f, 20.4555f, 18.0542f, 20.456f, 17.6633f, 20.0659f)
                curveTo(17.2725f, 19.6757f, 17.2719f, 19.0425f, 17.662f, 18.6517f)
                curveTo(19.1078f, 17.2033f, 20.0f, 15.2068f, 20.0f, 13.0f)
                curveTo(20.0f, 8.5817f, 16.4183f, 5.0f, 12.0f, 5.0f)
                close()
                moveTo(12.0f, 11.0f)
                curveTo(10.8954f, 11.0f, 10.0f, 11.8954f, 10.0f, 13.0f)
                curveTo(10.0f, 14.1046f, 10.8954f, 15.0f, 12.0f, 15.0f)
                curveTo(13.1046f, 15.0f, 14.0f, 14.1046f, 14.0f, 13.0f)
                curveTo(14.0f, 11.8954f, 13.1046f, 11.0f, 12.0f, 11.0f)
                close()
                moveTo(8.0f, 13.0f)
                curveTo(8.0f, 10.7909f, 9.7909f, 9.0f, 12.0f, 9.0f)
                curveTo(14.2091f, 9.0f, 16.0f, 10.7909f, 16.0f, 13.0f)
                curveTo(16.0f, 14.1048f, 15.5534f, 15.1035f, 14.8284f, 15.8284f)
                curveTo(14.4379f, 16.219f, 14.4379f, 16.8521f, 14.8284f, 17.2426f)
                curveTo(15.219f, 17.6332f, 15.8521f, 17.6332f, 16.2426f, 17.2426f)
                curveTo(17.3273f, 16.1579f, 18.0f, 14.6566f, 18.0f, 13.0f)
                curveTo(18.0f, 9.6863f, 15.3137f, 7.0f, 12.0f, 7.0f)
                curveTo(8.6863f, 7.0f, 6.0f, 9.6863f, 6.0f, 13.0f)
                curveTo(6.0f, 14.6566f, 6.6727f, 16.1579f, 7.7574f, 17.2426f)
                curveTo(8.1479f, 17.6332f, 8.781f, 17.6332f, 9.1716f, 17.2426f)
                curveTo(9.5621f, 16.8521f, 9.5621f, 16.219f, 9.1716f, 15.8284f)
                curveTo(8.4466f, 15.1035f, 8.0f, 14.1048f, 8.0f, 13.0f)
                close()
            }
        }
        .build()
        return _communication!!
    }

private var _communication: ImageVector? = null
