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

public val CssGgIcons.Unavailable: ImageVector
    get() {
        if (_unavailable != null) {
            return _unavailable!!
        }
        _unavailable = Builder(name = "Unavailable", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(18.364f, 5.636f)
                curveTo(21.879f, 9.151f, 21.879f, 14.849f, 18.364f, 18.364f)
                curveTo(14.849f, 21.879f, 9.151f, 21.879f, 5.636f, 18.364f)
                curveTo(2.121f, 14.849f, 2.121f, 9.151f, 5.636f, 5.636f)
                curveTo(9.151f, 2.121f, 14.849f, 2.121f, 18.364f, 5.636f)
                close()
                moveTo(16.192f, 17.607f)
                lineTo(6.393f, 7.807f)
                curveTo(4.338f, 10.549f, 4.557f, 14.456f, 7.05f, 16.95f)
                curveTo(9.544f, 19.443f, 13.451f, 19.662f, 16.192f, 17.607f)
                close()
                moveTo(16.95f, 7.05f)
                curveTo(19.443f, 9.544f, 19.662f, 13.451f, 17.607f, 16.192f)
                lineTo(7.807f, 6.393f)
                curveTo(10.549f, 4.338f, 14.456f, 4.557f, 16.95f, 7.05f)
                close()
            }
        }
        .build()
        return _unavailable!!
    }

private var _unavailable: ImageVector? = null
