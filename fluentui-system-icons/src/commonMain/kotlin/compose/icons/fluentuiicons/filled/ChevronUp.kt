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

public val FilledGroup.ChevronUp: ImageVector
    get() {
        if (_chevronUp != null) {
            return _chevronUp!!
        }
        _chevronUp = Builder(name = "ChevronUp", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.2929f, 15.7071f)
                curveTo(4.6834f, 16.0976f, 5.3166f, 16.0976f, 5.7071f, 15.7071f)
                lineTo(12.0f, 9.4142f)
                lineTo(18.2929f, 15.7071f)
                curveTo(18.6834f, 16.0976f, 19.3166f, 16.0976f, 19.7071f, 15.7071f)
                curveTo(20.0976f, 15.3166f, 20.0976f, 14.6834f, 19.7071f, 14.2929f)
                lineTo(12.7071f, 7.2929f)
                curveTo(12.3166f, 6.9024f, 11.6834f, 6.9024f, 11.2929f, 7.2929f)
                lineTo(4.2929f, 14.2929f)
                curveTo(3.9024f, 14.6834f, 3.9024f, 15.3166f, 4.2929f, 15.7071f)
                close()
            }
        }
        .build()
        return _chevronUp!!
    }

private var _chevronUp: ImageVector? = null
