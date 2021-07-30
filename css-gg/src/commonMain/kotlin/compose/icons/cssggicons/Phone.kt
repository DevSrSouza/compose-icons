package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.CssGgIcons

public val CssGgIcons.Phone: ImageVector
    get() {
        if (_phone != null) {
            return _phone!!
        }
        _phone = Builder(name = "Phone", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 12.0f)
                curveTo(22.0f, 10.6868f, 21.7413f, 9.3865f, 21.2388f, 8.1731f)
                curveTo(20.7362f, 6.96f, 19.9997f, 5.8574f, 19.0711f, 4.929f)
                curveTo(18.1425f, 4.0002f, 17.0401f, 3.2637f, 15.8268f, 2.7612f)
                curveTo(14.6136f, 2.2585f, 13.3132f, 2.0f, 12.0f, 2.0f)
                verticalLineTo(4.0f)
                curveTo(13.0506f, 4.0f, 14.0909f, 4.207f, 15.0615f, 4.6089f)
                curveTo(16.0321f, 5.011f, 16.914f, 5.6003f, 17.6569f, 6.3433f)
                curveTo(18.3997f, 7.0859f, 18.989f, 7.968f, 19.391f, 8.9385f)
                curveTo(19.7931f, 9.9092f, 20.0f, 10.9495f, 20.0f, 12.0f)
                horizontalLineTo(22.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 10.0f)
                verticalLineTo(5.0f)
                curveTo(2.0f, 4.4478f, 2.4477f, 4.0f, 3.0f, 4.0f)
                horizontalLineTo(8.0f)
                curveTo(8.5523f, 4.0f, 9.0f, 4.4478f, 9.0f, 5.0f)
                verticalLineTo(9.0f)
                curveTo(9.0f, 9.5522f, 8.5523f, 10.0f, 8.0f, 10.0f)
                horizontalLineTo(6.0f)
                curveTo(6.0f, 14.4182f, 9.5817f, 18.0f, 14.0f, 18.0f)
                verticalLineTo(16.0f)
                curveTo(14.0f, 15.4478f, 14.4477f, 15.0f, 15.0f, 15.0f)
                horizontalLineTo(19.0f)
                curveTo(19.5523f, 15.0f, 20.0f, 15.4478f, 20.0f, 16.0f)
                verticalLineTo(21.0f)
                curveTo(20.0f, 21.5522f, 19.5523f, 22.0f, 19.0f, 22.0f)
                horizontalLineTo(14.0f)
                curveTo(7.3726f, 22.0f, 2.0f, 16.6274f, 2.0f, 10.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.5433f, 9.7039f)
                curveTo(17.8448f, 10.4319f, 18.0f, 11.2122f, 18.0f, 12.0f)
                horizontalLineTo(16.2f)
                curveTo(16.2f, 11.4485f, 16.0914f, 10.9023f, 15.8803f, 10.3928f)
                curveTo(15.6692f, 9.8831f, 15.3599f, 9.4202f, 14.9698f, 9.0303f)
                curveTo(14.5798f, 8.6401f, 14.1169f, 8.3308f, 13.6073f, 8.1196f)
                curveTo(13.0977f, 7.9087f, 12.5515f, 7.8f, 12.0f, 7.8f)
                verticalLineTo(6.0f)
                curveTo(12.7879f, 6.0f, 13.5681f, 6.1553f, 14.2961f, 6.4568f)
                curveTo(15.024f, 6.7583f, 15.6855f, 7.2002f, 16.2426f, 7.7573f)
                curveTo(16.7998f, 8.3145f, 17.2418f, 8.9758f, 17.5433f, 9.7039f)
                close()
            }
        }
        .build()
        return _phone!!
    }

private var _phone: ImageVector? = null
