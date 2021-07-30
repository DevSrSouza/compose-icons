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

public val LineAwesomeIcons.Rocketchat: ImageVector
    get() {
        if (_rocketchat != null) {
            return _rocketchat!!
        }
        _rocketchat = Builder(name = "Rocketchat", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.5488f, 5.0f)
                curveTo(6.2638f, 5.0f, 5.055f, 5.3086f, 4.0f, 5.8496f)
                curveTo(5.4225f, 6.9695f, 6.4323f, 8.5275f, 6.8359f, 10.3008f)
                curveTo(5.0652f, 11.8542f, 4.0f, 13.8385f, 4.0f, 16.0f)
                curveTo(4.0f, 18.1f, 5.0028f, 20.1108f, 6.8398f, 21.7168f)
                curveTo(6.5498f, 22.9668f, 5.948f, 24.134f, 5.082f, 25.123f)
                lineTo(4.0137f, 26.3457f)
                lineTo(5.5859f, 26.752f)
                curveTo(6.2259f, 26.918f, 6.8868f, 27.0f, 7.5488f, 27.0f)
                curveTo(9.7768f, 27.0f, 11.8418f, 26.1975f, 13.4238f, 24.7285f)
                curveTo(14.4258f, 24.9085f, 15.458f, 25.0f, 16.5f, 25.0f)
                curveTo(23.393f, 25.0f, 29.0f, 20.962f, 29.0f, 16.0f)
                curveTo(29.0f, 11.038f, 23.393f, 7.0f, 16.5f, 7.0f)
                curveTo(15.4409f, 7.0f, 14.4182f, 7.1058f, 13.4355f, 7.2852f)
                curveTo(11.9135f, 5.8774f, 9.8442f, 5.0f, 7.5488f, 5.0f)
                close()
                moveTo(16.5f, 9.0f)
                curveTo(22.29f, 9.0f, 27.0f, 12.14f, 27.0f, 16.0f)
                curveTo(27.0f, 19.86f, 22.29f, 23.0f, 16.5f, 23.0f)
                curveTo(15.412f, 23.0f, 14.3386f, 22.889f, 13.3086f, 22.668f)
                lineTo(12.7578f, 22.5488f)
                lineTo(12.3711f, 22.957f)
                curveTo(11.1471f, 24.252f, 9.4696f, 24.976f, 7.6406f, 25.0f)
                curveTo(8.2906f, 23.917f, 8.7279f, 22.7245f, 8.9219f, 21.4785f)
                lineTo(9.0137f, 20.8965f)
                lineTo(8.5488f, 20.5352f)
                curveTo(6.9058f, 19.2562f, 6.0f, 17.646f, 6.0f, 16.0f)
                curveTo(6.0f, 12.14f, 10.71f, 9.0f, 16.5f, 9.0f)
                close()
                moveTo(11.5f, 15.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 11.5f, 18.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 11.5f, 15.0f)
                close()
                moveTo(16.5f, 15.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 16.5f, 18.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 16.5f, 15.0f)
                close()
                moveTo(21.5f, 15.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 21.5f, 18.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 21.5f, 15.0f)
                close()
            }
        }
        .build()
        return _rocketchat!!
    }

private var _rocketchat: ImageVector? = null
