package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.Forward: ImageVector
    get() {
        if (_forward != null) {
            return _forward!!
        }
        _forward = Builder(name = "Forward", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(500.5f, 231.4f)
                lineToRelative(-192.0f, -160.0f)
                curveTo(287.9f, 54.3f, 256.0f, 68.6f, 256.0f, 96.0f)
                verticalLineToRelative(320.0f)
                curveToRelative(0.0f, 27.4f, 31.9f, 41.8f, 52.5f, 24.6f)
                lineToRelative(192.0f, -160.0f)
                curveToRelative(15.3f, -12.8f, 15.3f, -36.4f, 0.0f, -49.2f)
                close()
                moveTo(244.5f, 231.4f)
                lineToRelative(-192.0f, -160.0f)
                curveTo(31.9f, 54.3f, 0.0f, 68.6f, 0.0f, 96.0f)
                verticalLineToRelative(320.0f)
                curveToRelative(0.0f, 27.4f, 31.9f, 41.8f, 52.5f, 24.6f)
                lineToRelative(192.0f, -160.0f)
                curveToRelative(15.3f, -12.8f, 15.3f, -36.4f, 0.0f, -49.2f)
                close()
            }
        }
        .build()
        return _forward!!
    }

private var _forward: ImageVector? = null
