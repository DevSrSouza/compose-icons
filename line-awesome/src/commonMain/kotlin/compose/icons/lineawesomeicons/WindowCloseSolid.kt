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

public val LineAwesomeIcons.WindowCloseSolid: ImageVector
    get() {
        if (_windowCloseSolid != null) {
            return _windowCloseSolid!!
        }
        _windowCloseSolid = Builder(name = "WindowCloseSolid", defaultWidth = 32.0.dp, defaultHeight
                = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
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
                moveTo(11.688f, 10.313f)
                lineTo(10.281f, 11.719f)
                lineTo(14.563f, 16.0f)
                lineTo(10.219f, 20.344f)
                lineTo(11.625f, 21.75f)
                lineTo(15.969f, 17.406f)
                lineTo(20.281f, 21.719f)
                lineTo(21.688f, 20.313f)
                lineTo(17.375f, 16.0f)
                lineTo(21.625f, 11.75f)
                lineTo(20.219f, 10.344f)
                lineTo(15.969f, 14.594f)
                close()
            }
        }
        .build()
        return _windowCloseSolid!!
    }

private var _windowCloseSolid: ImageVector? = null
