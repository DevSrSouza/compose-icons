package compose.icons.lineawesomeicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.LineAwesomeIcons

public val LineAwesomeIcons.Joget: ImageVector
    get() {
        if (_joget != null) {
            return _joget!!
        }
        _joget = Builder(name = "Joget", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 3.0f)
                curveTo(8.832f, 3.0f, 3.0f, 8.832f, 3.0f, 16.0f)
                curveTo(3.0f, 23.168f, 8.832f, 29.0f, 16.0f, 29.0f)
                curveTo(23.168f, 29.0f, 29.0f, 23.168f, 29.0f, 16.0f)
                curveTo(29.0f, 8.832f, 23.168f, 3.0f, 16.0f, 3.0f)
                close()
                moveTo(16.0f, 5.0f)
                curveTo(22.065f, 5.0f, 27.0f, 9.935f, 27.0f, 16.0f)
                curveTo(27.0f, 16.4028f, 26.976f, 16.7997f, 26.9336f, 17.1914f)
                curveTo(24.4116f, 17.1894f, 17.4732f, 17.2335f, 14.9531f, 17.168f)
                curveTo(11.8721f, 17.099f, 10.4189f, 16.013f, 11.7109f, 14.502f)
                curveTo(12.9919f, 12.979f, 14.226f, 12.2286f, 15.207f, 11.6406f)
                curveTo(16.199f, 11.0636f, 16.6841f, 9.8064f, 13.8691f, 10.0254f)
                curveTo(8.3649f, 10.3994f, 6.0626f, 13.4403f, 5.0059f, 15.8672f)
                curveTo(5.078f, 9.8638f, 9.9798f, 5.0f, 16.0f, 5.0f)
                close()
                moveTo(21.582f, 12.0f)
                curveTo(20.589f, 12.0f, 18.9166f, 13.4195f, 17.4746f, 14.3535f)
                curveTo(15.7326f, 15.4955f, 13.8516f, 16.0957f, 13.8516f, 16.0957f)
                lineTo(23.2559f, 16.0039f)
                lineTo(25.9883f, 14.6641f)
                curveTo(25.9883f, 14.6641f, 26.1847f, 14.1335f, 24.9277f, 13.8105f)
                curveTo(23.6697f, 13.4755f, 21.6168f, 14.4694f, 19.9668f, 15.3574f)
                curveTo(18.3168f, 16.2344f, 18.248f, 15.8066f, 18.248f, 15.8066f)
                curveTo(18.248f, 15.8066f, 20.8312f, 13.8697f, 21.4082f, 13.5117f)
                curveTo(21.9972f, 13.1547f, 23.1852f, 12.7384f, 22.1582f, 12.1504f)
                curveTo(21.9732f, 12.0464f, 21.778f, 12.0f, 21.582f, 12.0f)
                close()
                moveTo(26.0918f, 20.3672f)
                curveTo(24.3981f, 24.265f, 20.5134f, 27.0f, 16.0f, 27.0f)
                curveTo(15.2988f, 27.0f, 14.6143f, 26.9268f, 13.9492f, 26.8008f)
                curveTo(13.5658f, 26.1685f, 13.1957f, 25.5067f, 13.0371f, 25.1406f)
                curveTo(12.7031f, 24.3676f, 11.4689f, 22.5667f, 14.8379f, 21.3438f)
                curveTo(17.5322f, 20.3687f, 23.5884f, 20.3922f, 26.0918f, 20.3672f)
                close()
            }
        }
        .build()
        return _joget!!
    }

private var _joget: ImageVector? = null
