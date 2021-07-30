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

public val LineAwesomeIcons.Mastodon: ImageVector
    get() {
        if (_mastodon != null) {
            return _mastodon!!
        }
        _mastodon = Builder(name = "Mastodon", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.9375f, 4.0313f)
                curveTo(12.917f, 4.0435f, 9.9179f, 4.427f, 8.3574f, 5.1465f)
                curveTo(8.3574f, 5.1465f, 5.0f, 6.6749f, 5.0f, 11.8809f)
                curveTo(5.0f, 18.0779f, 4.9955f, 25.8602f, 10.5625f, 27.3652f)
                curveTo(12.6945f, 27.9382f, 14.528f, 28.0616f, 16.002f, 27.9766f)
                curveTo(18.677f, 27.8256f, 20.0f, 27.0059f, 20.0f, 27.0059f)
                lineTo(19.9102f, 25.0293f)
                curveTo(19.9102f, 25.0293f, 18.1763f, 25.6403f, 16.0293f, 25.5703f)
                curveTo(13.9023f, 25.4953f, 11.6615f, 25.3357f, 11.3125f, 22.6797f)
                curveTo(11.2805f, 22.4327f, 11.2646f, 22.1826f, 11.2656f, 21.9336f)
                curveTo(15.7726f, 23.0526f, 19.6158f, 22.421f, 20.6738f, 22.293f)
                curveTo(23.6278f, 21.934f, 26.1993f, 20.0817f, 26.5273f, 18.3887f)
                curveTo(27.0413f, 15.7207f, 26.998f, 11.8809f, 26.998f, 11.8809f)
                curveTo(26.998f, 6.6749f, 23.6465f, 5.1465f, 23.6465f, 5.1465f)
                curveTo(22.001f, 4.378f, 18.958f, 4.019f, 15.9375f, 4.0313f)
                close()
                moveTo(12.7051f, 8.002f)
                curveTo(13.74f, 8.0297f, 14.7626f, 8.4927f, 15.3926f, 9.4707f)
                lineTo(16.002f, 10.5059f)
                lineTo(16.6094f, 9.4707f)
                curveTo(17.8744f, 7.5037f, 20.7096f, 7.6264f, 22.0586f, 9.1484f)
                curveTo(23.3026f, 10.5964f, 23.0254f, 11.531f, 23.0254f, 18.0f)
                lineTo(23.0254f, 18.002f)
                lineTo(20.5781f, 18.002f)
                lineTo(20.5781f, 12.373f)
                curveTo(20.5781f, 9.738f, 17.2188f, 9.6363f, 17.2188f, 12.7383f)
                lineTo(17.2188f, 16.0f)
                lineTo(14.7871f, 16.0f)
                lineTo(14.7871f, 12.7383f)
                curveTo(14.7871f, 9.6363f, 11.4297f, 9.7361f, 11.4297f, 12.3711f)
                lineTo(11.4297f, 18.0f)
                lineTo(8.9766f, 18.0f)
                curveTo(8.9766f, 11.526f, 8.7044f, 10.5854f, 9.9434f, 9.1484f)
                curveTo(10.6229f, 8.3824f, 11.6702f, 7.9742f, 12.7051f, 8.002f)
                close()
            }
        }
        .build()
        return _mastodon!!
    }

private var _mastodon: ImageVector? = null
