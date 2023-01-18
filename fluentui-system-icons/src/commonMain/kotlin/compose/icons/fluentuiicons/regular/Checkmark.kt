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

public val RegularGroup.Checkmark: ImageVector
    get() {
        if (_checkmark != null) {
            return _checkmark!!
        }
        _checkmark = Builder(name = "Checkmark", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.5303f, 12.9697f)
                curveTo(4.2374f, 12.6768f, 3.7626f, 12.6768f, 3.4697f, 12.9697f)
                curveTo(3.1768f, 13.2626f, 3.1768f, 13.7374f, 3.4697f, 14.0303f)
                lineTo(7.9697f, 18.5303f)
                curveTo(8.2626f, 18.8232f, 8.7374f, 18.8232f, 9.0303f, 18.5303f)
                lineTo(20.0303f, 7.5303f)
                curveTo(20.3232f, 7.2374f, 20.3232f, 6.7626f, 20.0303f, 6.4697f)
                curveTo(19.7374f, 6.1768f, 19.2626f, 6.1768f, 18.9697f, 6.4697f)
                lineTo(8.5f, 16.9393f)
                lineTo(4.5303f, 12.9697f)
                close()
            }
        }
        .build()
        return _checkmark!!
    }

private var _checkmark: ImageVector? = null
