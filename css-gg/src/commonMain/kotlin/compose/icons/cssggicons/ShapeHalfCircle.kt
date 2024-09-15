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
                curveTo(11.582f, 4.0f, 8.0f, 7.582f, 8.0f, 12.0f)
                curveTo(8.0f, 16.418f, 11.582f, 20.0f, 16.0f, 20.0f)
                verticalLineTo(17.0f)
                curveTo(13.239f, 17.0f, 11.0f, 14.761f, 11.0f, 12.0f)
                curveTo(11.0f, 9.239f, 13.239f, 7.0f, 16.0f, 7.0f)
                verticalLineTo(4.0f)
                close()
            }
        }
        .build()
        return _shapeHalfCircle!!
    }

private var _shapeHalfCircle: ImageVector? = null
