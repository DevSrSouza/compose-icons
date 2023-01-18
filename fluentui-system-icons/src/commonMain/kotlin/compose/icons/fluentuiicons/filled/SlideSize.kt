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

public val FilledGroup.SlideSize: ImageVector
    get() {
        if (_slideSize != null) {
            return _slideSize!!
        }
        _slideSize = Builder(name = "SlideSize", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 6.75f)
                curveTo(2.0f, 5.2312f, 3.2312f, 4.0f, 4.75f, 4.0f)
                horizontalLineTo(19.25f)
                curveTo(20.7688f, 4.0f, 22.0f, 5.2312f, 22.0f, 6.75f)
                verticalLineTo(17.25f)
                curveTo(22.0f, 18.7688f, 20.7688f, 20.0f, 19.25f, 20.0f)
                horizontalLineTo(4.75f)
                curveTo(3.2312f, 20.0f, 2.0f, 18.7688f, 2.0f, 17.25f)
                verticalLineTo(6.75f)
                close()
                moveTo(16.7808f, 7.2197f)
                curveTo(16.6402f, 7.079f, 16.4494f, 7.0f, 16.2505f, 7.0f)
                lineTo(13.7493f, 7.0f)
                curveTo(13.3351f, 7.0f, 12.9993f, 7.3358f, 12.9993f, 7.75f)
                curveTo(12.9993f, 8.1642f, 13.3351f, 8.5f, 13.7493f, 8.5f)
                horizontalLineTo(14.4393f)
                lineTo(12.7197f, 10.219f)
                curveTo(12.4267f, 10.5118f, 12.4266f, 10.9867f, 12.7194f, 11.2796f)
                curveTo(13.0123f, 11.5726f, 13.4871f, 11.5727f, 13.7801f, 11.2798f)
                lineTo(15.5005f, 9.5601f)
                verticalLineTo(10.25f)
                curveTo(15.5005f, 10.6642f, 15.8363f, 11.0f, 16.2505f, 11.0f)
                curveTo(16.6647f, 11.0f, 17.0005f, 10.6642f, 17.0005f, 10.25f)
                verticalLineTo(7.75f)
                curveTo(17.0005f, 7.5511f, 16.9215f, 7.3603f, 16.7808f, 7.2197f)
                close()
                moveTo(7.75f, 16.9999f)
                horizontalLineTo(10.2512f)
                curveTo(10.6654f, 16.9999f, 11.0012f, 16.6641f, 11.0012f, 16.2499f)
                curveTo(11.0012f, 15.8357f, 10.6654f, 15.4999f, 10.2512f, 15.4999f)
                horizontalLineTo(9.5604f)
                lineTo(11.2804f, 13.7797f)
                curveTo(11.5732f, 13.4868f, 11.5732f, 13.0119f, 11.2803f, 12.719f)
                curveTo(10.9874f, 12.4261f, 10.5125f, 12.4262f, 10.2196f, 12.7191f)
                lineTo(8.5f, 14.439f)
                verticalLineTo(13.7499f)
                curveTo(8.5f, 13.3357f, 8.1642f, 12.9999f, 7.75f, 12.9999f)
                curveTo(7.3358f, 12.9999f, 7.0f, 13.3357f, 7.0f, 13.7499f)
                lineTo(7.0f, 16.2499f)
                curveTo(7.0f, 16.4488f, 7.079f, 16.6396f, 7.2197f, 16.7802f)
                curveTo(7.3603f, 16.9209f, 7.5511f, 16.9999f, 7.75f, 16.9999f)
                close()
            }
        }
        .build()
        return _slideSize!!
    }

private var _slideSize: ImageVector? = null
