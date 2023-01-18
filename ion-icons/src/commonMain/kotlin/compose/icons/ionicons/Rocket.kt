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

public val IonIcons.Rocket: ImageVector
    get() {
        if (_rocket != null) {
            return _rocket!!
        }
        _rocket = Builder(name = "Rocket", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(328.85f, 156.79f)
                arcToRelative(26.69f, 26.69f, 0.0f, true, false, 18.88f, 7.81f)
                arcTo(26.6f, 26.6f, 0.0f, false, false, 328.85f, 156.79f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(477.44f, 50.06f)
                arcToRelative(0.29f, 0.29f, 0.0f, false, true, 0.0f, -0.09f)
                arcToRelative(20.4f, 20.4f, 0.0f, false, false, -15.13f, -15.3f)
                curveToRelative(-29.8f, -7.27f, -76.68f, 0.48f, -128.63f, 21.28f)
                curveToRelative(-52.36f, 21.0f, -101.42f, 52.0f, -134.58f, 85.22f)
                arcTo(320.7f, 320.7f, 0.0f, false, false, 169.55f, 175.0f)
                curveToRelative(-22.33f, -1.0f, -42.0f, 2.18f, -58.57f, 9.41f)
                curveToRelative(-57.74f, 25.41f, -74.23f, 90.44f, -78.62f, 117.14f)
                arcToRelative(25.0f, 25.0f, 0.0f, false, false, 27.19f, 29.0f)
                horizontalLineToRelative(0.13f)
                lineTo(124.0f, 323.53f)
                curveToRelative(0.08f, 0.82f, 0.17f, 1.57f, 0.24f, 2.26f)
                arcToRelative(34.36f, 34.36f, 0.0f, false, false, 9.9f, 20.72f)
                lineToRelative(31.39f, 31.41f)
                arcToRelative(34.27f, 34.27f, 0.0f, false, false, 20.71f, 9.91f)
                lineToRelative(2.15f, 0.23f)
                lineToRelative(-7.0f, 64.24f)
                reflectiveCurveToRelative(0.0f, 0.08f, 0.0f, 0.13f)
                arcTo(25.0f, 25.0f, 0.0f, false, false, 206.0f, 480.0f)
                arcToRelative(25.25f, 25.25f, 0.0f, false, false, 4.15f, -0.34f)
                curveTo(237.0f, 475.34f, 302.0f, 459.05f, 327.34f, 401.0f)
                curveToRelative(7.17f, -16.46f, 10.34f, -36.05f, 9.45f, -58.34f)
                arcToRelative(314.78f, 314.78f, 0.0f, false, false, 33.95f, -29.55f)
                curveToRelative(33.43f, -33.26f, 64.53f, -81.92f, 85.31f, -133.52f)
                curveTo(476.74f, 128.23f, 484.53f, 81.0f, 477.44f, 50.06f)
                close()
                moveTo(370.38f, 224.94f)
                arcToRelative(58.77f, 58.77f, 0.0f, true, true, 0.0f, -83.07f)
                arcTo(58.3f, 58.3f, 0.0f, false, true, 370.38f, 224.94f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(161.93f, 386.44f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -11.0f, 2.67f)
                curveToRelative(-6.39f, 4.37f, -12.81f, 8.69f, -19.29f, 12.9f)
                curveToRelative(-13.11f, 8.52f, -28.79f, -6.44f, -21.0f, -20.0f)
                lineToRelative(12.15f, -21.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -15.16f, -24.91f)
                arcTo(61.25f, 61.25f, 0.0f, false, false, 72.0f, 353.56f)
                curveToRelative(-3.66f, 3.67f, -14.79f, 14.81f, -20.78f, 57.26f)
                arcTo(357.94f, 357.94f, 0.0f, false, false, 48.0f, 447.59f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 64.0f, 464.0f)
                horizontalLineToRelative(0.4f)
                arcToRelative(359.87f, 359.87f, 0.0f, false, false, 36.8f, -3.2f)
                curveToRelative(42.47f, -6.0f, 53.61f, -17.14f, 57.27f, -20.8f)
                arcToRelative(60.49f, 60.49f, 0.0f, false, false, 17.39f, -35.74f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 161.93f, 386.44f)
                close()
            }
        }
        .build()
        return _rocket!!
    }

private var _rocket: ImageVector? = null
