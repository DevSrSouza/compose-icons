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

public val RegularGroup.ChatCursor: ImageVector
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
                lineTo(16.6378f, 11.2284f)
                curveTo(16.8727f, 10.5284f, 17.0f, 9.7791f, 17.0f, 9.0f)
                curveTo(17.0f, 5.134f, 13.866f, 2.0f, 10.0f, 2.0f)
                curveTo(6.134f, 2.0f, 3.0f, 5.134f, 3.0f, 9.0f)
                curveTo(3.0f, 10.217f, 3.3105f, 11.3878f, 3.8935f, 12.4249f)
                curveTo(3.9405f, 12.5084f, 3.9621f, 12.603f, 3.9569f, 12.6973f)
                lineTo(3.9427f, 12.7912f)
                lineTo(3.187f, 15.812f)
                lineTo(6.211f, 15.0583f)
                curveTo(6.2729f, 15.0429f, 6.3366f, 15.0396f, 6.3987f, 15.0479f)
                lineTo(6.4903f, 15.0691f)
                lineTo(6.577f, 15.1075f)
                curveTo(7.6136f, 15.6898f, 8.7837f, 16.0f, 10.0f, 16.0f)
                curveTo(10.3395f, 16.0f, 10.6734f, 15.9758f, 11.0f, 15.9291f)
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
                moveTo(21.6f, 16.2f)
                curveTo(22.3688f, 16.7766f, 21.961f, 18.0f, 21.0f, 18.0f)
                horizontalLineTo(16.6f)
                curveTo(16.2307f, 18.0f, 15.8914f, 18.2035f, 15.7176f, 18.5294f)
                lineTo(13.8824f, 21.9706f)
                curveTo(13.3925f, 22.8891f, 12.0f, 22.541f, 12.0f, 21.5f)
                verticalLineTo(11.0f)
                curveTo(12.0f, 10.1759f, 12.9408f, 9.7056f, 13.6f, 10.2f)
                lineTo(21.6f, 16.2f)
                close()
            }
        }
        .build()
        return _chatCursor!!
    }

private var _chatCursor: ImageVector? = null
