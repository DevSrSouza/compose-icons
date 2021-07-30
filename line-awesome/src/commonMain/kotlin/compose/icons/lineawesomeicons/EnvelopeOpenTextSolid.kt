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

public val LineAwesomeIcons.EnvelopeOpenTextSolid: ImageVector
    get() {
        if (_envelopeOpenTextSolid != null) {
            return _envelopeOpenTextSolid!!
        }
        _envelopeOpenTextSolid = Builder(name = "EnvelopeOpenTextSolid", defaultWidth = 32.0.dp,
                defaultHeight = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 5.0f)
                lineTo(10.0f, 6.9004f)
                lineTo(4.0078f, 10.8027f)
                lineTo(4.0078f, 27.0f)
                lineTo(27.9922f, 27.0f)
                lineTo(27.9922f, 10.8027f)
                lineTo(22.0f, 6.8984f)
                lineTo(22.0f, 5.0f)
                lineTo(10.0f, 5.0f)
                close()
                moveTo(12.0f, 7.0f)
                lineTo(20.0f, 7.0f)
                lineTo(20.0f, 14.6816f)
                lineTo(16.0f, 17.2734f)
                lineTo(12.0f, 14.6816f)
                lineTo(12.0f, 7.0f)
                close()
                moveTo(13.0f, 9.0f)
                lineTo(13.0f, 11.0f)
                lineTo(19.0f, 11.0f)
                lineTo(19.0f, 9.0f)
                lineTo(13.0f, 9.0f)
                close()
                moveTo(10.0f, 9.2852f)
                lineTo(10.0f, 13.3867f)
                lineTo(6.8438f, 11.3418f)
                lineTo(10.0f, 9.2852f)
                close()
                moveTo(22.0f, 9.2852f)
                lineTo(25.1563f, 11.3418f)
                lineTo(22.0f, 13.3867f)
                lineTo(22.0f, 9.2852f)
                close()
                moveTo(13.0f, 12.0f)
                lineTo(13.0f, 14.0f)
                lineTo(19.0f, 14.0f)
                lineTo(19.0f, 12.0f)
                lineTo(13.0f, 12.0f)
                close()
                moveTo(6.0078f, 13.1836f)
                lineTo(16.0f, 19.6563f)
                lineTo(25.9922f, 13.1836f)
                lineTo(25.9922f, 25.0f)
                lineTo(6.0078f, 25.0f)
                lineTo(6.0078f, 13.1836f)
                close()
            }
        }
        .build()
        return _envelopeOpenTextSolid!!
    }

private var _envelopeOpenTextSolid: ImageVector? = null
