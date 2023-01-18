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

public val FilledGroup.Mention: ImageVector
    get() {
        if (_mention != null) {
            return _mention!!
        }
        _mention = Builder(name = "Mention", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(17.4292f, 2.0f, 21.8479f, 6.3267f, 21.9962f, 11.7201f)
                lineTo(22.0f, 12.0f)
                lineTo(21.9997f, 13.5254f)
                curveTo(21.9864f, 15.7227f, 20.2007f, 17.5f, 18.0f, 17.5f)
                curveTo(16.5544f, 17.5f, 15.288f, 16.7332f, 14.5852f, 15.5841f)
                curveTo(13.7852f, 16.4184f, 12.7033f, 16.9333f, 11.5f, 16.9333f)
                curveTo(8.9849f, 16.9333f, 7.0f, 14.6838f, 7.0f, 11.9667f)
                curveTo(7.0f, 9.2496f, 8.9849f, 7.0f, 11.5f, 7.0f)
                curveTo(12.4366f, 7.0f, 13.2997f, 7.312f, 14.0141f, 7.8439f)
                curveTo(14.087f, 7.3658f, 14.5008f, 7.0f, 15.0f, 7.0f)
                curveTo(15.5128f, 7.0f, 15.9355f, 7.386f, 15.9933f, 7.8834f)
                lineTo(16.0f, 8.0f)
                verticalLineTo(13.5f)
                curveTo(16.0f, 14.6046f, 16.8954f, 15.5f, 18.0f, 15.5f)
                curveTo(19.0544f, 15.5f, 19.9182f, 14.6841f, 19.9945f, 13.6493f)
                lineTo(20.0003f, 13.4748f)
                lineTo(20.0f, 12.0f)
                curveTo(20.0f, 7.5817f, 16.4183f, 4.0f, 12.0f, 4.0f)
                curveTo(7.5817f, 4.0f, 4.0f, 7.5817f, 4.0f, 12.0f)
                curveTo(4.0f, 16.4183f, 7.5817f, 20.0f, 12.0f, 20.0f)
                curveTo(12.9215f, 20.0f, 13.8203f, 19.8446f, 14.6695f, 19.5441f)
                curveTo(15.1901f, 19.3598f, 15.7616f, 19.6326f, 15.9458f, 20.1532f)
                curveTo(16.13f, 20.6739f, 15.8573f, 21.2453f, 15.3367f, 21.4295f)
                curveTo(14.2739f, 21.8056f, 13.1495f, 22.0f, 12.0f, 22.0f)
                curveTo(6.4771f, 22.0f, 2.0f, 17.5228f, 2.0f, 12.0f)
                curveTo(2.0f, 6.4771f, 6.4771f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(11.6492f, 9.0053f)
                lineTo(11.5f, 9.0f)
                curveTo(10.1491f, 9.0f, 9.0f, 10.3023f, 9.0f, 11.9667f)
                curveTo(9.0f, 13.631f, 10.1491f, 14.9333f, 11.5f, 14.9333f)
                curveTo(12.8009f, 14.9333f, 13.9146f, 13.7257f, 13.9953f, 12.1501f)
                lineTo(13.9998f, 11.9293f)
                curveTo(13.9834f, 10.3443f, 12.9245f, 9.0962f, 11.6492f, 9.0053f)
                lineTo(11.5f, 9.0f)
                lineTo(11.6492f, 9.0053f)
                close()
            }
        }
        .build()
        return _mention!!
    }

private var _mention: ImageVector? = null
