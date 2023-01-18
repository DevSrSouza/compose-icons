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

public val FilledGroup.DocumentHeaderDismiss: ImageVector
    get() {
        if (_documentHeaderDismiss != null) {
            return _documentHeaderDismiss!!
        }
        _documentHeaderDismiss = Builder(name = "DocumentHeaderDismiss", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.7463f, 2.0f)
                curveTo(18.9369f, 2.0f, 19.9114f, 2.925f, 19.9906f, 4.0955f)
                lineTo(19.9958f, 4.2495f)
                verticalLineTo(11.4983f)
                curveTo(19.2278f, 11.1788f, 18.3853f, 11.0024f, 17.5017f, 11.0024f)
                curveTo(13.9127f, 11.0024f, 11.0033f, 13.912f, 11.0033f, 17.5011f)
                curveTo(11.0033f, 19.2442f, 11.6895f, 20.827f, 12.8065f, 21.9941f)
                horizontalLineTo(6.2494f)
                curveTo(5.0589f, 21.9941f, 4.0843f, 21.0691f, 4.0052f, 19.8985f)
                lineTo(4.0f, 19.7445f)
                verticalLineTo(4.2495f)
                curveTo(4.0f, 3.0589f, 4.9249f, 2.0843f, 6.0954f, 2.0052f)
                lineTo(6.2494f, 2.0f)
                horizontalLineTo(17.7463f)
                close()
                moveTo(8.504f, 5.0036f)
                curveTo(7.6758f, 5.0036f, 7.0044f, 5.675f, 7.0044f, 6.5033f)
                curveTo(7.0044f, 7.3316f, 7.6758f, 8.003f, 8.504f, 8.003f)
                horizontalLineTo(15.5022f)
                curveTo(16.3304f, 8.003f, 17.0018f, 7.3316f, 17.0018f, 6.5033f)
                curveTo(17.0018f, 5.675f, 16.3304f, 5.0036f, 15.5022f, 5.0036f)
                horizontalLineTo(8.504f)
                close()
                moveTo(23.0f, 17.5011f)
                curveTo(23.0f, 20.5381f, 20.5382f, 23.0f, 17.5014f, 23.0f)
                curveTo(14.4646f, 23.0f, 12.0028f, 20.5381f, 12.0028f, 17.5011f)
                curveTo(12.0028f, 14.4641f, 14.4646f, 12.0022f, 17.5014f, 12.0022f)
                curveTo(20.5382f, 12.0022f, 23.0f, 14.4641f, 23.0f, 17.5011f)
                close()
                moveTo(15.8554f, 15.148f)
                curveTo(15.6602f, 14.9528f, 15.3437f, 14.9528f, 15.1485f, 15.148f)
                curveTo(14.9533f, 15.3432f, 14.9533f, 15.6598f, 15.1485f, 15.855f)
                lineTo(16.7945f, 17.5011f)
                lineTo(15.1485f, 19.1472f)
                curveTo(14.9533f, 19.3424f, 14.9533f, 19.659f, 15.1485f, 19.8542f)
                curveTo(15.3437f, 20.0494f, 15.6602f, 20.0494f, 15.8554f, 19.8542f)
                lineTo(17.5014f, 18.2081f)
                lineTo(19.1474f, 19.8542f)
                curveTo(19.3426f, 20.0494f, 19.6591f, 20.0494f, 19.8544f, 19.8542f)
                curveTo(20.0496f, 19.659f, 20.0496f, 19.3424f, 19.8544f, 19.1472f)
                lineTo(18.2083f, 17.5011f)
                lineTo(19.8544f, 15.855f)
                curveTo(20.0496f, 15.6598f, 20.0496f, 15.3432f, 19.8544f, 15.148f)
                curveTo(19.6591f, 14.9528f, 19.3426f, 14.9528f, 19.1474f, 15.148f)
                lineTo(17.5014f, 16.7941f)
                lineTo(15.8554f, 15.148f)
                close()
            }
        }
        .build()
        return _documentHeaderDismiss!!
    }

private var _documentHeaderDismiss: ImageVector? = null
