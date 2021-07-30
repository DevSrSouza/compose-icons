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

public val LineAwesomeIcons.MicrophoneSlashSolid: ImageVector
    get() {
        if (_microphoneSlashSolid != null) {
            return _microphoneSlashSolid!!
        }
        _microphoneSlashSolid = Builder(name = "MicrophoneSlashSolid", defaultWidth = 32.0.dp,
                defaultHeight = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.7188f, 2.2813f)
                lineTo(2.2813f, 3.7188f)
                lineTo(28.2813f, 29.7188f)
                lineTo(29.7188f, 28.2813f)
                lineTo(23.4375f, 22.0f)
                curveTo(24.3984f, 20.9375f, 25.0f, 19.543f, 25.0f, 18.0f)
                lineTo(25.0f, 14.0f)
                lineTo(23.0f, 14.0f)
                lineTo(23.0f, 18.0f)
                curveTo(23.0f, 18.9922f, 22.6367f, 19.8984f, 22.0313f, 20.5938f)
                lineTo(20.625f, 19.1875f)
                curveTo(20.8633f, 18.8594f, 21.0f, 18.4375f, 21.0f, 18.0f)
                lineTo(21.0f, 6.0f)
                curveTo(21.0f, 4.8984f, 20.1016f, 4.0f, 19.0f, 4.0f)
                lineTo(13.0f, 4.0f)
                curveTo(11.8984f, 4.0f, 11.0f, 4.8984f, 11.0f, 6.0f)
                lineTo(11.0f, 9.5625f)
                close()
                moveTo(13.0f, 6.0f)
                lineTo(19.0f, 6.0f)
                lineTo(19.0f, 17.5625f)
                lineTo(13.0f, 11.5625f)
                close()
                moveTo(7.0f, 14.0f)
                lineTo(7.0f, 18.0f)
                curveTo(7.0f, 21.3086f, 9.6914f, 24.0f, 13.0f, 24.0f)
                lineTo(15.0f, 24.0f)
                lineTo(15.0f, 26.0f)
                lineTo(11.0f, 26.0f)
                lineTo(11.0f, 28.0f)
                lineTo(21.0f, 28.0f)
                lineTo(21.0f, 26.0f)
                lineTo(17.0f, 26.0f)
                lineTo(17.0f, 24.0f)
                lineTo(19.0f, 24.0f)
                curveTo(19.2539f, 24.0f, 19.5039f, 23.9688f, 19.75f, 23.9375f)
                lineTo(17.8125f, 22.0f)
                lineTo(13.0f, 22.0f)
                curveTo(10.793f, 22.0f, 9.0f, 20.207f, 9.0f, 18.0f)
                lineTo(9.0f, 14.0f)
                close()
                moveTo(11.0f, 15.1875f)
                lineTo(11.0f, 18.0f)
                curveTo(11.0f, 19.1016f, 11.8984f, 20.0f, 13.0f, 20.0f)
                lineTo(15.8125f, 20.0f)
                lineTo(13.8125f, 18.0f)
                lineTo(13.0f, 18.0f)
                lineTo(13.0f, 17.1875f)
                close()
            }
        }
        .build()
        return _microphoneSlashSolid!!
    }

private var _microphoneSlashSolid: ImageVector? = null
