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

public val FilledGroup.ChatCursor: ImageVector
    get() {
        if (_chatCursor != null) {
            return _chatCursor!!
        }
        _chatCursor = Builder(name = "ChatCursor", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 1.0f)
                curveTo(14.4183f, 1.0f, 18.0f, 4.5817f, 18.0f, 9.0f)
                curveTo(18.0f, 10.0063f, 17.8142f, 10.9692f, 17.475f, 11.8563f)
                lineTo(14.2f, 9.4f)
                curveTo(12.8815f, 8.4111f, 11.0f, 9.3519f, 11.0f, 11.0f)
                verticalLineTo(16.9381f)
                curveTo(10.6724f, 16.979f, 10.3387f, 17.0f, 10.0f, 17.0f)
                curveTo(8.7268f, 17.0f, 7.4959f, 16.7018f, 6.3867f, 16.1393f)
                lineTo(6.266f, 16.075f)
                lineTo(2.6211f, 16.9851f)
                curveTo(2.3113f, 17.0625f, 2.0262f, 16.8369f, 2.0013f, 16.5438f)
                lineTo(2.0011f, 16.4624f)
                lineTo(2.0149f, 16.3787f)
                lineTo(2.925f, 12.735f)
                lineTo(2.8617f, 12.6153f)
                curveTo(2.4066f, 11.7186f, 2.1243f, 10.7422f, 2.0327f, 9.7283f)
                lineTo(2.0074f, 9.3463f)
                lineTo(2.0f, 9.0f)
                curveTo(2.0f, 4.5817f, 5.5817f, 1.0f, 10.0f, 1.0f)
                close()
                moveTo(13.6f, 10.2f)
                lineTo(21.6f, 16.2f)
                curveTo(22.3688f, 16.7766f, 21.961f, 18.0f, 21.0f, 18.0f)
                horizontalLineTo(16.6f)
                curveTo(16.2307f, 18.0f, 15.8914f, 18.2035f, 15.7176f, 18.5294f)
                lineTo(13.8824f, 21.9706f)
                curveTo(13.3925f, 22.8891f, 12.0f, 22.541f, 12.0f, 21.5f)
                verticalLineTo(11.0f)
                curveTo(12.0f, 10.9485f, 12.0037f, 10.8984f, 12.0107f, 10.8498f)
                curveTo(12.0276f, 10.7335f, 12.0638f, 10.6259f, 12.1153f, 10.5292f)
                curveTo(12.3865f, 10.0198f, 13.0806f, 9.8104f, 13.6f, 10.2f)
                close()
            }
        }
        .build()
        return _chatCursor!!
    }

private var _chatCursor: ImageVector? = null
