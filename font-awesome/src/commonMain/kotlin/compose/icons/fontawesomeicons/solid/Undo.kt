package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
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
                moveTo(212.33f, 224.33f)
                horizontalLineTo(12.0f)
                curveToRelative(-6.63f, 0.0f, -12.0f, -5.37f, -12.0f, -12.0f)
                verticalLineTo(12.0f)
                curveTo(0.0f, 5.37f, 5.37f, 0.0f, 12.0f, 0.0f)
                horizontalLineToRelative(48.0f)
                curveToRelative(6.63f, 0.0f, 12.0f, 5.37f, 12.0f, 12.0f)
                verticalLineToRelative(78.11f)
                curveTo(117.77f, 39.28f, 184.26f, 7.47f, 258.17f, 8.01f)
                curveToRelative(136.91f, 0.99f, 246.45f, 111.62f, 246.16f, 248.53f)
                curveTo(504.04f, 393.26f, 393.12f, 504.0f, 256.33f, 504.0f)
                curveToRelative(-64.09f, 0.0f, -122.5f, -24.31f, -166.51f, -64.21f)
                curveToRelative(-5.1f, -4.62f, -5.33f, -12.55f, -0.47f, -17.42f)
                lineToRelative(33.97f, -33.97f)
                curveToRelative(4.47f, -4.47f, 11.66f, -4.72f, 16.4f, -0.52f)
                curveTo(170.76f, 415.34f, 211.58f, 432.0f, 256.33f, 432.0f)
                curveToRelative(97.27f, 0.0f, 176.0f, -78.72f, 176.0f, -176.0f)
                curveToRelative(0.0f, -97.27f, -78.72f, -176.0f, -176.0f, -176.0f)
                curveToRelative(-58.5f, 0.0f, -110.28f, 28.48f, -142.27f, 72.33f)
                horizontalLineToRelative(98.27f)
                curveToRelative(6.63f, 0.0f, 12.0f, 5.37f, 12.0f, 12.0f)
                verticalLineToRelative(48.0f)
                curveToRelative(0.0f, 6.63f, -5.37f, 12.0f, -12.0f, 12.0f)
                close()
            }
        }
        .build()
        return _undo!!
    }

private var _undo: ImageVector? = null
