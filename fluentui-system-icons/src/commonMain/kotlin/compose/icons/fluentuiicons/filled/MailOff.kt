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

public val FilledGroup.MailOff: ImageVector
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
                curveTo(2.6703f, 5.0549f, 2.1161f, 5.9223f, 2.0162f, 6.9236f)
                lineTo(10.0942f, 11.1551f)
                lineTo(12.5157f, 13.5765f)
                lineTo(12.348f, 13.6644f)
                curveTo(12.13f, 13.7786f, 11.87f, 13.7786f, 11.652f, 13.6644f)
                lineTo(2.0f, 8.608f)
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
                moveTo(15.2998f, 12.118f)
                lineTo(21.5621f, 18.3804f)
                curveTo(21.8405f, 17.9012f, 22.0f, 17.3442f, 22.0f, 16.75f)
                verticalLineTo(8.608f)
                lineTo(15.2998f, 12.118f)
                close()
                moveTo(7.182f, 4.0f)
                lineTo(14.1887f, 11.0069f)
                lineTo(21.9838f, 6.9236f)
                curveTo(21.8201f, 5.2819f, 20.4347f, 4.0f, 18.75f, 4.0f)
                horizontalLineTo(7.182f)
                close()
            }
        }
        .build()
        return _mailOff!!
    }

private var _mailOff: ImageVector? = null
