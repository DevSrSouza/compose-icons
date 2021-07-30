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

public val CssGgIcons.ShapeHexagon: ImageVector
    get() {
        if (_shapeHexagon != null) {
            return _shapeHexagon!!
        }
        _shapeHexagon = Builder(name = "ShapeHexagon", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(6.0f, 15.2348f)
                lineTo(12.0f, 18.5681f)
                lineTo(18.0f, 15.2348f)
                verticalLineTo(8.7652f)
                lineTo(12.0f, 5.4319f)
                lineTo(6.0f, 8.7652f)
                verticalLineTo(15.2348f)
                close()
                moveTo(12.0f, 2.0f)
                lineTo(3.0f, 7.0f)
                verticalLineTo(17.0f)
                lineTo(12.0f, 22.0f)
                lineTo(21.0f, 17.0f)
                verticalLineTo(7.0f)
                lineTo(12.0f, 2.0f)
                close()
            }
        }
        .build()
        return _shapeHexagon!!
    }

private var _shapeHexagon: ImageVector? = null
