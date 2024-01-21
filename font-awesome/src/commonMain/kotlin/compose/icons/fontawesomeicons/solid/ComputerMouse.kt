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

public val SolidGroup.ComputerMouse: ImageVector
    get() {
        if (_computerMouse != null) {
            return _computerMouse!!
        }
        _computerMouse = Builder(name = "ComputerMouse", defaultWidth = 384.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 192.0f)
                lineTo(176.0f, 192.0f)
                lineTo(176.0f, 0.0f)
                lineTo(160.0f, 0.0f)
                curveTo(71.6f, 0.0f, 0.0f, 71.6f, 0.0f, 160.0f)
                verticalLineToRelative(32.0f)
                close()
                moveTo(0.0f, 224.0f)
                lineTo(0.0f, 352.0f)
                curveToRelative(0.0f, 88.4f, 71.6f, 160.0f, 160.0f, 160.0f)
                horizontalLineToRelative(64.0f)
                curveToRelative(88.4f, 0.0f, 160.0f, -71.6f, 160.0f, -160.0f)
                lineTo(384.0f, 224.0f)
                lineTo(192.0f, 224.0f)
                lineTo(0.0f, 224.0f)
                close()
                moveTo(384.0f, 192.0f)
                lineTo(384.0f, 160.0f)
                curveTo(384.0f, 71.6f, 312.4f, 0.0f, 224.0f, 0.0f)
                lineTo(208.0f, 0.0f)
                lineTo(208.0f, 192.0f)
                lineTo(384.0f, 192.0f)
                close()
            }
        }
        .build()
        return _computerMouse!!
    }

private var _computerMouse: ImageVector? = null
