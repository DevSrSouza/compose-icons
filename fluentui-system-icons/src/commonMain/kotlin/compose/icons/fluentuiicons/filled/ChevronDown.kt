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

public val FilledGroup.ChevronDown: ImageVector
    get() {
        if (_chevronDown != null) {
            return _chevronDown!!
        }
        _chevronDown = Builder(name = "ChevronDown", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.2929f, 8.2929f)
                curveTo(4.6834f, 7.9024f, 5.3166f, 7.9024f, 5.7071f, 8.2929f)
                lineTo(12.0f, 14.5858f)
                lineTo(18.2929f, 8.2929f)
                curveTo(18.6834f, 7.9024f, 19.3166f, 7.9024f, 19.7071f, 8.2929f)
                curveTo(20.0976f, 8.6834f, 20.0976f, 9.3166f, 19.7071f, 9.7071f)
                lineTo(12.7071f, 16.7071f)
                curveTo(12.3166f, 17.0976f, 11.6834f, 17.0976f, 11.2929f, 16.7071f)
                lineTo(4.2929f, 9.7071f)
                curveTo(3.9024f, 9.3166f, 3.9024f, 8.6834f, 4.2929f, 8.2929f)
                close()
            }
        }
        .build()
        return _chevronDown!!
    }

private var _chevronDown: ImageVector? = null
