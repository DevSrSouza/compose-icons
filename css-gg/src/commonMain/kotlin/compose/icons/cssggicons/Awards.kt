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

public val CssGgIcons.Awards: ImageVector
    get() {
        if (_awards != null) {
            return _awards!!
        }
        _awards = Builder(name = "Awards", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(19.0f, 9.0f)
                curveTo(19.0f, 11.3787f, 17.8135f, 13.4804f, 16.0f, 14.7453f)
                verticalLineTo(22.0f)
                horizontalLineTo(13.4142f)
                lineTo(12.0f, 20.5858f)
                lineTo(10.5858f, 22.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(14.7453f)
                curveTo(6.1865f, 13.4804f, 5.0f, 11.3787f, 5.0f, 9.0f)
                curveTo(5.0f, 5.134f, 8.134f, 2.0f, 12.0f, 2.0f)
                curveTo(15.866f, 2.0f, 19.0f, 5.134f, 19.0f, 9.0f)
                close()
                moveTo(17.0f, 9.0f)
                curveTo(17.0f, 11.7614f, 14.7614f, 14.0f, 12.0f, 14.0f)
                curveTo(9.2386f, 14.0f, 7.0f, 11.7614f, 7.0f, 9.0f)
                curveTo(7.0f, 6.2386f, 9.2386f, 4.0f, 12.0f, 4.0f)
                curveTo(14.7614f, 4.0f, 17.0f, 6.2386f, 17.0f, 9.0f)
                close()
                moveTo(10.0f, 19.7573f)
                lineTo(12.0f, 17.7573f)
                lineTo(14.0f, 19.7574f)
                verticalLineTo(15.7101f)
                curveTo(13.3663f, 15.8987f, 12.695f, 16.0f, 12.0f, 16.0f)
                curveTo(11.305f, 16.0f, 10.6337f, 15.8987f, 10.0f, 15.7101f)
                verticalLineTo(19.7573f)
                close()
            }
        }
        .build()
        return _awards!!
    }

private var _awards: ImageVector? = null
