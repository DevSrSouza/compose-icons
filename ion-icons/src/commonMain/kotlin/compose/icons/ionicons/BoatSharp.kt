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

public val IonIcons.BoatSharp: ImageVector
    get() {
        if (_boatSharp != null) {
            return _boatSharp!!
        }
        _boatSharp = Builder(name = "BoatSharp", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(477.77f, 246.42f)
                curveToRelative(-2.13f, -6.0f, -7.23f, -9.55f, -12.56f, -11.95f)
                lineTo(432.0f, 221.38f)
                verticalLineTo(92.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -20.0f, -20.0f)
                horizontalLineTo(336.0f)
                verticalLineTo(40.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, -16.0f)
                horizontalLineTo(192.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, 16.0f)
                verticalLineTo(72.0f)
                horizontalLineTo(100.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 80.0f, 92.0f)
                verticalLineTo(221.46f)
                lineTo(46.92f, 234.52f)
                curveToRelative(-5.33f, 2.4f, -10.58f, 6.0f, -12.72f, 12.0f)
                reflectiveCurveToRelative(-3.16f, 11.81f, -1.0f, 19.0f)
                lineTo(84.25f, 415.7f)
                horizontalLineToRelative(1.06f)
                curveToRelative(34.12f, 0.0f, 64.0f, -17.41f, 85.31f, -43.82f)
                curveTo(191.94f, 398.29f, 221.8f, 414.0f, 255.92f, 414.0f)
                reflectiveCurveToRelative(64.0f, -15.76f, 85.31f, -42.17f)
                curveToRelative(21.32f, 26.41f, 51.18f, 43.87f, 85.3f, 43.87f)
                horizontalLineToRelative(1.06f)
                lineToRelative(51.25f, -150.17f)
                curveTo(481.0f, 259.53f, 479.91f, 252.43f, 477.77f, 246.42f)
                close()
                moveTo(256.0f, 152.0f)
                lineTo(112.0f, 208.83f)
                verticalLineTo(108.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                horizontalLineTo(396.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                verticalLineTo(208.76f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(345.22f, 407.0f)
                curveToRelative(-52.25f, 36.26f, -126.35f, 36.25f, -178.6f, 0.0f)
                curveToRelative(0.0f, 0.0f, -45.64f, 63.0f, -94.64f, 63.0f)
                lineToRelative(13.33f, 1.0f)
                curveToRelative(29.86f, 0.0f, 58.65f, -11.73f, 85.31f, -25.59f)
                arcToRelative(185.33f, 185.33f, 0.0f, false, false, 170.6f, 0.0f)
                curveToRelative(26.66f, 13.87f, 55.45f, 25.6f, 85.31f, 25.6f)
                lineToRelative(13.33f, -1.0f)
                curveTo(392.21f, 470.0f, 345.22f, 407.0f, 345.22f, 407.0f)
                close()
            }
        }
        .build()
        return _boatSharp!!
    }

private var _boatSharp: ImageVector? = null
