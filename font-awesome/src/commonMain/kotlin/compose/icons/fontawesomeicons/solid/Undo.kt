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

public val SolidGroup.Undo: ImageVector
    get() {
        if (_undo != null) {
            return _undo!!
        }
        _undo = Builder(name = "Undo", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(212.333f, 224.333f)
                horizontalLineTo(12.0f)
                curveToRelative(-6.627f, 0.0f, -12.0f, -5.373f, -12.0f, -12.0f)
                verticalLineTo(12.0f)
                curveTo(0.0f, 5.373f, 5.373f, 0.0f, 12.0f, 0.0f)
                horizontalLineToRelative(48.0f)
                curveToRelative(6.627f, 0.0f, 12.0f, 5.373f, 12.0f, 12.0f)
                verticalLineToRelative(78.112f)
                curveTo(117.773f, 39.279f, 184.26f, 7.47f, 258.175f, 8.007f)
                curveToRelative(136.906f, 0.994f, 246.448f, 111.623f, 246.157f, 248.532f)
                curveTo(504.041f, 393.258f, 393.12f, 504.0f, 256.333f, 504.0f)
                curveToRelative(-64.089f, 0.0f, -122.496f, -24.313f, -166.51f, -64.215f)
                curveToRelative(-5.099f, -4.622f, -5.334f, -12.554f, -0.467f, -17.42f)
                lineToRelative(33.967f, -33.967f)
                curveToRelative(4.474f, -4.474f, 11.662f, -4.717f, 16.401f, -0.525f)
                curveTo(170.76f, 415.336f, 211.58f, 432.0f, 256.333f, 432.0f)
                curveToRelative(97.268f, 0.0f, 176.0f, -78.716f, 176.0f, -176.0f)
                curveToRelative(0.0f, -97.267f, -78.716f, -176.0f, -176.0f, -176.0f)
                curveToRelative(-58.496f, 0.0f, -110.28f, 28.476f, -142.274f, 72.333f)
                horizontalLineToRelative(98.274f)
                curveToRelative(6.627f, 0.0f, 12.0f, 5.373f, 12.0f, 12.0f)
                verticalLineToRelative(48.0f)
                curveToRelative(0.0f, 6.627f, -5.373f, 12.0f, -12.0f, 12.0f)
                close()
            }
        }
        .build()
        return _undo!!
    }

private var _undo: ImageVector? = null
