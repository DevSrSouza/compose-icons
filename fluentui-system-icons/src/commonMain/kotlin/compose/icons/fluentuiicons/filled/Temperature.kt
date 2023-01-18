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

public val FilledGroup.Temperature: ImageVector
    get() {
        if (_temperature != null) {
            return _temperature!!
        }
        _temperature = Builder(name = "Temperature", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(14.1422f, 2.0f, 15.8911f, 3.684f, 15.9951f, 5.8002f)
                lineTo(16.0f, 5.9998f)
                lineTo(16.001f, 12.728f)
                lineTo(16.0564f, 12.7856f)
                curveTo(16.8523f, 13.6539f, 17.3529f, 14.7572f, 17.4723f, 15.9459f)
                lineTo(17.493f, 16.2216f)
                lineTo(17.5f, 16.5f)
                curveTo(17.5f, 19.5376f, 15.0376f, 22.0f, 12.0f, 22.0f)
                curveTo(8.9624f, 22.0f, 6.5f, 19.5376f, 6.5f, 16.5f)
                curveTo(6.5f, 15.195f, 6.9579f, 13.9622f, 7.766f, 12.989f)
                lineTo(7.9445f, 12.7845f)
                lineTo(7.999f, 12.727f)
                lineTo(8.0f, 6.0f)
                curveTo(8.0f, 3.9269f, 9.5771f, 2.2222f, 11.5969f, 2.0201f)
                lineTo(11.8004f, 2.0049f)
                lineTo(12.0f, 2.0f)
                close()
                moveTo(12.0f, 4.0f)
                curveTo(10.9456f, 4.0f, 10.0818f, 4.8159f, 10.0055f, 5.8508f)
                lineTo(10.0f, 6.0f)
                lineTo(9.9997f, 13.5931f)
                lineTo(9.6667f, 13.8912f)
                curveTo(8.9286f, 14.5519f, 8.5f, 15.4902f, 8.5f, 16.5f)
                curveTo(8.5f, 18.433f, 10.067f, 20.0f, 12.0f, 20.0f)
                curveTo(13.933f, 20.0f, 15.5f, 18.433f, 15.5f, 16.5f)
                curveTo(15.5f, 15.5627f, 15.1307f, 14.6869f, 14.4874f, 14.0376f)
                lineTo(14.3341f, 13.8919f)
                lineTo(14.0014f, 13.5938f)
                lineTo(14.0f, 6.0f)
                curveTo(14.0f, 4.8954f, 13.1046f, 4.0f, 12.0f, 4.0f)
                close()
                moveTo(12.0f, 8.0f)
                curveTo(12.5523f, 8.0f, 13.0f, 8.4477f, 13.0f, 9.0f)
                lineTo(13.0008f, 14.2084f)
                curveTo(13.8833f, 14.5944f, 14.5f, 15.4752f, 14.5f, 16.5f)
                curveTo(14.5f, 17.8807f, 13.3807f, 19.0f, 12.0f, 19.0f)
                curveTo(10.6193f, 19.0f, 9.5f, 17.8807f, 9.5f, 16.5f)
                curveTo(9.5f, 15.4748f, 10.1171f, 14.5937f, 11.0002f, 14.2079f)
                lineTo(11.0f, 9.0f)
                curveTo(11.0f, 8.4477f, 11.4477f, 8.0f, 12.0f, 8.0f)
                close()
            }
        }
        .build()
        return _temperature!!
    }

private var _temperature: ImageVector? = null
