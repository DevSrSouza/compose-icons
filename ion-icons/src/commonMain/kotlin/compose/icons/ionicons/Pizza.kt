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

public val IonIcons.Pizza: ImageVector
    get() {
        if (_pizza != null) {
            return _pizza!!
        }
        _pizza = Builder(name = "Pizza", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(441.82f, 67.83f)
                lineToRelative(0.0f, 0.0f)
                curveTo(383.44f, 44.73f, 317.3f, 32.0f, 255.56f, 32.0f)
                curveTo(192.0f, 32.0f, 125.76f, 44.53f, 69.0f, 67.26f)
                curveTo(48.7f, 75.49f, 45.21f, 90.0f, 48.71f, 100.82f)
                lineTo(52.78f, 111.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 21.31f, 8.69f)
                curveToRelative(10.8f, -4.76f, 23.93f, -10.54f, 27.0f, -11.78f)
                curveTo(145.1f, 89.64f, 198.71f, 80.0f, 256.0f, 80.0f)
                curveToRelative(57.47f, 0.0f, 108.09f, 9.24f, 154.76f, 28.25f)
                horizontalLineToRelative(0.0f)
                curveToRelative(4.42f, 1.8f, 14.88f, 6.42f, 26.17f, 11.46f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 21.35f, -8.59f)
                lineTo(462.0f, 102.0f)
                lineToRelative(0.34f, -0.9f)
                curveTo(465.79f, 90.89f, 462.48f, 76.05f, 441.82f, 67.83f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(409.18f, 140.86f)
                curveTo(363.67f, 122.53f, 307.68f, 112.0f, 255.56f, 112.0f)
                arcToRelative(425.0f, 425.0f, 0.0f, false, false, -153.74f, 28.89f)
                curveToRelative(-0.53f, 0.21f, -2.06f, 0.88f, -4.29f, 1.88f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -8.0f, 21.27f)
                curveToRelative(4.0f, 8.71f, 9.42f, 20.58f, 15.5f, 33.89f)
                curveTo(137.94f, 270.0f, 199.21f, 404.0f, 227.26f, 462.0f)
                arcTo(31.74f, 31.74f, 0.0f, false, false, 256.0f, 480.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(31.73f, 31.73f, 0.0f, false, false, 28.76f, -18.06f)
                lineToRelative(0.06f, -0.13f)
                lineToRelative(137.3f, -297.57f)
                arcToRelative(15.94f, 15.94f, 0.0f, false, false, -8.31f, -21.45f)
                curveToRelative(-2.26f, -0.95f, -3.85f, -1.61f, -4.5f, -1.87f)
                close()
                moveTo(194.08f, 223.93f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 29.85f, -29.85f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 194.08f, 223.93f)
                close()
                moveTo(258.08f, 351.93f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 29.85f, -29.85f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 258.08f, 351.93f)
                close()
                moveTo(322.08f, 239.93f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 29.85f, -29.85f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 322.08f, 239.93f)
                close()
            }
        }
        .build()
        return _pizza!!
    }

private var _pizza: ImageVector? = null
