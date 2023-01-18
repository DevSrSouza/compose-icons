package compose.icons.fluentuiicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.RegularGroup

public val RegularGroup.Alert: ImageVector
    get() {
        if (_alert != null) {
            return _alert!!
        }
        _alert = Builder(name = "Alert", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0001f, 1.9961f)
                curveTo(16.05f, 1.9961f, 19.3568f, 5.1908f, 19.4959f, 9.2451f)
                lineTo(19.5001f, 9.4961f)
                verticalLineTo(13.5931f)
                lineTo(20.8801f, 16.7491f)
                curveTo(20.9492f, 16.907f, 20.9848f, 17.0775f, 20.9848f, 17.2499f)
                curveTo(20.9848f, 17.9402f, 20.4252f, 18.4999f, 19.7348f, 18.4999f)
                lineTo(15.0001f, 18.5014f)
                curveTo(15.0001f, 20.1582f, 13.657f, 21.5014f, 12.0001f, 21.5014f)
                curveTo(10.4024f, 21.5014f, 9.0964f, 20.2524f, 9.0052f, 18.6776f)
                lineTo(8.9997f, 18.4991f)
                lineTo(4.275f, 18.4999f)
                curveTo(4.1036f, 18.4999f, 3.9341f, 18.4646f, 3.777f, 18.3964f)
                curveTo(3.1438f, 18.1213f, 2.8534f, 17.3851f, 3.1285f, 16.7519f)
                lineTo(4.5001f, 13.594f)
                verticalLineTo(9.496f)
                curveTo(4.5007f, 5.3412f, 7.8522f, 1.9961f, 12.0001f, 1.9961f)
                close()
                moveTo(13.4997f, 18.4991f)
                lineTo(10.5001f, 18.5014f)
                curveTo(10.5001f, 19.3298f, 11.1717f, 20.0014f, 12.0001f, 20.0014f)
                curveTo(12.7798f, 20.0014f, 13.4206f, 19.4065f, 13.4932f, 18.6458f)
                lineTo(13.4997f, 18.4991f)
                close()
                moveTo(12.0001f, 3.4961f)
                curveTo(8.6799f, 3.4961f, 6.0006f, 6.1704f, 6.0001f, 9.4961f)
                verticalLineTo(13.9057f)
                lineTo(4.6561f, 16.9999f)
                horizontalLineTo(19.3526f)
                lineTo(18.0001f, 13.9067f)
                lineTo(18.0002f, 9.509f)
                lineTo(17.9965f, 9.2837f)
                curveTo(17.8854f, 6.0503f, 15.2417f, 3.4961f, 12.0001f, 3.4961f)
                close()
            }
        }
        .build()
        return _alert!!
    }

private var _alert: ImageVector? = null
