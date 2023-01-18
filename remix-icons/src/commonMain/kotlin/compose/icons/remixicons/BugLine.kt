package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.BugLine: ImageVector
    get() {
        if (_bugLine != null) {
            return _bugLine!!
        }
        _bugLine = Builder(name = "BugLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 19.9f)
                arcToRelative(5.002f, 5.002f, 0.0f, false, false, 4.0f, -4.9f)
                verticalLineToRelative(-3.0f)
                arcToRelative(4.98f, 4.98f, 0.0f, false, false, -0.415f, -2.0f)
                horizontalLineToRelative(-9.17f)
                arcTo(4.98f, 4.98f, 0.0f, false, false, 7.0f, 12.0f)
                verticalLineToRelative(3.0f)
                arcToRelative(5.002f, 5.002f, 0.0f, false, false, 4.0f, 4.9f)
                lineTo(11.0f, 14.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(5.9f)
                close()
                moveTo(5.536f, 17.69f)
                arcTo(6.979f, 6.979f, 0.0f, false, true, 5.0f, 15.0f)
                lineTo(2.0f, 15.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-1.0f)
                curveToRelative(0.0f, -0.643f, 0.087f, -1.265f, 0.249f, -1.856f)
                lineTo(3.036f, 8.866f)
                lineToRelative(1.0f, -1.732f)
                lineTo(6.056f, 8.3f)
                arcToRelative(7.01f, 7.01f, 0.0f, false, true, 0.199f, -0.3f)
                horizontalLineToRelative(11.49f)
                curveToRelative(0.069f, 0.098f, 0.135f, 0.199f, 0.199f, 0.3f)
                lineToRelative(2.02f, -1.166f)
                lineToRelative(1.0f, 1.732f)
                lineToRelative(-2.213f, 1.278f)
                curveToRelative(0.162f, 0.59f, 0.249f, 1.213f, 0.249f, 1.856f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(0.0f, 0.953f, -0.19f, 1.862f, -0.536f, 2.69f)
                lineToRelative(2.5f, 1.444f)
                lineToRelative(-1.0f, 1.732f)
                lineToRelative(-2.526f, -1.458f)
                arcTo(6.986f, 6.986f, 0.0f, false, true, 12.0f, 22.0f)
                arcToRelative(6.986f, 6.986f, 0.0f, false, true, -5.438f, -2.592f)
                lineToRelative(-2.526f, 1.458f)
                lineToRelative(-1.0f, -1.732f)
                lineToRelative(2.5f, -1.443f)
                close()
                moveTo(8.0f, 6.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 8.0f, 0.0f)
                lineTo(8.0f, 6.0f)
                close()
            }
        }
        .build()
        return _bugLine!!
    }

private var _bugLine: ImageVector? = null
