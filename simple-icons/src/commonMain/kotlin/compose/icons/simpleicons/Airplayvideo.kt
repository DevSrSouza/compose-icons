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

public val SimpleIcons.Airplayvideo: ImageVector
    get() {
        if (_airplayvideo != null) {
            return _airplayvideo!!
        }
        _airplayvideo = Builder(name = "Airplayvideo", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.412f, 1.32f)
                curveToRelative(-1.178f, 0.0f, -1.584f, 0.122f, -2.031f, 0.366f)
                arcTo(2.449f, 2.449f, 0.0f, false, false, 0.365f, 2.7f)
                curveTo(0.122f, 3.148f, 0.0f, 3.553f, 0.0f, 4.771f)
                verticalLineToRelative(9.137f)
                curveToRelative(0.0f, 1.178f, 0.122f, 1.585f, 0.365f, 2.031f)
                curveToRelative(0.244f, 0.447f, 0.57f, 0.772f, 1.016f, 1.016f)
                curveToRelative(0.406f, 0.244f, 0.813f, 0.365f, 2.031f, 0.365f)
                horizontalLineToRelative(2.72f)
                lineToRelative(1.138f, -1.34f)
                lineTo(3.006f, 15.98f)
                curveToRelative(-0.325f, 0.041f, -0.69f, -0.001f, -1.016f, -0.164f)
                curveToRelative(-0.203f, -0.08f, -0.366f, -0.283f, -0.488f, -0.486f)
                curveToRelative(-0.122f, -0.325f, -0.203f, -0.65f, -0.162f, -1.016f)
                lineTo(1.34f, 4.406f)
                curveToRelative(-0.04f, -0.325f, 0.0f, -0.69f, 0.162f, -1.015f)
                curveToRelative(0.081f, -0.203f, 0.285f, -0.365f, 0.488f, -0.487f)
                curveToRelative(0.325f, -0.122f, 0.65f, -0.204f, 1.016f, -0.164f)
                horizontalLineToRelative(17.867f)
                curveToRelative(0.325f, -0.04f, 0.69f, 0.002f, 1.016f, 0.164f)
                curveToRelative(0.203f, 0.082f, 0.364f, 0.284f, 0.486f, 0.487f)
                curveToRelative(0.122f, 0.324f, 0.203f, 0.65f, 0.162f, 1.015f)
                verticalLineToRelative(9.95f)
                curveToRelative(0.04f, 0.324f, 0.0f, 0.69f, -0.162f, 1.015f)
                curveToRelative(-0.081f, 0.203f, -0.283f, 0.365f, -0.486f, 0.486f)
                curveToRelative(-0.325f, 0.122f, -0.65f, 0.203f, -1.016f, 0.163f)
                horizontalLineToRelative(-4.264f)
                lineToRelative(1.137f, 1.341f)
                lineToRelative(2.803f, -0.04f)
                curveToRelative(1.218f, 0.0f, 1.623f, -0.122f, 2.07f, -0.366f)
                arcToRelative(2.449f, 2.449f, 0.0f, false, false, 1.016f, -1.016f)
                curveToRelative(0.243f, -0.406f, 0.365f, -0.813f, 0.365f, -2.03f)
                lineTo(24.0f, 4.77f)
                curveToRelative(0.0f, -1.218f, -0.122f, -1.623f, -0.365f, -2.07f)
                arcToRelative(2.449f, 2.449f, 0.0f, false, false, -1.016f, -1.015f)
                curveToRelative(-0.447f, -0.244f, -0.852f, -0.366f, -2.07f, -0.366f)
                lineTo(3.412f, 1.319f)
                close()
                moveTo(11.863f, 13.518f)
                arcToRelative(0.501f, 0.501f, 0.0f, false, false, -0.37f, 0.187f)
                lineToRelative(-7.106f, 8.162f)
                arcToRelative(0.465f, 0.465f, 0.0f, false, false, -0.123f, 0.326f)
                arcToRelative(0.47f, 0.47f, 0.0f, false, false, 0.488f, 0.487f)
                horizontalLineToRelative(14.293f)
                curveToRelative(0.122f, 0.0f, 0.245f, -0.04f, 0.326f, -0.121f)
                curveToRelative(0.203f, -0.163f, 0.204f, -0.489f, 0.041f, -0.692f)
                lineToRelative(-7.107f, -8.162f)
                lineToRelative(-0.041f, -0.04f)
                arcToRelative(0.594f, 0.594f, 0.0f, false, false, -0.4f, -0.147f)
                close()
            }
        }
        .build()
        return _airplayvideo!!
    }

private var _airplayvideo: ImageVector? = null
