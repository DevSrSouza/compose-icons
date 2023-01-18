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

public val FilledGroup.Autocorrect: ImageVector
    get() {
        if (_autocorrect != null) {
            return _autocorrect!!
        }
        _autocorrect = Builder(name = "Autocorrect", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.594f, 4.7225f)
                curveTo(13.9773f, 4.9629f, 14.3013f, 5.2869f, 14.5417f, 5.6702f)
                curveTo(15.6565f, 7.4479f, 16.614f, 8.9747f, 17.4142f, 10.2507f)
                lineTo(21.5001f, 10.2496f)
                curveTo(22.0524f, 10.2496f, 22.5001f, 10.6974f, 22.5001f, 11.2496f)
                curveTo(22.5001f, 11.8019f, 22.0524f, 12.2496f, 21.5001f, 12.2496f)
                lineTo(18.7496f, 12.2484f)
                curveTo(19.3778f, 13.0843f, 19.7501f, 14.1235f, 19.7501f, 15.2496f)
                curveTo(19.7501f, 18.0111f, 17.5116f, 20.2496f, 14.7501f, 20.2496f)
                curveTo(11.9887f, 20.2496f, 9.7501f, 18.0111f, 9.7501f, 15.2496f)
                curveTo(9.7501f, 12.4882f, 11.9887f, 10.2496f, 14.7501f, 10.2496f)
                lineTo(15.053f, 10.2487f)
                lineTo(14.7693f, 9.7966f)
                curveTo(14.1801f, 8.858f, 13.5393f, 7.8362f, 12.8473f, 6.7328f)
                curveTo(12.7672f, 6.605f, 12.6592f, 6.497f, 12.5314f, 6.4169f)
                curveTo(12.097f, 6.1444f, 11.5338f, 6.2469f, 11.2206f, 6.6375f)
                lineTo(11.1529f, 6.7328f)
                lineTo(3.5973f, 18.7809f)
                curveTo(3.3039f, 19.2488f, 2.6867f, 19.3903f, 2.2188f, 19.0968f)
                curveTo(1.7844f, 18.8244f, 1.6314f, 18.2728f, 1.8467f, 17.8207f)
                lineTo(1.9029f, 17.7184f)
                lineTo(9.4586f, 5.6702f)
                curveTo(10.3388f, 4.2665f, 12.1903f, 3.8422f, 13.594f, 4.7225f)
                close()
                moveTo(14.7501f, 12.2496f)
                curveTo(13.0933f, 12.2496f, 11.7501f, 13.5928f, 11.7501f, 15.2496f)
                curveTo(11.7501f, 16.9065f, 13.0933f, 18.2496f, 14.7501f, 18.2496f)
                curveTo(16.407f, 18.2496f, 17.7501f, 16.9065f, 17.7501f, 15.2496f)
                curveTo(17.7501f, 13.5928f, 16.407f, 12.2496f, 14.7501f, 12.2496f)
                close()
            }
        }
        .build()
        return _autocorrect!!
    }

private var _autocorrect: ImageVector? = null
