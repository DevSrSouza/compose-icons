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

public val LineAwesomeIcons.Maxcdn: ImageVector
    get() {
        if (_maxcdn != null) {
            return _maxcdn!!
        }
        _maxcdn = Builder(name = "Maxcdn", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 6.0f)
                lineTo(7.0f, 11.0f)
                lineTo(4.0f, 26.0f)
                lineTo(9.0f, 26.0f)
                lineTo(12.0f, 11.0f)
                lineTo(16.0f, 11.0f)
                lineTo(13.0f, 26.0f)
                lineTo(18.0f, 26.0f)
                lineTo(21.0f, 11.0f)
                lineTo(25.0f, 11.0f)
                lineTo(22.0f, 26.0f)
                lineTo(27.0f, 26.0f)
                lineTo(29.75f, 12.2578f)
                curveTo(30.3945f, 9.0195f, 27.9219f, 6.0f, 24.6172f, 6.0f)
                close()
            }
        }
        .build()
        return _maxcdn!!
    }

private var _maxcdn: ImageVector? = null
