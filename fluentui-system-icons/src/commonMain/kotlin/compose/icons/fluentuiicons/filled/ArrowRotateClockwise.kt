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

public val FilledGroup.ArrowRotateClockwise: ImageVector
    get() {
        if (_arrowRotateClockwise != null) {
            return _arrowRotateClockwise!!
        }
        _arrowRotateClockwise = Builder(name = "ArrowRotateClockwise", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 3.0f)
                curveTo(16.9706f, 3.0f, 21.0f, 7.0294f, 21.0f, 12.0f)
                curveTo(21.0f, 15.4359f, 19.0581f, 18.4885f, 16.1267f, 20.001f)
                lineTo(18.0f, 20.0f)
                curveTo(18.5523f, 20.0f, 19.0f, 20.4477f, 19.0f, 21.0f)
                curveTo(19.0f, 21.5128f, 18.614f, 21.9355f, 18.1166f, 21.9933f)
                lineTo(18.0f, 22.0f)
                horizontalLineTo(14.0f)
                curveTo(13.4872f, 22.0f, 13.0645f, 21.614f, 13.0067f, 21.1166f)
                lineTo(13.0f, 21.0f)
                verticalLineTo(17.0f)
                curveTo(13.0f, 16.4477f, 13.4477f, 16.0f, 14.0f, 16.0f)
                curveTo(14.5128f, 16.0f, 14.9355f, 16.386f, 14.9933f, 16.8834f)
                lineTo(15.0f, 17.0f)
                lineTo(15.0014f, 18.3267f)
                curveTo(17.3966f, 17.1903f, 19.0f, 14.753f, 19.0f, 12.0f)
                curveTo(19.0f, 8.134f, 15.866f, 5.0f, 12.0f, 5.0f)
                curveTo(8.134f, 5.0f, 5.0f, 8.134f, 5.0f, 12.0f)
                curveTo(5.0f, 12.5523f, 4.5523f, 13.0f, 4.0f, 13.0f)
                curveTo(3.4477f, 13.0f, 3.0f, 12.5523f, 3.0f, 12.0f)
                curveTo(3.0f, 7.0294f, 7.0294f, 3.0f, 12.0f, 3.0f)
                close()
                moveTo(12.0f, 9.0f)
                curveTo(13.6569f, 9.0f, 15.0f, 10.3431f, 15.0f, 12.0f)
                curveTo(15.0f, 13.6569f, 13.6569f, 15.0f, 12.0f, 15.0f)
                curveTo(10.3431f, 15.0f, 9.0f, 13.6569f, 9.0f, 12.0f)
                curveTo(9.0f, 10.3431f, 10.3431f, 9.0f, 12.0f, 9.0f)
                close()
                moveTo(12.0f, 11.0f)
                curveTo(11.4477f, 11.0f, 11.0f, 11.4477f, 11.0f, 12.0f)
                curveTo(11.0f, 12.5523f, 11.4477f, 13.0f, 12.0f, 13.0f)
                curveTo(12.5523f, 13.0f, 13.0f, 12.5523f, 13.0f, 12.0f)
                curveTo(13.0f, 11.4477f, 12.5523f, 11.0f, 12.0f, 11.0f)
                close()
            }
        }
        .build()
        return _arrowRotateClockwise!!
    }

private var _arrowRotateClockwise: ImageVector? = null
