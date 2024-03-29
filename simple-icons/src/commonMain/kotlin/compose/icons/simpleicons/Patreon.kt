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

public val SimpleIcons.Patreon: ImageVector
    get() {
        if (_patreon != null) {
            return _patreon!!
        }
        _patreon = Builder(name = "Patreon", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 0.48f)
                verticalLineToRelative(23.04f)
                horizontalLineToRelative(4.22f)
                lineTo(4.22f, 0.48f)
                close()
                moveTo(15.385f, 0.48f)
                curveToRelative(-4.764f, 0.0f, -8.641f, 3.88f, -8.641f, 8.65f)
                curveToRelative(0.0f, 4.755f, 3.877f, 8.623f, 8.641f, 8.623f)
                curveToRelative(4.75f, 0.0f, 8.615f, -3.868f, 8.615f, -8.623f)
                curveTo(24.0f, 4.36f, 20.136f, 0.48f, 15.385f, 0.48f)
                close()
            }
        }
        .build()
        return _patreon!!
    }

private var _patreon: ImageVector? = null
