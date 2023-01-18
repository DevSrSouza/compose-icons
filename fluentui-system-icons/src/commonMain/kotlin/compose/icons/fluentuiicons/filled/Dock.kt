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

public val FilledGroup.Dock: ImageVector
    get() {
        if (_dock != null) {
            return _dock!!
        }
        _dock = Builder(name = "Dock", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.7071f, 3.2929f)
                curveTo(12.3166f, 2.9024f, 11.6834f, 2.9024f, 11.2929f, 3.2929f)
                lineTo(7.7929f, 6.7929f)
                curveTo(7.4024f, 7.1834f, 7.4024f, 7.8166f, 7.7929f, 8.2071f)
                curveTo(8.1834f, 8.5976f, 8.8166f, 8.5976f, 9.2071f, 8.2071f)
                lineTo(11.0f, 6.4142f)
                verticalLineTo(15.0f)
                curveTo(11.0f, 15.5523f, 11.4477f, 16.0f, 12.0f, 16.0f)
                curveTo(12.5523f, 16.0f, 13.0f, 15.5523f, 13.0f, 15.0f)
                verticalLineTo(6.4142f)
                lineTo(14.7929f, 8.2071f)
                curveTo(15.1834f, 8.5976f, 15.8166f, 8.5976f, 16.2071f, 8.2071f)
                curveTo(16.5976f, 7.8166f, 16.5976f, 7.1834f, 16.2071f, 6.7929f)
                lineTo(12.7071f, 3.2929f)
                close()
                moveTo(4.0f, 12.75f)
                curveTo(4.0f, 12.3358f, 4.3358f, 12.0f, 4.75f, 12.0f)
                horizontalLineTo(9.0f)
                curveTo(9.5523f, 12.0f, 10.0f, 11.5523f, 10.0f, 11.0f)
                curveTo(10.0f, 10.4477f, 9.5523f, 10.0f, 9.0f, 10.0f)
                horizontalLineTo(4.75f)
                curveTo(3.2312f, 10.0f, 2.0f, 11.2312f, 2.0f, 12.75f)
                verticalLineTo(17.25f)
                curveTo(2.0f, 18.7688f, 3.2312f, 20.0f, 4.75f, 20.0f)
                horizontalLineTo(19.25f)
                curveTo(20.7688f, 20.0f, 22.0f, 18.7688f, 22.0f, 17.25f)
                verticalLineTo(12.75f)
                curveTo(22.0f, 11.2312f, 20.7688f, 10.0f, 19.25f, 10.0f)
                horizontalLineTo(15.0f)
                curveTo(14.4477f, 10.0f, 14.0f, 10.4477f, 14.0f, 11.0f)
                curveTo(14.0f, 11.5523f, 14.4477f, 12.0f, 15.0f, 12.0f)
                horizontalLineTo(19.25f)
                curveTo(19.6642f, 12.0f, 20.0f, 12.3358f, 20.0f, 12.75f)
                verticalLineTo(17.25f)
                curveTo(20.0f, 17.6642f, 19.6642f, 18.0f, 19.25f, 18.0f)
                horizontalLineTo(4.75f)
                curveTo(4.3358f, 18.0f, 4.0f, 17.6642f, 4.0f, 17.25f)
                verticalLineTo(12.75f)
                close()
            }
        }
        .build()
        return _dock!!
    }

private var _dock: ImageVector? = null
