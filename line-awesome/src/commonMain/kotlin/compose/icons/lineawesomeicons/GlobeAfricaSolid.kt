package compose.icons.lineawesomeicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.LineAwesomeIcons

public val LineAwesomeIcons.GlobeAfricaSolid: ImageVector
    get() {
        if (_globeAfricaSolid != null) {
            return _globeAfricaSolid!!
        }
        _globeAfricaSolid = Builder(name = "GlobeAfricaSolid", defaultWidth = 32.0.dp, defaultHeight
                = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 3.0f)
                curveTo(8.832f, 3.0f, 3.0f, 8.832f, 3.0f, 16.0f)
                curveTo(3.0f, 23.168f, 8.832f, 29.0f, 16.0f, 29.0f)
                curveTo(23.168f, 29.0f, 29.0f, 23.168f, 29.0f, 16.0f)
                curveTo(29.0f, 8.832f, 23.168f, 3.0f, 16.0f, 3.0f)
                close()
                moveTo(16.0f, 5.0f)
                curveTo(16.338f, 5.0f, 16.67f, 5.0208f, 17.0f, 5.0508f)
                lineTo(17.0f, 7.0f)
                lineTo(15.0f, 7.0f)
                lineTo(14.0f, 10.0f)
                lineTo(13.0f, 10.0f)
                lineTo(13.0f, 11.0f)
                lineTo(18.0f, 11.0f)
                lineTo(19.0f, 12.0f)
                lineTo(20.0f, 12.0f)
                lineTo(20.0f, 13.0f)
                lineTo(19.0f, 14.0f)
                lineTo(15.0f, 13.0f)
                lineTo(11.0f, 16.0f)
                lineTo(11.0f, 19.0f)
                lineTo(13.0f, 21.0f)
                lineTo(16.0f, 21.0f)
                lineTo(16.0f, 23.5f)
                lineTo(17.0f, 26.0f)
                lineTo(18.0f, 26.0f)
                lineTo(21.0f, 22.0f)
                lineTo(21.0f, 21.0f)
                lineTo(22.0f, 19.0f)
                lineTo(22.0f, 18.0f)
                lineTo(21.0f, 18.0f)
                lineTo(20.0f, 16.0f)
                lineTo(21.0f, 15.0f)
                lineTo(22.5f, 16.0f)
                lineTo(25.0f, 15.0f)
                lineTo(25.0f, 14.0f)
                lineTo(26.8086f, 14.0f)
                curveTo(26.9286f, 14.65f, 27.0f, 15.316f, 27.0f, 16.0f)
                curveTo(27.0f, 22.065f, 22.065f, 27.0f, 16.0f, 27.0f)
                curveTo(9.935f, 27.0f, 5.0f, 22.065f, 5.0f, 16.0f)
                curveTo(5.0f, 9.935f, 9.935f, 5.0f, 16.0f, 5.0f)
                close()
            }
        }
        .build()
        return _globeAfricaSolid!!
    }

private var _globeAfricaSolid: ImageVector? = null
