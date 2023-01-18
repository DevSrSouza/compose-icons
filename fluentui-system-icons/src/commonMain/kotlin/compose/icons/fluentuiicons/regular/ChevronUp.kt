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

public val RegularGroup.ChevronUp: ImageVector
    get() {
        if (_chevronUp != null) {
            return _chevronUp!!
        }
        _chevronUp = Builder(name = "ChevronUp", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.2197f, 15.5303f)
                curveTo(4.5126f, 15.8232f, 4.9874f, 15.8232f, 5.2803f, 15.5303f)
                lineTo(12.0f, 8.8107f)
                lineTo(18.7197f, 15.5303f)
                curveTo(19.0126f, 15.8232f, 19.4874f, 15.8232f, 19.7803f, 15.5303f)
                curveTo(20.0732f, 15.2374f, 20.0732f, 14.7626f, 19.7803f, 14.4697f)
                lineTo(12.5303f, 7.2197f)
                curveTo(12.2374f, 6.9268f, 11.7626f, 6.9268f, 11.4697f, 7.2197f)
                lineTo(4.2197f, 14.4697f)
                curveTo(3.9268f, 14.7626f, 3.9268f, 15.2374f, 4.2197f, 15.5303f)
                close()
            }
        }
        .build()
        return _chevronUp!!
    }

private var _chevronUp: ImageVector? = null
