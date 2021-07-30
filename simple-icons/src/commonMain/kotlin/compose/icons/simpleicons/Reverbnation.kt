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

public val SimpleIcons.Reverbnation: ImageVector
    get() {
        if (_reverbnation != null) {
            return _reverbnation!!
        }
        _reverbnation = Builder(name = "Reverbnation", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 9.324f)
                lineToRelative(-9.143f, -0.03f)
                lineTo(11.971f, 0.57f)
                lineTo(9.143f, 9.294f)
                lineTo(0.0f, 9.324f)
                horizontalLineToRelative(0.031f)
                lineToRelative(7.367f, 5.355f)
                lineToRelative(-2.855f, 8.749f)
                horizontalLineToRelative(0.029f)
                lineToRelative(7.459f, -5.386f)
                lineToRelative(7.396f, 5.386f)
                lineToRelative(-2.855f, -8.73f)
                lineTo(24.0f, 9.315f)
            }
        }
        .build()
        return _reverbnation!!
    }

private var _reverbnation: ImageVector? = null
