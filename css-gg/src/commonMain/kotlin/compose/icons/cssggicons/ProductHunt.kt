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

public val CssGgIcons.ProductHunt: ImageVector
    get() {
        if (_productHunt != null) {
            return _productHunt!!
        }
        _productHunt = Builder(name = "ProductHunt", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 19.0f)
                curveTo(8.134f, 19.0f, 5.0f, 15.866f, 5.0f, 12.0f)
                curveTo(5.0f, 8.134f, 8.134f, 5.0f, 12.0f, 5.0f)
                curveTo(15.866f, 5.0f, 19.0f, 8.134f, 19.0f, 12.0f)
                curveTo(19.0f, 15.866f, 15.866f, 19.0f, 12.0f, 19.0f)
                close()
                moveTo(3.0f, 12.0f)
                curveTo(3.0f, 7.0294f, 7.0294f, 3.0f, 12.0f, 3.0f)
                curveTo(16.9706f, 3.0f, 21.0f, 7.0294f, 21.0f, 12.0f)
                curveTo(21.0f, 16.9706f, 16.9706f, 21.0f, 12.0f, 21.0f)
                curveTo(7.0294f, 21.0f, 3.0f, 16.9706f, 3.0f, 12.0f)
                close()
                moveTo(9.0f, 16.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(13.0f)
                curveTo(14.6569f, 8.0f, 16.0f, 9.3432f, 16.0f, 11.0f)
                curveTo(16.0f, 12.6569f, 14.6569f, 14.0f, 13.0f, 14.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(9.0f)
                close()
                moveTo(14.0f, 11.0f)
                curveTo(14.0f, 11.5523f, 13.5523f, 12.0f, 13.0f, 12.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(13.0f)
                curveTo(13.5523f, 10.0f, 14.0f, 10.4477f, 14.0f, 11.0f)
                close()
            }
        }
        .build()
        return _productHunt!!
    }

private var _productHunt: ImageVector? = null
