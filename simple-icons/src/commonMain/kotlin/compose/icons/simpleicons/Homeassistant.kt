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
                moveTo(11.992f, 1.395f)
                arcToRelative(0.704f, 0.704f, 0.0f, false, false, -0.498f, 0.211f)
                lineTo(0.162f, 13.098f)
                arcTo(0.563f, 0.563f, 0.0f, false, false, 0.0f, 13.494f)
                arcToRelative(0.567f, 0.567f, 0.0f, false, false, 0.566f, 0.566f)
                lineTo(2.67f, 14.06f)
                verticalLineToRelative(8.074f)
                curveToRelative(0.0f, 0.26f, 0.21f, 0.471f, 0.471f, 0.471f)
                horizontalLineToRelative(7.947f)
                verticalLineToRelative(-3.684f)
                lineTo(8.037f, 15.867f)
                arcToRelative(2.42f, 2.42f, 0.0f, false, true, -0.947f, 0.193f)
                curveToRelative(-1.338f, 0.0f, -2.422f, -1.087f, -2.422f, -2.426f)
                curveToRelative(0.0f, -1.339f, 1.084f, -2.424f, 2.422f, -2.424f)
                curveToRelative(1.338f, 0.0f, 2.422f, 1.085f, 2.422f, 2.424f)
                curveToRelative(0.0f, 0.336f, -0.068f, 0.656f, -0.191f, 0.947f)
                lineToRelative(1.768f, 1.768f)
                verticalLineToRelative(-5.375f)
                curveTo(10.2f, 10.615f, 9.572f, 9.744f, 9.572f, 8.727f)
                curveToRelative(0.0f, -1.339f, 1.086f, -2.426f, 2.424f, -2.426f)
                curveToRelative(1.338f, 0.0f, 2.422f, 1.087f, 2.422f, 2.426f)
                curveToRelative(0.0f, 1.017f, -0.626f, 1.888f, -1.514f, 2.248f)
                verticalLineToRelative(5.375f)
                lineToRelative(1.766f, -1.768f)
                arcToRelative(2.421f, 2.421f, 0.0f, false, true, -0.191f, -0.947f)
                curveToRelative(0.0f, -1.339f, 1.086f, -2.424f, 2.424f, -2.424f)
                curveToRelative(1.338f, 0.0f, 2.422f, 1.085f, 2.422f, 2.424f)
                curveToRelative(0.0f, 1.339f, -1.084f, 2.426f, -2.422f, 2.426f)
                arcToRelative(2.42f, 2.42f, 0.0f, false, true, -0.947f, -0.193f)
                lineToRelative(-3.051f, 3.055f)
                verticalLineToRelative(3.684f)
                horizontalLineToRelative(7.947f)
                arcToRelative(0.47f, 0.47f, 0.0f, false, false, 0.471f, -0.471f)
                verticalLineToRelative(-8.074f)
                horizontalLineToRelative(2.111f)
                arcToRelative(0.569f, 0.569f, 0.0f, false, false, 0.396f, -0.162f)
                curveToRelative(0.223f, -0.219f, 0.226f, -0.577f, 0.008f, -0.801f)
                lineToRelative(-2.516f, -2.572f)
                lineTo(21.322f, 6.471f)
                curveToRelative(0.0f, -0.26f, -0.21f, -0.473f, -0.471f, -0.473f)
                horizontalLineToRelative(-1.965f)
                curveToRelative(-0.26f, 0.0f, -0.471f, 0.212f, -0.471f, 0.473f)
                verticalLineToRelative(1.104f)
                lineTo(12.5f, 1.604f)
                arcToRelative(0.706f, 0.706f, 0.0f, false, false, -0.508f, -0.209f)
                close()
                moveTo(11.996f, 7.756f)
                curveToRelative(-0.535f, 0.0f, -0.969f, 0.435f, -0.969f, 0.971f)
                curveToRelative(0.0f, 0.535f, 0.434f, 0.969f, 0.969f, 0.969f)
                arcToRelative(0.968f, 0.968f, 0.0f, false, false, 0.969f, -0.969f)
                curveToRelative(0.0f, -0.536f, -0.433f, -0.971f, -0.969f, -0.971f)
                close()
                moveTo(7.09f, 12.666f)
                arcToRelative(0.968f, 0.968f, 0.0f, false, false, -0.969f, 0.969f)
                curveToRelative(0.0f, 0.535f, 0.434f, 0.971f, 0.969f, 0.971f)
                curveToRelative(0.535f, 0.0f, 0.969f, -0.435f, 0.969f, -0.971f)
                arcToRelative(0.968f, 0.968f, 0.0f, false, false, -0.969f, -0.969f)
                close()
                moveTo(16.902f, 12.666f)
                curveToRelative(-0.535f, 0.0f, -0.971f, 0.433f, -0.971f, 0.969f)
                curveToRelative(0.0f, 0.535f, 0.436f, 0.971f, 0.971f, 0.971f)
                curveToRelative(0.535f, 0.0f, 0.969f, -0.435f, 0.969f, -0.971f)
                arcToRelative(0.968f, 0.968f, 0.0f, false, false, -0.969f, -0.969f)
                close()
            }
        }
        .build()
        return _homeassistant!!
    }

private var _homeassistant: ImageVector? = null
