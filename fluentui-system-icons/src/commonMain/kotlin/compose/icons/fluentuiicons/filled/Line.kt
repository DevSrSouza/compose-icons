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

public val FilledGroup.Line: ImageVector
    get() {
        if (_line != null) {
            return _line!!
        }
        _line = Builder(name = "Line", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.7071f, 2.2929f)
                curveTo(22.0976f, 2.6834f, 22.0976f, 3.3166f, 21.7071f, 3.7071f)
                lineTo(3.7071f, 21.7071f)
                curveTo(3.3166f, 22.0976f, 2.6834f, 22.0976f, 2.2929f, 21.7071f)
                curveTo(1.9024f, 21.3166f, 1.9024f, 20.6834f, 2.2929f, 20.2929f)
                lineTo(20.2929f, 2.2929f)
                curveTo(20.6834f, 1.9024f, 21.3166f, 1.9024f, 21.7071f, 2.2929f)
                close()
            }
        }
        .build()
        return _line!!
    }

private var _line: ImageVector? = null
