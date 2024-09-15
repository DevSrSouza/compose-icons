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

public val CssGgIcons.Pokemon: ImageVector
    get() {
        if (_pokemon != null) {
            return _pokemon!!
        }
        _pokemon = Builder(name = "Pokemon", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(3.0f, 12.0f)
                curveTo(3.0f, 7.029f, 7.029f, 3.0f, 12.0f, 3.0f)
                curveTo(16.971f, 3.0f, 21.0f, 7.029f, 21.0f, 12.0f)
                curveTo(21.0f, 16.971f, 16.971f, 21.0f, 12.0f, 21.0f)
                curveTo(7.029f, 21.0f, 3.0f, 16.971f, 3.0f, 12.0f)
                close()
                moveTo(5.071f, 13.0f)
                curveTo(5.556f, 16.392f, 8.474f, 19.0f, 12.0f, 19.0f)
                curveTo(15.526f, 19.0f, 18.444f, 16.392f, 18.929f, 13.0f)
                horizontalLineTo(14.829f)
                curveTo(14.417f, 14.165f, 13.306f, 15.0f, 12.0f, 15.0f)
                curveTo(10.694f, 15.0f, 9.583f, 14.165f, 9.171f, 13.0f)
                horizontalLineTo(5.071f)
                close()
                moveTo(18.929f, 11.0f)
                curveTo(18.444f, 7.608f, 15.526f, 5.0f, 12.0f, 5.0f)
                curveTo(8.474f, 5.0f, 5.556f, 7.608f, 5.071f, 11.0f)
                horizontalLineTo(9.171f)
                curveTo(9.583f, 9.835f, 10.694f, 9.0f, 12.0f, 9.0f)
                curveTo(13.306f, 9.0f, 14.417f, 9.835f, 14.829f, 11.0f)
                horizontalLineTo(18.929f)
                close()
                moveTo(12.0f, 13.0f)
                curveTo(12.552f, 13.0f, 13.0f, 12.552f, 13.0f, 12.0f)
                curveTo(13.0f, 11.448f, 12.552f, 11.0f, 12.0f, 11.0f)
                curveTo(11.448f, 11.0f, 11.0f, 11.448f, 11.0f, 12.0f)
                curveTo(11.0f, 12.552f, 11.448f, 13.0f, 12.0f, 13.0f)
                close()
            }
        }
        .build()
        return _pokemon!!
    }

private var _pokemon: ImageVector? = null
