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

public val SimpleIcons.Rapid: ImageVector
    get() {
        if (_rapid != null) {
            return _rapid!!
        }
        _rapid = Builder(name = "Rapid", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.028f, 15.798f)
                curveToRelative(-0.212f, -0.065f, -0.228f, -0.359f, 0.017f, -0.457f)
                curveToRelative(4.216f, -1.993f, 3.938f, -6.519f, 3.938f, -6.519f)
                curveTo(19.967f, 4.232f, 16.6f, -0.016f, 11.158f, 0.0f)
                curveTo(5.112f, 0.033f, 1.468f, 4.787f, 1.5f, 10.407f)
                curveTo(1.55f, 20.26f, 9.067f, 24.017f, 11.42f, 24.0f)
                lineToRelative(-0.016f, -3.905f)
                curveToRelative(0.0f, -0.62f, 0.0f, -1.11f, 0.375f, -1.11f)
                curveToRelative(0.0f, 0.0f, 2.42f, 2.434f, 5.116f, 2.417f)
                curveToRelative(4.183f, -0.016f, 5.605f, -3.529f, 5.605f, -3.529f)
                close()
                moveTo(11.191f, 12.792f)
                arcToRelative(3.86f, 3.86f, 0.0f, false, true, -3.89f, -3.855f)
                arcToRelative(3.86f, 3.86f, 0.0f, false, true, 3.857f, -3.889f)
                arcToRelative(3.86f, 3.86f, 0.0f, false, true, 3.89f, 3.856f)
                curveToRelative(0.0f, 2.14f, -1.716f, 3.888f, -3.857f, 3.888f)
                close()
            }
        }
        .build()
        return _rapid!!
    }

private var _rapid: ImageVector? = null
