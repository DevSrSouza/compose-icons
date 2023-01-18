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

public val IonIcons.FastFoodSharp: ImageVector
    get() {
        if (_fastFoodSharp != null) {
            return _fastFoodSharp!!
        }
        _fastFoodSharp = Builder(name = "FastFoodSharp", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(384.0f, 352.0f)
                horizontalLineTo(184.36f)
                lineToRelative(-41.0f, 35.0f)
                lineToRelative(-41.0f, -35.0f)
                horizontalLineTo(16.0f)
                verticalLineToRelative(24.0f)
                curveToRelative(0.0f, 30.59f, 21.13f, 55.51f, 47.26f, 56.0f)
                curveToRelative(2.43f, 15.12f, 8.31f, 28.78f, 17.16f, 39.47f)
                curveTo(93.51f, 487.28f, 112.54f, 496.0f, 134.0f, 496.0f)
                horizontalLineTo(266.0f)
                curveToRelative(21.46f, 0.0f, 40.49f, -8.72f, 53.58f, -24.55f)
                curveToRelative(8.85f, -10.69f, 14.73f, -24.35f, 17.16f, -39.47f)
                curveToRelative(13.88f, -0.25f, 26.35f, -7.4f, 35.0f, -18.63f)
                arcTo(61.26f, 61.26f, 0.0f, false, false, 384.0f, 376.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(105.0f, 320.0f)
                horizontalLineToRelative(0.0f)
                lineToRelative(38.33f, 28.19f)
                lineTo(182.0f, 320.0f)
                horizontalLineTo(384.0f)
                verticalLineToRelative(-8.0f)
                arcToRelative(40.07f, 40.07f, 0.0f, false, false, -32.0f, -39.2f)
                curveToRelative(-0.82f, -29.69f, -13.0f, -54.54f, -35.51f, -72.0f)
                curveTo(295.67f, 184.56f, 267.85f, 176.0f, 236.0f, 176.0f)
                horizontalLineTo(164.0f)
                curveToRelative(-68.22f, 0.0f, -114.43f, 38.77f, -116.0f, 96.8f)
                arcTo(40.07f, 40.07f, 0.0f, false, false, 16.0f, 312.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(89.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(463.08f, 96.0f)
                horizontalLineTo(388.49f)
                lineToRelative(8.92f, -35.66f)
                lineTo(442.0f, 45.0f)
                lineTo(432.0f, 16.0f)
                lineTo(370.0f, 36.0f)
                lineTo(355.51f, 96.0f)
                horizontalLineTo(208.0f)
                verticalLineToRelative(32.0f)
                horizontalLineToRelative(18.75f)
                lineToRelative(1.86f, 16.0f)
                horizontalLineTo(236.0f)
                curveToRelative(39.0f, 0.0f, 73.66f, 10.9f, 100.12f, 31.52f)
                arcTo(121.9f, 121.9f, 0.0f, false, true, 371.0f, 218.07f)
                arcToRelative(124.16f, 124.16f, 0.0f, false, true, 10.73f, 32.65f)
                arcToRelative(72.0f, 72.0f, 0.0f, false, true, 27.89f, 90.9f)
                arcTo(96.0f, 96.0f, 0.0f, false, true, 416.0f, 376.0f)
                curveToRelative(0.0f, 22.34f, -7.6f, 43.63f, -21.4f, 59.95f)
                arcToRelative(80.0f, 80.0f, 0.0f, false, true, -31.83f, 22.95f)
                arcToRelative(109.21f, 109.21f, 0.0f, false, true, -18.53f, 33.0f)
                curveToRelative(-1.18f, 1.42f, -2.39f, 2.81f, -3.63f, 4.15f)
                horizontalLineTo(416.0f)
                curveToRelative(16.0f, 0.0f, 23.0f, -8.0f, 25.0f, -23.0f)
                lineToRelative(36.4f, -345.0f)
                horizontalLineTo(496.0f)
                verticalLineTo(96.0f)
                close()
            }
        }
        .build()
        return _fastFoodSharp!!
    }

private var _fastFoodSharp: ImageVector? = null
