package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.CssGgIcons

public val CssGgIcons.ShapeTriangle: ImageVector
    get() {
        if (_shapeTriangle != null) {
            return _shapeTriangle!!
        }
        _shapeTriangle = Builder(name = "ShapeTriangle", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(11.6603f, 5.0f)
                lineTo(3.0f, 20.0f)
                horizontalLineTo(20.3205f)
                lineTo(11.6603f, 5.0f)
                close()
                moveTo(11.6603f, 11.0f)
                lineTo(8.1961f, 17.0f)
                horizontalLineTo(15.1244f)
                lineTo(11.6603f, 11.0f)
                close()
            }
        }
        .build()
        return _shapeTriangle!!
    }

private var _shapeTriangle: ImageVector? = null
