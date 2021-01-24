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

public val SolidGroup.Mouse: ImageVector
    get() {
        if (_mouse != null) {
            return _mouse!!
        }
        _mouse = Builder(name = "Mouse", defaultWidth = 384.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 352.0f)
                arcToRelative(160.0f, 160.0f, 0.0f, false, false, 160.0f, 160.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(160.0f, 160.0f, 0.0f, false, false, 160.0f, -160.0f)
                lineTo(384.0f, 224.0f)
                lineTo(0.0f, 224.0f)
                close()
                moveTo(176.0f, 0.0f)
                horizontalLineToRelative(-16.0f)
                arcTo(160.0f, 160.0f, 0.0f, false, false, 0.0f, 160.0f)
                verticalLineToRelative(32.0f)
                horizontalLineToRelative(176.0f)
                close()
                moveTo(224.0f, 0.0f)
                horizontalLineToRelative(-16.0f)
                verticalLineToRelative(192.0f)
                horizontalLineToRelative(176.0f)
                verticalLineToRelative(-32.0f)
                arcTo(160.0f, 160.0f, 0.0f, false, false, 224.0f, 0.0f)
                close()
            }
        }
        .build()
        return _mouse!!
    }

private var _mouse: ImageVector? = null
