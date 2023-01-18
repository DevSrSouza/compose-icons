package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.VolumeMute: ImageVector
    get() {
        if (_volumeMute != null) {
            return _volumeMute!!
        }
        _volumeMute = Builder(name = "VolumeMute", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(416.0f, 432.0f)
                lineTo(64.0f, 80.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(243.33f, 98.86f)
                arcToRelative(23.89f, 23.89f, 0.0f, false, false, -25.55f, 1.82f)
                lineToRelative(-0.66f, 0.51f)
                lineTo(188.6f, 124.54f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -0.59f, 11.85f)
                lineToRelative(54.33f, 54.33f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 256.0f, 185.06f)
                verticalLineTo(120.57f)
                arcTo(24.51f, 24.51f, 0.0f, false, false, 243.33f, 98.86f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(251.33f, 335.29f)
                lineTo(96.69f, 180.69f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 85.38f, 176.0f)
                horizontalLineTo(56.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, -24.0f, 24.0f)
                verticalLineTo(312.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, 24.0f, 24.0f)
                horizontalLineToRelative(69.76f)
                lineToRelative(92.0f, 75.31f)
                arcTo(23.9f, 23.9f, 0.0f, false, false, 243.63f, 413.0f)
                arcTo(24.51f, 24.51f, 0.0f, false, false, 256.0f, 391.45f)
                verticalLineTo(346.59f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 251.33f, 335.29f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(352.0f, 256.0f)
                curveToRelative(0.0f, -24.56f, -5.81f, -47.87f, -17.75f, -71.27f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, false, -28.5f, 14.55f)
                curveTo(315.34f, 218.06f, 320.0f, 236.62f, 320.0f, 256.0f)
                quadToRelative(0.0f, 4.0f, -0.31f, 8.13f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 2.32f, 6.25f)
                lineToRelative(14.36f, 14.36f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 13.55f, -4.31f)
                arcTo(146.0f, 146.0f, 0.0f, false, false, 352.0f, 256.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(416.0f, 256.0f)
                curveToRelative(0.0f, -51.18f, -13.08f, -83.89f, -34.18f, -120.06f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -27.64f, 16.12f)
                curveTo(373.07f, 184.44f, 384.0f, 211.83f, 384.0f, 256.0f)
                curveToRelative(0.0f, 23.83f, -3.29f, 42.88f, -9.37f, 60.65f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 1.9f, 8.26f)
                lineTo(389.0f, 337.4f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 13.13f, -2.79f)
                curveTo(411.0f, 311.76f, 416.0f, 287.26f, 416.0f, 256.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(480.0f, 256.0f)
                curveToRelative(0.0f, -74.25f, -20.19f, -121.11f, -50.51f, -168.61f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, false, -27.0f, 17.22f)
                curveTo(429.82f, 147.38f, 448.0f, 189.5f, 448.0f, 256.0f)
                curveToRelative(0.0f, 46.19f, -8.43f, 80.27f, -22.43f, 110.53f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 1.59f, 9.0f)
                lineToRelative(11.92f, 11.92f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 452.0f, 385.29f)
                curveTo(471.6f, 344.9f, 480.0f, 305.0f, 480.0f, 256.0f)
                close()
            }
        }
        .build()
        return _volumeMute!!
    }

private var _volumeMute: ImageVector? = null
