package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.CssGgIcons

public val CssGgIcons.Windows: ImageVector
    get() {
        if (_windows != null) {
            return _windows!!
        }
        _windows = Builder(name = "Windows", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 5.5485f)
                lineTo(10.1954f, 4.5817f)
                verticalLineTo(11.6106f)
                lineTo(3.0067f, 11.6651f)
                lineTo(3.0f, 5.5485f)
                close()
                moveTo(10.1954f, 12.3909f)
                verticalLineTo(19.4957f)
                lineTo(3.0057f, 18.5105f)
                lineTo(3.0053f, 12.3909f)
                horizontalLineTo(10.1954f)
                close()
                moveTo(11.1134f, 4.456f)
                lineTo(20.9977f, 3.0f)
                verticalLineTo(11.5334f)
                lineTo(11.1134f, 11.6106f)
                verticalLineTo(4.456f)
                close()
                moveTo(21.0f, 12.505f)
                lineTo(20.9977f, 21.0f)
                lineTo(11.1134f, 19.6466f)
                verticalLineTo(12.505f)
                horizontalLineTo(21.0f)
                close()
            }
        }
        .build()
        return _windows!!
    }

private var _windows: ImageVector? = null
