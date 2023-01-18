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

public val RegularGroup.TextMore: ImageVector
    get() {
        if (_textMore != null) {
            return _textMore!!
        }
        _textMore = Builder(name = "TextMore", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.7502f, 2.0f)
                curveTo(10.0512f, 2.0f, 10.3231f, 2.18f, 10.4406f, 2.4571f)
                lineTo(17.4115f, 18.8884f)
                curveTo(16.9529f, 18.3451f, 16.2669f, 18.0f, 15.5002f, 18.0f)
                curveTo(15.4686f, 18.0f, 15.4372f, 18.0006f, 15.4059f, 18.0017f)
                lineTo(13.9203f, 14.5f)
                horizontalLineTo(5.58f)
                lineTo(3.4406f, 19.5429f)
                curveTo(3.2789f, 19.9242f, 2.8386f, 20.1022f, 2.4573f, 19.9404f)
                curveTo(2.076f, 19.7787f, 1.898f, 19.3384f, 2.0598f, 18.9571f)
                lineTo(9.0598f, 2.4571f)
                curveTo(9.1773f, 2.18f, 9.4492f, 2.0f, 9.7502f, 2.0f)
                close()
                moveTo(13.284f, 13.0f)
                lineTo(9.7502f, 4.6704f)
                lineTo(6.2164f, 13.0f)
                horizontalLineTo(13.284f)
                close()
                moveTo(12.0f, 20.5f)
                curveTo(12.0f, 21.3284f, 11.3284f, 22.0f, 10.5f, 22.0f)
                curveTo(9.6716f, 22.0f, 9.0f, 21.3284f, 9.0f, 20.5f)
                curveTo(9.0f, 19.6716f, 9.6716f, 19.0f, 10.5f, 19.0f)
                curveTo(11.3284f, 19.0f, 12.0f, 19.6716f, 12.0f, 20.5f)
                close()
                moveTo(15.5f, 22.0f)
                curveTo(16.3284f, 22.0f, 17.0f, 21.3284f, 17.0f, 20.5f)
                curveTo(17.0f, 19.6716f, 16.3284f, 19.0f, 15.5f, 19.0f)
                curveTo(14.6716f, 19.0f, 14.0f, 19.6716f, 14.0f, 20.5f)
                curveTo(14.0f, 21.3284f, 14.6716f, 22.0f, 15.5f, 22.0f)
                close()
                moveTo(20.5f, 22.0f)
                curveTo(21.3284f, 22.0f, 22.0f, 21.3284f, 22.0f, 20.5f)
                curveTo(22.0f, 19.6716f, 21.3284f, 19.0f, 20.5f, 19.0f)
                curveTo(19.6716f, 19.0f, 19.0f, 19.6716f, 19.0f, 20.5f)
                curveTo(19.0f, 21.3284f, 19.6716f, 22.0f, 20.5f, 22.0f)
                close()
            }
        }
        .build()
        return _textMore!!
    }

private var _textMore: ImageVector? = null
