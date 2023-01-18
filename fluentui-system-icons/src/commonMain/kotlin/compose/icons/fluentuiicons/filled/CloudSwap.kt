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

public val FilledGroup.CloudSwap: ImageVector
    get() {
        if (_cloudSwap != null) {
            return _cloudSwap!!
        }
        _cloudSwap = Builder(name = "CloudSwap", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.75f, 4.25f)
                curveTo(8.9246f, 4.25f, 6.561f, 6.2928f, 6.0866f, 9.0f)
                lineTo(6.0f, 9.0f)
                curveTo(3.7909f, 9.0f, 2.0f, 10.7909f, 2.0f, 13.0f)
                curveTo(2.0f, 15.2091f, 3.7909f, 17.0f, 6.0f, 17.0f)
                horizontalLineTo(9.1683f)
                curveTo(8.8603f, 16.3503f, 8.975f, 15.5501f, 9.5126f, 15.0126f)
                lineTo(12.0126f, 12.5126f)
                curveTo(12.696f, 11.8291f, 13.804f, 11.8291f, 14.4874f, 12.5126f)
                curveTo(15.025f, 13.0501f, 15.1397f, 13.8503f, 14.8317f, 14.5f)
                horizontalLineTo(17.1683f)
                curveTo(16.8603f, 13.8503f, 16.975f, 13.0501f, 17.5126f, 12.5126f)
                curveTo(18.196f, 11.8291f, 19.304f, 11.8291f, 19.9874f, 12.5126f)
                lineTo(21.3939f, 13.919f)
                curveTo(21.4633f, 13.624f, 21.5f, 13.3163f, 21.5f, 13.0f)
                curveTo(21.5f, 10.7909f, 19.7091f, 9.0f, 17.5f, 9.0f)
                lineTo(17.4134f, 9.0f)
                curveTo(16.939f, 6.2928f, 14.5754f, 4.25f, 11.75f, 4.25f)
                close()
                moveTo(13.7803f, 14.2803f)
                curveTo(14.0732f, 13.9874f, 14.0732f, 13.5126f, 13.7803f, 13.2197f)
                curveTo(13.4874f, 12.9268f, 13.0126f, 12.9268f, 12.7197f, 13.2197f)
                lineTo(10.2197f, 15.7197f)
                curveTo(9.9268f, 16.0126f, 9.9268f, 16.4874f, 10.2197f, 16.7803f)
                lineTo(12.7197f, 19.2803f)
                curveTo(13.0126f, 19.5732f, 13.4874f, 19.5732f, 13.7803f, 19.2803f)
                curveTo(14.0732f, 18.9874f, 14.0732f, 18.5126f, 13.7803f, 18.2197f)
                lineTo(12.5607f, 17.0f)
                horizontalLineTo(19.4393f)
                lineTo(18.2197f, 18.2197f)
                curveTo(17.9268f, 18.5126f, 17.9268f, 18.9874f, 18.2197f, 19.2803f)
                curveTo(18.5126f, 19.5732f, 18.9874f, 19.5732f, 19.2803f, 19.2803f)
                lineTo(21.7803f, 16.7803f)
                curveTo(22.0732f, 16.4874f, 22.0732f, 16.0126f, 21.7803f, 15.7197f)
                lineTo(19.2803f, 13.2197f)
                curveTo(18.9874f, 12.9268f, 18.5126f, 12.9268f, 18.2197f, 13.2197f)
                curveTo(17.9268f, 13.5126f, 17.9268f, 13.9874f, 18.2197f, 14.2803f)
                lineTo(19.4393f, 15.5f)
                horizontalLineTo(12.5607f)
                lineTo(13.7803f, 14.2803f)
                close()
            }
        }
        .build()
        return _cloudSwap!!
    }

private var _cloudSwap: ImageVector? = null
