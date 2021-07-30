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

public val LineAwesomeIcons.LaughBeam: ImageVector
    get() {
        if (_laughBeam != null) {
            return _laughBeam!!
        }
        _laughBeam = Builder(name = "LaughBeam", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
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
                curveTo(22.065f, 5.0f, 27.0f, 9.935f, 27.0f, 16.0f)
                curveTo(27.0f, 22.065f, 22.065f, 27.0f, 16.0f, 27.0f)
                curveTo(9.935f, 27.0f, 5.0f, 22.065f, 5.0f, 16.0f)
                curveTo(5.0f, 9.935f, 9.935f, 5.0f, 16.0f, 5.0f)
                close()
                moveTo(11.0f, 12.0f)
                curveTo(8.906f, 12.0f, 7.3906f, 13.207f, 7.3906f, 13.207f)
                lineTo(8.6094f, 14.793f)
                curveTo(8.6094f, 14.793f, 9.693f, 14.0f, 11.002f, 14.0f)
                curveTo(12.311f, 14.0f, 13.3926f, 14.793f, 13.3926f, 14.793f)
                lineTo(14.6113f, 13.207f)
                curveTo(14.6093f, 13.207f, 13.094f, 12.0f, 11.0f, 12.0f)
                close()
                moveTo(21.0f, 12.0f)
                curveTo(18.906f, 12.0f, 17.3906f, 13.207f, 17.3906f, 13.207f)
                lineTo(18.6094f, 14.793f)
                curveTo(18.6094f, 14.793f, 19.693f, 14.0f, 21.002f, 14.0f)
                curveTo(22.311f, 14.0f, 23.3926f, 14.793f, 23.3926f, 14.793f)
                lineTo(24.6113f, 13.207f)
                curveTo(24.6093f, 13.207f, 23.094f, 12.0f, 21.0f, 12.0f)
                close()
                moveTo(9.0f, 19.0f)
                curveTo(9.0f, 19.0f, 10.605f, 24.0f, 16.0f, 24.0f)
                curveTo(21.395f, 24.0f, 23.0f, 19.0f, 23.0f, 19.0f)
                lineTo(9.0f, 19.0f)
                close()
            }
        }
        .build()
        return _laughBeam!!
    }

private var _laughBeam: ImageVector? = null
