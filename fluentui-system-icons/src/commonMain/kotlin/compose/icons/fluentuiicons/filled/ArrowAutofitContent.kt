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

public val FilledGroup.ArrowAutofitContent: ImageVector
    get() {
        if (_arrowAutofitContent != null) {
            return _arrowAutofitContent!!
        }
        _arrowAutofitContent = Builder(name = "ArrowAutofitContent", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0644f, 5.2439f)
                curveTo(6.3372f, 4.9322f, 6.3056f, 4.4583f, 5.9939f, 4.1856f)
                curveTo(5.6822f, 3.9128f, 5.2083f, 3.9444f, 4.9356f, 4.2561f)
                lineTo(3.1856f, 6.2561f)
                curveTo(2.9381f, 6.5389f, 2.9381f, 6.9611f, 3.1856f, 7.2439f)
                lineTo(4.9356f, 9.2439f)
                curveTo(5.2083f, 9.5556f, 5.6821f, 9.5872f, 5.9939f, 9.3145f)
                curveTo(6.3056f, 9.0417f, 6.3372f, 8.5679f, 6.0644f, 8.2561f)
                lineTo(5.4028f, 7.5f)
                horizontalLineTo(8.2646f)
                curveTo(8.6788f, 7.5f, 9.0146f, 7.1642f, 9.0146f, 6.75f)
                curveTo(9.0146f, 6.3358f, 8.6788f, 6.0f, 8.2646f, 6.0f)
                horizontalLineTo(5.4028f)
                lineTo(6.0644f, 5.2439f)
                close()
                moveTo(18.0208f, 4.1856f)
                curveTo(17.709f, 4.4583f, 17.6775f, 4.9322f, 17.9502f, 5.2439f)
                lineTo(18.6118f, 6.0f)
                horizontalLineTo(15.7501f)
                curveTo(15.3359f, 6.0f, 15.0001f, 6.3358f, 15.0001f, 6.75f)
                curveTo(15.0001f, 7.1642f, 15.3359f, 7.5f, 15.7501f, 7.5f)
                horizontalLineTo(18.6118f)
                lineTo(17.9502f, 8.2561f)
                curveTo(17.6775f, 8.5679f, 17.709f, 9.0417f, 18.0208f, 9.3145f)
                curveTo(18.3325f, 9.5872f, 18.8063f, 9.5556f, 19.0791f, 9.2439f)
                lineTo(20.8291f, 7.2439f)
                curveTo(21.0765f, 6.9611f, 21.0765f, 6.5389f, 20.8291f, 6.2561f)
                lineTo(19.0791f, 4.2561f)
                curveTo(18.8063f, 3.9444f, 18.3325f, 3.9128f, 18.0208f, 4.1856f)
                close()
                moveTo(5.75f, 11.0f)
                curveTo(4.2312f, 11.0f, 3.0f, 12.2312f, 3.0f, 13.75f)
                verticalLineTo(17.75f)
                curveTo(3.0f, 19.2688f, 4.2312f, 20.5f, 5.75f, 20.5f)
                horizontalLineTo(18.25f)
                curveTo(19.7688f, 20.5f, 21.0f, 19.2688f, 21.0f, 17.75f)
                verticalLineTo(13.75f)
                curveTo(21.0f, 12.2312f, 19.7688f, 11.0f, 18.25f, 11.0f)
                horizontalLineTo(5.75f)
                close()
                moveTo(6.0f, 15.75f)
                curveTo(6.0f, 15.3358f, 6.3358f, 15.0f, 6.75f, 15.0f)
                horizontalLineTo(17.25f)
                curveTo(17.6642f, 15.0f, 18.0f, 15.3358f, 18.0f, 15.75f)
                curveTo(18.0f, 16.1642f, 17.6642f, 16.5f, 17.25f, 16.5f)
                horizontalLineTo(6.75f)
                curveTo(6.3358f, 16.5f, 6.0f, 16.1642f, 6.0f, 15.75f)
                close()
            }
        }
        .build()
        return _arrowAutofitContent!!
    }

private var _arrowAutofitContent: ImageVector? = null
