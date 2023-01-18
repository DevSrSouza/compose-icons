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

public val FilledGroup.Gas: ImageVector
    get() {
        if (_gas != null) {
            return _gas!!
        }
        _gas = Builder(name = "Gas", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.1452f, 2.3065f)
                curveTo(13.2865f, 2.1138f, 13.5111f, 2.0f, 13.7501f, 2.0f)
                horizontalLineTo(18.2501f)
                curveTo(18.6643f, 2.0f, 19.0001f, 2.3358f, 19.0001f, 2.75f)
                verticalLineTo(6.5f)
                curveTo(19.0001f, 6.5411f, 18.9967f, 6.5814f, 18.9904f, 6.6207f)
                curveTo(19.6067f, 7.125f, 20.0f, 7.8916f, 20.0f, 8.75f)
                verticalLineTo(19.25f)
                curveTo(20.0f, 20.7688f, 18.7688f, 22.0f, 17.25f, 22.0f)
                horizontalLineTo(6.75f)
                curveTo(5.2312f, 22.0f, 4.0f, 20.7688f, 4.0f, 19.25f)
                verticalLineTo(8.75f)
                curveTo(4.0f, 7.2312f, 5.2312f, 6.0f, 6.75f, 6.0f)
                horizontalLineTo(7.5f)
                verticalLineTo(5.75f)
                curveTo(7.5f, 4.7835f, 6.7165f, 4.0f, 5.75f, 4.0f)
                horizontalLineTo(4.75f)
                curveTo(4.3358f, 4.0f, 4.0f, 3.6642f, 4.0f, 3.25f)
                curveTo(4.0f, 2.8358f, 4.3358f, 2.5f, 4.75f, 2.5f)
                horizontalLineTo(5.75f)
                curveTo(7.5449f, 2.5f, 9.0f, 3.9551f, 9.0f, 5.75f)
                verticalLineTo(6.0f)
                horizontalLineTo(10.4367f)
                lineTo(13.1452f, 2.3065f)
                close()
                moveTo(17.5001f, 3.5f)
                horizontalLineTo(14.1301f)
                lineTo(12.2968f, 6.0f)
                horizontalLineTo(17.25f)
                curveTo(17.3343f, 6.0f, 17.4177f, 6.0038f, 17.5001f, 6.0112f)
                verticalLineTo(3.5f)
                close()
                moveTo(8.2197f, 10.2197f)
                curveTo(7.9268f, 10.5126f, 7.9268f, 10.9874f, 8.2197f, 11.2803f)
                lineTo(10.9393f, 14.0f)
                lineTo(8.2197f, 16.7197f)
                curveTo(7.9268f, 17.0126f, 7.9268f, 17.4874f, 8.2197f, 17.7803f)
                curveTo(8.5126f, 18.0732f, 8.9874f, 18.0732f, 9.2803f, 17.7803f)
                lineTo(12.0f, 15.0607f)
                lineTo(14.7197f, 17.7803f)
                curveTo(15.0126f, 18.0732f, 15.4874f, 18.0732f, 15.7803f, 17.7803f)
                curveTo(16.0732f, 17.4874f, 16.0732f, 17.0126f, 15.7803f, 16.7197f)
                lineTo(13.0607f, 14.0f)
                lineTo(15.7803f, 11.2803f)
                curveTo(16.0732f, 10.9874f, 16.0732f, 10.5126f, 15.7803f, 10.2197f)
                curveTo(15.4874f, 9.9268f, 15.0126f, 9.9268f, 14.7197f, 10.2197f)
                lineTo(12.0f, 12.9393f)
                lineTo(9.2803f, 10.2197f)
                curveTo(8.9874f, 9.9268f, 8.5126f, 9.9268f, 8.2197f, 10.2197f)
                close()
            }
        }
        .build()
        return _gas!!
    }

private var _gas: ImageVector? = null
