package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
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

public val CssGgIcons.SelectO: ImageVector
    get() {
        if (_selectO != null) {
            return _selectO!!
        }
        _selectO = Builder(name = "SelectO", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.1715f, 11.508f)
                lineTo(7.7573f, 10.0938f)
                lineTo(12.0f, 5.8511f)
                lineTo(16.2426f, 10.0938f)
                lineTo(14.8284f, 11.508f)
                lineTo(12.0f, 8.6796f)
                lineTo(9.1715f, 11.508f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.1715f, 12.492f)
                lineTo(7.7573f, 13.9062f)
                lineTo(12.0f, 18.1489f)
                lineTo(16.2426f, 13.9062f)
                lineTo(14.8284f, 12.492f)
                lineTo(12.0f, 15.3204f)
                lineTo(9.1715f, 12.492f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(23.0f, 12.0f)
                curveTo(23.0f, 18.0751f, 18.0751f, 23.0f, 12.0f, 23.0f)
                curveTo(5.9249f, 23.0f, 1.0f, 18.0751f, 1.0f, 12.0f)
                curveTo(1.0f, 5.9249f, 5.9249f, 1.0f, 12.0f, 1.0f)
                curveTo(18.0751f, 1.0f, 23.0f, 5.9249f, 23.0f, 12.0f)
                close()
                moveTo(21.0f, 12.0f)
                curveTo(21.0f, 16.9706f, 16.9706f, 21.0f, 12.0f, 21.0f)
                curveTo(7.0294f, 21.0f, 3.0f, 16.9706f, 3.0f, 12.0f)
                curveTo(3.0f, 7.0294f, 7.0294f, 3.0f, 12.0f, 3.0f)
                curveTo(16.9706f, 3.0f, 21.0f, 7.0294f, 21.0f, 12.0f)
                close()
            }
        }
        .build()
        return _selectO!!
    }

private var _selectO: ImageVector? = null
