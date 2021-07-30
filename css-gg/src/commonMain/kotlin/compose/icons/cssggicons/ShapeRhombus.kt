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

public val CssGgIcons.ShapeRhombus: ImageVector
    get() {
        if (_shapeRhombus != null) {
            return _shapeRhombus!!
        }
        _shapeRhombus = Builder(name = "ShapeRhombus", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 6.3432f)
                lineTo(6.3432f, 12.0f)
                lineTo(12.0f, 17.6569f)
                lineTo(17.6569f, 12.0f)
                lineTo(12.0f, 6.3432f)
                close()
                moveTo(2.1005f, 12.0f)
                lineTo(12.0f, 21.8995f)
                lineTo(21.8995f, 12.0f)
                lineTo(12.0f, 2.1005f)
                lineTo(2.1005f, 12.0f)
                close()
            }
        }
        .build()
        return _shapeRhombus!!
    }

private var _shapeRhombus: ImageVector? = null
