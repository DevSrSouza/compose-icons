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

public val LineAwesomeIcons.LiraSignSolid: ImageVector
    get() {
        if (_liraSignSolid != null) {
            return _liraSignSolid!!
        }
        _liraSignSolid = Builder(name = "LiraSignSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 4.0f)
                lineTo(11.0f, 9.9063f)
                lineTo(8.0f, 11.0f)
                lineTo(8.0f, 13.0f)
                lineTo(11.0f, 11.9063f)
                lineTo(11.0f, 13.9063f)
                lineTo(8.0f, 15.0f)
                lineTo(8.0f, 17.0f)
                lineTo(11.0f, 15.9063f)
                lineTo(11.0f, 28.0f)
                lineTo(12.0f, 28.0f)
                curveTo(17.7617f, 28.0f, 22.8281f, 24.1523f, 24.3438f, 18.5938f)
                lineTo(24.9688f, 16.25f)
                lineTo(23.0313f, 15.75f)
                lineTo(22.4063f, 18.0625f)
                curveTo(21.2188f, 22.4258f, 17.4297f, 25.4219f, 13.0f, 25.8438f)
                lineTo(13.0f, 15.1875f)
                lineTo(19.0f, 13.0f)
                lineTo(19.0f, 11.0f)
                lineTo(13.0f, 13.1875f)
                lineTo(13.0f, 11.1875f)
                lineTo(19.0f, 9.0f)
                lineTo(19.0f, 7.0f)
                lineTo(13.0f, 9.1875f)
                lineTo(13.0f, 4.0f)
                close()
            }
        }
        .build()
        return _liraSignSolid!!
    }

private var _liraSignSolid: ImageVector? = null
