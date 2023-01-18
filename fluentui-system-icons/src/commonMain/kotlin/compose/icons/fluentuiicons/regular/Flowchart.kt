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

public val RegularGroup.Flowchart: ImageVector
    get() {
        if (_flowchart != null) {
            return _flowchart!!
        }
        _flowchart = Builder(name = "Flowchart", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.2476f, 2.9961f)
                curveTo(4.0049f, 2.9961f, 2.9976f, 4.0034f, 2.9976f, 5.2461f)
                lineTo(2.9976f, 7.7534f)
                curveTo(2.9976f, 8.996f, 4.0049f, 10.0034f, 5.2476f, 10.0034f)
                horizontalLineTo(5.75f)
                verticalLineTo(13.7096f)
                curveTo(5.7033f, 13.7446f, 5.6585f, 13.7834f, 5.616f, 13.8259f)
                lineTo(2.8238f, 16.6172f)
                curveTo(2.3355f, 17.1053f, 2.3354f, 17.897f, 2.8237f, 18.3852f)
                lineTo(5.6159f, 21.1771f)
                curveTo(6.1041f, 21.6652f, 6.8957f, 21.6651f, 7.3838f, 21.1768f)
                lineTo(10.1745f, 18.3849f)
                curveTo(10.217f, 18.3424f, 10.2557f, 18.2977f, 10.2908f, 18.251f)
                horizontalLineTo(14.0049f)
                verticalLineTo(18.7547f)
                curveTo(14.0049f, 19.9973f, 15.0122f, 21.0047f, 16.2549f, 21.0047f)
                horizontalLineTo(18.7488f)
                curveTo(19.9914f, 21.0047f, 20.9988f, 19.9973f, 20.9988f, 18.7547f)
                verticalLineTo(16.2505f)
                curveTo(20.9988f, 15.0078f, 19.9914f, 14.0005f, 18.7488f, 14.0005f)
                horizontalLineTo(16.2549f)
                curveTo(15.0122f, 14.0005f, 14.0049f, 15.0078f, 14.0049f, 16.2505f)
                verticalLineTo(16.751f)
                horizontalLineTo(10.2904f)
                curveTo(10.2554f, 16.7044f, 10.2168f, 16.6598f, 10.1744f, 16.6174f)
                lineTo(7.3837f, 13.8262f)
                curveTo(7.3413f, 13.7838f, 7.2966f, 13.745f, 7.25f, 13.71f)
                verticalLineTo(10.0034f)
                horizontalLineTo(7.7546f)
                curveTo(8.9972f, 10.0034f, 10.0046f, 8.996f, 10.0046f, 7.7534f)
                verticalLineTo(5.2461f)
                curveTo(10.0046f, 4.0034f, 8.9972f, 2.9961f, 7.7546f, 2.9961f)
                horizontalLineTo(5.2476f)
                close()
                moveTo(4.4976f, 5.2461f)
                curveTo(4.4976f, 4.8319f, 4.8333f, 4.4961f, 5.2476f, 4.4961f)
                horizontalLineTo(7.7546f)
                curveTo(8.1688f, 4.4961f, 8.5046f, 4.8319f, 8.5046f, 5.2461f)
                verticalLineTo(7.7534f)
                curveTo(8.5046f, 8.1676f, 8.1688f, 8.5034f, 7.7546f, 8.5034f)
                horizontalLineTo(5.2476f)
                curveTo(4.8333f, 8.5034f, 4.4976f, 8.1676f, 4.4976f, 7.7534f)
                lineTo(4.4976f, 5.2461f)
                close()
                moveTo(4.0611f, 17.5012f)
                lineTo(6.4997f, 15.0635f)
                lineTo(8.9369f, 17.5012f)
                lineTo(6.4997f, 19.9396f)
                lineTo(4.0611f, 17.5012f)
                close()
                moveTo(16.2549f, 15.5005f)
                horizontalLineTo(18.7488f)
                curveTo(19.163f, 15.5005f, 19.4988f, 15.8363f, 19.4988f, 16.2505f)
                verticalLineTo(18.7547f)
                curveTo(19.4988f, 19.1689f, 19.163f, 19.5047f, 18.7488f, 19.5047f)
                horizontalLineTo(16.2549f)
                curveTo(15.8407f, 19.5047f, 15.5049f, 19.1689f, 15.5049f, 18.7547f)
                verticalLineTo(16.2505f)
                curveTo(15.5049f, 15.8363f, 15.8407f, 15.5005f, 16.2549f, 15.5005f)
                close()
            }
        }
        .build()
        return _flowchart!!
    }

private var _flowchart: ImageVector? = null
