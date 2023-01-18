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

public val IonIcons.FingerPrintSharp: ImageVector
    get() {
        if (_fingerPrintSharp != null) {
            return _fingerPrintSharp!!
        }
        _fingerPrintSharp = Builder(name = "FingerPrintSharp", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(56.79f, 200.58f)
                lineToRelative(12.36f, 7.5f)
                lineTo(76.5f, 194.5f)
                curveTo(93.07f, 166.75f, 143.78f, 102.0f, 256.0f, 102.0f)
                curveTo(371.0f, 102.0f, 420.0f, 172.32f, 436.1f, 195.46f)
                lineToRelative(8.16f, 12.7f)
                lineTo(469.88f, 192.0f)
                lineToRelative(-8.54f, -13.36f)
                curveToRelative(-8.88f, -12.85f, -27.52f, -39.53f, -60.78f, -63.1f)
                curveTo(360.15f, 86.82f, 311.5f, 72.25f, 256.0f, 72.25f)
                curveToRelative(-128.07f, 0.0f, -186.69f, 75.11f, -206.0f, 107.25f)
                lineTo(42.63f, 192.0f)
                lineTo(54.0f, 198.86f)
                arcToRelative(14.09f, 14.09f, 0.0f, false, false, 1.63f, 1.1f)
                arcTo(12.57f, 12.57f, 0.0f, false, false, 56.79f, 200.58f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(379.22f, 172.32f)
                curveTo(343.68f, 143.39f, 301.1f, 128.07f, 256.0f, 128.07f)
                curveToRelative(-97.52f, 0.0f, -162.31f, 66.0f, -183.33f, 131.47f)
                curveTo(53.42f, 320.0f, 76.82f, 407.61f, 77.8f, 411.36f)
                lineToRelative(4.38f, 13.81f)
                lineToRelative(29.93f, -6.43f)
                lineToRelative(-4.74f, -15.0f)
                curveToRelative(-0.21f, -0.75f, -22.1f, -82.93f, -5.41f, -135.21f)
                curveToRelative(9.0f, -28.08f, 27.73f, -55.4f, 51.35f, -74.79f)
                curveTo(181.81f, 170.39f, 217.35f, 158.0f, 256.0f, 158.0f)
                curveToRelative(90.58f, 0.0f, 141.93f, 70.61f, 156.45f, 108.11f)
                curveToRelative(11.27f, 28.93f, 8.67f, 61.82f, -6.28f, 82.0f)
                curveToRelative(-5.53f, 7.39f, -15.28f, 16.07f, -30.12f, 15.32f)
                curveToRelative(-33.81f, -1.72f, -39.66f, -18.43f, -47.79f, -50.25f)
                curveToRelative(-3.9f, -15.32f, -7.9f, -31.18f, -17.87f, -44.0f)
                curveToRelative(-12.14f, -15.75f, -29.8f, -23.36f, -54.28f, -23.36f)
                curveToRelative(-26.33f, 0.0f, -46.27f, 8.68f, -59.38f, 25.72f)
                curveToRelative(-28.6f, 37.28f, -10.0f, 100.93f, -9.21f, 103.61f)
                lineToRelative(0.22f, 0.85f)
                curveToRelative(1.41f, 3.86f, 36.08f, 96.65f, 128.93f, 119.68f)
                lineToRelative(14.77f, 3.21f)
                lineToRelative(8.09f, -28.71f)
                lineToRelative(-15.27f, -3.43f)
                curveToRelative(-74.22f, -18.43f, -105.21f, -94.39f, -107.59f, -100.39f)
                arcToRelative(152.44f, 152.44f, 0.0f, false, true, -5.1f, -29.79f)
                curveToRelative(-1.08f, -14.46f, -0.32f, -34.39f, 9.43f, -47.14f)
                curveToRelative(7.15f, -9.32f, 18.64f, -13.82f, 35.0f, -13.82f)
                curveToRelative(29.79f, 0.0f, 34.78f, 14.57f, 42.58f, 44.79f)
                curveToRelative(7.58f, 29.46f, 18.0f, 69.85f, 75.84f, 72.75f)
                curveToRelative(22.21f, 1.07f, 42.26f, -8.79f, 56.34f, -27.65f)
                curveToRelative(21.13f, -28.28f, 25.14f, -71.57f, 10.19f, -110.14f)
                curveTo(429.27f, 225.0f, 406.74f, 194.82f, 379.22f, 172.32f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(154.18f, 343.21f)
                curveToRelative(-3.47f, -28.28f, 1.41f, -71.0f, 26.55f, -98.78f)
                curveToRelative(17.44f, -19.29f, 42.79f, -29.0f, 75.19f, -29.0f)
                curveToRelative(37.49f, 0.0f, 65.87f, 16.72f, 84.51f, 49.61f)
                arcToRelative(154.0f, 154.0f, 0.0f, false, true, 17.88f, 53.25f)
                lineToRelative(1.43f, 14.69f)
                lineToRelative(30.0f, -2.2f)
                arcToRelative(112.63f, 112.63f, 0.0f, false, false, -1.0f, -15.6f)
                curveToRelative(-0.11f, -1.28f, -3.57f, -32.46f, -21.0f, -63.75f)
                curveTo(343.68f, 208.32f, 305.11f, 185.5f, 256.0f, 185.5f)
                curveToRelative(-41.5f, 0.0f, -74.55f, 13.18f, -98.06f, 39.11f)
                curveToRelative(-31.85f, 35.14f, -38.35f, 86.25f, -33.91f, 122.35f)
                verticalLineToRelative(0.33f)
                curveTo(132.0f, 401.82f, 153.0f, 445.43f, 190.15f, 484.43f)
                lineToRelative(11.6f, 11.22f)
                lineToRelative(20.95f, -21.79f)
                lineToRelative(-10.34f, -9.79f)
                curveTo(179.64f, 429.79f, 161.11f, 391.43f, 154.18f, 343.21f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(132.47f, 72.66f)
                curveTo(143.55f, 65.94f, 182.74f, 45.89f, 256.0f, 45.89f)
                curveToRelative(87.54f, 0.0f, 126.44f, 28.72f, 126.87f, 28.93f)
                lineToRelative(13.9f, 8.86f)
                lineTo(413.0f, 58.47f)
                lineToRelative(-13.22f, -8.56f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-0.52f, -0.38f, -1.06f, -0.76f, -1.6f, -1.12f)
                curveTo(385.5f, 40.54f, 340.54f, 16.0f, 256.0f, 16.0f)
                curveToRelative(-87.71f, 0.0f, -132.75f, 26.48f, -143.41f, 33.71f)
                horizontalLineToRelative(0.0f)
                lineTo(99.0f, 58.52f)
                lineToRelative(16.2f, 25.21f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(390.59f, 415.21f)
                curveToRelative(-33.37f, 3.75f, -60.45f, -2.67f, -80.71f, -18.85f)
                curveToRelative(-34.24f, -27.43f, -38.68f, -75.11f, -38.79f, -76.0f)
                lineToRelative(-1.23f, -14.88f)
                lineToRelative(-30.53f, 2.23f)
                lineToRelative(1.31f, 15.0f)
                curveToRelative(0.22f, 2.46f, 5.2f, 60.75f, 49.62f, 96.54f)
                curveToRelative(22.11f, 17.89f, 49.74f, 26.89f, 82.24f, 26.89f)
                arcToRelative(187.0f, 187.0f, 0.0f, false, false, 21.56f, -1.29f)
                lineToRelative(16.59f, -2.09f)
                lineToRelative(-6.1f, -29.71f)
                close()
            }
        }
        .build()
        return _fingerPrintSharp!!
    }

private var _fingerPrintSharp: ImageVector? = null
