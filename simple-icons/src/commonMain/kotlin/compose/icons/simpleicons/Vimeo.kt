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

public val SimpleIcons.Vimeo: ImageVector
    get() {
        if (_vimeo != null) {
            return _vimeo!!
        }
        _vimeo = Builder(name = "Vimeo", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.9765f, 6.4168f)
                curveToRelative(-0.105f, 2.338f, -1.739f, 5.5429f, -4.894f, 9.6088f)
                curveToRelative(-3.2679f, 4.247f, -6.0258f, 6.3699f, -8.2898f, 6.3699f)
                curveToRelative(-1.409f, 0.0f, -2.578f, -1.294f, -3.553f, -3.881f)
                lineToRelative(-1.9179f, -7.1138f)
                curveToRelative(-0.719f, -2.584f, -1.488f, -3.878f, -2.312f, -3.878f)
                curveToRelative(-0.179f, 0.0f, -0.806f, 0.378f, -1.8809f, 1.132f)
                lineToRelative(-1.129f, -1.457f)
                arcToRelative(315.06f, 315.06f, 0.0f, false, false, 3.501f, -3.1279f)
                curveToRelative(1.579f, -1.368f, 2.765f, -2.085f, 3.5539f, -2.159f)
                curveToRelative(1.867f, -0.18f, 3.016f, 1.1f, 3.447f, 3.838f)
                curveToRelative(0.465f, 2.953f, 0.789f, 4.789f, 0.971f, 5.5069f)
                curveToRelative(0.5389f, 2.45f, 1.1309f, 3.674f, 1.7759f, 3.674f)
                curveToRelative(0.502f, 0.0f, 1.256f, -0.796f, 2.265f, -2.385f)
                curveToRelative(1.004f, -1.589f, 1.54f, -2.797f, 1.612f, -3.628f)
                curveToRelative(0.144f, -1.371f, -0.395f, -2.061f, -1.614f, -2.061f)
                curveToRelative(-0.574f, 0.0f, -1.167f, 0.121f, -1.777f, 0.391f)
                curveToRelative(1.186f, -3.8679f, 3.434f, -5.7568f, 6.7619f, -5.6368f)
                curveToRelative(2.4729f, 0.06f, 3.6279f, 1.664f, 3.4929f, 4.7969f)
                close()
            }
        }
        .build()
        return _vimeo!!
    }

private var _vimeo: ImageVector? = null
