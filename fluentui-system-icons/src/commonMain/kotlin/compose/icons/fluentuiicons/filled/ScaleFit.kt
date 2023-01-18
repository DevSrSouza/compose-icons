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

public val FilledGroup.ScaleFit: ImageVector
    get() {
        if (_scaleFit != null) {
            return _scaleFit!!
        }
        _scaleFit = Builder(name = "ScaleFit", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.25f, 4.0f)
                curveTo(3.0074f, 4.0f, 2.0f, 5.0074f, 2.0f, 6.25f)
                verticalLineTo(17.75f)
                curveTo(2.0f, 18.9926f, 3.0074f, 20.0f, 4.25f, 20.0f)
                horizontalLineTo(19.75f)
                curveTo(20.9926f, 20.0f, 22.0f, 18.9926f, 22.0f, 17.75f)
                verticalLineTo(6.25f)
                curveTo(22.0f, 5.0074f, 20.9926f, 4.0f, 19.75f, 4.0f)
                horizontalLineTo(4.25f)
                close()
                moveTo(7.9939f, 9.4356f)
                curveTo(8.3056f, 9.7083f, 8.3372f, 10.1822f, 8.0644f, 10.4939f)
                lineTo(7.4028f, 11.25f)
                horizontalLineTo(10.2646f)
                curveTo(10.6788f, 11.25f, 11.0146f, 11.5858f, 11.0146f, 12.0f)
                curveTo(11.0146f, 12.4142f, 10.6788f, 12.75f, 10.2646f, 12.75f)
                horizontalLineTo(7.4028f)
                lineTo(8.0644f, 13.5061f)
                curveTo(8.3372f, 13.8179f, 8.3056f, 14.2917f, 7.9939f, 14.5644f)
                curveTo(7.6821f, 14.8372f, 7.2083f, 14.8056f, 6.9356f, 14.4939f)
                lineTo(5.1856f, 12.4939f)
                curveTo(4.9381f, 12.2111f, 4.9381f, 11.7889f, 5.1856f, 11.5061f)
                lineTo(6.9356f, 9.5061f)
                curveTo(7.2083f, 9.1944f, 7.6822f, 9.1628f, 7.9939f, 9.4356f)
                close()
                moveTo(15.9502f, 10.4939f)
                curveTo(15.6775f, 10.1822f, 15.709f, 9.7083f, 16.0208f, 9.4356f)
                curveTo(16.3325f, 9.1628f, 16.8063f, 9.1944f, 17.0791f, 9.5061f)
                lineTo(18.8291f, 11.5061f)
                curveTo(19.0765f, 11.7889f, 19.0765f, 12.2111f, 18.8291f, 12.4939f)
                lineTo(17.0791f, 14.4939f)
                curveTo(16.8063f, 14.8056f, 16.3325f, 14.8372f, 16.0208f, 14.5644f)
                curveTo(15.709f, 14.2917f, 15.6775f, 13.8179f, 15.9502f, 13.5061f)
                lineTo(16.6118f, 12.75f)
                horizontalLineTo(13.7501f)
                curveTo(13.3359f, 12.75f, 13.0001f, 12.4142f, 13.0001f, 12.0f)
                curveTo(13.0001f, 11.5858f, 13.3359f, 11.25f, 13.7501f, 11.25f)
                horizontalLineTo(16.6118f)
                lineTo(15.9502f, 10.4939f)
                close()
            }
        }
        .build()
        return _scaleFit!!
    }

private var _scaleFit: ImageVector? = null
