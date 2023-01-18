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

public val RegularGroup.ArrowTrendingText: ImageVector
    get() {
        if (_arrowTrendingText != null) {
            return _arrowTrendingText!!
        }
        _arrowTrendingText = Builder(name = "ArrowTrendingText", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.25f, 3.0f)
                curveTo(20.6642f, 3.0f, 21.0f, 3.3358f, 21.0f, 3.75f)
                lineTo(21.0f, 8.75f)
                curveTo(21.0f, 9.1642f, 20.6642f, 9.5f, 20.25f, 9.5f)
                curveTo(19.8358f, 9.5f, 19.5f, 9.1642f, 19.5f, 8.75f)
                lineTo(19.5f, 5.5607f)
                lineTo(13.5303f, 11.5303f)
                curveTo(13.2374f, 11.8232f, 12.7626f, 11.8232f, 12.4697f, 11.5303f)
                lineTo(10.25f, 9.3107f)
                lineTo(4.2803f, 15.2803f)
                curveTo(3.9874f, 15.5732f, 3.5126f, 15.5732f, 3.2197f, 15.2803f)
                curveTo(2.9268f, 14.9874f, 2.9268f, 14.5126f, 3.2197f, 14.2197f)
                lineTo(9.7197f, 7.7197f)
                curveTo(10.0126f, 7.4268f, 10.4874f, 7.4268f, 10.7803f, 7.7197f)
                lineTo(13.0f, 9.9393f)
                lineTo(18.4394f, 4.5f)
                lineTo(15.25f, 4.5f)
                curveTo(14.8358f, 4.5f, 14.5f, 4.1642f, 14.5f, 3.75f)
                curveTo(14.5f, 3.3358f, 14.8358f, 3.0f, 15.25f, 3.0f)
                lineTo(20.25f, 3.0f)
                close()
                moveTo(14.0f, 13.0f)
                curveTo(12.8954f, 13.0f, 12.0f, 13.8954f, 12.0f, 15.0f)
                verticalLineTo(21.0f)
                curveTo(12.0f, 22.1046f, 12.8954f, 23.0f, 14.0f, 23.0f)
                horizontalLineTo(21.0f)
                curveTo(22.1046f, 23.0f, 23.0f, 22.1046f, 23.0f, 21.0f)
                verticalLineTo(15.0f)
                curveTo(23.0f, 13.8954f, 22.1046f, 13.0f, 21.0f, 13.0f)
                horizontalLineTo(14.0f)
                close()
                moveTo(14.0f, 16.5f)
                curveTo(14.0f, 16.2239f, 14.2239f, 16.0f, 14.5f, 16.0f)
                horizontalLineTo(20.5f)
                curveTo(20.7761f, 16.0f, 21.0f, 16.2239f, 21.0f, 16.5f)
                curveTo(21.0f, 16.7761f, 20.7761f, 17.0f, 20.5f, 17.0f)
                horizontalLineTo(14.5f)
                curveTo(14.2239f, 17.0f, 14.0f, 16.7761f, 14.0f, 16.5f)
                close()
                moveTo(14.0f, 19.5f)
                curveTo(14.0f, 19.2239f, 14.2239f, 19.0f, 14.5f, 19.0f)
                horizontalLineTo(20.5f)
                curveTo(20.7761f, 19.0f, 21.0f, 19.2239f, 21.0f, 19.5f)
                curveTo(21.0f, 19.7761f, 20.7761f, 20.0f, 20.5f, 20.0f)
                horizontalLineTo(14.5f)
                curveTo(14.2239f, 20.0f, 14.0f, 19.7761f, 14.0f, 19.5f)
                close()
            }
        }
        .build()
        return _arrowTrendingText!!
    }

private var _arrowTrendingText: ImageVector? = null
