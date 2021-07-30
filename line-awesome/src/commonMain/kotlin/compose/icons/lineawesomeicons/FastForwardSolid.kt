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

public val LineAwesomeIcons.FastForwardSolid: ImageVector
    get() {
        if (_fastForwardSolid != null) {
            return _fastForwardSolid!!
        }
        _fastForwardSolid = Builder(name = "FastForwardSolid", defaultWidth = 32.0.dp, defaultHeight
                = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 5.0f)
                lineTo(15.0f, 12.375f)
                lineTo(6.5938f, 6.1875f)
                lineTo(5.0f, 5.0313f)
                lineTo(5.0f, 26.9688f)
                lineTo(6.5938f, 25.8125f)
                lineTo(15.0f, 19.625f)
                lineTo(15.0f, 27.0f)
                lineTo(16.5938f, 25.8125f)
                lineTo(28.5938f, 16.8125f)
                lineTo(29.6563f, 16.0f)
                lineTo(28.5938f, 15.1875f)
                lineTo(16.5938f, 6.1875f)
                close()
                moveTo(7.0f, 8.9688f)
                lineTo(15.4063f, 15.1563f)
                lineTo(16.5313f, 16.0f)
                lineTo(15.4063f, 16.8438f)
                lineTo(7.0f, 23.0313f)
                close()
                moveTo(17.0f, 9.0f)
                lineTo(26.3125f, 16.0f)
                lineTo(17.0f, 23.0f)
                close()
            }
        }
        .build()
        return _fastForwardSolid!!
    }

private var _fastForwardSolid: ImageVector? = null
