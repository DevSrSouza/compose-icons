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

public val LineAwesomeIcons.Mendeley: ImageVector
    get() {
        if (_mendeley != null) {
            return _mendeley!!
        }
        _mendeley = Builder(name = "Mendeley", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.6582f, 7.2012f)
                curveTo(6.0462f, 7.1612f, 4.2041f, 10.8326f, 5.3281f, 13.6816f)
                curveTo(5.9321f, 16.8476f, 5.3472f, 18.5272f, 3.2012f, 18.5762f)
                curveTo(2.1512f, 18.4622f, 1.3672f, 18.8984f, 0.5742f, 19.6914f)
                curveTo(-0.4118f, 20.6674f, -0.3815f, 24.3884f, 2.6855f, 24.7754f)
                curveTo(5.0195f, 25.0674f, 6.6458f, 22.5218f, 5.7188f, 20.4258f)
                curveTo(3.3747f, 15.2878f, 15.0731f, 15.1685f, 13.1211f, 20.0195f)
                curveTo(13.1161f, 20.0245f, 13.1105f, 20.0291f, 13.1055f, 20.0391f)
                curveTo(11.7775f, 22.1601f, 13.4435f, 24.8668f, 16.0195f, 24.7578f)
                curveTo(18.6005f, 24.8618f, 20.2496f, 22.1501f, 18.9316f, 20.0391f)
                curveTo(18.9266f, 20.0291f, 18.923f, 20.0245f, 18.918f, 20.0195f)
                curveTo(16.966f, 15.1685f, 28.6633f, 15.2878f, 26.3203f, 20.4258f)
                curveTo(26.0923f, 20.9208f, 25.9871f, 21.4805f, 26.0371f, 22.0605f)
                curveTo(26.2801f, 24.7065f, 29.4423f, 25.7327f, 31.2363f, 23.8047f)
                curveTo(32.1193f, 23.0707f, 32.3803f, 20.5547f, 31.2363f, 19.4297f)
                curveTo(30.6273f, 18.8157f, 29.7658f, 18.4772f, 28.8398f, 18.5762f)
                curveTo(26.6948f, 18.5262f, 26.0669f, 16.8476f, 26.6719f, 13.6816f)
                curveTo(27.8019f, 10.8326f, 25.9348f, 7.1662f, 22.3418f, 7.2012f)
                curveTo(18.5068f, 7.2362f, 18.4575f, 11.2637f, 16.0195f, 11.2637f)
                curveTo(13.6365f, 11.2637f, 13.4682f, 7.2362f, 9.6582f, 7.2012f)
                close()
                moveTo(16.0059f, 12.2598f)
                lineTo(16.0352f, 12.2598f)
                curveTo(17.7542f, 12.2598f, 19.1465f, 13.6511f, 19.1465f, 15.3711f)
                curveTo(19.1465f, 16.6101f, 18.1952f, 18.4824f, 16.0352f, 18.4824f)
                lineTo(16.0059f, 18.4824f)
                curveTo(13.8559f, 18.4824f, 12.8926f, 16.6251f, 12.8926f, 15.3711f)
                curveTo(12.8926f, 13.6521f, 14.2909f, 12.2598f, 16.0059f, 12.2598f)
                close()
            }
        }
        .build()
        return _mendeley!!
    }

private var _mendeley: ImageVector? = null
