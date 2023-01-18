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

public val FilledGroup.Flowchart: ImageVector
    get() {
        if (_flowchart != null) {
            return _flowchart!!
        }
        _flowchart = Builder(name = "Flowchart", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.9976f, 5.2461f)
                curveTo(2.9976f, 4.0034f, 4.0049f, 2.9961f, 5.2476f, 2.9961f)
                horizontalLineTo(7.7546f)
                curveTo(8.9972f, 2.9961f, 10.0046f, 4.0034f, 10.0046f, 5.2461f)
                verticalLineTo(7.7534f)
                curveTo(10.0046f, 8.996f, 8.9972f, 10.0034f, 7.7546f, 10.0034f)
                horizontalLineTo(7.25f)
                verticalLineTo(13.7095f)
                curveTo(7.2966f, 13.7445f, 7.3413f, 13.7833f, 7.3837f, 13.8257f)
                lineTo(10.1744f, 16.6169f)
                curveTo(10.2169f, 16.6595f, 10.2557f, 16.7043f, 10.2908f, 16.751f)
                horizontalLineTo(14.0049f)
                verticalLineTo(16.2505f)
                curveTo(14.0049f, 15.0078f, 15.0122f, 14.0005f, 16.2549f, 14.0005f)
                horizontalLineTo(18.7488f)
                curveTo(19.9914f, 14.0005f, 20.9988f, 15.0078f, 20.9988f, 16.2505f)
                verticalLineTo(18.7547f)
                curveTo(20.9988f, 19.9973f, 19.9914f, 21.0047f, 18.7488f, 21.0047f)
                horizontalLineTo(16.2549f)
                curveTo(15.0122f, 21.0047f, 14.0049f, 19.9973f, 14.0049f, 18.7547f)
                verticalLineTo(18.251f)
                horizontalLineTo(10.2904f)
                curveTo(10.2555f, 18.2975f, 10.2168f, 18.3421f, 10.1745f, 18.3844f)
                lineTo(7.3838f, 21.1763f)
                curveTo(6.8957f, 21.6647f, 6.1041f, 21.6648f, 5.6159f, 21.1766f)
                lineTo(2.8237f, 18.3847f)
                curveTo(2.3354f, 17.8965f, 2.3355f, 17.1049f, 2.8238f, 16.6167f)
                lineTo(5.616f, 13.8254f)
                curveTo(5.6585f, 13.7829f, 5.7033f, 13.7442f, 5.75f, 13.7091f)
                verticalLineTo(10.0034f)
                horizontalLineTo(5.2476f)
                curveTo(4.0049f, 10.0034f, 2.9976f, 8.996f, 2.9976f, 7.7534f)
                lineTo(2.9976f, 5.2461f)
                close()
            }
        }
        .build()
        return _flowchart!!
    }

private var _flowchart: ImageVector? = null
