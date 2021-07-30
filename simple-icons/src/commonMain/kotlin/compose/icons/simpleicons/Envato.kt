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

public val SimpleIcons.Envato: ImageVector
    get() {
        if (_envato != null) {
            return _envato!!
        }
        _envato = Builder(name = "Envato", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.058f, 1.043f)
                curveTo(16.744f, -2.841f, 6.018f, 4.682f, 6.104f, 14.38f)
                arcToRelative(0.459f, 0.459f, 0.0f, false, true, -0.45f, 0.451f)
                arcToRelative(0.459f, 0.459f, 0.0f, false, true, -0.388f, -0.221f)
                arcToRelative(10.387f, 10.387f, 0.0f, false, true, -0.412f, -7.634f)
                arcToRelative(0.42f, 0.42f, 0.0f, false, false, -0.712f, -0.412f)
                arcToRelative(10.284f, 10.284f, 0.0f, false, false, -2.784f, 7.033f)
                arcTo(10.284f, 10.284f, 0.0f, false, false, 11.76f, 23.999f)
                curveToRelative(14.635f, -0.332f, 11.257f, -19.491f, 8.298f, -22.956f)
                close()
            }
        }
        .build()
        return _envato!!
    }

private var _envato: ImageVector? = null
