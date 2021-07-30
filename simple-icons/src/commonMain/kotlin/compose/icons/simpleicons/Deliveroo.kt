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

public val SimpleIcons.Deliveroo: ImageVector
    get() {
        if (_deliveroo != null) {
            return _deliveroo!!
        }
        _deliveroo = Builder(name = "Deliveroo", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.861f, 0.0f)
                lineToRelative(-1.127f, 10.584f)
                lineTo(13.81f, 1.66f)
                lineTo(7.777f, 2.926f)
                lineToRelative(1.924f, 8.922f)
                lineToRelative(-8.695f, 1.822f)
                lineToRelative(1.535f, 7.127f)
                lineTo(17.832f, 24.0f)
                lineToRelative(3.498f, -7.744f)
                lineTo(22.994f, 0.636f)
                lineTo(16.861f, 0.0f)
                close()
                moveTo(11.39f, 13.61f)
                arcToRelative(0.755f, 0.755f, 0.0f, false, true, 0.322f, 0.066f)
                curveToRelative(0.208f, 0.093f, 0.56f, 0.29f, 0.63f, 0.592f)
                curveToRelative(0.103f, 0.434f, 0.004f, 0.799f, -0.312f, 1.084f)
                verticalLineToRelative(0.002f)
                curveToRelative(-0.315f, 0.284f, -0.732f, 0.258f, -1.174f, 0.113f)
                curveToRelative(-0.441f, -0.145f, -0.637f, -0.672f, -0.47f, -1.309f)
                curveToRelative(0.124f, -0.473f, 0.71f, -0.544f, 1.004f, -0.549f)
                close()
                moveTo(15.532f, 14.158f)
                curveToRelative(0.447f, -0.012f, 0.832f, 0.186f, 1.05f, 0.543f)
                curveToRelative(0.217f, 0.357f, 0.107f, 0.75f, -0.122f, 1.143f)
                horizontalLineToRelative(-0.002f)
                curveToRelative(-0.229f, 0.392f, -0.83f, 0.445f, -1.422f, 0.16f)
                curveToRelative(-0.399f, -0.193f, -0.397f, -0.684f, -0.353f, -0.983f)
                arcToRelative(0.922f, 0.922f, 0.0f, false, true, 0.193f, -0.447f)
                curveToRelative(0.142f, -0.177f, 0.381f, -0.408f, 0.656f, -0.416f)
                close()
            }
        }
        .build()
        return _deliveroo!!
    }

private var _deliveroo: ImageVector? = null
