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

public val SimpleIcons.Hotwire: ImageVector
    get() {
        if (_hotwire != null) {
            return _hotwire!!
        }
        _hotwire = Builder(name = "Hotwire", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(16.764f, 6.917f)
                lineToRelative(-3.48f, 0.81f)
                lineTo(16.32f, 0.0f)
                lineTo(7.236f, 11.705f)
                lineToRelative(4.334f, -0.854f)
                lineToRelative(-4.087f, 7.982f)
                lineToRelative(2.364f, -0.532f)
                lineTo(7.456f, 24.0f)
                lineToRelative(7.51f, -8.111f)
                lineToRelative(-2.77f, 0.64f)
                lineToRelative(4.568f, -9.612f)
                close()
            }
        }
        .build()
        return _hotwire!!
    }

private var _hotwire: ImageVector? = null
