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

public val LineAwesomeIcons.WindowClose: ImageVector
    get() {
        if (_windowClose != null) {
            return _windowClose!!
        }
        _windowClose = Builder(name = "WindowClose", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 5.0f)
                lineTo(5.0f, 27.0f)
                lineTo(27.0f, 27.0f)
                lineTo(27.0f, 5.0f)
                close()
                moveTo(7.0f, 7.0f)
                lineTo(25.0f, 7.0f)
                lineTo(25.0f, 25.0f)
                lineTo(7.0f, 25.0f)
                close()
                moveTo(11.6875f, 10.3125f)
                lineTo(10.2813f, 11.7188f)
                lineTo(14.5625f, 16.0f)
                lineTo(10.2188f, 20.3438f)
                lineTo(11.625f, 21.75f)
                lineTo(15.9688f, 17.4063f)
                lineTo(20.2813f, 21.7188f)
                lineTo(21.6875f, 20.3125f)
                lineTo(17.375f, 16.0f)
                lineTo(21.625f, 11.75f)
                lineTo(20.2188f, 10.3438f)
                lineTo(15.9688f, 14.5938f)
                close()
            }
        }
        .build()
        return _windowClose!!
    }

private var _windowClose: ImageVector? = null
