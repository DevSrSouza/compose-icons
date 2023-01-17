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

public val SimpleIcons.Files: ImageVector
    get() {
        if (_files != null) {
            return _files!!
        }
        _files = Builder(name = "Files", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.367f, 2.453f)
                arcToRelative(0.822f, 0.822f, 0.0f, false, false, -0.576f, 0.238f)
                lineTo(0.241f, 14.213f)
                arcToRelative(0.822f, 0.822f, 0.0f, false, false, -0.241f, 0.584f)
                verticalLineToRelative(0.066f)
                curveToRelative(0.0f, -0.323f, 0.209f, -0.608f, 0.516f, -0.709f)
                lineToRelative(7.275f, -2.318f)
                arcToRelative(2.437f, 2.437f, 0.0f, false, false, 1.584f, -1.592f)
                lineToRelative(2.318f, -7.267f)
                arcToRelative(0.757f, 0.757f, 0.0f, false, true, 0.719f, -0.524f)
                close()
                moveTo(0.0f, 14.863f)
                verticalLineToRelative(5.047f)
                curveToRelative(0.0f, 0.904f, 0.733f, 1.637f, 1.637f, 1.637f)
                horizontalLineToRelative(20.726f)
                curveToRelative(0.904f, 0.0f, 1.637f, -0.733f, 1.637f, -1.637f)
                lineTo(24.0f, 4.09f)
                curveToRelative(0.0f, -0.904f, -0.733f, -1.637f, -1.637f, -1.637f)
                horizontalLineToRelative(-9.951f)
                verticalLineToRelative(0.5f)
                lineToRelative(0.088f, 9.861f)
                curveToRelative(0.01f, 1.175f, -0.962f, 2.14f, -2.137f, 2.14f)
                lineTo(0.0f, 14.862f)
                close()
                moveTo(12.0f, 3.66f)
                lineToRelative(-2.148f, 6.735f)
                verticalLineToRelative(0.001f)
                arcToRelative(2.94f, 2.94f, 0.0f, false, true, -1.909f, 1.916f)
                lineToRelative(-6.716f, 2.141f)
                horizontalLineToRelative(9.136f)
                curveToRelative(0.905f, 0.0f, 1.638f, -0.734f, 1.637f, -1.639f)
                close()
                moveTo(1.637f, 4.635f)
                curveToRelative(-0.905f, 0.0f, -1.638f, 0.734f, -1.637f, 1.638f)
                verticalLineToRelative(7.473f)
                lineToRelative(9.135f, -9.111f)
                close()
            }
        }
        .build()
        return _files!!
    }

private var _files: ImageVector? = null
