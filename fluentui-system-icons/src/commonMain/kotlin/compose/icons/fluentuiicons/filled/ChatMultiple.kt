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

public val FilledGroup.ChatMultiple: ImageVector
    get() {
        if (_chatMultiple != null) {
            return _chatMultiple!!
        }
        _chatMultiple = Builder(name = "ChatMultiple", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.5f, 3.0f)
                curveTo(5.3579f, 3.0f, 2.0f, 6.3579f, 2.0f, 10.5f)
                curveTo(2.0f, 11.6335f, 2.2519f, 12.71f, 2.7034f, 13.6749f)
                curveTo(2.4012f, 14.9f, 2.1395f, 16.2085f, 2.0217f, 16.8173f)
                curveTo(1.8884f, 17.5063f, 2.4873f, 18.1099f, 3.1749f, 17.9875f)
                curveTo(3.7982f, 17.8765f, 5.1532f, 17.6267f, 6.4114f, 17.3363f)
                curveTo(7.3541f, 17.7628f, 8.4003f, 18.0f, 9.5f, 18.0f)
                curveTo(13.6421f, 18.0f, 17.0f, 14.6421f, 17.0f, 10.5f)
                curveTo(17.0f, 6.3579f, 13.6421f, 3.0f, 9.5f, 3.0f)
                close()
                moveTo(9.4619f, 18.9996f)
                curveTo(10.8001f, 20.2411f, 12.5922f, 21.0002f, 14.5616f, 21.0002f)
                curveTo(15.6611f, 21.0002f, 16.707f, 20.7631f, 17.6495f, 20.3368f)
                curveTo(18.6933f, 20.5811f, 19.8358f, 20.8249f, 20.563f, 20.9769f)
                curveTo(21.4554f, 21.1634f, 22.2348f, 20.3624f, 22.0304f, 19.4775f)
                curveTo(21.8679f, 18.7741f, 21.6117f, 17.6822f, 21.3586f, 16.6742f)
                curveTo(21.8098f, 15.7095f, 22.0616f, 14.6333f, 22.0616f, 13.5002f)
                curveTo(22.0616f, 10.2172f, 19.9523f, 7.427f, 17.015f, 6.4106f)
                curveTo(17.3653f, 7.0477f, 17.6363f, 7.7345f, 17.8146f, 8.4577f)
                curveTo(19.4676f, 9.5263f, 20.5616f, 11.3855f, 20.5616f, 13.5002f)
                curveTo(20.5616f, 14.4916f, 20.3217f, 15.4248f, 19.8975f, 16.247f)
                lineTo(19.767f, 16.5f)
                lineTo(19.8372f, 16.7758f)
                curveTo(20.065f, 17.6713f, 20.3037f, 18.6758f, 20.4787f, 19.4264f)
                curveTo(19.7046f, 19.2627f, 18.6611f, 19.0362f, 17.7395f, 18.8168f)
                lineTo(17.475f, 18.7539f)
                lineTo(17.2316f, 18.875f)
                curveTo(16.4283f, 19.2749f, 15.5223f, 19.5002f, 14.5616f, 19.5002f)
                curveTo(13.5021f, 19.5002f, 12.5067f, 19.2255f, 11.6427f, 18.7436f)
                curveTo(10.9768f, 18.9112f, 10.2796f, 19.0002f, 9.5616f, 19.0002f)
                curveTo(9.5283f, 19.0002f, 9.4951f, 19.0f, 9.4619f, 18.9996f)
                close()
            }
        }
        .build()
        return _chatMultiple!!
    }

private var _chatMultiple: ImageVector? = null
