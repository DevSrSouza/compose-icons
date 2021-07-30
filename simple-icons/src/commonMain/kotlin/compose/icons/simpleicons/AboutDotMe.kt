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

public val SimpleIcons.AboutDotMe: ImageVector
    get() {
        if (_aboutDotMe != null) {
            return _aboutDotMe!!
        }
        _aboutDotMe = Builder(name = "AboutDotMe", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.536f, 9.146f)
                curveToRelative(-1.373f, 0.0f, -2.133f, 1.014f, -2.294f, 2.116f)
                horizontalLineToRelative(4.608f)
                curveToRelative(-0.125f, -1.05f, -0.867f, -2.115f, -2.314f, -2.115f)
                moveToRelative(-2.26f, 3.617f)
                curveToRelative(0.235f, 1.156f, 1.193f, 1.97f, 2.532f, 1.97f)
                curveToRelative(0.725f, 0.0f, 1.77f, -0.27f, 2.384f, -0.914f)
                lineToRelative(1.175f, 1.35f)
                curveToRelative(-1.064f, 1.11f, -2.653f, 1.426f, -3.74f, 1.426f)
                curveToRelative(-2.64f, 0.0f, -4.697f, -1.906f, -4.697f, -4.606f)
                curveToRelative(0.0f, -2.535f, 1.894f, -4.62f, 4.57f, -4.62f)
                curveToRelative(2.585f, 0.0f, 4.5f, 1.98f, 4.5f, 4.604f)
                verticalLineToRelative(0.766f)
                horizontalLineToRelative(-6.723f)
                verticalLineToRelative(0.023f)
                close()
                moveTo(10.789f, 16.594f)
                verticalLineToRelative(-5.69f)
                curveToRelative(0.0f, -0.976f, -0.435f, -1.536f, -1.338f, -1.536f)
                curveToRelative(-0.814f, 0.0f, -1.355f, 0.585f, -1.717f, 1.007f)
                verticalLineToRelative(6.24f)
                horizontalLineToRelative(-2.35f)
                verticalLineToRelative(-5.7f)
                curveToRelative(0.0f, -0.976f, -0.415f, -1.532f, -1.318f, -1.532f)
                curveToRelative(-0.813f, 0.0f, -1.375f, 0.586f, -1.717f, 1.006f)
                verticalLineToRelative(6.24f)
                lineTo(0.0f, 16.629f)
                lineTo(0.0f, 7.505f)
                horizontalLineToRelative(2.35f)
                verticalLineToRelative(1.15f)
                curveToRelative(0.4f, -0.463f, 1.302f, -1.26f, 2.71f, -1.26f)
                curveToRelative(1.247f, 0.0f, 2.096f, 0.526f, 2.477f, 1.59f)
                curveToRelative(0.524f, -0.761f, 1.5f, -1.59f, 2.91f, -1.59f)
                curveToRelative(1.7f, 0.0f, 2.69f, 1.01f, 2.69f, 2.963f)
                verticalLineToRelative(6.24f)
                horizontalLineToRelative(-2.353f)
                lineToRelative(0.005f, -0.007f)
                close()
            }
        }
        .build()
        return _aboutDotMe!!
    }

private var _aboutDotMe: ImageVector? = null
