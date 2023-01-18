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

public val FilledGroup.Checkmark: ImageVector
    get() {
        if (_checkmark != null) {
            return _checkmark!!
        }
        _checkmark = Builder(name = "Checkmark", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.5f, 16.5858f)
                lineTo(4.7071f, 12.7929f)
                curveTo(4.3166f, 12.4024f, 3.6834f, 12.4024f, 3.2929f, 12.7929f)
                curveTo(2.9024f, 13.1834f, 2.9024f, 13.8166f, 3.2929f, 14.2071f)
                lineTo(7.7929f, 18.7071f)
                curveTo(8.1834f, 19.0976f, 8.8166f, 19.0976f, 9.2071f, 18.7071f)
                lineTo(20.2071f, 7.7071f)
                curveTo(20.5976f, 7.3166f, 20.5976f, 6.6834f, 20.2071f, 6.2929f)
                curveTo(19.8166f, 5.9024f, 19.1834f, 5.9024f, 18.7929f, 6.2929f)
                lineTo(8.5f, 16.5858f)
                close()
            }
        }
        .build()
        return _checkmark!!
    }

private var _checkmark: ImageVector? = null
