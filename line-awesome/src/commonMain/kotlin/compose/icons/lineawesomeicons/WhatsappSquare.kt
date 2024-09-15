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
                lineTo(12.5f, 22.1f)
                curveTo(13.5f, 22.7f, 14.7f, 23.0f, 16.0f, 23.0f)
                curveTo(19.9f, 23.0f, 23.0f, 19.9f, 23.0f, 16.0f)
                curveTo(23.0f, 12.1f, 19.9f, 9.0f, 16.0f, 9.0f)
                close()
                moveTo(16.0f, 10.5f)
                curveTo(19.0f, 10.5f, 21.5f, 13.0f, 21.5f, 16.0f)
                curveTo(21.5f, 19.0f, 19.0f, 21.5f, 16.0f, 21.5f)
                curveTo(15.0f, 21.5f, 14.101f, 21.201f, 13.301f, 20.801f)
                lineTo(12.801f, 20.5f)
                lineTo(12.199f, 20.699f)
                lineTo(11.199f, 21.0f)
                lineTo(11.5f, 20.0f)
                lineTo(11.699f, 19.4f)
                lineTo(11.4f, 18.9f)
                curveTo(10.9f, 18.1f, 10.6f, 17.1f, 10.6f, 16.1f)
                curveTo(10.5f, 13.0f, 13.0f, 10.5f, 16.0f, 10.5f)
                close()
                moveTo(13.801f, 13.1f)
                curveTo(13.701f, 13.1f, 13.5f, 13.101f, 13.4f, 13.301f)
                curveTo(13.2f, 13.401f, 12.801f, 13.8f, 12.801f, 14.6f)
                curveTo(12.801f, 15.3f, 13.3f, 16.099f, 13.4f, 16.199f)
                curveTo(13.5f, 16.299f, 14.5f, 17.9f, 16.1f, 18.6f)
                curveTo(17.1f, 19.0f, 17.5f, 19.1f, 18.0f, 19.0f)
                curveTo(18.3f, 18.9f, 19.0f, 18.599f, 19.1f, 18.199f)
                curveTo(19.2f, 17.799f, 19.201f, 17.499f, 19.301f, 17.699f)
                curveTo(19.301f, 17.599f, 19.2f, 17.6f, 19.0f, 17.5f)
                curveTo(18.8f, 17.4f, 18.0f, 17.0f, 17.9f, 17.0f)
                curveTo(17.7f, 17.0f, 17.6f, 16.9f, 17.5f, 17.1f)
                curveTo(17.4f, 17.2f, 17.1f, 17.599f, 17.0f, 17.699f)
                curveTo(16.9f, 17.799f, 16.899f, 17.799f, 16.699f, 17.699f)
                curveTo(15.699f, 17.199f, 15.1f, 16.801f, 14.5f, 15.801f)
                curveTo(14.4f, 15.501f, 14.7f, 15.5f, 15.0f, 14.9f)
                curveTo(15.1f, 14.8f, 15.0f, 14.7f, 15.0f, 14.6f)
                curveTo(14.9f, 14.5f, 14.6f, 13.7f, 14.5f, 13.4f)
                curveTo(14.3f, 13.1f, 14.2f, 13.1f, 14.1f, 13.1f)
                lineTo(13.801f, 13.1f)
                close()
            }
        }
        .build()
        return _whatsappSquare!!
    }

private var _whatsappSquare: ImageVector? = null
