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

public val LineAwesomeIcons.MicrophoneAltSlashSolid: ImageVector
    get() {
        if (_microphoneAltSlashSolid != null) {
            return _microphoneAltSlashSolid!!
        }
        _microphoneAltSlashSolid = Builder(name = "MicrophoneAltSlashSolid", defaultWidth = 32.0.dp,
                defaultHeight = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.7207f, 2.2793f)
                lineTo(2.2793f, 3.7207f)
                lineTo(11.8613f, 13.3027f)
                lineTo(13.2891f, 14.7285f)
                lineTo(17.2617f, 18.7012f)
                lineTo(18.7031f, 20.1445f)
                lineTo(28.2793f, 29.7207f)
                lineTo(29.7207f, 28.2793f)
                lineTo(20.3965f, 18.9551f)
                lineTo(21.8438f, 17.9375f)
                curveTo(25.3057f, 17.5205f, 28.0f, 14.57f, 28.0f, 11.0f)
                curveTo(28.0f, 7.145f, 24.855f, 4.0f, 21.0f, 4.0f)
                curveTo(17.422f, 4.0f, 14.4695f, 6.7145f, 14.0625f, 10.1875f)
                lineTo(13.0547f, 11.6133f)
                lineTo(3.7207f, 2.2793f)
                close()
                moveTo(21.0f, 6.0f)
                curveTo(23.773f, 6.0f, 26.0f, 8.227f, 26.0f, 11.0f)
                curveTo(26.0f, 12.016f, 25.7035f, 12.965f, 25.1875f, 13.75f)
                lineTo(18.25f, 6.8125f)
                curveTo(19.035f, 6.2965f, 19.984f, 6.0f, 21.0f, 6.0f)
                close()
                moveTo(16.8125f, 8.25f)
                lineTo(23.75f, 15.1875f)
                curveTo(22.965f, 15.7025f, 22.016f, 16.0f, 21.0f, 16.0f)
                curveTo(18.227f, 16.0f, 16.0f, 13.773f, 16.0f, 11.0f)
                curveTo(16.0f, 9.984f, 16.2975f, 9.035f, 16.8125f, 8.25f)
                close()
                moveTo(10.7227f, 14.9121f)
                lineTo(6.0f, 21.5938f)
                lineTo(5.5313f, 22.2813f)
                lineTo(6.0938f, 22.875f)
                lineTo(6.9063f, 23.6875f)
                lineTo(4.2813f, 26.2813f)
                lineTo(5.7188f, 27.7188f)
                lineTo(8.2813f, 25.125f)
                lineTo(9.6563f, 26.5f)
                lineTo(10.375f, 26.0f)
                lineTo(17.0898f, 21.2793f)
                lineTo(15.6504f, 19.8418f)
                lineTo(9.9063f, 23.9063f)
                lineTo(8.125f, 22.0625f)
                lineTo(12.1523f, 16.3438f)
                lineTo(10.7227f, 14.9121f)
                close()
            }
        }
        .build()
        return _microphoneAltSlashSolid!!
    }

private var _microphoneAltSlashSolid: ImageVector? = null
