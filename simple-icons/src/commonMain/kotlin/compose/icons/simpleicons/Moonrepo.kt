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

public val SimpleIcons.Moonrepo: ImageVector
    get() {
        if (_moonrepo != null) {
            return _moonrepo!!
        }
        _moonrepo = Builder(name = "Moonrepo", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.514f, 7.342f)
                curveTo(19.711f, 7.862f, 19.814f, 8.413f, 19.816f, 8.969f)
                curveTo(19.816f, 12.494f, 15.998f, 14.697f, 12.946f, 12.934f)
                curveTo(11.529f, 12.116f, 10.657f, 10.605f, 10.657f, 8.969f)
                curveTo(10.657f, 5.646f, 14.085f, 3.431f, 17.115f, 4.793f)
                curveTo(15.26f, 3.373f, 12.99f, 2.607f, 10.655f, 2.612f)
                curveTo(4.772f, 2.614f, 0.005f, 7.381f, 0.0f, 13.265f)
                curveTo(0.002f, 19.148f, 4.772f, 23.918f, 10.655f, 23.92f)
                curveTo(16.538f, 23.916f, 21.306f, 19.147f, 21.31f, 13.265f)
                curveTo(21.312f, 11.155f, 20.687f, 9.095f, 19.514f, 7.342f)
                close()
                moveTo(14.841f, 4.666f)
                curveTo(14.841f, 8.191f, 18.657f, 10.395f, 21.709f, 8.632f)
                curveTo(23.127f, 7.814f, 24.0f, 6.302f, 24.0f, 4.666f)
                curveTo(24.0f, 1.14f, 20.184f, -1.061f, 17.13f, 0.699f)
                curveTo(15.714f, 1.519f, 14.841f, 3.03f, 14.841f, 4.666f)
            }
        }
        .build()
        return _moonrepo!!
    }

private var _moonrepo: ImageVector? = null
