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

public val LineAwesomeIcons.WhatsappSquare: ImageVector
    get() {
        if (_whatsappSquare != null) {
            return _whatsappSquare!!
        }
        _whatsappSquare = Builder(name = "WhatsappSquare", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 5.0f)
                lineTo(5.0f, 27.0f)
                lineTo(27.0f, 27.0f)
                lineTo(27.0f, 5.0f)
                lineTo(5.0f, 5.0f)
                close()
                moveTo(7.0f, 7.0f)
                lineTo(25.0f, 7.0f)
                lineTo(25.0f, 25.0f)
                lineTo(7.0f, 25.0f)
                lineTo(7.0f, 7.0f)
                close()
                moveTo(16.0f, 9.0f)
                curveTo(12.1f, 9.0f, 9.0f, 12.1f, 9.0f, 16.0f)
                curveTo(9.0f, 17.3f, 9.4f, 18.5f, 10.0f, 19.5f)
                lineTo(9.0f, 23.0f)
                lineTo(12.5f, 22.0996f)
                curveTo(13.5f, 22.6996f, 14.7f, 23.0f, 16.0f, 23.0f)
                curveTo(19.9f, 23.0f, 23.0f, 19.9f, 23.0f, 16.0f)
                curveTo(23.0f, 12.1f, 19.9f, 9.0f, 16.0f, 9.0f)
                close()
                moveTo(16.0f, 10.5f)
                curveTo(19.0f, 10.5f, 21.5f, 13.0f, 21.5f, 16.0f)
                curveTo(21.5f, 19.0f, 19.0f, 21.5f, 16.0f, 21.5f)
                curveTo(15.0f, 21.5f, 14.1008f, 21.2008f, 13.3008f, 20.8008f)
                lineTo(12.8008f, 20.5f)
                lineTo(12.1992f, 20.6992f)
                lineTo(11.1992f, 21.0f)
                lineTo(11.5f, 20.0f)
                lineTo(11.6992f, 19.4004f)
                lineTo(11.4004f, 18.9004f)
                curveTo(10.9004f, 18.1004f, 10.5996f, 17.0996f, 10.5996f, 16.0996f)
                curveTo(10.4996f, 12.9996f, 13.0f, 10.5f, 16.0f, 10.5f)
                close()
                moveTo(13.8008f, 13.0996f)
                curveTo(13.7008f, 13.0996f, 13.5004f, 13.1008f, 13.4004f, 13.3008f)
                curveTo(13.2004f, 13.4008f, 12.8008f, 13.7996f, 12.8008f, 14.5996f)
                curveTo(12.8008f, 15.2996f, 13.3004f, 16.0992f, 13.4004f, 16.1992f)
                curveTo(13.5004f, 16.2992f, 14.4996f, 17.8996f, 16.0996f, 18.5996f)
                curveTo(17.0996f, 18.9996f, 17.5f, 19.1f, 18.0f, 19.0f)
                curveTo(18.3f, 18.9f, 18.9996f, 18.5992f, 19.0996f, 18.1992f)
                curveTo(19.1996f, 17.7992f, 19.2008f, 17.4992f, 19.3008f, 17.6992f)
                curveTo(19.3008f, 17.5992f, 19.2f, 17.6f, 19.0f, 17.5f)
                curveTo(18.8f, 17.4f, 18.0004f, 17.0f, 17.9004f, 17.0f)
                curveTo(17.7004f, 17.0f, 17.6f, 16.8996f, 17.5f, 17.0996f)
                curveTo(17.4f, 17.1996f, 17.1f, 17.5992f, 17.0f, 17.6992f)
                curveTo(16.9f, 17.7992f, 16.8992f, 17.7992f, 16.6992f, 17.6992f)
                curveTo(15.6992f, 17.1992f, 15.1f, 16.8008f, 14.5f, 15.8008f)
                curveTo(14.4f, 15.5008f, 14.7f, 15.5004f, 15.0f, 14.9004f)
                curveTo(15.1f, 14.8004f, 15.0f, 14.6996f, 15.0f, 14.5996f)
                curveTo(14.9f, 14.4996f, 14.6f, 13.7004f, 14.5f, 13.4004f)
                curveTo(14.3f, 13.1004f, 14.1996f, 13.0996f, 14.0996f, 13.0996f)
                lineTo(13.8008f, 13.0996f)
                close()
            }
        }
        .build()
        return _whatsappSquare!!
    }

private var _whatsappSquare: ImageVector? = null
