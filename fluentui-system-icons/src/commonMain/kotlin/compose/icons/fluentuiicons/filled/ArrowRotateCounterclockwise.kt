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

public val FilledGroup.ArrowRotateCounterclockwise: ImageVector
    get() {
        if (_arrowRotateCounterclockwise != null) {
            return _arrowRotateCounterclockwise!!
        }
        _arrowRotateCounterclockwise = Builder(name = "ArrowRotateCounterclockwise", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 3.0f)
                curveTo(7.0294f, 3.0f, 3.0f, 7.0294f, 3.0f, 12.0f)
                curveTo(3.0f, 15.4359f, 4.9419f, 18.4885f, 7.8733f, 20.001f)
                lineTo(6.0f, 20.0f)
                curveTo(5.4477f, 20.0f, 5.0f, 20.4477f, 5.0f, 21.0f)
                curveTo(5.0f, 21.5128f, 5.386f, 21.9355f, 5.8834f, 21.9933f)
                lineTo(6.0f, 22.0f)
                horizontalLineTo(10.0f)
                curveTo(10.5128f, 22.0f, 10.9355f, 21.614f, 10.9933f, 21.1166f)
                lineTo(11.0f, 21.0f)
                verticalLineTo(17.0f)
                curveTo(11.0f, 16.4477f, 10.5523f, 16.0f, 10.0f, 16.0f)
                curveTo(9.4872f, 16.0f, 9.0645f, 16.386f, 9.0067f, 16.8834f)
                lineTo(9.0f, 17.0f)
                lineTo(8.9986f, 18.3267f)
                curveTo(6.6034f, 17.1903f, 5.0f, 14.753f, 5.0f, 12.0f)
                curveTo(5.0f, 8.134f, 8.134f, 5.0f, 12.0f, 5.0f)
                curveTo(15.866f, 5.0f, 19.0f, 8.134f, 19.0f, 12.0f)
                curveTo(19.0f, 12.5523f, 19.4477f, 13.0f, 20.0f, 13.0f)
                curveTo(20.5523f, 13.0f, 21.0f, 12.5523f, 21.0f, 12.0f)
                curveTo(21.0f, 7.0294f, 16.9706f, 3.0f, 12.0f, 3.0f)
                close()
                moveTo(12.0f, 9.0f)
                curveTo(10.3431f, 9.0f, 9.0f, 10.3431f, 9.0f, 12.0f)
                curveTo(9.0f, 13.6569f, 10.3431f, 15.0f, 12.0f, 15.0f)
                curveTo(13.6569f, 15.0f, 15.0f, 13.6569f, 15.0f, 12.0f)
                curveTo(15.0f, 10.3431f, 13.6569f, 9.0f, 12.0f, 9.0f)
                close()
                moveTo(12.0f, 11.0f)
                curveTo(12.5523f, 11.0f, 13.0f, 11.4477f, 13.0f, 12.0f)
                curveTo(13.0f, 12.5523f, 12.5523f, 13.0f, 12.0f, 13.0f)
                curveTo(11.4477f, 13.0f, 11.0f, 12.5523f, 11.0f, 12.0f)
                curveTo(11.0f, 11.4477f, 11.4477f, 11.0f, 12.0f, 11.0f)
                close()
            }
        }
        .build()
        return _arrowRotateCounterclockwise!!
    }

private var _arrowRotateCounterclockwise: ImageVector? = null
