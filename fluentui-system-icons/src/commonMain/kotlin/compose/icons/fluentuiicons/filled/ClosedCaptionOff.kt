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

public val FilledGroup.ClosedCaptionOff: ImageVector
    get() {
        if (_closedCaptionOff != null) {
            return _closedCaptionOff!!
        }
        _closedCaptionOff = Builder(name = "ClosedCaptionOff", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.2803f, 2.2197f)
                curveTo(2.9874f, 1.9268f, 2.5126f, 1.9268f, 2.2197f, 2.2197f)
                curveTo(1.9268f, 2.5126f, 1.9268f, 2.9874f, 2.2197f, 3.2803f)
                lineTo(3.4698f, 4.5305f)
                curveTo(2.5846f, 5.1111f, 2.0f, 6.1123f, 2.0f, 7.25f)
                verticalLineTo(16.7545f)
                curveTo(2.0f, 18.5494f, 3.4551f, 20.0045f, 5.25f, 20.0045f)
                horizontalLineTo(18.75f)
                curveTo(18.8132f, 20.0045f, 18.8759f, 20.0027f, 18.9382f, 19.9991f)
                lineTo(20.7194f, 21.7803f)
                curveTo(21.0123f, 22.0732f, 21.4872f, 22.0732f, 21.7801f, 21.7803f)
                curveTo(22.073f, 21.4874f, 22.073f, 21.0126f, 21.7801f, 20.7197f)
                lineTo(3.2803f, 2.2197f)
                close()
                moveTo(8.573f, 9.6337f)
                curveTo(7.6902f, 9.7809f, 7.0f, 10.6301f, 7.0f, 11.9999f)
                curveTo(7.0f, 14.0045f, 8.4841f, 14.8961f, 9.8792f, 14.1026f)
                curveTo(10.2392f, 13.8978f, 10.6971f, 14.0237f, 10.9019f, 14.3837f)
                curveTo(11.1067f, 14.7438f, 10.9809f, 15.2017f, 10.6208f, 15.4065f)
                curveTo(8.2154f, 16.7746f, 5.5f, 15.1432f, 5.5f, 11.9999f)
                curveTo(5.5f, 10.2995f, 6.2929f, 9.0421f, 7.4019f, 8.4626f)
                lineTo(8.573f, 9.6337f)
                close()
                moveTo(17.3784f, 9.9014f)
                curveTo(16.1366f, 9.193f, 14.8292f, 9.8161f, 14.5531f, 11.3712f)
                lineTo(21.5638f, 18.382f)
                curveTo(21.8412f, 17.9034f, 22.0f, 17.3475f, 22.0f, 16.7545f)
                verticalLineTo(7.25f)
                curveTo(22.0f, 5.4551f, 20.5449f, 4.0f, 18.75f, 4.0f)
                horizontalLineTo(7.182f)
                lineTo(13.3557f, 10.1739f)
                curveTo(14.1688f, 8.2865f, 16.2384f, 7.5242f, 18.1216f, 8.5985f)
                curveTo(18.4814f, 8.8037f, 18.6067f, 9.2618f, 18.4015f, 9.6216f)
                curveTo(18.1962f, 9.9814f, 17.7382f, 10.1066f, 17.3784f, 9.9014f)
                close()
            }
        }
        .build()
        return _closedCaptionOff!!
    }

private var _closedCaptionOff: ImageVector? = null
