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

public val LineAwesomeIcons.EnvelopeSquareSolid: ImageVector
    get() {
        if (_envelopeSquareSolid != null) {
            return _envelopeSquareSolid!!
        }
        _envelopeSquareSolid = Builder(name = "EnvelopeSquareSolid", defaultWidth = 32.0.dp,
                defaultHeight = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
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
                moveTo(9.0f, 10.0f)
                lineTo(9.0f, 22.0f)
                lineTo(23.0f, 22.0f)
                lineTo(23.0f, 10.0f)
                close()
                moveTo(11.8125f, 12.0f)
                lineTo(20.1875f, 12.0f)
                lineTo(16.0f, 14.7813f)
                close()
                moveTo(11.0f, 13.875f)
                lineTo(15.4375f, 16.8438f)
                lineTo(16.0f, 17.1875f)
                lineTo(16.5625f, 16.8438f)
                lineTo(21.0f, 13.875f)
                lineTo(21.0f, 20.0f)
                lineTo(11.0f, 20.0f)
                close()
            }
        }
        .build()
        return _envelopeSquareSolid!!
    }

private var _envelopeSquareSolid: ImageVector? = null
