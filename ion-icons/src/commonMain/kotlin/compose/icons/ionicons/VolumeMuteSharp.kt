package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Square as StrokeCapSquare
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.VolumeMuteSharp: ImageVector
    get() {
        if (_volumeMuteSharp != null) {
            return _volumeMuteSharp!!
        }
        _volumeMuteSharp = Builder(name = "VolumeMuteSharp", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = StrokeCapSquare, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(416.0f, 432.0f)
                lineTo(64.0f, 80.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(352.0f, 256.0f)
                curveToRelative(0.0f, -24.56f, -5.81f, -47.88f, -17.75f, -71.27f)
                lineTo(327.0f, 170.47f)
                lineTo(298.48f, 185.0f)
                lineToRelative(7.27f, 14.25f)
                curveTo(315.34f, 218.06f, 320.0f, 236.62f, 320.0f, 256.0f)
                arcToRelative(112.91f, 112.91f, 0.0f, false, true, -0.63f, 11.74f)
                lineToRelative(27.32f, 27.32f)
                arcTo(148.8f, 148.8f, 0.0f, false, false, 352.0f, 256.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(416.0f, 256.0f)
                curveToRelative(0.0f, -51.19f, -13.08f, -83.89f, -34.18f, -120.06f)
                lineToRelative(-8.06f, -13.82f)
                lineToRelative(-27.64f, 16.12f)
                lineToRelative(8.06f, 13.82f)
                curveTo(373.07f, 184.44f, 384.0f, 211.83f, 384.0f, 256.0f)
                curveToRelative(0.0f, 25.93f, -3.89f, 46.21f, -11.0f, 65.33f)
                lineToRelative(24.5f, 24.51f)
                curveTo(409.19f, 319.68f, 416.0f, 292.42f, 416.0f, 256.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(480.0f, 256.0f)
                curveToRelative(0.0f, -74.26f, -20.19f, -121.11f, -50.51f, -168.61f)
                lineTo(420.88f, 73.9f)
                lineToRelative(-27.0f, 17.22f)
                lineToRelative(8.61f, 13.49f)
                curveTo(429.82f, 147.38f, 448.0f, 189.5f, 448.0f, 256.0f)
                curveToRelative(0.0f, 48.76f, -9.4f, 84.0f, -24.82f, 115.55f)
                lineToRelative(23.7f, 23.7f)
                curveTo(470.16f, 351.39f, 480.0f, 309.0f, 480.0f, 256.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 72.0f)
                lineToRelative(-73.6f, 58.78f)
                lineToRelative(73.6f, 73.59f)
                lineToRelative(0.0f, -132.37f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(32.0f, 176.1f)
                lineToRelative(0.0f, 159.8f)
                lineToRelative(93.65f, 0.0f)
                lineToRelative(130.35f, 104.1f)
                lineToRelative(0.0f, -100.37f)
                lineToRelative(-163.53f, -163.53f)
                lineToRelative(-60.47f, 0.0f)
                close()
            }
        }
        .build()
        return _volumeMuteSharp!!
    }

private var _volumeMuteSharp: ImageVector? = null
