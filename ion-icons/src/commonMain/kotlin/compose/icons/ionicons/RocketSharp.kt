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

public val IonIcons.RocketSharp: ImageVector
    get() {
        if (_rocketSharp != null) {
            return _rocketSharp!!
        }
        _rocketSharp = Builder(name = "RocketSharp", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(477.64f, 38.26f)
                arcToRelative(4.75f, 4.75f, 0.0f, false, false, -3.55f, -3.66f)
                curveToRelative(-58.57f, -14.32f, -193.9f, 36.71f, -267.22f, 110.0f)
                arcToRelative(317.0f, 317.0f, 0.0f, false, false, -35.63f, 42.1f)
                curveToRelative(-22.61f, -2.0f, -45.22f, -0.33f, -64.49f, 8.07f)
                curveTo(52.38f, 218.7f, 36.55f, 281.14f, 32.14f, 308.0f)
                arcToRelative(9.64f, 9.64f, 0.0f, false, false, 10.55f, 11.2f)
                lineTo(130.0f, 309.57f)
                arcToRelative(194.1f, 194.1f, 0.0f, false, false, 1.19f, 19.7f)
                arcToRelative(19.53f, 19.53f, 0.0f, false, false, 5.7f, 12.0f)
                lineTo(170.7f, 375.0f)
                arcToRelative(19.59f, 19.59f, 0.0f, false, false, 12.0f, 5.7f)
                arcToRelative(193.53f, 193.53f, 0.0f, false, false, 19.59f, 1.19f)
                lineToRelative(-9.58f, 87.2f)
                arcToRelative(9.65f, 9.65f, 0.0f, false, false, 11.2f, 10.55f)
                curveToRelative(26.81f, -4.3f, 89.36f, -20.13f, 113.15f, -74.5f)
                curveToRelative(8.4f, -19.27f, 10.12f, -41.77f, 8.18f, -64.27f)
                arcToRelative(317.66f, 317.66f, 0.0f, false, false, 42.21f, -35.64f)
                curveTo(441.0f, 232.05f, 491.74f, 99.74f, 477.64f, 38.26f)
                close()
                moveTo(294.07f, 217.93f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, true, 67.86f, 0.0f)
                arcTo(47.95f, 47.95f, 0.0f, false, true, 294.07f, 217.93f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(168.4f, 399.43f)
                curveToRelative(-5.48f, 5.49f, -14.27f, 7.63f, -24.85f, 9.46f)
                curveToRelative(-23.77f, 4.05f, -44.76f, -16.49f, -40.49f, -40.52f)
                curveToRelative(1.63f, -9.11f, 6.45f, -21.88f, 9.45f, -24.88f)
                arcToRelative(4.37f, 4.37f, 0.0f, false, false, -3.65f, -7.45f)
                arcToRelative(60.0f, 60.0f, 0.0f, false, false, -35.13f, 17.12f)
                curveTo(50.22f, 376.69f, 48.0f, 464.0f, 48.0f, 464.0f)
                reflectiveCurveToRelative(87.36f, -2.22f, 110.87f, -25.75f)
                arcTo(59.69f, 59.69f, 0.0f, false, false, 176.0f, 403.09f)
                curveTo(176.37f, 398.91f, 171.28f, 396.42f, 168.4f, 399.43f)
                close()
            }
        }
        .build()
        return _rocketSharp!!
    }

private var _rocketSharp: ImageVector? = null
