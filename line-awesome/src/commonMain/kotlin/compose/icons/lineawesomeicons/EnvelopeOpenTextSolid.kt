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
                lineTo(10.0f, 6.9f)
                lineTo(4.008f, 10.803f)
                lineTo(4.008f, 27.0f)
                lineTo(27.992f, 27.0f)
                lineTo(27.992f, 10.803f)
                lineTo(22.0f, 6.898f)
                lineTo(22.0f, 5.0f)
                lineTo(10.0f, 5.0f)
                close()
                moveTo(12.0f, 7.0f)
                lineTo(20.0f, 7.0f)
                lineTo(20.0f, 14.682f)
                lineTo(16.0f, 17.273f)
                lineTo(12.0f, 14.682f)
                lineTo(12.0f, 7.0f)
                close()
                moveTo(13.0f, 9.0f)
                lineTo(13.0f, 11.0f)
                lineTo(19.0f, 11.0f)
                lineTo(19.0f, 9.0f)
                lineTo(13.0f, 9.0f)
                close()
                moveTo(10.0f, 9.285f)
                lineTo(10.0f, 13.387f)
                lineTo(6.844f, 11.342f)
                lineTo(10.0f, 9.285f)
                close()
                moveTo(22.0f, 9.285f)
                lineTo(25.156f, 11.342f)
                lineTo(22.0f, 13.387f)
                lineTo(22.0f, 9.285f)
                close()
                moveTo(13.0f, 12.0f)
                lineTo(13.0f, 14.0f)
                lineTo(19.0f, 14.0f)
                lineTo(19.0f, 12.0f)
                lineTo(13.0f, 12.0f)
                close()
                moveTo(6.008f, 13.184f)
                lineTo(16.0f, 19.656f)
                lineTo(25.992f, 13.184f)
                lineTo(25.992f, 25.0f)
                lineTo(6.008f, 25.0f)
                lineTo(6.008f, 13.184f)
                close()
            }
        }
        .build()
        return _envelopeOpenTextSolid!!
    }

private var _envelopeOpenTextSolid: ImageVector? = null
