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

public val LineAwesomeIcons.RulerSolid: ImageVector
    get() {
        if (_rulerSolid != null) {
            return _rulerSolid!!
        }
        _rulerSolid = Builder(name = "RulerSolid", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.5313f, 3.5938f)
                lineTo(3.5938f, 20.5313f)
                lineTo(11.4688f, 28.4063f)
                lineTo(28.4063f, 11.4688f)
                close()
                moveTo(20.5313f, 6.4375f)
                lineTo(25.5625f, 11.4688f)
                lineTo(11.4688f, 25.5625f)
                lineTo(6.4375f, 20.5313f)
                lineTo(7.5938f, 19.375f)
                lineTo(9.75f, 21.5313f)
                lineTo(11.1875f, 20.125f)
                lineTo(9.0f, 17.9375f)
                lineTo(10.1875f, 16.7813f)
                lineTo(11.0625f, 17.6563f)
                lineTo(12.4688f, 16.2188f)
                lineTo(11.5938f, 15.375f)
                lineTo(12.7813f, 14.1875f)
                lineTo(14.9375f, 16.3438f)
                lineTo(16.3438f, 14.9375f)
                lineTo(14.1875f, 12.7813f)
                lineTo(15.375f, 11.5938f)
                lineTo(16.2188f, 12.4688f)
                lineTo(17.6563f, 11.0625f)
                lineTo(16.7813f, 10.1875f)
                lineTo(17.9375f, 9.0f)
                lineTo(20.125f, 11.1875f)
                lineTo(21.5313f, 9.75f)
                lineTo(19.375f, 7.5938f)
                close()
            }
        }
        .build()
        return _rulerSolid!!
    }

private var _rulerSolid: ImageVector? = null
