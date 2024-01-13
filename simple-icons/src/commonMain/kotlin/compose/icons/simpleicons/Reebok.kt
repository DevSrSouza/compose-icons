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

public val SimpleIcons.Reebok: ImageVector
    get() {
        if (_reebok != null) {
            return _reebok!!
        }
        _reebok = Builder(name = "Reebok", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.991f, 11.48f)
                curveTo(17.744f, 10.38f, 19.458f, 9.748f, 24.0f, 8.64f)
                curveToRelative(-2.467f, 0.163f, -7.922f, 0.537f, -11.682f, 1.271f)
                lineToRelative(2.673f, 1.57f)
                moveToRelative(-8.56f, 3.651f)
                horizontalLineToRelative(3.6f)
                curveToRelative(0.713f, -1.08f, 1.422f, -1.606f, 2.248f, -2.191f)
                arcToRelative(71.382f, 71.382f, 0.0f, false, false, -1.892f, -0.701f)
                curveToRelative(-2.297f, 1.014f, -3.575f, 2.375f, -3.953f, 2.892f)
                moveToRelative(0.709f, -3.928f)
                curveToRelative(-3.21f, 1.147f, -4.994f, 2.393f, -6.199f, 3.928f)
                horizontalLineToRelative(3.975f)
                curveToRelative(0.387f, -0.539f, 1.862f, -2.093f, 4.633f, -3.174f)
                arcToRelative(57.092f, 57.092f, 0.0f, false, false, -2.41f, -0.754f)
                moveTo(8.79f, 8.788f)
                horizontalLineTo(0.0f)
                curveToRelative(8.862f, 1.6f, 13.133f, 3.66f, 20.0f, 6.572f)
                curveToRelative(-0.587f, -0.439f, -10.051f, -6.013f, -11.209f, -6.572f)
            }
        }
        .build()
        return _reebok!!
    }

private var _reebok: ImageVector? = null
