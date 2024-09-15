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
                moveTo(3.721f, 2.279f)
                lineTo(2.279f, 3.721f)
                lineTo(11.861f, 13.303f)
                lineTo(13.289f, 14.729f)
                lineTo(17.262f, 18.701f)
                lineTo(18.703f, 20.145f)
                lineTo(28.279f, 29.721f)
                lineTo(29.721f, 28.279f)
                lineTo(20.396f, 18.955f)
                lineTo(21.844f, 17.938f)
                curveTo(25.306f, 17.521f, 28.0f, 14.57f, 28.0f, 11.0f)
                curveTo(28.0f, 7.145f, 24.855f, 4.0f, 21.0f, 4.0f)
                curveTo(17.422f, 4.0f, 14.469f, 6.714f, 14.063f, 10.188f)
                lineTo(13.055f, 11.613f)
                lineTo(3.721f, 2.279f)
                close()
                moveTo(21.0f, 6.0f)
                curveTo(23.773f, 6.0f, 26.0f, 8.227f, 26.0f, 11.0f)
                curveTo(26.0f, 12.016f, 25.704f, 12.965f, 25.188f, 13.75f)
                lineTo(18.25f, 6.813f)
                curveTo(19.035f, 6.297f, 19.984f, 6.0f, 21.0f, 6.0f)
                close()
                moveTo(16.813f, 8.25f)
                lineTo(23.75f, 15.188f)
                curveTo(22.965f, 15.703f, 22.016f, 16.0f, 21.0f, 16.0f)
                curveTo(18.227f, 16.0f, 16.0f, 13.773f, 16.0f, 11.0f)
                curveTo(16.0f, 9.984f, 16.298f, 9.035f, 16.813f, 8.25f)
                close()
                moveTo(10.723f, 14.912f)
                lineTo(6.0f, 21.594f)
                lineTo(5.531f, 22.281f)
                lineTo(6.094f, 22.875f)
                lineTo(6.906f, 23.688f)
                lineTo(4.281f, 26.281f)
                lineTo(5.719f, 27.719f)
                lineTo(8.281f, 25.125f)
                lineTo(9.656f, 26.5f)
                lineTo(10.375f, 26.0f)
                lineTo(17.09f, 21.279f)
                lineTo(15.65f, 19.842f)
                lineTo(9.906f, 23.906f)
                lineTo(8.125f, 22.063f)
                lineTo(12.152f, 16.344f)
                lineTo(10.723f, 14.912f)
                close()
            }
        }
        .build()
        return _microphoneAltSlashSolid!!
    }

private var _microphoneAltSlashSolid: ImageVector? = null
