package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.Headset: ImageVector
    get() {
        if (_headset != null) {
            return _headset!!
        }
        _headset = Builder(name = "Headset", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(411.16f, 97.46f)
                curveTo(368.43f, 55.86f, 311.88f, 32.0f, 256.0f, 32.0f)
                reflectiveCurveTo(143.57f, 55.86f, 100.84f, 97.46f)
                curveTo(56.45f, 140.67f, 32.0f, 197.0f, 32.0f, 256.0f)
                curveToRelative(0.0f, 26.67f, 8.75f, 61.09f, 32.88f, 125.55f)
                reflectiveCurveTo(137.0f, 473.0f, 157.27f, 477.41f)
                curveToRelative(5.81f, 1.27f, 12.62f, 2.59f, 18.73f, 2.59f)
                arcToRelative(60.06f, 60.06f, 0.0f, false, false, 30.0f, -8.0f)
                lineToRelative(14.0f, -8.0f)
                curveToRelative(15.07f, -8.82f, 19.47f, -28.13f, 10.8f, -43.35f)
                lineTo(143.88f, 268.08f)
                arcToRelative(31.73f, 31.73f, 0.0f, false, false, -43.57f, -11.76f)
                lineToRelative(-13.69f, 8.0f)
                arcToRelative(56.49f, 56.49f, 0.0f, false, false, -14.0f, 11.59f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -7.0f, -2.0f)
                arcTo(114.68f, 114.68f, 0.0f, false, true, 64.0f, 256.0f)
                curveToRelative(0.0f, -50.31f, 21.0f, -98.48f, 59.16f, -135.61f)
                curveTo(160.0f, 84.55f, 208.39f, 64.0f, 256.0f, 64.0f)
                reflectiveCurveToRelative(96.0f, 20.55f, 132.84f, 56.39f)
                curveTo(427.0f, 157.52f, 448.0f, 205.69f, 448.0f, 256.0f)
                arcToRelative(114.68f, 114.68f, 0.0f, false, true, -1.68f, 17.91f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -7.0f, 2.0f)
                arcToRelative(56.49f, 56.49f, 0.0f, false, false, -14.0f, -11.59f)
                lineToRelative(-13.69f, -8.0f)
                arcToRelative(31.73f, 31.73f, 0.0f, false, false, -43.57f, 11.76f)
                lineTo(281.2f, 420.65f)
                curveToRelative(-8.67f, 15.22f, -4.27f, 34.53f, 10.8f, 43.35f)
                lineToRelative(14.0f, 8.0f)
                arcToRelative(60.06f, 60.06f, 0.0f, false, false, 30.0f, 8.0f)
                curveToRelative(6.11f, 0.0f, 12.92f, -1.32f, 18.73f, -2.59f)
                curveTo(375.0f, 473.0f, 423.0f, 446.0f, 447.12f, 381.55f)
                reflectiveCurveTo(480.0f, 282.67f, 480.0f, 256.0f)
                curveTo(480.0f, 197.0f, 455.55f, 140.67f, 411.16f, 97.46f)
                close()
            }
        }
        .build()
        return _headset!!
    }

private var _headset: ImageVector? = null
