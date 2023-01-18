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

public val FilledGroup.RecordStop: ImageVector
    get() {
        if (_recordStop != null) {
            return _recordStop!!
        }
        _recordStop = Builder(name = "RecordStop", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 22.0f)
                curveTo(17.5228f, 22.0f, 22.0f, 17.5228f, 22.0f, 12.0f)
                curveTo(22.0f, 6.4771f, 17.5228f, 2.0f, 12.0f, 2.0f)
                curveTo(6.4771f, 2.0f, 2.0f, 6.4771f, 2.0f, 12.0f)
                curveTo(2.0f, 17.5228f, 6.4771f, 22.0f, 12.0f, 22.0f)
                close()
                moveTo(9.5f, 8.0f)
                horizontalLineTo(14.5f)
                curveTo(15.3284f, 8.0f, 16.0f, 8.6716f, 16.0f, 9.5f)
                verticalLineTo(14.5f)
                curveTo(16.0f, 15.3284f, 15.3284f, 16.0f, 14.5f, 16.0f)
                horizontalLineTo(9.5f)
                curveTo(8.6716f, 16.0f, 8.0f, 15.3284f, 8.0f, 14.5f)
                verticalLineTo(9.5f)
                curveTo(8.0f, 8.6716f, 8.6716f, 8.0f, 9.5f, 8.0f)
                close()
            }
        }
        .build()
        return _recordStop!!
    }

private var _recordStop: ImageVector? = null
