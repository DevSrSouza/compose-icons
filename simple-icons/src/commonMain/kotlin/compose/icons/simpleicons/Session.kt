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

public val SimpleIcons.Session: ImageVector
    get() {
        if (_session != null) {
            return _session!!
        }
        _session = Builder(name = "Session", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(19.431f, 12.193f)
                lineToRelative(-4.53f, -2.51f)
                horizontalLineToRelative(3.071f)
                arcToRelative(4.847f, 4.847f, 0.0f, false, false, 4.842f, -4.841f)
                arcTo(4.848f, 4.848f, 0.0f, false, false, 17.972f, 0.0f)
                lineTo(7.252f, 0.0f)
                arcToRelative(6.073f, 6.073f, 0.0f, false, false, -6.066f, 6.066f)
                arcToRelative(6.566f, 6.566f, 0.0f, false, false, 3.383f, 5.741f)
                lineToRelative(4.53f, 2.51f)
                lineTo(6.028f, 14.317f)
                arcToRelative(4.847f, 4.847f, 0.0f, false, false, -4.842f, 4.841f)
                arcTo(4.848f, 4.848f, 0.0f, false, false, 6.028f, 24.0f)
                horizontalLineToRelative(10.72f)
                arcToRelative(6.073f, 6.073f, 0.0f, false, false, 6.066f, -6.066f)
                arcToRelative(6.568f, 6.568f, 0.0f, false, false, -3.383f, -5.741f)
                close()
                moveTo(5.295f, 10.493f)
                arcToRelative(5.065f, 5.065f, 0.0f, false, true, -2.607f, -4.309f)
                curveTo(2.627f, 3.61f, 4.79f, 1.5f, 7.367f, 1.5f)
                horizontalLineToRelative(10.508f)
                curveToRelative(1.797f, 0.0f, 3.345f, 1.378f, 3.434f, 3.173f)
                arcToRelative(3.345f, 3.345f, 0.0f, false, true, -3.337f, 3.51f)
                lineTo(11.92f, 8.183f)
                arcToRelative(0.67f, 0.67f, 0.0f, false, false, -0.67f, 0.67f)
                lineToRelative(-0.001f, 4.94f)
                close()
                moveTo(16.633f, 22.5f)
                lineTo(6.124f, 22.5f)
                curveToRelative(-1.797f, 0.0f, -3.345f, -1.378f, -3.434f, -3.173f)
                arcToRelative(3.345f, 3.345f, 0.0f, false, true, 3.337f, -3.51f)
                horizontalLineToRelative(6.053f)
                curveToRelative(0.37f, 0.0f, 0.67f, -0.3f, 0.67f, -0.67f)
                verticalLineToRelative(-4.94f)
                lineToRelative(5.954f, 3.3f)
                arcToRelative(5.065f, 5.065f, 0.0f, false, true, 2.608f, 4.309f)
                curveToRelative(0.06f, 2.575f, -2.103f, 4.684f, -4.679f, 4.684f)
            }
        }
        .build()
        return _session!!
    }

private var _session: ImageVector? = null
