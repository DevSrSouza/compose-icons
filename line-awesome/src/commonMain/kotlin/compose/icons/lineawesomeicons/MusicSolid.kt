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

public val LineAwesomeIcons.MusicSolid: ImageVector
    get() {
        if (_musicSolid != null) {
            return _musicSolid!!
        }
        _musicSolid = Builder(name = "MusicSolid", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(27.0f, 3.7813f)
                lineTo(25.8125f, 4.0313f)
                lineTo(9.8125f, 7.0313f)
                lineTo(9.0f, 7.1563f)
                lineTo(9.0f, 20.5625f)
                curveTo(8.4063f, 20.2148f, 7.7344f, 20.0f, 7.0f, 20.0f)
                curveTo(4.8008f, 20.0f, 3.0f, 21.8008f, 3.0f, 24.0f)
                curveTo(3.0f, 26.1992f, 4.8008f, 28.0f, 7.0f, 28.0f)
                curveTo(9.1992f, 28.0f, 11.0f, 26.1992f, 11.0f, 24.0f)
                lineTo(11.0f, 12.8125f)
                lineTo(25.0f, 10.1875f)
                lineTo(25.0f, 17.5625f)
                curveTo(24.4063f, 17.2148f, 23.7344f, 17.0f, 23.0f, 17.0f)
                curveTo(20.8008f, 17.0f, 19.0f, 18.8008f, 19.0f, 21.0f)
                curveTo(19.0f, 23.1992f, 20.8008f, 25.0f, 23.0f, 25.0f)
                curveTo(25.1992f, 25.0f, 27.0f, 23.1992f, 27.0f, 21.0f)
                close()
                moveTo(25.0f, 6.1875f)
                lineTo(25.0f, 8.1875f)
                lineTo(11.0f, 10.8125f)
                lineTo(11.0f, 8.8125f)
                close()
                moveTo(23.0f, 19.0f)
                curveTo(24.1172f, 19.0f, 25.0f, 19.8828f, 25.0f, 21.0f)
                curveTo(25.0f, 22.1172f, 24.1172f, 23.0f, 23.0f, 23.0f)
                curveTo(21.8828f, 23.0f, 21.0f, 22.1172f, 21.0f, 21.0f)
                curveTo(21.0f, 19.8828f, 21.8828f, 19.0f, 23.0f, 19.0f)
                close()
                moveTo(7.0f, 22.0f)
                curveTo(8.1172f, 22.0f, 9.0f, 22.8828f, 9.0f, 24.0f)
                curveTo(9.0f, 25.1172f, 8.1172f, 26.0f, 7.0f, 26.0f)
                curveTo(5.8828f, 26.0f, 5.0f, 25.1172f, 5.0f, 24.0f)
                curveTo(5.0f, 22.8828f, 5.8828f, 22.0f, 7.0f, 22.0f)
                close()
            }
        }
        .build()
        return _musicSolid!!
    }

private var _musicSolid: ImageVector? = null
