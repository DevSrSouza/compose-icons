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

public val RegularGroup.MailOff: ImageVector
    get() {
        if (_mailOff != null) {
            return _mailOff!!
        }
        _mailOff = Builder(name = "MailOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.2803f, 2.2197f)
                curveTo(2.9874f, 1.9268f, 2.5126f, 1.9268f, 2.2197f, 2.2197f)
                curveTo(1.9268f, 2.5126f, 1.9268f, 2.9874f, 2.2197f, 3.2803f)
                lineTo(3.4698f, 4.5305f)
                curveTo(2.5846f, 5.1111f, 2.0f, 6.1123f, 2.0f, 7.25f)
                verticalLineTo(16.75f)
                lineTo(2.0051f, 16.9344f)
                curveTo(2.1007f, 18.6436f, 3.517f, 20.0f, 5.25f, 20.0f)
                horizontalLineTo(18.75f)
                lineTo(18.9339f, 19.9949f)
                lineTo(20.7194f, 21.7805f)
                curveTo(21.0123f, 22.0734f, 21.4872f, 22.0734f, 21.7801f, 21.7805f)
                curveTo(22.073f, 21.4876f, 22.073f, 21.0127f, 21.7801f, 20.7198f)
                lineTo(3.2803f, 2.2197f)
                close()
                moveTo(17.439f, 18.5f)
                horizontalLineTo(5.25f)
                lineTo(5.1065f, 18.4942f)
                curveTo(4.2071f, 18.4212f, 3.5f, 17.6682f, 3.5f, 16.75f)
                verticalLineTo(9.374f)
                lineTo(11.6507f, 13.6637f)
                lineTo(11.7468f, 13.706f)
                curveTo(11.9431f, 13.7764f, 12.1619f, 13.7623f, 12.3493f, 13.6637f)
                lineTo(12.5154f, 13.5763f)
                lineTo(17.439f, 18.5f)
                close()
                moveTo(10.0825f, 11.1433f)
                lineTo(3.5f, 7.679f)
                verticalLineTo(7.25f)
                lineTo(3.5058f, 7.1065f)
                curveTo(3.5598f, 6.4417f, 3.9853f, 5.8819f, 4.5745f, 5.6352f)
                lineTo(10.0825f, 11.1433f)
                close()
                moveTo(20.5f, 7.678f)
                lineTo(14.1844f, 11.0026f)
                lineTo(15.2949f, 12.1131f)
                lineTo(20.5f, 9.373f)
                verticalLineTo(16.75f)
                lineTo(20.4942f, 16.8935f)
                curveTo(20.4843f, 17.0152f, 20.462f, 17.1334f, 20.4285f, 17.2468f)
                lineTo(21.5621f, 18.3804f)
                curveTo(21.8405f, 17.9012f, 22.0f, 17.3442f, 22.0f, 16.75f)
                verticalLineTo(7.25f)
                lineTo(21.9949f, 7.0656f)
                curveTo(21.8992f, 5.3565f, 20.483f, 4.0f, 18.75f, 4.0f)
                horizontalLineTo(7.182f)
                lineTo(8.6819f, 5.5f)
                horizontalLineTo(18.75f)
                lineTo(18.8935f, 5.5058f)
                curveTo(19.7929f, 5.5788f, 20.5f, 6.3318f, 20.5f, 7.25f)
                verticalLineTo(7.678f)
                close()
            }
        }
        .build()
        return _mailOff!!
    }

private var _mailOff: ImageVector? = null
