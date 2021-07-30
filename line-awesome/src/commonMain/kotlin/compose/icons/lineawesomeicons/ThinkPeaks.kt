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

public val LineAwesomeIcons.ThinkPeaks: ImageVector
    get() {
        if (_thinkPeaks != null) {
            return _thinkPeaks!!
        }
        _thinkPeaks = Builder(name = "ThinkPeaks", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.5059f, 2.4395f)
                lineTo(3.0f, 24.0f)
                lineTo(5.3125f, 24.0f)
                lineTo(15.5098f, 6.4199f)
                lineTo(25.6289f, 23.7988f)
                lineTo(29.5742f, 17.0f)
                lineTo(27.2617f, 17.0f)
                lineTo(25.625f, 19.8203f)
                lineTo(15.5059f, 2.4395f)
                close()
                moveTo(15.5254f, 10.4297f)
                lineTo(8.8145f, 22.0f)
                lineTo(11.1289f, 22.0f)
                lineTo(15.5293f, 14.4102f)
                lineTo(24.0273f, 29.0f)
                lineTo(26.3418f, 29.0f)
                lineTo(15.5254f, 10.4297f)
                close()
            }
        }
        .build()
        return _thinkPeaks!!
    }

private var _thinkPeaks: ImageVector? = null
