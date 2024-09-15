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

public val LineAwesomeIcons.Vimeo: ImageVector
    get() {
        if (_vimeo != null) {
            return _vimeo!!
        }
        _vimeo = Builder(name = "Vimeo", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(27.988f, 10.41f)
                curveTo(27.883f, 12.754f, 26.25f, 15.957f, 23.094f, 20.027f)
                curveTo(19.828f, 24.273f, 17.07f, 26.398f, 14.813f, 26.398f)
                curveTo(13.41f, 26.398f, 12.227f, 25.105f, 11.262f, 22.52f)
                curveTo(10.613f, 20.145f, 9.969f, 17.773f, 9.324f, 15.402f)
                curveTo(8.605f, 12.813f, 7.836f, 11.52f, 7.012f, 11.52f)
                curveTo(6.832f, 11.52f, 6.203f, 11.898f, 5.129f, 12.652f)
                lineTo(4.0f, 11.195f)
                curveTo(5.184f, 10.152f, 6.352f, 9.109f, 7.504f, 8.066f)
                curveTo(9.082f, 6.699f, 10.27f, 5.98f, 11.059f, 5.906f)
                curveTo(12.926f, 5.727f, 14.078f, 7.004f, 14.508f, 9.742f)
                curveTo(14.973f, 12.699f, 15.297f, 14.535f, 15.477f, 15.254f)
                curveTo(16.016f, 17.707f, 16.609f, 18.93f, 17.258f, 18.93f)
                curveTo(17.758f, 18.93f, 18.512f, 18.137f, 19.52f, 16.547f)
                curveTo(20.523f, 14.953f, 21.063f, 13.746f, 21.137f, 12.914f)
                curveTo(21.277f, 11.543f, 20.738f, 10.855f, 19.52f, 10.855f)
                curveTo(18.945f, 10.855f, 18.352f, 10.984f, 17.742f, 11.246f)
                curveTo(18.922f, 7.379f, 21.176f, 5.496f, 24.504f, 5.605f)
                curveTo(26.969f, 5.676f, 28.129f, 7.277f, 27.988f, 10.41f)
                close()
            }
        }
        .build()
        return _vimeo!!
    }

private var _vimeo: ImageVector? = null
