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

public val SimpleIcons.Homeassistant: ImageVector
    get() {
        if (_homeassistant != null) {
            return _homeassistant!!
        }
        _homeassistant = Builder(name = "Homeassistant", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.939f, 10.627f)
                lineTo(13.061f, 0.749f)
                arcToRelative(1.505f, 1.505f, 0.0f, false, false, -2.121f, 0.0f)
                lineToRelative(-9.879f, 9.878f)
                curveTo(0.478f, 11.21f, 0.0f, 12.363f, 0.0f, 13.187f)
                verticalLineToRelative(9.0f)
                curveToRelative(0.0f, 0.826f, 0.675f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(9.227f)
                lineToRelative(-4.063f, -4.062f)
                arcToRelative(2.034f, 2.034f, 0.0f, false, true, -0.664f, 0.113f)
                curveToRelative(-1.13f, 0.0f, -2.05f, -0.92f, -2.05f, -2.05f)
                reflectiveCurveToRelative(0.92f, -2.05f, 2.05f, -2.05f)
                reflectiveCurveToRelative(2.05f, 0.92f, 2.05f, 2.05f)
                curveToRelative(0.0f, 0.233f, -0.041f, 0.456f, -0.113f, 0.665f)
                lineToRelative(3.163f, 3.163f)
                verticalLineTo(9.928f)
                arcToRelative(2.05f, 2.05f, 0.0f, false, true, -1.15f, -1.84f)
                curveToRelative(0.0f, -1.13f, 0.92f, -2.05f, 2.05f, -2.05f)
                reflectiveCurveToRelative(2.05f, 0.92f, 2.05f, 2.05f)
                arcToRelative(2.05f, 2.05f, 0.0f, false, true, -1.15f, 1.84f)
                verticalLineToRelative(8.127f)
                lineToRelative(3.146f, -3.146f)
                arcTo(2.051f, 2.051f, 0.0f, false, true, 18.0f, 12.239f)
                curveToRelative(1.13f, 0.0f, 2.05f, 0.92f, 2.05f, 2.05f)
                reflectiveCurveToRelative(-0.92f, 2.05f, -2.05f, 2.05f)
                curveToRelative(-0.25f, 0.0f, -0.488f, -0.047f, -0.709f, -0.13f)
                lineTo(12.9f, 20.602f)
                verticalLineToRelative(3.088f)
                horizontalLineToRelative(9.6f)
                curveToRelative(0.825f, 0.0f, 1.5f, -0.675f, 1.5f, -1.5f)
                verticalLineToRelative(-9.0f)
                curveToRelative(0.0f, -0.825f, -0.477f, -1.977f, -1.061f, -2.561f)
                close()
            }
        }
        .build()
        return _homeassistant!!
    }

private var _homeassistant: ImageVector? = null
