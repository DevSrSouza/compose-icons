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

public val LineAwesomeIcons.Codepen: ImageVector
    get() {
        if (_codepen != null) {
            return _codepen!!
        }
        _codepen = Builder(name = "Codepen", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 2.8438f)
                lineTo(15.4375f, 3.2188f)
                lineTo(3.4375f, 11.25f)
                lineTo(3.0f, 11.5313f)
                lineTo(3.0f, 20.4688f)
                lineTo(3.4375f, 20.75f)
                lineTo(15.4375f, 28.7813f)
                lineTo(16.0f, 29.1563f)
                lineTo(16.5625f, 28.7813f)
                lineTo(28.5625f, 20.75f)
                lineTo(29.0f, 20.4688f)
                lineTo(29.0f, 11.5313f)
                lineTo(28.5625f, 11.25f)
                lineTo(16.5625f, 3.2188f)
                close()
                moveTo(15.0f, 5.9063f)
                lineTo(15.0f, 11.3438f)
                lineTo(9.8438f, 14.8125f)
                lineTo(5.8125f, 12.0938f)
                close()
                moveTo(17.0f, 5.9063f)
                lineTo(26.1875f, 12.0938f)
                lineTo(22.1563f, 14.8125f)
                lineTo(17.0f, 11.3438f)
                close()
                moveTo(16.0f, 13.0938f)
                lineTo(20.3438f, 16.0f)
                lineTo(16.0f, 18.9063f)
                lineTo(11.6563f, 16.0f)
                close()
                moveTo(5.0f, 13.9375f)
                lineTo(8.0625f, 16.0f)
                lineTo(5.0f, 18.0625f)
                close()
                moveTo(27.0f, 13.9375f)
                lineTo(27.0f, 18.0625f)
                lineTo(23.9375f, 16.0f)
                close()
                moveTo(9.875f, 17.1875f)
                lineTo(15.0f, 20.6563f)
                lineTo(15.0f, 26.0938f)
                lineTo(5.8125f, 19.9063f)
                close()
                moveTo(22.125f, 17.1875f)
                lineTo(26.1875f, 19.9063f)
                lineTo(17.0f, 26.0938f)
                lineTo(17.0f, 20.6563f)
                close()
            }
        }
        .build()
        return _codepen!!
    }

private var _codepen: ImageVector? = null
