package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.CssGgIcons

public val CssGgIcons.Stark: ImageVector
    get() {
        if (_stark != null) {
            return _stark!!
        }
        _stark = Builder(name = "Stark", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.172f, 18.025f)
                curveTo(5.817f, 17.286f, 4.695f, 16.166f, 3.955f, 14.791f)
                curveTo(3.017f, 13.047f, 2.758f, 11.016f, 3.231f, 9.093f)
                curveTo(3.703f, 7.169f, 4.872f, 5.489f, 6.512f, 4.378f)
                curveTo(8.151f, 3.266f, 10.145f, 2.803f, 12.107f, 3.077f)
                lineTo(11.67f, 6.203f)
                curveTo(10.482f, 6.037f, 9.275f, 6.317f, 8.282f, 6.99f)
                curveTo(7.29f, 7.663f, 6.582f, 8.68f, 6.296f, 9.845f)
                curveTo(6.01f, 11.01f, 6.166f, 12.239f, 6.734f, 13.295f)
                curveTo(7.182f, 14.128f, 7.861f, 14.806f, 8.682f, 15.254f)
                lineTo(14.828f, 3.975f)
                lineTo(17.462f, 5.411f)
                curveTo(18.818f, 6.149f, 19.939f, 7.27f, 20.679f, 8.645f)
                curveTo(21.618f, 10.389f, 21.876f, 12.419f, 21.404f, 14.343f)
                curveTo(20.931f, 16.267f, 19.762f, 17.947f, 18.123f, 19.058f)
                curveTo(16.483f, 20.169f, 14.489f, 20.633f, 12.528f, 20.359f)
                lineTo(12.964f, 17.233f)
                curveTo(14.152f, 17.399f, 15.359f, 17.118f, 16.352f, 16.445f)
                curveTo(17.345f, 15.773f, 18.053f, 14.755f, 18.339f, 13.59f)
                curveTo(18.625f, 12.426f, 18.468f, 11.196f, 17.9f, 10.14f)
                curveTo(17.452f, 9.308f, 16.773f, 8.629f, 15.952f, 8.182f)
                lineTo(9.806f, 19.46f)
                lineTo(7.172f, 18.025f)
                close()
            }
        }
        .build()
        return _stark!!
    }

private var _stark: ImageVector? = null
