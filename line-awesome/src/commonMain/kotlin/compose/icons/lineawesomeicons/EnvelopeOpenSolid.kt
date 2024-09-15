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

public val LineAwesomeIcons.EnvelopeOpenSolid: ImageVector
    get() {
        if (_envelopeOpenSolid != null) {
            return _envelopeOpenSolid!!
        }
        _envelopeOpenSolid = Builder(name = "EnvelopeOpenSolid", defaultWidth = 32.0.dp,
                defaultHeight = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 3.0f)
                lineTo(15.469f, 3.344f)
                lineTo(3.469f, 11.156f)
                lineTo(3.0f, 11.469f)
                lineTo(3.0f, 29.0f)
                lineTo(29.0f, 29.0f)
                lineTo(29.0f, 11.469f)
                lineTo(28.531f, 11.156f)
                lineTo(16.531f, 3.344f)
                close()
                moveTo(16.0f, 5.375f)
                lineTo(26.188f, 12.0f)
                lineTo(16.0f, 18.594f)
                lineTo(5.813f, 12.0f)
                close()
                moveTo(5.0f, 13.844f)
                lineTo(15.469f, 20.625f)
                lineTo(16.0f, 20.969f)
                lineTo(16.531f, 20.625f)
                lineTo(27.0f, 13.844f)
                lineTo(27.0f, 27.0f)
                lineTo(5.0f, 27.0f)
                close()
            }
        }
        .build()
        return _envelopeOpenSolid!!
    }

private var _envelopeOpenSolid: ImageVector? = null
