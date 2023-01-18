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

public val FilledGroup.ChevronRight: ImageVector
    get() {
        if (_chevronRight != null) {
            return _chevronRight!!
        }
        _chevronRight = Builder(name = "ChevronRight", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.2929f, 4.2929f)
                curveTo(7.9024f, 4.6834f, 7.9024f, 5.3166f, 8.2929f, 5.7071f)
                lineTo(14.5858f, 12.0f)
                lineTo(8.2929f, 18.2929f)
                curveTo(7.9024f, 18.6834f, 7.9024f, 19.3166f, 8.2929f, 19.7071f)
                curveTo(8.6834f, 20.0976f, 9.3166f, 20.0976f, 9.7071f, 19.7071f)
                lineTo(16.7071f, 12.7071f)
                curveTo(17.0976f, 12.3166f, 17.0976f, 11.6834f, 16.7071f, 11.2929f)
                lineTo(9.7071f, 4.2929f)
                curveTo(9.3166f, 3.9024f, 8.6834f, 3.9024f, 8.2929f, 4.2929f)
                close()
            }
        }
        .build()
        return _chevronRight!!
    }

private var _chevronRight: ImageVector? = null
