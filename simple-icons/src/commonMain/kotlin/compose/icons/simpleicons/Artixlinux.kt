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

public val SimpleIcons.Artixlinux: ImageVector
    get() {
        if (_artixlinux != null) {
            return _artixlinux!!
        }
        _artixlinux = Builder(name = "Artixlinux", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                lineTo(7.873f, 8.462f)
                lineToRelative(11.358f, 6.363f)
                close()
                moveTo(6.626f, 11.018f)
                lineTo(0.295f, 24.0f)
                lineToRelative(18.788f, -7.762f)
                close()
                moveTo(20.472f, 17.37f)
                lineToRelative(-5.926f, 3.402f)
                lineTo(23.706f, 24.0f)
                close()
            }
        }
        .build()
        return _artixlinux!!
    }

private var _artixlinux: ImageVector? = null
