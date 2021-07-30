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

public val CssGgIcons.Spectrum: ImageVector
    get() {
        if (_spectrum != null) {
            return _spectrum!!
        }
        _spectrum = Builder(name = "Spectrum", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 16.0f)
                horizontalLineTo(16.0f)
                curveTo(16.0f, 11.5817f, 12.4183f, 8.0f, 8.0f, 8.0f)
                verticalLineTo(12.0f)
                curveTo(10.2091f, 12.0f, 12.0f, 13.7909f, 12.0f, 16.0f)
                close()
            }
        }
        .build()
        return _spectrum!!
    }

private var _spectrum: ImageVector? = null
