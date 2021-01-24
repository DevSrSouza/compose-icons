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

public val SolidGroup.Bolt: ImageVector
    get() {
        if (_bolt != null) {
            return _bolt!!
        }
        _bolt = Builder(name = "Bolt", defaultWidth = 320.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 320.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(296.0f, 160.0f)
                horizontalLineTo(180.6f)
                lineToRelative(42.6f, -129.8f)
                curveTo(227.2f, 15.0f, 215.7f, 0.0f, 200.0f, 0.0f)
                horizontalLineTo(56.0f)
                curveTo(44.0f, 0.0f, 33.8f, 8.9f, 32.2f, 20.8f)
                lineToRelative(-32.0f, 240.0f)
                curveTo(-1.7f, 275.2f, 9.5f, 288.0f, 24.0f, 288.0f)
                horizontalLineToRelative(118.7f)
                lineTo(96.6f, 482.5f)
                curveToRelative(-3.6f, 15.2f, 8.0f, 29.5f, 23.3f, 29.5f)
                curveToRelative(8.4f, 0.0f, 16.4f, -4.4f, 20.8f, -12.0f)
                lineToRelative(176.0f, -304.0f)
                curveToRelative(9.3f, -15.9f, -2.2f, -36.0f, -20.7f, -36.0f)
                close()
            }
        }
        .build()
        return _bolt!!
    }

private var _bolt: ImageVector? = null
