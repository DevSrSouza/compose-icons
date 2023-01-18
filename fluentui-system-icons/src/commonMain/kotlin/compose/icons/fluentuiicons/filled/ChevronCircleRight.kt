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

public val FilledGroup.ChevronCircleRight: ImageVector
    get() {
        if (_chevronCircleRight != null) {
            return _chevronCircleRight!!
        }
        _chevronCircleRight = Builder(name = "ChevronCircleRight", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 12.0f)
                curveTo(2.0f, 6.4771f, 6.4771f, 2.0f, 12.0f, 2.0f)
                curveTo(17.5228f, 2.0f, 22.0f, 6.4771f, 22.0f, 12.0f)
                curveTo(22.0f, 17.5228f, 17.5228f, 22.0f, 12.0f, 22.0f)
                curveTo(6.4771f, 22.0f, 2.0f, 17.5228f, 2.0f, 12.0f)
                close()
                moveTo(9.9697f, 16.5303f)
                curveTo(10.2626f, 16.8232f, 10.7374f, 16.8232f, 11.0303f, 16.5303f)
                lineTo(15.0303f, 12.5303f)
                curveTo(15.3232f, 12.2374f, 15.3232f, 11.7626f, 15.0303f, 11.4697f)
                lineTo(11.0303f, 7.4697f)
                curveTo(10.7374f, 7.1768f, 10.2626f, 7.1768f, 9.9697f, 7.4697f)
                curveTo(9.6768f, 7.7626f, 9.6768f, 8.2374f, 9.9697f, 8.5303f)
                lineTo(13.4393f, 12.0f)
                lineTo(9.9697f, 15.4697f)
                curveTo(9.6768f, 15.7626f, 9.6768f, 16.2374f, 9.9697f, 16.5303f)
                close()
            }
        }
        .build()
        return _chevronCircleRight!!
    }

private var _chevronCircleRight: ImageVector? = null
