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

public val FilledGroup.BranchCompare: ImageVector
    get() {
        if (_branchCompare != null) {
            return _branchCompare!!
        }
        _branchCompare = Builder(name = "BranchCompare", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 5.5f)
                curveTo(9.0f, 7.2632f, 7.6961f, 8.7219f, 6.0f, 8.9646f)
                verticalLineTo(15.0f)
                curveTo(6.0f, 16.6569f, 7.3432f, 18.0f, 9.0f, 18.0f)
                horizontalLineTo(11.6893f)
                lineTo(10.7197f, 17.0303f)
                curveTo(10.4268f, 16.7374f, 10.4268f, 16.2626f, 10.7197f, 15.9697f)
                curveTo(11.0126f, 15.6768f, 11.4874f, 15.6768f, 11.7803f, 15.9697f)
                lineTo(14.0303f, 18.2197f)
                curveTo(14.3232f, 18.5126f, 14.3232f, 18.9874f, 14.0303f, 19.2803f)
                lineTo(11.7803f, 21.5303f)
                curveTo(11.4874f, 21.8232f, 11.0126f, 21.8232f, 10.7197f, 21.5303f)
                curveTo(10.4268f, 21.2374f, 10.4268f, 20.7626f, 10.7197f, 20.4697f)
                lineTo(11.6893f, 19.5f)
                horizontalLineTo(9.0f)
                curveTo(6.5147f, 19.5f, 4.5f, 17.4853f, 4.5f, 15.0f)
                verticalLineTo(8.875f)
                lineTo(4.5003f, 8.8551f)
                curveTo(3.0544f, 8.4249f, 2.0f, 7.0856f, 2.0f, 5.5f)
                curveTo(2.0f, 3.567f, 3.567f, 2.0f, 5.5f, 2.0f)
                curveTo(7.433f, 2.0f, 9.0f, 3.567f, 9.0f, 5.5f)
                close()
                moveTo(22.0f, 18.5f)
                curveTo(22.0f, 20.433f, 20.433f, 22.0f, 18.5f, 22.0f)
                curveTo(16.567f, 22.0f, 15.0f, 20.433f, 15.0f, 18.5f)
                curveTo(15.0f, 16.7368f, 16.3039f, 15.2781f, 18.0f, 15.0354f)
                verticalLineTo(9.0f)
                curveTo(18.0f, 7.3432f, 16.6569f, 6.0f, 15.0f, 6.0f)
                horizontalLineTo(13.0607f)
                lineTo(14.0303f, 6.9697f)
                curveTo(14.3232f, 7.2626f, 14.3232f, 7.7374f, 14.0303f, 8.0303f)
                curveTo(13.7374f, 8.3232f, 13.2626f, 8.3232f, 12.9697f, 8.0303f)
                lineTo(10.7197f, 5.7803f)
                curveTo(10.4268f, 5.4874f, 10.4268f, 5.0126f, 10.7197f, 4.7197f)
                lineTo(12.9697f, 2.4697f)
                curveTo(13.2626f, 2.1768f, 13.7374f, 2.1768f, 14.0303f, 2.4697f)
                curveTo(14.3232f, 2.7626f, 14.3232f, 3.2374f, 14.0303f, 3.5303f)
                lineTo(13.0607f, 4.5f)
                horizontalLineTo(15.0f)
                curveTo(17.4853f, 4.5f, 19.5f, 6.5147f, 19.5f, 9.0f)
                verticalLineTo(15.125f)
                lineTo(19.4997f, 15.1449f)
                curveTo(20.9456f, 15.5751f, 22.0f, 16.9144f, 22.0f, 18.5f)
                close()
            }
        }
        .build()
        return _branchCompare!!
    }

private var _branchCompare: ImageVector? = null
