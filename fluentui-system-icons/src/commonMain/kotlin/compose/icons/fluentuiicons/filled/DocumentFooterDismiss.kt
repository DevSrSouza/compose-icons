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

public val FilledGroup.DocumentFooterDismiss: ImageVector
    get() {
        if (_documentFooterDismiss != null) {
            return _documentFooterDismiss!!
        }
        _documentFooterDismiss = Builder(name = "DocumentFooterDismiss", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0f, 6.5016f)
                curveTo(23.0f, 9.5401f, 20.5382f, 12.0032f, 17.5014f, 12.0032f)
                curveTo(14.4646f, 12.0032f, 12.0028f, 9.5401f, 12.0028f, 6.5016f)
                curveTo(12.0028f, 3.4632f, 14.4646f, 1.0f, 17.5014f, 1.0f)
                curveTo(20.5382f, 1.0f, 23.0f, 3.4632f, 23.0f, 6.5016f)
                close()
                moveTo(15.8554f, 4.1474f)
                curveTo(15.6602f, 3.952f, 15.3437f, 3.952f, 15.1485f, 4.1474f)
                curveTo(14.9533f, 4.3427f, 14.9533f, 4.6594f, 15.1485f, 4.8547f)
                lineTo(16.7945f, 6.5016f)
                lineTo(15.1485f, 8.1485f)
                curveTo(14.9533f, 8.3439f, 14.9533f, 8.6605f, 15.1485f, 8.8559f)
                curveTo(15.3437f, 9.0512f, 15.6602f, 9.0512f, 15.8554f, 8.8559f)
                lineTo(17.5014f, 7.2089f)
                lineTo(19.1474f, 8.8559f)
                curveTo(19.3426f, 9.0512f, 19.6591f, 9.0512f, 19.8544f, 8.8559f)
                curveTo(20.0496f, 8.6605f, 20.0496f, 8.3439f, 19.8544f, 8.1485f)
                lineTo(18.2083f, 6.5016f)
                lineTo(19.8544f, 4.8547f)
                curveTo(20.0496f, 4.6594f, 20.0496f, 4.3427f, 19.8544f, 4.1474f)
                curveTo(19.6591f, 3.952f, 19.3426f, 3.952f, 19.1474f, 4.1474f)
                lineTo(17.5014f, 5.7943f)
                lineTo(15.8554f, 4.1474f)
                close()
                moveTo(17.5017f, 13.0035f)
                curveTo(18.3853f, 13.0035f, 19.2278f, 12.827f, 19.9958f, 12.5074f)
                verticalLineTo(19.7493f)
                curveTo(19.9958f, 20.9406f, 19.0708f, 21.9156f, 17.9004f, 21.9948f)
                lineTo(17.7463f, 22.0f)
                horizontalLineTo(6.2494f)
                curveTo(5.0589f, 22.0f, 4.0843f, 21.0746f, 4.0052f, 19.9034f)
                lineTo(4.0f, 19.7493f)
                verticalLineTo(4.2467f)
                curveTo(4.0f, 3.0555f, 4.9249f, 2.0805f, 6.0954f, 2.0013f)
                lineTo(6.2494f, 1.9961f)
                horizontalLineTo(12.8165f)
                curveTo(11.6936f, 3.1647f, 11.0033f, 4.7525f, 11.0033f, 6.5016f)
                curveTo(11.0033f, 10.0925f, 13.9127f, 13.0035f, 17.5017f, 13.0035f)
                close()
                moveTo(8.504f, 16.0044f)
                curveTo(7.6758f, 16.0044f, 7.0044f, 16.6762f, 7.0044f, 17.5048f)
                curveTo(7.0044f, 18.3335f, 7.6758f, 19.0053f, 8.504f, 19.0053f)
                horizontalLineTo(15.5022f)
                curveTo(16.3304f, 19.0053f, 17.0018f, 18.3335f, 17.0018f, 17.5048f)
                curveTo(17.0018f, 16.6762f, 16.3304f, 16.0044f, 15.5022f, 16.0044f)
                horizontalLineTo(8.504f)
                close()
            }
        }
        .build()
        return _documentFooterDismiss!!
    }

private var _documentFooterDismiss: ImageVector? = null
