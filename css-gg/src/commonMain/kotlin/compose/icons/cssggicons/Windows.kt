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
                moveTo(3.0f, 5.549f)
                lineTo(10.195f, 4.582f)
                verticalLineTo(11.611f)
                lineTo(3.007f, 11.665f)
                lineTo(3.0f, 5.549f)
                close()
                moveTo(10.195f, 12.391f)
                verticalLineTo(19.496f)
                lineTo(3.006f, 18.51f)
                lineTo(3.005f, 12.391f)
                horizontalLineTo(10.195f)
                close()
                moveTo(11.113f, 4.456f)
                lineTo(20.998f, 3.0f)
                verticalLineTo(11.533f)
                lineTo(11.113f, 11.611f)
                verticalLineTo(4.456f)
                close()
                moveTo(21.0f, 12.505f)
                lineTo(20.998f, 21.0f)
                lineTo(11.113f, 19.647f)
                verticalLineTo(12.505f)
                horizontalLineTo(21.0f)
                close()
            }
        }
        .build()
        return _windows!!
    }

private var _windows: ImageVector? = null
