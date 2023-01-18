package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.VolumeHigh: ImageVector
    get() {
        if (_volumeHigh != null) {
            return _volumeHigh!!
        }
        _volumeHigh = Builder(name = "VolumeHigh", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.0f, 416.0f)
                arcToRelative(23.88f, 23.88f, 0.0f, false, true, -14.2f, -4.68f)
                arcToRelative(8.27f, 8.27f, 0.0f, false, true, -0.66f, -0.51f)
                lineTo(125.76f, 336.0f)
                lineTo(56.0f, 336.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, -24.0f, -24.0f)
                lineTo(32.0f, 200.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, 24.0f, -24.0f)
                horizontalLineToRelative(69.75f)
                lineToRelative(91.37f, -74.81f)
                arcToRelative(8.27f, 8.27f, 0.0f, false, true, 0.66f, -0.51f)
                arcTo(24.0f, 24.0f, 0.0f, false, true, 256.0f, 120.0f)
                lineTo(256.0f, 392.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, -24.0f, 24.0f)
                close()
                moveTo(125.82f, 336.0f)
                close()
                moveTo(125.55f, 176.14f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(320.0f, 336.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -14.29f, -23.19f)
                curveToRelative(9.49f, -18.87f, 14.3f, -38.0f, 14.3f, -56.81f)
                curveToRelative(0.0f, -19.38f, -4.66f, -37.94f, -14.25f, -56.73f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 28.5f, -14.54f)
                curveTo(346.19f, 208.12f, 352.0f, 231.44f, 352.0f, 256.0f)
                curveToRelative(0.0f, 23.86f, -6.0f, 47.81f, -17.7f, 71.19f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 320.0f, 336.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(368.0f, 384.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -13.86f, -24.0f)
                curveTo(373.05f, 327.09f, 384.0f, 299.51f, 384.0f, 256.0f)
                curveToRelative(0.0f, -44.17f, -10.93f, -71.56f, -29.82f, -103.94f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 27.64f, -16.12f)
                curveTo(402.92f, 172.11f, 416.0f, 204.81f, 416.0f, 256.0f)
                curveToRelative(0.0f, 50.43f, -13.06f, 83.29f, -34.13f, 120.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 368.0f, 384.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(416.0f, 432.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -13.39f, -24.74f)
                curveTo(429.85f, 365.47f, 448.0f, 323.76f, 448.0f, 256.0f)
                curveToRelative(0.0f, -66.5f, -18.18f, -108.62f, -45.49f, -151.39f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 27.0f, -17.22f)
                curveTo(459.81f, 134.89f, 480.0f, 181.74f, 480.0f, 256.0f)
                curveToRelative(0.0f, 64.75f, -14.66f, 113.63f, -50.6f, 168.74f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 416.0f, 432.0f)
                close()
            }
        }
        .build()
        return _volumeHigh!!
    }

private var _volumeHigh: ImageVector? = null
