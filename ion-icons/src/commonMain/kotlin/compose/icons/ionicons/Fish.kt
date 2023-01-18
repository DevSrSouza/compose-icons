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

public val IonIcons.Fish: ImageVector
    get() {
        if (_fish != null) {
            return _fish!!
        }
        _fish = Builder(name = "Fish", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(512.0f, 256.0f)
                curveToRelative(0.0f, -16.54f, -14.27f, -46.76f, -45.61f, -74.0f)
                arcToRelative(207.06f, 207.06f, 0.0f, false, false, -60.28f, -36.12f)
                arcToRelative(3.15f, 3.15f, 0.0f, false, false, -3.93f, 1.56f)
                curveToRelative(-0.15f, 0.29f, -0.3f, 0.57f, -0.47f, 0.86f)
                lineToRelative(-9.59f, 15.9f)
                arcToRelative(183.24f, 183.24f, 0.0f, false, false, 0.07f, 183.78f)
                lineToRelative(0.23f, 0.39f)
                lineToRelative(8.74f, 16.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.94f, 1.82f)
                curveTo(479.63f, 337.42f, 512.0f, 281.49f, 512.0f, 256.0f)
                close()
                moveTo(418.08f, 255.86f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 13.79f, -13.79f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 418.08f, 255.86f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(335.45f, 256.0f)
                arcToRelative(214.8f, 214.8f, 0.0f, false, true, 29.08f, -108.0f)
                lineToRelative(0.12f, -0.21f)
                lineToRelative(4.62f, -7.67f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -2.59f, -6.0f)
                arcToRelative(284.29f, 284.29f, 0.0f, false, false, -39.26f, -5.39f)
                arcToRelative(7.94f, 7.94f, 0.0f, false, true, -4.29f, -1.6f)
                curveToRelative(-19.28f, -14.66f, -57.5f, -40.3f, -96.46f, -46.89f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -18.0f, 20.18f)
                lineToRelative(10.62f, 37.17f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -2.42f, 4.84f)
                curveToRelative(-36.85f, 13.69f, -68.59f, 38.75f, -91.74f, 57.85f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -10.06f, 0.06f)
                quadToRelative(-4.72f, -3.75f, -9.69f, -7.39f)
                curveTo(65.74f, 164.0f, 19.17f, 160.19f, 17.21f, 160.05f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 0.38f, 179.45f)
                curveToRelative(0.42f, 1.93f, 9.19f, 40.69f, 31.7f, 71.61f)
                arcToRelative(8.09f, 8.09f, 0.0f, false, true, 0.0f, 9.55f)
                curveTo(9.57f, 291.52f, 0.8f, 330.29f, 0.38f, 332.22f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.83f, 19.4f)
                curveToRelative(2.0f, -0.14f, 48.53f, -4.0f, 88.12f, -32.88f)
                quadToRelative(4.85f, -3.56f, 9.47f, -7.22f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 10.06f, 0.07f)
                curveToRelative(23.25f, 19.19f, 55.05f, 44.28f, 92.0f, 58.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 2.42f, 4.83f)
                lineTo(208.62f, 411.6f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 18.0f, 20.18f)
                curveToRelative(17.16f, -2.9f, 51.88f, -12.86f, 96.05f, -46.83f)
                arcToRelative(8.15f, 8.15f, 0.0f, false, true, 4.36f, -1.65f)
                arcTo(287.36f, 287.36f, 0.0f, false, false, 366.25f, 378.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.69f, -5.83f)
                lineToRelative(-4.51f, -8.29f)
                arcTo(214.81f, 214.81f, 0.0f, false, true, 335.45f, 256.0f)
                close()
            }
        }
        .build()
        return _fish!!
    }

private var _fish: ImageVector? = null
