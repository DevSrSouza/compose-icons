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

public val CssGgIcons.ArrowLongDownR: ImageVector
    get() {
        if (_arrowLongDownR != null) {
            return _arrowLongDownR!!
        }
        _arrowLongDownR = Builder(name = "ArrowLongDownR", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(16.2416f, 4.6415f)
                lineTo(11.9989f, 0.3988f)
                lineTo(7.7563f, 4.6415f)
                lineTo(11.0003f, 7.8855f)
                lineTo(11.013f, 19.7865f)
                lineTo(9.1685f, 17.9523f)
                lineTo(7.7582f, 19.3704f)
                lineTo(12.0127f, 23.6012f)
                lineTo(16.2437f, 19.3466f)
                lineTo(14.8255f, 17.9363f)
                lineTo(13.013f, 19.7591f)
                lineTo(13.0003f, 7.8827f)
                lineTo(16.2416f, 4.6415f)
                close()
                moveTo(10.5847f, 4.6415f)
                lineTo(11.9989f, 3.2273f)
                lineTo(13.4131f, 4.6415f)
                lineTo(11.9989f, 6.0557f)
                lineTo(10.5847f, 4.6415f)
                close()
            }
        }
        .build()
        return _arrowLongDownR!!
    }

private var _arrowLongDownR: ImageVector? = null
