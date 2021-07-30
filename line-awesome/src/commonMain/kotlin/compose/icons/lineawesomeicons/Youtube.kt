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

public val LineAwesomeIcons.Youtube: ImageVector
    get() {
        if (_youtube != null) {
            return _youtube!!
        }
        _youtube = Builder(name = "Youtube", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 6.0f)
                curveTo(12.2344f, 6.0f, 8.9063f, 6.3906f, 6.875f, 6.6875f)
                curveTo(5.1953f, 6.9336f, 3.8398f, 8.1992f, 3.5313f, 9.875f)
                curveTo(3.2695f, 11.3008f, 3.0f, 13.3867f, 3.0f, 16.0f)
                curveTo(3.0f, 18.6133f, 3.2695f, 20.6992f, 3.5313f, 22.125f)
                curveTo(3.8398f, 23.8008f, 5.1953f, 25.0703f, 6.875f, 25.3125f)
                curveTo(8.9141f, 25.6094f, 12.2539f, 26.0f, 16.0f, 26.0f)
                curveTo(19.7461f, 26.0f, 23.0859f, 25.6094f, 25.125f, 25.3125f)
                curveTo(26.8047f, 25.0703f, 28.1602f, 23.8008f, 28.4688f, 22.125f)
                curveTo(28.7305f, 20.6953f, 29.0f, 18.6055f, 29.0f, 16.0f)
                curveTo(29.0f, 13.3945f, 28.7344f, 11.3047f, 28.4688f, 9.875f)
                curveTo(28.1602f, 8.1992f, 26.8047f, 6.9336f, 25.125f, 6.6875f)
                curveTo(23.0938f, 6.3906f, 19.7656f, 6.0f, 16.0f, 6.0f)
                close()
                moveTo(16.0f, 8.0f)
                curveTo(19.6328f, 8.0f, 22.8789f, 8.3711f, 24.8438f, 8.6563f)
                curveTo(25.6875f, 8.7813f, 26.3477f, 9.418f, 26.5f, 10.25f)
                curveTo(26.7422f, 11.5703f, 27.0f, 13.5273f, 27.0f, 16.0f)
                curveTo(27.0f, 18.4688f, 26.7422f, 20.4297f, 26.5f, 21.75f)
                curveTo(26.3477f, 22.582f, 25.6914f, 23.2227f, 24.8438f, 23.3438f)
                curveTo(22.8711f, 23.6289f, 19.6094f, 24.0f, 16.0f, 24.0f)
                curveTo(12.3906f, 24.0f, 9.125f, 23.6289f, 7.1563f, 23.3438f)
                curveTo(6.3125f, 23.2227f, 5.6523f, 22.582f, 5.5f, 21.75f)
                curveTo(5.2578f, 20.4297f, 5.0f, 18.4766f, 5.0f, 16.0f)
                curveTo(5.0f, 13.5195f, 5.2578f, 11.5703f, 5.5f, 10.25f)
                curveTo(5.6523f, 9.418f, 6.3086f, 8.7813f, 7.1563f, 8.6563f)
                curveTo(9.1172f, 8.3711f, 12.3672f, 8.0f, 16.0f, 8.0f)
                close()
                moveTo(13.0f, 10.2813f)
                lineTo(13.0f, 21.7188f)
                lineTo(14.5f, 20.875f)
                lineTo(21.5f, 16.875f)
                lineTo(23.0f, 16.0f)
                lineTo(21.5f, 15.125f)
                lineTo(14.5f, 11.125f)
                close()
                moveTo(15.0f, 13.7188f)
                lineTo(18.9688f, 16.0f)
                lineTo(15.0f, 18.2813f)
                close()
            }
        }
        .build()
        return _youtube!!
    }

private var _youtube: ImageVector? = null
