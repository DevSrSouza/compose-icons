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

public val FilledGroup.ChevronLeft: ImageVector
    get() {
        if (_chevronLeft != null) {
            return _chevronLeft!!
        }
        _chevronLeft = Builder(name = "ChevronLeft", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.7071f, 4.2929f)
                curveTo(16.0976f, 4.6834f, 16.0976f, 5.3166f, 15.7071f, 5.7071f)
                lineTo(9.4142f, 12.0f)
                lineTo(15.7071f, 18.2929f)
                curveTo(16.0976f, 18.6834f, 16.0976f, 19.3166f, 15.7071f, 19.7071f)
                curveTo(15.3166f, 20.0976f, 14.6834f, 20.0976f, 14.2929f, 19.7071f)
                lineTo(7.2929f, 12.7071f)
                curveTo(6.9024f, 12.3166f, 6.9024f, 11.6834f, 7.2929f, 11.2929f)
                lineTo(14.2929f, 4.2929f)
                curveTo(14.6834f, 3.9024f, 15.3166f, 3.9024f, 15.7071f, 4.2929f)
                close()
            }
        }
        .build()
        return _chevronLeft!!
    }

private var _chevronLeft: ImageVector? = null
