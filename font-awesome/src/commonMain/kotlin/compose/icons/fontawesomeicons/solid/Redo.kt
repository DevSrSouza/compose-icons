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

public val SolidGroup.Redo: ImageVector
    get() {
        if (_redo != null) {
            return _redo!!
        }
        _redo = Builder(name = "Redo", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(500.33f, 0.0f)
                horizontalLineToRelative(-47.41f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, 12.57f)
                lineToRelative(4.0f, 82.76f)
                arcTo(247.42f, 247.42f, 0.0f, false, false, 256.0f, 8.0f)
                curveTo(119.34f, 8.0f, 7.9f, 119.53f, 8.0f, 256.19f)
                curveTo(8.1f, 393.07f, 119.1f, 504.0f, 256.0f, 504.0f)
                arcToRelative(247.1f, 247.1f, 0.0f, false, false, 166.18f, -63.91f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.48f, -17.43f)
                lineToRelative(-34.0f, -34.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -16.38f, -0.55f)
                arcTo(176.0f, 176.0f, 0.0f, true, true, 402.1f, 157.8f)
                lineToRelative(-101.53f, -4.87f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.57f, 12.0f)
                verticalLineToRelative(47.41f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                horizontalLineToRelative(200.33f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                verticalLineTo(12.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, -12.0f)
                close()
            }
        }
        .build()
        return _redo!!
    }

private var _redo: ImageVector? = null
