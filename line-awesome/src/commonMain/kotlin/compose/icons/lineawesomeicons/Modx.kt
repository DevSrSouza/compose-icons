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

public val LineAwesomeIcons.Modx: ImageVector
    get() {
        if (_modx != null) {
            return _modx!!
        }
        _modx = Builder(name = "Modx", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 4.242f)
                lineTo(7.0f, 16.234f)
                lineTo(8.855f, 17.447f)
                lineTo(3.889f, 25.0f)
                lineTo(16.375f, 25.0f)
                lineTo(17.521f, 23.285f)
                lineTo(25.0f, 27.766f)
                lineTo(25.0f, 15.439f)
                lineTo(23.18f, 14.324f)
                lineTo(27.816f, 7.0f)
                lineTo(15.48f, 7.0f)
                lineTo(14.348f, 8.607f)
                lineTo(7.0f, 4.242f)
                close()
                moveTo(9.0f, 7.758f)
                lineTo(13.191f, 10.248f)
                lineTo(19.32f, 13.891f)
                lineTo(10.193f, 15.932f)
                lineTo(9.0f, 15.152f)
                lineTo(9.0f, 7.758f)
                close()
                moveTo(16.52f, 9.0f)
                lineTo(24.184f, 9.0f)
                lineTo(21.676f, 12.961f)
                lineTo(16.072f, 9.633f)
                lineTo(16.52f, 9.0f)
                close()
                moveTo(20.152f, 15.756f)
                lineTo(15.307f, 23.0f)
                lineTo(7.598f, 23.0f)
                lineTo(11.02f, 17.797f)
                lineTo(20.152f, 15.756f)
                close()
                moveTo(22.311f, 16.137f)
                lineTo(23.0f, 16.561f)
                lineTo(23.0f, 24.234f)
                lineTo(18.672f, 21.645f)
                lineTo(22.311f, 16.137f)
                close()
            }
        }
        .build()
        return _modx!!
    }

private var _modx: ImageVector? = null
