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

public val RegularGroup.Line: ImageVector
    get() {
        if (_line != null) {
            return _line!!
        }
        _line = Builder(name = "Line", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.7838f, 2.2197f)
                curveTo(22.0767f, 2.5126f, 22.0767f, 2.9874f, 21.7838f, 3.2803f)
                lineTo(3.2803f, 21.7838f)
                curveTo(2.9874f, 22.0767f, 2.5126f, 22.0767f, 2.2197f, 21.7838f)
                curveTo(1.9268f, 21.4909f, 1.9268f, 21.016f, 2.2197f, 20.7231f)
                lineTo(20.7231f, 2.2197f)
                curveTo(21.016f, 1.9268f, 21.4909f, 1.9268f, 21.7838f, 2.2197f)
                close()
            }
        }
        .build()
        return _line!!
    }

private var _line: ImageVector? = null
