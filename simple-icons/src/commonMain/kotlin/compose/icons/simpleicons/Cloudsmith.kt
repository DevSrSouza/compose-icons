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

public val SimpleIcons.Cloudsmith: ImageVector
    get() {
        if (_cloudsmith != null) {
            return _cloudsmith!!
        }
        _cloudsmith = Builder(name = "Cloudsmith", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.15f, 0.0f)
                arcToRelative(4.146f, 4.146f, 0.0f, false, false, -2.94f, 1.225f)
                curveToRelative(-0.981f, 0.98f, -1.34f, 2.288f, -1.177f, 3.53f)
                curveToRelative(-0.458f, 2.548f, -2.843f, 2.908f, -3.889f, 2.94f)
                curveToRelative(-1.176f, -0.098f, -2.352f, 0.327f, -3.235f, 1.21f)
                arcToRelative(4.142f, 4.142f, 0.0f, false, false, 0.0f, 5.88f)
                arcToRelative(4.142f, 4.142f, 0.0f, false, false, 5.882f, 0.0f)
                arcTo(4.136f, 4.136f, 0.0f, false, false, 12.0f, 12.108f)
                verticalLineToRelative(-0.23f)
                curveToRelative(0.097f, -3.104f, 2.777f, -3.529f, 3.92f, -3.561f)
                horizontalLineToRelative(0.523f)
                curveToRelative(0.98f, -0.066f, 1.928f, -0.458f, 2.647f, -1.21f)
                arcToRelative(4.142f, 4.142f, 0.0f, false, false, 0.0f, -5.88f)
                arcTo(4.146f, 4.146f, 0.0f, false, false, 16.15f, 0.0f)
                close()
                moveTo(15.823f, 15.7f)
                arcToRelative(4.15f, 4.15f, 0.0f, false, false, -4.15f, 4.15f)
                arcToRelative(4.15f, 4.15f, 0.0f, false, false, 4.15f, 4.15f)
                arcToRelative(4.15f, 4.15f, 0.0f, false, false, 4.15f, -4.15f)
                arcToRelative(4.15f, 4.15f, 0.0f, false, false, -4.15f, -4.15f)
                close()
            }
        }
        .build()
        return _cloudsmith!!
    }

private var _cloudsmith: ImageVector? = null
