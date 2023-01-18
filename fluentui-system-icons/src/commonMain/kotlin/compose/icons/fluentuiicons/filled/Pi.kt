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

public val FilledGroup.Pi: ImageVector
    get() {
        if (_pi != null) {
            return _pi!!
        }
        _pi = Builder(name = "Pi", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth =
                24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 7.0f)
                curveTo(2.0f, 5.3432f, 3.3431f, 4.0f, 5.0f, 4.0f)
                horizontalLineTo(20.25f)
                curveTo(20.8023f, 4.0f, 21.25f, 4.4477f, 21.25f, 5.0f)
                curveTo(21.25f, 5.5523f, 20.8023f, 6.0f, 20.25f, 6.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(16.7025f)
                curveTo(17.0f, 17.7398f, 18.0276f, 18.464f, 19.0045f, 18.1151f)
                lineTo(19.1637f, 18.0583f)
                curveTo(19.6838f, 17.8725f, 20.256f, 18.1436f, 20.4417f, 18.6637f)
                curveTo(20.6275f, 19.1838f, 20.3564f, 19.756f, 19.8363f, 19.9417f)
                lineTo(19.6772f, 19.9986f)
                curveTo(17.3978f, 20.8126f, 15.0f, 19.1228f, 15.0f, 16.7025f)
                verticalLineTo(6.0f)
                horizontalLineTo(9.9789f)
                curveTo(9.9677f, 6.2206f, 9.9512f, 6.5137f, 9.9275f, 6.8676f)
                curveTo(9.8719f, 7.6972f, 9.7768f, 8.8627f, 9.6182f, 10.2106f)
                curveTo(9.3025f, 12.8935f, 8.7298f, 16.3522f, 7.6945f, 19.3285f)
                curveTo(7.5131f, 19.8502f, 6.9431f, 20.1259f, 6.4215f, 19.9445f)
                curveTo(5.8999f, 19.7631f, 5.6241f, 19.1931f, 5.8055f, 18.6715f)
                curveTo(6.7703f, 15.8979f, 7.3225f, 12.6065f, 7.6319f, 9.9769f)
                curveTo(7.7858f, 8.6686f, 7.8781f, 7.5372f, 7.932f, 6.734f)
                curveTo(7.9514f, 6.4438f, 7.9658f, 6.1968f, 7.9762f, 6.0f)
                horizontalLineTo(5.0f)
                curveTo(4.4477f, 6.0f, 4.0f, 6.4477f, 4.0f, 7.0f)
                verticalLineTo(7.5f)
                curveTo(4.0f, 8.0523f, 3.5523f, 8.5f, 3.0f, 8.5f)
                curveTo(2.4477f, 8.5f, 2.0f, 8.0523f, 2.0f, 7.5f)
                verticalLineTo(7.0f)
                close()
            }
        }
        .build()
        return _pi!!
    }

private var _pi: ImageVector? = null
