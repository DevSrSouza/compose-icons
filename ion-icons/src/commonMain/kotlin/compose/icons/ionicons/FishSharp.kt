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

public val IonIcons.FishSharp: ImageVector
    get() {
        if (_fishSharp != null) {
            return _fishSharp!!
        }
        _fishSharp = Builder(name = "FishSharp", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(335.45f, 256.0f)
                arcToRelative(214.83f, 214.83f, 0.0f, false, true, 29.08f, -108.0f)
                lineToRelative(7.62f, -13.26f)
                arcToRelative(280.69f, 280.69f, 0.0f, false, false, -48.64f, -7.15f)
                curveToRelative(-21.94f, -16.9f, -54.64f, -36.95f, -92.34f, -43.33f)
                lineTo(208.0f, 80.0f)
                lineToRelative(13.37f, 61.86f)
                curveTo(179.7f, 156.0f, 142.94f, 184.72f, 118.61f, 204.48f)
                quadToRelative(-7.06f, -5.91f, -14.78f, -11.55f)
                curveToRelative(-39.71f, -29.0f, -82.6f, -31.8f, -84.4f, -31.9f)
                lineTo(0.0f, 160.0f)
                lineToRelative(2.67f, 19.31f)
                curveToRelative(0.29f, 2.0f, 6.79f, 44.73f, 31.65f, 76.52f)
                curveTo(9.46f, 287.63f, 3.0f, 330.33f, 2.67f, 332.36f)
                lineTo(0.0f, 352.0f)
                lineToRelative(19.43f, -1.36f)
                curveToRelative(1.8f, -0.1f, 44.69f, -2.89f, 84.4f, -31.9f)
                quadToRelative(7.58f, -5.53f, 14.56f, -11.37f)
                curveToRelative(24.37f, 19.83f, 61.14f, 48.6f, 102.86f, 62.74f)
                lineTo(208.0f, 432.0f)
                lineToRelative(23.17f, -4.22f)
                curveToRelative(37.49f, -6.34f, 70.08f, -26.4f, 92.0f, -43.32f)
                arcToRelative(284.27f, 284.27f, 0.0f, false, false, 49.32f, -7.23f)
                lineToRelative(-7.91f, -13.18f)
                arcTo(214.92f, 214.92f, 0.0f, false, true, 335.45f, 256.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(499.59f, 221.75f)
                curveToRelative(-5.85f, -9.88f, -16.54f, -24.9f, -34.19f, -40.28f)
                arcToRelative(209.82f, 209.82f, 0.0f, false, false, -62.0f, -37.0f)
                lineTo(392.23f, 164.0f)
                arcToRelative(183.22f, 183.22f, 0.0f, false, false, -0.09f, 183.87f)
                lineToRelative(11.75f, 19.57f)
                arcToRelative(209.26f, 209.26f, 0.0f, false, false, 61.42f, -36.49f)
                curveTo(497.05f, 303.47f, 512.0f, 269.0f, 512.0f, 256.0f)
                curveTo(512.0f, 243.69f, 504.0f, 229.26f, 499.59f, 221.75f)
                close()
                moveTo(416.0f, 256.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 416.0f, 256.0f)
                close()
            }
        }
        .build()
        return _fishSharp!!
    }

private var _fishSharp: ImageVector? = null
