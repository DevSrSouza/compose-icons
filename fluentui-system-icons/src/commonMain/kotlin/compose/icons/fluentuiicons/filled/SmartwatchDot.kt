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

public val FilledGroup.SmartwatchDot: ImageVector
    get() {
        if (_smartwatchDot != null) {
            return _smartwatchDot!!
        }
        _smartwatchDot = Builder(name = "SmartwatchDot", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.5f, 2.0f)
                curveTo(15.2828f, 2.0f, 15.9606f, 2.4498f, 16.2891f, 3.105f)
                curveTo(16.1031f, 3.5324f, 16.0f, 4.0042f, 16.0f, 4.5f)
                curveTo(16.0f, 4.7192f, 16.0201f, 4.9336f, 16.0587f, 5.1416f)
                curveTo(15.7215f, 5.0493f, 15.3665f, 5.0f, 15.0f, 5.0f)
                horizontalLineTo(9.0f)
                curveTo(8.4696f, 5.0f, 7.9632f, 5.1033f, 7.5f, 5.2908f)
                verticalLineTo(4.0f)
                curveTo(7.5f, 2.8954f, 8.3954f, 2.0f, 9.5f, 2.0f)
                horizontalLineTo(14.5f)
                close()
                moveTo(15.0f, 6.0f)
                curveTo(15.589f, 6.0f, 16.1384f, 6.1698f, 16.6019f, 6.463f)
                curveTo(16.8515f, 6.8308f, 17.1692f, 7.1485f, 17.537f, 7.3981f)
                curveTo(17.8302f, 7.8616f, 18.0f, 8.411f, 18.0f, 9.0f)
                verticalLineTo(10.0f)
                curveTo(18.5523f, 10.0f, 19.0f, 10.4477f, 19.0f, 11.0f)
                verticalLineTo(12.0f)
                curveTo(19.0f, 12.5523f, 18.5523f, 13.0f, 18.0f, 13.0f)
                verticalLineTo(15.0f)
                curveTo(18.0f, 16.6569f, 16.6569f, 18.0f, 15.0f, 18.0f)
                horizontalLineTo(9.0f)
                curveTo(7.3432f, 18.0f, 6.0f, 16.6569f, 6.0f, 15.0f)
                verticalLineTo(9.0f)
                curveTo(6.0f, 7.3432f, 7.3432f, 6.0f, 9.0f, 6.0f)
                horizontalLineTo(15.0f)
                close()
                moveTo(9.0f, 19.0f)
                curveTo(8.4696f, 19.0f, 7.9632f, 18.8967f, 7.5f, 18.7092f)
                verticalLineTo(20.0f)
                curveTo(7.5f, 21.1046f, 8.3954f, 22.0f, 9.5f, 22.0f)
                horizontalLineTo(14.5f)
                curveTo(15.6046f, 22.0f, 16.5f, 21.1046f, 16.5f, 20.0f)
                verticalLineTo(18.7092f)
                curveTo(16.0368f, 18.8967f, 15.5305f, 19.0f, 15.0f, 19.0f)
                horizontalLineTo(9.0f)
                close()
                moveTo(22.0f, 4.5f)
                curveTo(22.0f, 3.1193f, 20.8807f, 2.0f, 19.5f, 2.0f)
                curveTo(18.1193f, 2.0f, 17.0f, 3.1193f, 17.0f, 4.5f)
                curveTo(17.0f, 5.8807f, 18.1193f, 7.0f, 19.5f, 7.0f)
                curveTo(20.8807f, 7.0f, 22.0f, 5.8807f, 22.0f, 4.5f)
                close()
            }
        }
        .build()
        return _smartwatchDot!!
    }

private var _smartwatchDot: ImageVector? = null
