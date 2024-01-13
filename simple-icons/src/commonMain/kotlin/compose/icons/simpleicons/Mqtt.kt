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

public val SimpleIcons.Mqtt: ImageVector
    get() {
        if (_mqtt != null) {
            return _mqtt!!
        }
        _mqtt = Builder(name = "Mqtt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.657f, 23.994f)
                horizontalLineToRelative(-9.45f)
                arcTo(1.212f, 1.212f, 0.0f, false, true, 0.0f, 22.788f)
                verticalLineToRelative(-9.18f)
                horizontalLineToRelative(0.071f)
                curveToRelative(5.784f, 0.0f, 10.504f, 4.65f, 10.586f, 10.386f)
                close()
                moveTo(18.263f, 23.994f)
                horizontalLineToRelative(-4.045f)
                curveTo(14.135f, 16.246f, 7.795f, 9.977f, 0.0f, 9.942f)
                lineTo(0.0f, 6.038f)
                horizontalLineToRelative(0.071f)
                curveToRelative(9.983f, 0.0f, 18.121f, 8.044f, 18.192f, 17.956f)
                close()
                moveTo(22.793f, 23.994f)
                horizontalLineToRelative(-0.97f)
                curveTo(21.754f, 12.071f, 11.995f, 2.407f, 0.0f, 2.372f)
                verticalLineToRelative(-1.16f)
                curveTo(0.0f, 0.55f, 0.544f, 0.006f, 1.207f, 0.006f)
                horizontalLineToRelative(7.64f)
                curveTo(15.733f, 2.49f, 21.257f, 7.789f, 24.0f, 14.508f)
                verticalLineToRelative(8.291f)
                curveToRelative(0.0f, 0.663f, -0.544f, 1.195f, -1.207f, 1.195f)
                close()
                moveTo(16.713f, 0.006f)
                horizontalLineToRelative(6.092f)
                arcTo(1.19f, 1.19f, 0.0f, false, true, 24.0f, 1.2f)
                verticalLineToRelative(5.914f)
                curveToRelative(-0.91f, -1.242f, -2.046f, -2.65f, -3.158f, -3.762f)
                curveTo(19.588f, 2.11f, 18.122f, 0.987f, 16.714f, 0.005f)
                close()
            }
        }
        .build()
        return _mqtt!!
    }

private var _mqtt: ImageVector? = null
