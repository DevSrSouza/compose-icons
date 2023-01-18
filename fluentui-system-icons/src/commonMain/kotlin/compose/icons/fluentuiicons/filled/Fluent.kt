package compose.icons.fluentuiicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.FilledGroup

public val FilledGroup.Fluent: ImageVector
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
                verticalLineTo(2.502f)
                lineTo(12.5444f, 2.5021f)
                verticalLineTo(2.5021f)
                lineTo(12.6499f, 2.5231f)
                verticalLineTo(2.5231f)
                lineTo(12.7236f, 2.5529f)
                verticalLineTo(2.5529f)
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
                verticalLineTo(5.9557f)
                lineTo(6.0203f, 5.8587f)
                verticalLineTo(5.8587f)
                lineTo(6.0418f, 5.8f)
                verticalLineTo(5.8f)
                lineTo(6.0536f, 5.7748f)
                curveTo(6.0706f, 5.7411f, 6.091f, 5.7102f, 6.114f, 5.6822f)
                lineTo(6.1803f, 5.6155f)
                verticalLineTo(5.6155f)
                lineTo(6.2517f, 5.5661f)
                verticalLineTo(5.5661f)
                lineTo(12.3262f, 2.5312f)
                verticalLineTo(2.5312f)
                lineTo(12.4108f, 2.508f)
                close()
            }
        }
        .build()
        return _fluent!!
    }

private var _fluent: ImageVector? = null
