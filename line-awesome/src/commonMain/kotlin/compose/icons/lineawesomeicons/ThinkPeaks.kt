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
                moveTo(15.506f, 2.439f)
                lineTo(3.0f, 24.0f)
                lineTo(5.313f, 24.0f)
                lineTo(15.51f, 6.42f)
                lineTo(25.629f, 23.799f)
                lineTo(29.574f, 17.0f)
                lineTo(27.262f, 17.0f)
                lineTo(25.625f, 19.82f)
                lineTo(15.506f, 2.439f)
                close()
                moveTo(15.525f, 10.43f)
                lineTo(8.814f, 22.0f)
                lineTo(11.129f, 22.0f)
                lineTo(15.529f, 14.41f)
                lineTo(24.027f, 29.0f)
                lineTo(26.342f, 29.0f)
                lineTo(15.525f, 10.43f)
                close()
            }
        }
        .build()
        return _thinkPeaks!!
    }

private var _thinkPeaks: ImageVector? = null
