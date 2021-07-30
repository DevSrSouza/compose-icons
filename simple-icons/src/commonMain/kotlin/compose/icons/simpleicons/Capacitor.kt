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

public val SimpleIcons.Capacitor: ImageVector
    get() {
        if (_capacitor != null) {
            return _capacitor!!
        }
        _capacitor = Builder(name = "Capacitor", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 3.7f)
                lineToRelative(-5.766f, 5.766f)
                lineToRelative(5.725f, 5.736f)
                lineToRelative(-3.713f, 3.712f)
                lineTo(5.073f, 3.742f)
                lineTo(8.786f, 0.03f)
                lineToRelative(5.736f, 5.726f)
                lineTo(20.284f, 0.0f)
                lineTo(24.0f, 3.7f)
                close()
                moveTo(0.029f, 8.785f)
                lineToRelative(3.713f, -3.713f)
                lineToRelative(15.173f, 15.173f)
                lineToRelative(-3.713f, 3.714f)
                lineToRelative(-5.732f, -5.726f)
                lineTo(3.7f, 24.0f)
                lineTo(0.0f, 20.285f)
                lineToRelative(5.754f, -5.764f)
                lineTo(0.029f, 8.785f)
                close()
            }
        }
        .build()
        return _capacitor!!
    }

private var _capacitor: ImageVector? = null
