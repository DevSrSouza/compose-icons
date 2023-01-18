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

public val FilledGroup.ChevronCircleDown: ImageVector
    get() {
        if (_chevronCircleDown != null) {
            return _chevronCircleDown!!
        }
        _chevronCircleDown = Builder(name = "ChevronCircleDown", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(17.5228f, 2.0f, 22.0f, 6.4771f, 22.0f, 12.0f)
                curveTo(22.0f, 17.5228f, 17.5228f, 22.0f, 12.0f, 22.0f)
                curveTo(6.4771f, 22.0f, 2.0f, 17.5228f, 2.0f, 12.0f)
                curveTo(2.0f, 6.4771f, 6.4771f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(7.4697f, 9.9697f)
                curveTo(7.1768f, 10.2626f, 7.1768f, 10.7374f, 7.4697f, 11.0303f)
                lineTo(11.4697f, 15.0303f)
                curveTo(11.7626f, 15.3232f, 12.2374f, 15.3232f, 12.5303f, 15.0303f)
                lineTo(16.5303f, 11.0303f)
                curveTo(16.8232f, 10.7374f, 16.8232f, 10.2626f, 16.5303f, 9.9697f)
                curveTo(16.2374f, 9.6768f, 15.7626f, 9.6768f, 15.4697f, 9.9697f)
                lineTo(12.0f, 13.4393f)
                lineTo(8.5303f, 9.9697f)
                curveTo(8.2374f, 9.6768f, 7.7626f, 9.6768f, 7.4697f, 9.9697f)
                close()
            }
        }
        .build()
        return _chevronCircleDown!!
    }

private var _chevronCircleDown: ImageVector? = null
