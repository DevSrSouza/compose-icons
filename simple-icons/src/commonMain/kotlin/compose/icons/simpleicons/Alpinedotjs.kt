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

public val SimpleIcons.Alpinedotjs: ImageVector
    get() {
        if (_alpinedotjs != null) {
            return _alpinedotjs!!
        }
        _alpinedotjs = Builder(name = "Alpinedotjs", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(24.0f, 12.0f)
                lineToRelative(-5.72f, 5.746f)
                lineToRelative(-5.724f, -5.741f)
                lineToRelative(5.724f, -5.75f)
                lineTo(24.0f, 12.0f)
                close()
                moveTo(5.72f, 6.254f)
                lineTo(0.0f, 12.0f)
                lineToRelative(5.72f, 5.746f)
                horizontalLineToRelative(11.44f)
                lineTo(5.72f, 6.254f)
                close()
            }
        }
        .build()
        return _alpinedotjs!!
    }

private var _alpinedotjs: ImageVector? = null
