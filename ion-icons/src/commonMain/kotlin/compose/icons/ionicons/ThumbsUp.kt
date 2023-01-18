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

public val IonIcons.ThumbsUp: ImageVector
    get() {
        if (_thumbsUp != null) {
            return _thumbsUp!!
        }
        _thumbsUp = Builder(name = "ThumbsUp", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(472.06f, 334.0f)
                lineTo(327.9f, 327.87f)
                curveToRelative(-4.61f, -0.36f, -23.9f, -1.21f, -23.9f, -25.87f)
                curveToRelative(0.0f, -23.81f, 19.16f, -25.33f, 24.14f, -25.88f)
                lineTo(472.06f, 270.0f)
                curveToRelative(12.67f, 0.13f, 23.94f, 14.43f, 23.94f, 32.0f)
                reflectiveCurveTo(484.73f, 333.87f, 472.06f, 334.0f)
                close()
                moveTo(330.61f, 202.33f)
                lineTo(437.35f, 194.0f)
                curveTo(450.0f, 194.0f, 464.0f, 210.68f, 464.0f, 227.88f)
                verticalLineToRelative(0.33f)
                curveToRelative(0.0f, 16.32f, -11.14f, 29.62f, -24.88f, 29.79f)
                lineToRelative(-108.45f, -1.73f)
                curveTo(304.0f, 253.0f, 304.0f, 236.83f, 304.0f, 229.88f)
                curveTo(304.0f, 207.0f, 325.8f, 202.73f, 330.61f, 202.33f)
                close()
                moveTo(421.85f, 480.0f)
                lineToRelative(-89.37f, -8.93f)
                curveTo(308.0f, 470.14f, 304.0f, 453.82f, 304.0f, 443.59f)
                curveToRelative(0.0f, -18.38f, 13.41f, -24.6f, 26.67f, -24.6f)
                lineToRelative(91.0f, -3.0f)
                curveToRelative(14.54f, 0.23f, 26.32f, 14.5f, 26.32f, 32.0f)
                reflectiveCurveTo(436.32f, 479.66f, 421.85f, 480.0f)
                close()
                moveTo(456.21f, 408.5f)
                lineTo(329.81f, 402.29f)
                curveToRelative(-9.39f, -0.63f, -25.81f, -3.0f, -25.81f, -26.37f)
                curveToRelative(0.0f, -12.0f, 4.35f, -25.61f, 25.0f, -27.53f)
                lineToRelative(127.19f, -3.88f)
                curveTo(469.35f, 344.65f, 480.0f, 358.0f, 480.0f, 375.91f)
                reflectiveCurveTo(469.35f, 408.34f, 456.21f, 408.49f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(139.34f, 232.84f)
                lineToRelative(1.0f, -2.0f)
                arcToRelative(16.27f, 16.27f, 0.0f, false, true, -6.77f, 7.25f)
                arcTo(16.35f, 16.35f, 0.0f, false, false, 139.34f, 232.84f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(316.06f, 52.62f)
                curveTo(306.63f, 39.32f, 291.0f, 32.0f, 272.0f, 32.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -14.31f, 8.84f)
                curveToRelative(-3.0f, 6.07f, -15.25f, 24.0f, -28.19f, 42.91f)
                curveToRelative(-18.0f, 26.33f, -40.35f, 59.07f, -55.23f, 84.8f)
                lineToRelative(-0.13f, 0.23f)
                curveToRelative(-20.48f, 35.49f, -30.35f, 54.93f, -33.82f, 62.0f)
                horizontalLineToRelative(0.0f)
                lineToRelative(-1.0f, 2.0f)
                arcToRelative(16.35f, 16.35f, 0.0f, false, true, -5.79f, 5.22f)
                lineToRelative(0.0f, 0.0f)
                arcTo(15.82f, 15.82f, 0.0f, false, true, 126.0f, 240.0f)
                horizontalLineTo(100.69f)
                arcTo(84.69f, 84.69f, 0.0f, false, false, 16.0f, 324.69f)
                verticalLineTo(363.3f)
                arcTo(84.69f, 84.69f, 0.0f, false, false, 100.69f, 448.0f)
                horizontalLineToRelative(48.79f)
                arcToRelative(17.55f, 17.55f, 0.0f, false, true, 9.58f, 2.89f)
                curveTo(182.0f, 465.87f, 225.34f, 480.0f, 272.0f, 480.0f)
                curveToRelative(7.45f, 0.0f, 14.19f, -0.14f, 20.27f, -0.38f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 6.2f, -12.68f)
                lineToRelative(-0.1f, -0.14f)
                curveTo(289.8f, 454.41f, 288.0f, 441.0f, 288.0f, 432.0f)
                arcToRelative(61.2f, 61.2f, 0.0f, false, true, 5.19f, -24.77f)
                arcToRelative(17.36f, 17.36f, 0.0f, false, false, 0.0f, -14.05f)
                arcToRelative(63.81f, 63.81f, 0.0f, false, true, 0.0f, -50.39f)
                arcToRelative(17.32f, 17.32f, 0.0f, false, false, 0.0f, -14.0f)
                arcToRelative(62.15f, 62.15f, 0.0f, false, true, 0.0f, -49.59f)
                arcToRelative(18.13f, 18.13f, 0.0f, false, false, 0.0f, -14.68f)
                arcTo(60.33f, 60.33f, 0.0f, false, true, 288.0f, 239.0f)
                curveToRelative(0.0f, -8.2f, 2.0f, -21.3f, 8.0f, -31.19f)
                arcToRelative(15.63f, 15.63f, 0.0f, false, false, 1.14f, -13.64f)
                curveToRelative(-0.38f, -1.0f, -0.76f, -2.07f, -1.13f, -3.17f)
                arcToRelative(24.84f, 24.84f, 0.0f, false, true, -0.86f, -11.58f)
                curveToRelative(3.0f, -19.34f, 9.67f, -36.29f, 16.74f, -54.16f)
                curveToRelative(3.08f, -7.78f, 6.27f, -15.82f, 9.22f, -24.26f)
                curveTo(327.25f, 83.43f, 325.41f, 65.8f, 316.06f, 52.62f)
                close()
            }
        }
        .build()
        return _thumbsUp!!
    }

private var _thumbsUp: ImageVector? = null
