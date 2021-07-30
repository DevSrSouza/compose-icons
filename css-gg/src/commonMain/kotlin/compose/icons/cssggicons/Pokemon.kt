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
                curveTo(3.0f, 7.0294f, 7.0294f, 3.0f, 12.0f, 3.0f)
                curveTo(16.9706f, 3.0f, 21.0f, 7.0294f, 21.0f, 12.0f)
                curveTo(21.0f, 16.9706f, 16.9706f, 21.0f, 12.0f, 21.0f)
                curveTo(7.0294f, 21.0f, 3.0f, 16.9706f, 3.0f, 12.0f)
                close()
                moveTo(5.0709f, 13.0f)
                curveTo(5.5561f, 16.3923f, 8.4735f, 19.0f, 12.0f, 19.0f)
                curveTo(15.5265f, 19.0f, 18.4439f, 16.3923f, 18.9291f, 13.0f)
                horizontalLineTo(14.8293f)
                curveTo(14.4174f, 14.1652f, 13.3062f, 15.0f, 12.0f, 15.0f)
                curveTo(10.6938f, 15.0f, 9.5825f, 14.1652f, 9.1707f, 13.0f)
                horizontalLineTo(5.0709f)
                close()
                moveTo(18.9291f, 11.0f)
                curveTo(18.4439f, 7.6077f, 15.5265f, 5.0f, 12.0f, 5.0f)
                curveTo(8.4735f, 5.0f, 5.5561f, 7.6077f, 5.0709f, 11.0f)
                horizontalLineTo(9.1707f)
                curveTo(9.5825f, 9.8348f, 10.6938f, 9.0f, 12.0f, 9.0f)
                curveTo(13.3062f, 9.0f, 14.4174f, 9.8348f, 14.8293f, 11.0f)
                horizontalLineTo(18.9291f)
                close()
                moveTo(12.0f, 13.0f)
                curveTo(12.5523f, 13.0f, 13.0f, 12.5523f, 13.0f, 12.0f)
                curveTo(13.0f, 11.4477f, 12.5523f, 11.0f, 12.0f, 11.0f)
                curveTo(11.4477f, 11.0f, 11.0f, 11.4477f, 11.0f, 12.0f)
                curveTo(11.0f, 12.5523f, 11.4477f, 13.0f, 12.0f, 13.0f)
                close()
            }
        }
        .build()
        return _pokemon!!
    }

private var _pokemon: ImageVector? = null
