package compose.icons.fluentuiicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.RegularGroup

public val RegularGroup.Fluent: ImageVector
    get() {
        if (_fluent != null) {
            return _fluent!!
        }
        _fluent = Builder(name = "Fluent", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.4108f, 2.508f)
                lineTo(12.4571f, 2.502f)
                lineTo(12.5444f, 2.5021f)
                lineTo(12.6499f, 2.5231f)
                lineTo(12.7236f, 2.5529f)
                lineTo(18.7236f, 5.5529f)
                curveTo(19.0921f, 5.7372f, 19.0921f, 6.2631f, 18.7236f, 6.4473f)
                lineTo(13.618f, 9.0001f)
                lineTo(18.7236f, 11.5529f)
                curveTo(19.0933f, 11.7377f, 19.0918f, 12.2659f, 18.7211f, 12.4486f)
                lineTo(12.9642f, 15.2861f)
                lineTo(13.0f, 20.997f)
                curveTo(13.0024f, 21.3843f, 12.5826f, 21.6271f, 12.2481f, 21.432f)
                lineTo(6.2481f, 17.932f)
                curveTo(6.0945f, 17.8424f, 6.0f, 17.6779f, 6.0f, 17.5001f)
                lineTo(6.0018f, 5.9557f)
                lineTo(6.0203f, 5.8587f)
                lineTo(6.0418f, 5.8f)
                lineTo(6.0536f, 5.7748f)
                curveTo(6.0706f, 5.7411f, 6.091f, 5.7102f, 6.114f, 5.6822f)
                lineTo(6.1803f, 5.6155f)
                lineTo(6.2517f, 5.5661f)
                lineTo(12.3262f, 2.5312f)
                lineTo(12.4108f, 2.508f)
                close()
                moveTo(7.0f, 12.8111f)
                verticalLineTo(17.2129f)
                lineTo(11.9945f, 20.1264f)
                lineTo(11.964f, 15.3131f)
                lineTo(7.0f, 12.8111f)
                close()
                moveTo(7.617f, 12.0031f)
                lineTo(11.999f, 14.2101f)
                lineTo(11.993f, 9.8291f)
                lineTo(7.617f, 12.0031f)
                close()
                moveTo(12.992f, 9.8051f)
                lineTo(12.999f, 14.1531f)
                lineTo(17.3756f, 11.9969f)
                lineTo(12.992f, 9.8051f)
                close()
                moveTo(7.0f, 11.1921f)
                lineTo(11.374f, 9.0201f)
                lineTo(7.0f, 6.8121f)
                verticalLineTo(11.1921f)
                close()
                moveTo(11.999f, 3.8101f)
                lineTo(7.615f, 6.0021f)
                lineTo(11.993f, 8.2111f)
                lineTo(11.999f, 3.8101f)
                close()
                moveTo(12.992f, 8.1941f)
                lineTo(17.382f, 6.0001f)
                lineTo(12.999f, 3.8081f)
                lineTo(12.992f, 8.1941f)
                close()
            }
        }
        .build()
        return _fluent!!
    }

private var _fluent: ImageVector? = null
