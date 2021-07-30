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

public val SimpleIcons.Microsoftoffice: ImageVector
    get() {
        if (_microsoftoffice != null) {
            return _microsoftoffice!!
        }
        _microsoftoffice = Builder(name = "Microsoftoffice", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.53f, 4.306f)
                verticalLineToRelative(15.363f)
                quadToRelative(0.0f, 0.807f, -0.472f, 1.433f)
                quadToRelative(-0.472f, 0.627f, -1.253f, 0.85f)
                lineToRelative(-6.888f, 1.974f)
                quadToRelative(-0.136f, 0.037f, -0.29f, 0.055f)
                quadToRelative(-0.156f, 0.019f, -0.293f, 0.019f)
                quadToRelative(-0.396f, 0.0f, -0.72f, -0.105f)
                quadToRelative(-0.321f, -0.106f, -0.656f, -0.292f)
                lineToRelative(-4.505f, -2.544f)
                quadToRelative(-0.248f, -0.137f, -0.391f, -0.366f)
                quadToRelative(-0.143f, -0.23f, -0.143f, -0.515f)
                quadToRelative(0.0f, -0.434f, 0.304f, -0.738f)
                quadToRelative(0.304f, -0.305f, 0.739f, -0.305f)
                horizontalLineToRelative(5.831f)
                lineTo(12.793f, 4.964f)
                lineToRelative(-4.38f, 1.563f)
                quadToRelative(-0.533f, 0.187f, -0.856f, 0.658f)
                quadToRelative(-0.322f, 0.472f, -0.322f, 1.03f)
                verticalLineToRelative(8.078f)
                quadToRelative(0.0f, 0.496f, -0.248f, 0.912f)
                quadToRelative(-0.25f, 0.416f, -0.683f, 0.651f)
                lineToRelative(-2.072f, 1.13f)
                quadToRelative(-0.286f, 0.148f, -0.571f, 0.148f)
                quadToRelative(-0.497f, 0.0f, -0.844f, -0.347f)
                quadToRelative(-0.348f, -0.347f, -0.348f, -0.844f)
                lineTo(2.469f, 6.563f)
                quadToRelative(0.0f, -0.62f, 0.33f, -1.19f)
                quadToRelative(0.328f, -0.571f, 0.874f, -0.881f)
                lineTo(11.07f, 0.285f)
                quadToRelative(0.248f, -0.136f, 0.534f, -0.21f)
                quadToRelative(0.285f, -0.075f, 0.57f, -0.075f)
                quadToRelative(0.211f, 0.0f, 0.38f, 0.031f)
                quadToRelative(0.166f, 0.031f, 0.364f, 0.093f)
                lineToRelative(6.888f, 1.899f)
                quadToRelative(0.384f, 0.11f, 0.7f, 0.329f)
                quadToRelative(0.317f, 0.217f, 0.547f, 0.52f)
                quadToRelative(0.23f, 0.305f, 0.353f, 0.67f)
                quadToRelative(0.125f, 0.367f, 0.125f, 0.764f)
                close()
                moveTo(19.942f, 19.669f)
                lineTo(19.942f, 4.306f)
                quadToRelative(0.0f, -0.273f, -0.16f, -0.478f)
                quadToRelative(-0.163f, -0.204f, -0.423f, -0.28f)
                lineToRelative(-3.388f, -0.93f)
                quadToRelative(-0.397f, -0.111f, -0.794f, -0.23f)
                quadToRelative(-0.397f, -0.117f, -0.794f, -0.216f)
                verticalLineToRelative(19.68f)
                lineToRelative(4.976f, -1.427f)
                quadToRelative(0.26f, -0.074f, 0.422f, -0.28f)
                quadToRelative(0.161f, -0.204f, 0.161f, -0.477f)
                close()
            }
        }
        .build()
        return _microsoftoffice!!
    }

private var _microsoftoffice: ImageVector? = null
