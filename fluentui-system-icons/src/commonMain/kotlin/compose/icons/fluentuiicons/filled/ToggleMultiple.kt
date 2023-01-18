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

public val FilledGroup.ToggleMultiple: ImageVector
    get() {
        if (_toggleMultiple != null) {
            return _toggleMultiple!!
        }
        _toggleMultiple = Builder(name = "ToggleMultiple", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 6.5f)
                curveTo(2.0f, 4.0147f, 4.0147f, 2.0f, 6.5f, 2.0f)
                horizontalLineTo(17.5f)
                curveTo(19.9853f, 2.0f, 22.0f, 4.0147f, 22.0f, 6.5f)
                curveTo(22.0f, 8.9853f, 19.9853f, 11.0f, 17.5f, 11.0f)
                horizontalLineTo(6.5f)
                curveTo(4.0147f, 11.0f, 2.0f, 8.9853f, 2.0f, 6.5f)
                close()
                moveTo(6.5f, 8.5f)
                curveTo(7.6046f, 8.5f, 8.5f, 7.6046f, 8.5f, 6.5f)
                curveTo(8.5f, 5.3954f, 7.6046f, 4.5f, 6.5f, 4.5f)
                curveTo(5.3954f, 4.5f, 4.5f, 5.3954f, 4.5f, 6.5f)
                curveTo(4.5f, 7.6046f, 5.3954f, 8.5f, 6.5f, 8.5f)
                close()
                moveTo(6.5f, 13.0f)
                curveTo(4.0147f, 13.0f, 2.0f, 15.0147f, 2.0f, 17.5f)
                curveTo(2.0f, 19.9853f, 4.0147f, 22.0f, 6.5f, 22.0f)
                horizontalLineTo(17.5f)
                curveTo(19.9853f, 22.0f, 22.0f, 19.9853f, 22.0f, 17.5f)
                curveTo(22.0f, 15.0147f, 19.9853f, 13.0f, 17.5f, 13.0f)
                horizontalLineTo(6.5f)
                close()
                moveTo(19.5f, 17.5f)
                curveTo(19.5f, 18.6046f, 18.6046f, 19.5f, 17.5f, 19.5f)
                curveTo(16.3954f, 19.5f, 15.5f, 18.6046f, 15.5f, 17.5f)
                curveTo(15.5f, 16.3954f, 16.3954f, 15.5f, 17.5f, 15.5f)
                curveTo(18.6046f, 15.5f, 19.5f, 16.3954f, 19.5f, 17.5f)
                close()
            }
        }
        .build()
        return _toggleMultiple!!
    }

private var _toggleMultiple: ImageVector? = null
