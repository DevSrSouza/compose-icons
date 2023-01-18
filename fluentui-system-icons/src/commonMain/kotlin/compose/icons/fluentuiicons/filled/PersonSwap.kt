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

public val FilledGroup.PersonSwap: ImageVector
    get() {
        if (_personSwap != null) {
            return _personSwap!!
        }
        _personSwap = Builder(name = "PersonSwap", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.7506f, 13.9972f)
                curveTo(16.9927f, 13.9972f, 17.9995f, 15.0041f, 17.9995f, 16.2461f)
                verticalLineTo(17.1646f)
                curveTo(17.9995f, 17.4501f, 17.9551f, 17.7321f, 17.8693f, 18.0008f)
                horizontalLineTo(15.8352f)
                curveTo(16.1384f, 17.3528f, 16.0226f, 16.5572f, 15.4876f, 16.0219f)
                curveTo(14.8044f, 15.3383f, 13.6964f, 15.3379f, 13.0127f, 16.0211f)
                lineTo(10.5127f, 18.5195f)
                curveTo(10.1842f, 18.8478f, 9.9997f, 19.2932f, 9.9998f, 19.7577f)
                curveTo(9.9999f, 20.2221f, 10.1846f, 20.6675f, 10.5133f, 20.9957f)
                lineTo(11.4477f, 21.9287f)
                curveTo(10.9835f, 21.9752f, 10.4997f, 21.9984f, 9.9965f, 21.9984f)
                curveTo(6.5755f, 21.9984f, 4.0525f, 20.9262f, 2.5104f, 18.7619f)
                curveTo(2.1784f, 18.296f, 2.0f, 17.7382f, 2.0f, 17.1661f)
                verticalLineTo(16.2461f)
                curveTo(2.0f, 15.0041f, 3.0069f, 13.9972f, 4.2489f, 13.9972f)
                horizontalLineTo(15.7506f)
                close()
                moveTo(9.9965f, 2.002f)
                curveTo(12.7579f, 2.002f, 14.9965f, 4.2405f, 14.9965f, 7.0019f)
                curveTo(14.9965f, 9.7634f, 12.7579f, 12.002f, 9.9965f, 12.002f)
                curveTo(7.235f, 12.002f, 4.9965f, 9.7634f, 4.9965f, 7.0019f)
                curveTo(4.9965f, 4.2405f, 7.235f, 2.002f, 9.9965f, 2.002f)
                close()
                moveTo(14.7802f, 17.7835f)
                curveTo(15.073f, 17.4906f, 15.0729f, 17.0157f, 14.78f, 16.7229f)
                curveTo(14.487f, 16.4301f, 14.0121f, 16.4302f, 13.7193f, 16.7231f)
                lineTo(11.2193f, 19.2242f)
                curveTo(11.0787f, 19.3649f, 10.9997f, 19.5557f, 10.9998f, 19.7546f)
                curveTo(10.9998f, 19.9535f, 11.0789f, 20.1442f, 11.2195f, 20.2849f)
                lineTo(13.7195f, 22.7838f)
                curveTo(14.0125f, 23.0766f, 14.4874f, 23.0765f, 14.7802f, 22.7835f)
                curveTo(15.073f, 22.4906f, 15.0729f, 22.0157f, 14.78f, 21.7229f)
                lineTo(13.5599f, 20.5033f)
                horizontalLineTo(20.4399f)
                lineTo(19.2196f, 21.7228f)
                curveTo(18.9266f, 22.0156f, 18.9265f, 22.4905f, 19.2193f, 22.7835f)
                curveTo(19.5121f, 23.0765f, 19.9869f, 23.0766f, 20.2799f, 22.7838f)
                lineTo(22.7799f, 20.2854f)
                curveTo(22.9206f, 20.1448f, 22.9997f, 19.9541f, 22.9998f, 19.7552f)
                curveTo(22.9998f, 19.5563f, 22.9209f, 19.3655f, 22.7803f, 19.2248f)
                lineTo(20.2803f, 16.7232f)
                curveTo(19.9875f, 16.4302f, 19.5126f, 16.43f, 19.2196f, 16.7228f)
                curveTo(18.9266f, 17.0156f, 18.9265f, 17.4905f, 19.2193f, 17.7835f)
                lineTo(20.4383f, 19.0033f)
                horizontalLineTo(13.5609f)
                lineTo(14.7802f, 17.7835f)
                close()
            }
        }
        .build()
        return _personSwap!!
    }

private var _personSwap: ImageVector? = null
