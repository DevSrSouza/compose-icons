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

public val LineAwesomeIcons.Windows: ImageVector
    get() {
        if (_windows != null) {
            return _windows!!
        }
        _windows = Builder(name = "Windows", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(27.0f, 5.0f)
                lineTo(5.0f, 7.9922f)
                lineTo(5.0f, 24.0078f)
                lineTo(27.0f, 27.0f)
                lineTo(27.0f, 5.0f)
                close()
                moveTo(25.0f, 7.2891f)
                lineTo(25.0f, 15.0f)
                lineTo(15.0f, 15.0f)
                lineTo(15.0f, 8.6504f)
                lineTo(25.0f, 7.2891f)
                close()
                moveTo(13.0f, 8.9219f)
                lineTo(13.0f, 15.0f)
                lineTo(7.0f, 15.0f)
                lineTo(7.0f, 9.7383f)
                lineTo(13.0f, 8.9219f)
                close()
                moveTo(7.0f, 17.0f)
                lineTo(13.0f, 17.0f)
                lineTo(13.0f, 23.0781f)
                lineTo(7.0f, 22.2617f)
                lineTo(7.0f, 17.0f)
                close()
                moveTo(15.0f, 17.0f)
                lineTo(25.0f, 17.0f)
                lineTo(25.0f, 24.7109f)
                lineTo(15.0f, 23.3496f)
                lineTo(15.0f, 17.0f)
                close()
            }
        }
        .build()
        return _windows!!
    }

private var _windows: ImageVector? = null
