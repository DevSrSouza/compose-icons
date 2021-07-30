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

public val LineAwesomeIcons.CubeSolid: ImageVector
    get() {
        if (_cubeSolid != null) {
            return _cubeSolid!!
        }
        _cubeSolid = Builder(name = "CubeSolid", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 4.4063f)
                lineTo(15.5938f, 4.5938f)
                lineTo(5.5938f, 9.0938f)
                lineTo(5.0f, 9.3438f)
                lineTo(5.0f, 22.0313f)
                lineTo(5.5f, 22.3125f)
                lineTo(15.5f, 27.875f)
                lineTo(16.0f, 28.1563f)
                lineTo(16.5f, 27.875f)
                lineTo(26.5f, 22.3125f)
                lineTo(27.0f, 22.0313f)
                lineTo(27.0f, 9.3438f)
                lineTo(26.4063f, 9.0938f)
                lineTo(16.4063f, 4.5938f)
                close()
                moveTo(16.0f, 6.5938f)
                lineTo(23.6875f, 10.0313f)
                lineTo(16.0f, 13.875f)
                lineTo(8.3125f, 10.0313f)
                close()
                moveTo(7.0f, 11.625f)
                lineTo(15.0f, 15.625f)
                lineTo(15.0f, 25.2813f)
                lineTo(7.0f, 20.8438f)
                close()
                moveTo(25.0f, 11.625f)
                lineTo(25.0f, 20.8438f)
                lineTo(17.0f, 25.2813f)
                lineTo(17.0f, 15.625f)
                close()
            }
        }
        .build()
        return _cubeSolid!!
    }

private var _cubeSolid: ImageVector? = null
