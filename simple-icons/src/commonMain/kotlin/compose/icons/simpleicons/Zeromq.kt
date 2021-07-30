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

public val SimpleIcons.Zeromq: ImageVector
    get() {
        if (_zeromq != null) {
            return _zeromq!!
        }
        _zeromq = Builder(name = "Zeromq", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.088f, 5.499f)
                lineToRelative(1.894f, -1.894f)
                lineToRelative(-3.587f, -3.587f)
                lineToRelative(-1.894f, 1.894f)
                curveTo(16.627f, 0.702f, 14.396f, 0.0f, 12.0f, 0.0f)
                curveTo(5.373f, 0.0f, 0.0f, 5.373f, 0.0f, 12.0f)
                curveToRelative(0.0f, 2.396f, 0.702f, 4.627f, 1.912f, 6.501f)
                lineToRelative(-1.894f, 1.894f)
                lineToRelative(3.587f, 3.587f)
                lineToRelative(1.894f, -1.894f)
                curveTo(7.373f, 23.298f, 9.604f, 24.0f, 12.0f, 24.0f)
                curveToRelative(6.627f, 0.0f, 12.0f, -5.373f, 12.0f, -12.0f)
                curveTo(24.0f, 9.604f, 23.298f, 7.373f, 22.088f, 5.499f)
                close()
                moveTo(4.569f, 12.0f)
                curveToRelative(0.0f, -4.104f, 3.327f, -7.431f, 7.431f, -7.431f)
                curveToRelative(1.125f, 0.0f, 2.191f, 0.25f, 3.146f, 0.698f)
                lineToRelative(-9.88f, 9.88f)
                curveTo(4.819f, 14.191f, 4.569f, 13.125f, 4.569f, 12.0f)
                close()
                moveTo(12.0f, 19.431f)
                curveToRelative(-1.125f, 0.0f, -2.191f, -0.25f, -3.146f, -0.698f)
                lineToRelative(9.88f, -9.88f)
                curveToRelative(0.447f, 0.956f, 0.698f, 2.022f, 0.698f, 3.146f)
                curveTo(19.431f, 16.104f, 16.104f, 19.431f, 12.0f, 19.431f)
                close()
            }
        }
        .build()
        return _zeromq!!
    }

private var _zeromq: ImageVector? = null
