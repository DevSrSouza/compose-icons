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

public val RegularGroup.ChevronRight: ImageVector
    get() {
        if (_chevronRight != null) {
            return _chevronRight!!
        }
        _chevronRight = Builder(name = "ChevronRight", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.4697f, 4.2197f)
                curveTo(8.1768f, 4.5126f, 8.1768f, 4.9874f, 8.4697f, 5.2803f)
                lineTo(15.1893f, 12.0f)
                lineTo(8.4697f, 18.7197f)
                curveTo(8.1768f, 19.0126f, 8.1768f, 19.4874f, 8.4697f, 19.7803f)
                curveTo(8.7626f, 20.0732f, 9.2374f, 20.0732f, 9.5303f, 19.7803f)
                lineTo(16.7803f, 12.5303f)
                curveTo(17.0732f, 12.2374f, 17.0732f, 11.7626f, 16.7803f, 11.4697f)
                lineTo(9.5303f, 4.2197f)
                curveTo(9.2374f, 3.9268f, 8.7626f, 3.9268f, 8.4697f, 4.2197f)
                close()
            }
        }
        .build()
        return _chevronRight!!
    }

private var _chevronRight: ImageVector? = null
