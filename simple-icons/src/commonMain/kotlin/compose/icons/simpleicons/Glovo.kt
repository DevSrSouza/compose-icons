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

public val SimpleIcons.Glovo: ImageVector
    get() {
        if (_glovo != null) {
            return _glovo!!
        }
        _glovo = Builder(name = "Glovo", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.012f, 0.0f)
                curveTo(7.847f, 0.0f, 4.459f, 3.388f, 4.459f, 7.553f)
                curveToRelative(0.0f, 1.576f, 0.494f, 3.106f, 1.412f, 4.4f)
                lineToRelative(0.211f, 0.281f)
                lineToRelative(3.93f, 5.555f)
                reflectiveCurveToRelative(0.47f, 0.775f, 1.529f, 0.775f)
                horizontalLineToRelative(0.941f)
                curveToRelative(1.036f, 0.0f, 1.53f, -0.775f, 1.53f, -0.775f)
                lineToRelative(3.93f, -5.555f)
                lineToRelative(0.187f, -0.28f)
                arcToRelative(7.43f, 7.43f, 0.0f, false, false, 1.412f, -4.401f)
                curveTo(19.564f, 3.388f, 16.176f, 0.0f, 12.011f, 0.0f)
                close()
                moveTo(12.012f, 3.693f)
                arcToRelative(3.837f, 3.837f, 0.0f, false, true, 3.836f, 3.836f)
                curveToRelative(0.0f, 0.824f, -0.26f, 1.578f, -0.73f, 2.237f)
                lineToRelative(-0.212f, 0.28f)
                lineToRelative(-2.894f, 4.095f)
                lineToRelative(-2.895f, -4.07f)
                lineToRelative(-0.21f, -0.305f)
                arcToRelative(3.848f, 3.848f, 0.0f, false, true, -0.731f, -2.237f)
                arcToRelative(3.837f, 3.837f, 0.0f, false, true, 3.836f, -3.836f)
                close()
                moveTo(9.895f, 21.953f)
                curveToRelative(0.0f, 1.106f, 0.893f, 2.023f, 2.07f, 2.047f)
                curveToRelative(1.223f, 0.0f, 2.117f, -0.917f, 2.117f, -2.059f)
                curveToRelative(0.0f, -1.14f, -0.894f, -2.058f, -2.094f, -2.058f)
                curveToRelative(-1.2f, 0.0f, -2.093f, 0.917f, -2.093f, 2.07f)
                close()
            }
        }
        .build()
        return _glovo!!
    }

private var _glovo: ImageVector? = null
