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

public val IonIcons.Chatbubbles: ImageVector
    get() {
        if (_chatbubbles != null) {
            return _chatbubbles!!
        }
        _chatbubbles = Builder(name = "Chatbubbles", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(60.44f, 389.17f)
                curveToRelative(0.0f, 0.07f, 0.0f, 0.2f, -0.08f, 0.38f)
                curveTo(60.39f, 389.43f, 60.41f, 389.3f, 60.44f, 389.17f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(439.9f, 405.6f)
                arcToRelative(26.77f, 26.77f, 0.0f, false, true, -9.59f, -2.0f)
                lineToRelative(-56.78f, -20.13f)
                lineToRelative(-0.42f, -0.17f)
                arcToRelative(9.88f, 9.88f, 0.0f, false, false, -3.91f, -0.76f)
                arcToRelative(10.32f, 10.32f, 0.0f, false, false, -3.62f, 0.66f)
                curveToRelative(-1.38f, 0.52f, -13.81f, 5.19f, -26.85f, 8.77f)
                curveToRelative(-7.07f, 1.94f, -31.68f, 8.27f, -51.43f, 8.27f)
                curveToRelative(-50.48f, 0.0f, -97.68f, -19.4f, -132.89f, -54.63f)
                arcTo(183.38f, 183.38f, 0.0f, false, true, 100.3f, 215.1f)
                arcToRelative(175.9f, 175.9f, 0.0f, false, true, 4.06f, -37.58f)
                curveToRelative(8.79f, -40.62f, 32.07f, -77.57f, 65.55f, -104.0f)
                arcTo(194.76f, 194.76f, 0.0f, false, true, 290.3f, 32.0f)
                curveToRelative(52.21f, 0.0f, 100.86f, 20.0f, 137.0f, 56.18f)
                curveToRelative(34.16f, 34.27f, 52.88f, 79.33f, 52.73f, 126.87f)
                arcToRelative(177.86f, 177.86f, 0.0f, false, true, -30.3f, 99.15f)
                lineToRelative(-0.19f, 0.28f)
                lineToRelative(-0.74f, 1.0f)
                curveToRelative(-0.17f, 0.23f, -0.34f, 0.45f, -0.5f, 0.68f)
                lineToRelative(-0.15f, 0.27f)
                arcToRelative(21.63f, 21.63f, 0.0f, false, false, -1.08f, 2.09f)
                lineToRelative(15.74f, 55.94f)
                arcToRelative(26.42f, 26.42f, 0.0f, false, true, 1.12f, 7.11f)
                arcTo(24.0f, 24.0f, 0.0f, false, true, 439.9f, 405.6f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(299.87f, 425.39f)
                arcToRelative(15.74f, 15.74f, 0.0f, false, false, -10.29f, -8.1f)
                curveToRelative(-5.78f, -1.53f, -12.52f, -1.27f, -17.67f, -1.65f)
                arcToRelative(201.78f, 201.78f, 0.0f, false, true, -128.82f, -58.75f)
                arcTo(199.21f, 199.21f, 0.0f, false, true, 86.4f, 244.16f)
                curveTo(85.0f, 234.42f, 85.0f, 232.0f, 85.0f, 232.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -28.0f, -10.58f)
                horizontalLineToRelative(0.0f)
                reflectiveCurveTo(49.12f, 230.0f, 45.4f, 238.61f)
                arcToRelative(162.09f, 162.09f, 0.0f, false, false, 11.0f, 150.06f)
                curveTo(59.0f, 393.0f, 59.0f, 395.0f, 58.42f, 399.5f)
                curveToRelative(-2.73f, 14.11f, -7.51f, 39.0f, -10.0f, 51.91f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, 8.0f, 22.92f)
                lineToRelative(0.46f, 0.39f)
                arcTo(24.34f, 24.34f, 0.0f, false, false, 72.0f, 480.0f)
                arcToRelative(23.42f, 23.42f, 0.0f, false, false, 9.0f, -1.79f)
                lineToRelative(53.51f, -20.65f)
                arcToRelative(8.05f, 8.05f, 0.0f, false, true, 5.72f, 0.0f)
                curveToRelative(21.07f, 7.84f, 43.0f, 12.0f, 63.78f, 12.0f)
                arcToRelative(176.0f, 176.0f, 0.0f, false, false, 74.91f, -16.66f)
                curveToRelative(5.46f, -2.56f, 14.0f, -5.34f, 19.0f, -11.12f)
                arcTo(15.0f, 15.0f, 0.0f, false, false, 299.87f, 425.39f)
                close()
            }
        }
        .build()
        return _chatbubbles!!
    }

private var _chatbubbles: ImageVector? = null
