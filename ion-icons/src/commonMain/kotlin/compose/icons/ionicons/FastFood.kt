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

public val IonIcons.FastFood: ImageVector
    get() {
        if (_fastFood != null) {
            return _fastFood!!
        }
        _fastFood = Builder(name = "FastFood", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(368.0f, 128.0f)
                horizontalLineToRelative(0.09f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(479.55f, 96.0f)
                horizontalLineTo(388.49f)
                lineToRelative(8.92f, -35.66f)
                lineToRelative(38.32f, -13.05f)
                curveToRelative(8.15f, -2.77f, 13.0f, -11.43f, 10.65f, -19.71f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -20.54f, -10.73f)
                lineToRelative(-47.0f, 16.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -10.36f, 11.27f)
                lineTo(355.51f, 96.0f)
                horizontalLineTo(224.45f)
                curveToRelative(-8.61f, 0.0f, -16.0f, 6.62f, -16.43f, 15.23f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 224.0f, 128.0f)
                horizontalLineToRelative(2.75f)
                lineToRelative(1.0f, 8.66f)
                arcTo(8.3f, 8.3f, 0.0f, false, false, 236.0f, 144.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(39.0f, 0.0f, 73.66f, 10.9f, 100.12f, 31.52f)
                arcTo(121.9f, 121.9f, 0.0f, false, true, 371.0f, 218.07f)
                arcToRelative(123.4f, 123.4f, 0.0f, false, true, 10.12f, 29.51f)
                arcToRelative(7.83f, 7.83f, 0.0f, false, false, 3.29f, 4.88f)
                arcToRelative(72.0f, 72.0f, 0.0f, false, true, 26.38f, 86.43f)
                arcToRelative(7.92f, 7.92f, 0.0f, false, false, -0.15f, 5.53f)
                arcTo(96.0f, 96.0f, 0.0f, false, true, 416.0f, 376.0f)
                curveToRelative(0.0f, 22.34f, -7.6f, 43.63f, -21.4f, 59.95f)
                arcToRelative(80.12f, 80.12f, 0.0f, false, true, -28.78f, 21.67f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -4.21f, 4.37f)
                arcToRelative(108.19f, 108.19f, 0.0f, false, true, -17.37f, 29.86f)
                lineToRelative(0.0f, 0.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 1.9f, 4.11f)
                horizontalLineToRelative(49.21f)
                arcToRelative(48.22f, 48.22f, 0.0f, false, false, 47.85f, -44.14f)
                lineTo(477.4f, 128.0f)
                horizontalLineTo(480.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.77f)
                curveTo(495.58f, 102.62f, 488.16f, 96.0f, 479.55f, 96.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(108.69f, 320.0f)
                arcToRelative(23.87f, 23.87f, 0.0f, false, true, 17.0f, 7.0f)
                lineToRelative(15.51f, 15.51f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 5.66f, 0.0f)
                lineTo(162.34f, 327.0f)
                arcToRelative(23.87f, 23.87f, 0.0f, false, true, 17.0f, -7.0f)
                horizontalLineTo(375.92f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.08f, -7.92f)
                verticalLineTo(312.0f)
                arcToRelative(40.07f, 40.07f, 0.0f, false, false, -32.0f, -39.2f)
                curveToRelative(-0.82f, -29.69f, -13.0f, -54.54f, -35.51f, -72.0f)
                curveTo(295.67f, 184.56f, 267.85f, 176.0f, 236.0f, 176.0f)
                horizontalLineTo(164.0f)
                curveToRelative(-68.22f, 0.0f, -114.43f, 38.77f, -116.0f, 96.8f)
                arcTo(40.07f, 40.07f, 0.0f, false, false, 16.0f, 312.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, 8.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(185.94f, 352.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -5.66f, 2.34f)
                lineToRelative(-22.14f, 22.15f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, -28.28f, 0.0f)
                lineToRelative(-22.14f, -22.15f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -5.66f, -2.34f)
                horizontalLineTo(32.66f)
                arcTo(15.93f, 15.93f, 0.0f, false, false, 16.9f, 365.17f)
                arcTo(65.22f, 65.22f, 0.0f, false, false, 16.0f, 376.0f)
                curveToRelative(0.0f, 30.59f, 21.13f, 55.51f, 47.26f, 56.0f)
                curveToRelative(2.43f, 15.12f, 8.31f, 28.78f, 17.16f, 39.47f)
                curveTo(93.51f, 487.28f, 112.54f, 496.0f, 134.0f, 496.0f)
                horizontalLineTo(266.0f)
                curveToRelative(21.46f, 0.0f, 40.49f, -8.72f, 53.58f, -24.55f)
                curveToRelative(8.85f, -10.69f, 14.73f, -24.35f, 17.16f, -39.47f)
                curveToRelative(26.13f, -0.47f, 47.26f, -25.39f, 47.26f, -56.0f)
                arcToRelative(65.22f, 65.22f, 0.0f, false, false, -0.9f, -10.83f)
                arcTo(15.93f, 15.93f, 0.0f, false, false, 367.34f, 352.0f)
                close()
            }
        }
        .build()
        return _fastFood!!
    }

private var _fastFood: ImageVector? = null
