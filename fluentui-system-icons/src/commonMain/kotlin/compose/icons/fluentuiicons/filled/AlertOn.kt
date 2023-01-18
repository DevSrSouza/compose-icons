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

public val FilledGroup.AlertOn: ImageVector
    get() {
        if (_alertOn != null) {
            return _alertOn!!
        }
        _alertOn = Builder(name = "AlertOn", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0417f, 19.003f)
                horizontalLineTo(14.9583f)
                curveTo(14.7196f, 20.4211f, 13.486f, 21.5015f, 12.0f, 21.5015f)
                curveTo(10.514f, 21.5015f, 9.2804f, 20.4211f, 9.0417f, 19.003f)
                close()
                moveTo(12.0f, 2.0039f)
                curveTo(16.1421f, 2.0039f, 19.5f, 5.3618f, 19.5f, 9.5039f)
                verticalLineTo(13.5024f)
                lineTo(20.9183f, 16.6625f)
                curveTo(20.9732f, 16.7848f, 21.0016f, 16.9174f, 21.0016f, 17.0515f)
                curveTo(21.0016f, 17.5762f, 20.5763f, 18.0015f, 20.0516f, 18.0015f)
                horizontalLineTo(3.9522f)
                curveTo(3.8184f, 18.0015f, 3.6861f, 17.9733f, 3.564f, 17.9186f)
                curveTo(3.0851f, 17.7042f, 2.8707f, 17.1422f, 3.0851f, 16.6633f)
                lineTo(4.5f, 13.5028f)
                lineTo(4.5001f, 9.491f)
                lineTo(4.5045f, 9.2411f)
                curveTo(4.6436f, 5.2104f, 7.9559f, 2.0039f, 12.0f, 2.0039f)
                close()
                moveTo(23.0f, 8.25f)
                curveTo(23.4142f, 8.25f, 23.75f, 8.5858f, 23.75f, 9.0f)
                curveTo(23.75f, 9.3797f, 23.4678f, 9.6935f, 23.1018f, 9.7432f)
                lineTo(23.0f, 9.75f)
                horizontalLineTo(21.0f)
                curveTo(20.5858f, 9.75f, 20.25f, 9.4142f, 20.25f, 9.0f)
                curveTo(20.25f, 8.6203f, 20.5322f, 8.3065f, 20.8982f, 8.2569f)
                lineTo(21.0f, 8.25f)
                horizontalLineTo(23.0f)
                close()
                moveTo(3.0f, 8.25f)
                curveTo(3.4142f, 8.25f, 3.75f, 8.5858f, 3.75f, 9.0f)
                curveTo(3.75f, 9.3797f, 3.4678f, 9.6935f, 3.1018f, 9.7432f)
                lineTo(3.0f, 9.75f)
                horizontalLineTo(1.0f)
                curveTo(0.5858f, 9.75f, 0.25f, 9.4142f, 0.25f, 9.0f)
                curveTo(0.25f, 8.6203f, 0.5322f, 8.3065f, 0.8982f, 8.2569f)
                lineTo(1.0f, 8.25f)
                horizontalLineTo(3.0f)
                close()
                moveTo(22.6f, 2.55f)
                curveTo(22.8259f, 2.8513f, 22.791f, 3.2672f, 22.5338f, 3.527f)
                lineTo(22.45f, 3.6f)
                lineTo(20.45f, 5.1f)
                curveTo(20.1186f, 5.3485f, 19.6485f, 5.2814f, 19.4f, 4.95f)
                curveTo(19.1741f, 4.6488f, 19.209f, 4.2329f, 19.4662f, 3.973f)
                lineTo(19.55f, 3.9f)
                lineTo(21.55f, 2.4f)
                curveTo(21.8814f, 2.1515f, 22.3515f, 2.2186f, 22.6f, 2.55f)
                close()
                moveTo(2.45f, 2.4f)
                lineTo(4.45f, 3.9f)
                curveTo(4.7814f, 4.1485f, 4.8485f, 4.6186f, 4.6f, 4.95f)
                curveTo(4.3515f, 5.2814f, 3.8814f, 5.3485f, 3.55f, 5.1f)
                lineTo(1.55f, 3.6f)
                curveTo(1.2186f, 3.3515f, 1.1515f, 2.8814f, 1.4f, 2.55f)
                curveTo(1.6485f, 2.2186f, 2.1186f, 2.1515f, 2.45f, 2.4f)
                close()
            }
        }
        .build()
        return _alertOn!!
    }

private var _alertOn: ImageVector? = null
