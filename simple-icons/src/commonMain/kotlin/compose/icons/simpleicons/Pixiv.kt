package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Pixiv: ImageVector
    get() {
        if (_pixiv != null) {
            return _pixiv!!
        }
        _pixiv = Builder(name = "Pixiv", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.935f, 0.0f)
                arcTo(4.924f, 4.924f, 0.0f, false, false, 0.0f, 4.935f)
                verticalLineToRelative(14.13f)
                arcTo(4.924f, 4.924f, 0.0f, false, false, 4.935f, 24.0f)
                horizontalLineToRelative(14.13f)
                arcTo(4.924f, 4.924f, 0.0f, false, false, 24.0f, 19.065f)
                lineTo(24.0f, 4.935f)
                arcTo(4.924f, 4.924f, 0.0f, false, false, 19.065f, 0.0f)
                close()
                moveTo(12.745f, 4.547f)
                curveToRelative(2.181f, 0.0f, 4.058f, 0.676f, 5.399f, 1.847f)
                arcToRelative(6.118f, 6.118f, 0.0f, false, true, 2.116f, 4.66f)
                curveToRelative(0.005f, 1.854f, -0.88f, 3.476f, -2.257f, 4.563f)
                curveToRelative(-1.375f, 1.092f, -3.225f, 1.697f, -5.258f, 1.697f)
                curveToRelative(-2.314f, 0.0f, -4.46f, -0.842f, -4.46f, -0.842f)
                verticalLineToRelative(2.718f)
                curveToRelative(0.397f, 0.116f, 1.048f, 0.365f, 0.635f, 0.779f)
                lineTo(5.79f, 19.969f)
                curveToRelative(-0.41f, -0.41f, 0.19f, -0.65f, 0.644f, -0.779f)
                lineTo(6.434f, 7.666f)
                curveToRelative(-1.053f, 0.81f, -1.593f, 1.51f, -1.868f, 2.031f)
                curveToRelative(0.32f, 1.02f, -0.284f, 0.969f, -0.284f, 0.969f)
                lineToRelative(-1.09f, -1.73f)
                reflectiveCurveToRelative(3.868f, -4.39f, 9.553f, -4.39f)
                close()
                moveTo(12.555f, 5.518f)
                curveToRelative(-1.423f, -0.003f, -3.184f, 0.473f, -4.27f, 1.244f)
                verticalLineToRelative(8.646f)
                curveToRelative(0.988f, 0.487f, 2.484f, 0.832f, 4.26f, 0.832f)
                horizontalLineToRelative(0.01f)
                curveToRelative(1.596f, 0.0f, 2.98f, -0.593f, 3.93f, -1.533f)
                curveToRelative(0.952f, -0.948f, 1.486f, -2.183f, 1.492f, -3.683f)
                curveToRelative(-0.005f, -1.54f, -0.504f, -2.864f, -1.42f, -3.86f)
                curveToRelative(-0.918f, -0.992f, -2.274f, -1.645f, -4.002f, -1.646f)
                close()
            }
        }
        .build()
        return _pixiv!!
    }

private var _pixiv: ImageVector? = null
