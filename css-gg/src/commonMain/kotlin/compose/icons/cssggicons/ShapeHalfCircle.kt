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

public val CssGgIcons.ShapeHalfCircle: ImageVector
    get() {
        if (_shapeHalfCircle != null) {
            return _shapeHalfCircle!!
        }
        _shapeHalfCircle = Builder(name = "ShapeHalfCircle", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 4.0f)
                curveTo(11.5817f, 4.0f, 8.0f, 7.5817f, 8.0f, 12.0f)
                curveTo(8.0f, 16.4183f, 11.5817f, 20.0f, 16.0f, 20.0f)
                verticalLineTo(17.0f)
                curveTo(13.2386f, 17.0f, 11.0f, 14.7614f, 11.0f, 12.0f)
                curveTo(11.0f, 9.2386f, 13.2386f, 7.0f, 16.0f, 7.0f)
                verticalLineTo(4.0f)
                close()
            }
        }
        .build()
        return _shapeHalfCircle!!
    }

private var _shapeHalfCircle: ImageVector? = null
