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

public val FilledGroup.BookPulse: ImageVector
    get() {
        if (_bookPulse != null) {
            return _bookPulse!!
        }
        _bookPulse = Builder(name = "BookPulse", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 4.5f)
                curveTo(4.0f, 3.1193f, 5.1193f, 2.0f, 6.5f, 2.0f)
                horizontalLineTo(18.0f)
                curveTo(19.3807f, 2.0f, 20.5f, 3.1193f, 20.5f, 4.5f)
                verticalLineTo(18.75f)
                curveTo(20.5f, 19.1642f, 20.1642f, 19.5f, 19.75f, 19.5f)
                horizontalLineTo(5.5f)
                curveTo(5.5f, 20.0523f, 5.9477f, 20.5f, 6.5f, 20.5f)
                horizontalLineTo(19.75f)
                curveTo(20.1642f, 20.5f, 20.5f, 20.8358f, 20.5f, 21.25f)
                curveTo(20.5f, 21.6642f, 20.1642f, 22.0f, 19.75f, 22.0f)
                horizontalLineTo(6.5f)
                curveTo(5.1193f, 22.0f, 4.0f, 20.8807f, 4.0f, 19.5f)
                verticalLineTo(4.5f)
                close()
                moveTo(11.6907f, 7.4578f)
                curveTo(11.5767f, 7.1882f, 11.3163f, 7.0097f, 11.0238f, 7.0004f)
                curveTo(10.7313f, 6.9911f, 10.4601f, 7.1528f, 10.3292f, 7.4146f)
                lineTo(8.7865f, 10.5f)
                horizontalLineTo(7.75f)
                curveTo(7.3358f, 10.5f, 7.0f, 10.8358f, 7.0f, 11.25f)
                curveTo(7.0f, 11.6642f, 7.3358f, 12.0f, 7.75f, 12.0f)
                horizontalLineTo(9.25f)
                curveTo(9.5341f, 12.0f, 9.7938f, 11.8395f, 9.9208f, 11.5854f)
                lineTo(10.9432f, 9.5406f)
                lineTo(13.0593f, 14.5422f)
                curveTo(13.1699f, 14.8037f, 13.4187f, 14.9803f, 13.7021f, 14.9985f)
                curveTo(13.9855f, 15.0166f, 14.2548f, 14.8732f, 14.3978f, 14.6279f)
                lineTo(15.9308f, 12.0f)
                horizontalLineTo(16.75f)
                curveTo(17.1642f, 12.0f, 17.5f, 11.6642f, 17.5f, 11.25f)
                curveTo(17.5f, 10.8358f, 17.1642f, 10.5f, 16.75f, 10.5f)
                horizontalLineTo(15.5f)
                curveTo(15.2332f, 10.5f, 14.9866f, 10.6417f, 14.8522f, 10.8721f)
                lineTo(13.857f, 12.5781f)
                lineTo(11.6907f, 7.4578f)
                close()
            }
        }
        .build()
        return _bookPulse!!
    }

private var _bookPulse: ImageVector? = null
