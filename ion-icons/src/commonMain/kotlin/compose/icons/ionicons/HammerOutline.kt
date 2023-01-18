package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.HammerOutline: ImageVector
    get() {
        if (_hammerOutline != null) {
            return _hammerOutline!!
        }
        _hammerOutline = Builder(name = "HammerOutline", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(277.42f, 247.0f)
                arcToRelative(24.68f, 24.68f, 0.0f, false, false, -4.08f, -5.47f)
                lineTo(255.0f, 223.44f)
                arcToRelative(21.63f, 21.63f, 0.0f, false, false, -6.56f, -4.57f)
                arcToRelative(20.93f, 20.93f, 0.0f, false, false, -23.28f, 4.27f)
                curveToRelative(-6.36f, 6.26f, -18.0f, 17.68f, -39.0f, 38.43f)
                curveTo(146.0f, 301.3f, 71.43f, 367.89f, 37.71f, 396.29f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -1.09f, 23.54f)
                lineToRelative(39.0f, 39.43f)
                arcToRelative(16.13f, 16.13f, 0.0f, false, false, 23.67f, -0.89f)
                curveToRelative(29.24f, -34.37f, 96.3f, -109.0f, 136.0f, -148.23f)
                curveToRelative(20.39f, -20.06f, 31.82f, -31.58f, 38.29f, -37.94f)
                arcTo(21.76f, 21.76f, 0.0f, false, false, 277.42f, 247.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(478.43f, 201.0f)
                lineToRelative(-34.31f, -34.0f)
                arcToRelative(5.44f, 5.44f, 0.0f, false, false, -4.0f, -1.59f)
                arcToRelative(5.59f, 5.59f, 0.0f, false, false, -4.0f, 1.59f)
                horizontalLineToRelative(0.0f)
                arcToRelative(11.41f, 11.41f, 0.0f, false, true, -9.55f, 3.27f)
                curveToRelative(-4.48f, -0.49f, -9.25f, -1.88f, -12.33f, -4.86f)
                curveToRelative(-7.0f, -6.86f, 1.09f, -20.36f, -5.07f, -29.0f)
                arcToRelative(242.88f, 242.88f, 0.0f, false, false, -23.08f, -26.72f)
                curveToRelative(-7.06f, -7.0f, -34.81f, -33.47f, -81.55f, -52.53f)
                arcToRelative(123.79f, 123.79f, 0.0f, false, false, -47.0f, -9.24f)
                curveToRelative(-26.35f, 0.0f, -46.61f, 11.76f, -54.0f, 18.51f)
                curveToRelative(-5.88f, 5.32f, -12.0f, 13.77f, -12.0f, 13.77f)
                arcTo(91.29f, 91.29f, 0.0f, false, true, 202.35f, 77.0f)
                arcToRelative(79.53f, 79.53f, 0.0f, false, true, 23.28f, -1.49f)
                curveTo(241.19f, 76.8f, 259.94f, 84.1f, 270.0f, 92.0f)
                curveToRelative(16.21f, 13.0f, 23.18f, 30.39f, 24.27f, 52.83f)
                curveToRelative(0.8f, 16.69f, -15.23f, 37.76f, -30.44f, 54.94f)
                arcToRelative(7.85f, 7.85f, 0.0f, false, false, 0.4f, 10.83f)
                lineToRelative(21.24f, 21.23f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.14f, 0.1f)
                curveToRelative(13.93f, -13.51f, 31.09f, -28.47f, 40.82f, -34.46f)
                reflectiveCurveToRelative(17.58f, -7.68f, 21.35f, -8.09f)
                arcTo(35.71f, 35.71f, 0.0f, false, true, 380.08f, 194.0f)
                arcToRelative(13.65f, 13.65f, 0.0f, false, true, 3.08f, 2.38f)
                curveToRelative(6.46f, 6.56f, 6.07f, 17.28f, -0.5f, 23.74f)
                lineToRelative(-2.0f, 1.89f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, false, 0.0f, 7.84f)
                lineToRelative(34.31f, 34.0f)
                arcToRelative(5.5f, 5.5f, 0.0f, false, false, 4.0f, 1.58f)
                arcToRelative(5.65f, 5.65f, 0.0f, false, false, 4.0f, -1.58f)
                lineTo(478.43f, 209.0f)
                arcTo(5.82f, 5.82f, 0.0f, false, false, 478.43f, 201.0f)
                close()
            }
        }
        .build()
        return _hammerOutline!!
    }

private var _hammerOutline: ImageVector? = null
