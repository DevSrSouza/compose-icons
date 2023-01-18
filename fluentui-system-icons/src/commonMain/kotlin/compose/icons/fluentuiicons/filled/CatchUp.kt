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

public val FilledGroup.CatchUp: ImageVector
    get() {
        if (_catchUp != null) {
            return _catchUp!!
        }
        _catchUp = Builder(name = "CatchUp", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.3722f, 7.2682f)
                curveTo(10.7062f, 5.5673f, 8.2962f, 5.5758f, 7.6424f, 7.2815f)
                lineTo(6.4355f, 10.4299f)
                curveTo(6.3613f, 10.6232f, 6.1757f, 10.7509f, 5.9686f, 10.7509f)
                horizontalLineTo(4.562f)
                curveTo(4.1955f, 10.2931f, 3.632f, 10.0f, 3.0f, 10.0f)
                curveTo(1.8954f, 10.0f, 1.0f, 10.8954f, 1.0f, 12.0f)
                curveTo(1.0f, 13.1046f, 1.8954f, 14.0f, 3.0f, 14.0f)
                curveTo(3.839f, 14.0f, 4.5574f, 13.4834f, 4.8543f, 12.7509f)
                horizontalLineTo(5.9686f)
                curveTo(7.004f, 12.7509f, 7.9323f, 12.1126f, 8.3029f, 11.1457f)
                lineTo(9.5098f, 7.9974f)
                lineTo(12.7309f, 16.2243f)
                curveTo(13.3681f, 17.852f, 15.6398f, 17.9365f, 16.3962f, 16.3608f)
                lineTo(17.993f, 13.0345f)
                curveTo(18.0763f, 12.8611f, 18.2515f, 12.7509f, 18.4438f, 12.7509f)
                horizontalLineTo(19.1457f)
                curveTo(19.4426f, 13.4834f, 20.161f, 14.0f, 21.0f, 14.0f)
                curveTo(22.1046f, 14.0f, 23.0f, 13.1046f, 23.0f, 12.0f)
                curveTo(23.0f, 10.8954f, 22.1046f, 10.0f, 21.0f, 10.0f)
                curveTo(20.368f, 10.0f, 19.8045f, 10.2931f, 19.438f, 10.7509f)
                horizontalLineTo(18.4438f)
                curveTo(17.4824f, 10.7509f, 16.6061f, 11.3022f, 16.19f, 12.1689f)
                lineTo(14.5932f, 15.4952f)
                lineTo(11.3722f, 7.2682f)
                close()
            }
        }
        .build()
        return _catchUp!!
    }

private var _catchUp: ImageVector? = null
