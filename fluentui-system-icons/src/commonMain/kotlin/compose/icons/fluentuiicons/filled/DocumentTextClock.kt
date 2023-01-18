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

public val FilledGroup.DocumentTextClock: ImageVector
    get() {
        if (_documentTextClock != null) {
            return _documentTextClock!!
        }
        _documentTextClock = Builder(name = "DocumentTextClock", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 8.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(6.0f)
                curveTo(4.8954f, 2.0f, 4.0f, 2.8954f, 4.0f, 4.0f)
                verticalLineTo(11.4982f)
                curveTo(4.7696f, 11.1772f, 5.6141f, 11.0f, 6.5f, 11.0f)
                curveTo(7.3876f, 11.0f, 8.2336f, 11.1779f, 9.0044f, 11.5f)
                horizontalLineTo(15.75f)
                curveTo(16.1642f, 11.5f, 16.5f, 11.8358f, 16.5f, 12.25f)
                curveTo(16.5f, 12.6642f, 16.1642f, 13.0f, 15.75f, 13.0f)
                horizontalLineTo(11.1904f)
                curveTo(11.5514f, 13.3762f, 11.8676f, 13.7957f, 12.1304f, 14.25f)
                horizontalLineTo(15.75f)
                curveTo(16.1642f, 14.25f, 16.5f, 14.5858f, 16.5f, 15.0f)
                curveTo(16.5f, 15.4142f, 16.1642f, 15.75f, 15.75f, 15.75f)
                horizontalLineTo(12.7617f)
                curveTo(12.8739f, 16.1523f, 12.9484f, 16.5703f, 12.9811f, 17.0f)
                horizontalLineTo(15.75f)
                curveTo(16.1642f, 17.0f, 16.5f, 17.3358f, 16.5f, 17.75f)
                curveTo(16.5f, 18.1642f, 16.1642f, 18.5f, 15.75f, 18.5f)
                horizontalLineTo(12.9236f)
                curveTo(12.7154f, 19.8481f, 12.093f, 21.0595f, 11.1904f, 22.0f)
                horizontalLineTo(18.0f)
                curveTo(19.1046f, 22.0f, 20.0f, 21.1046f, 20.0f, 20.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(14.0f)
                curveTo(12.8954f, 10.0f, 12.0f, 9.1046f, 12.0f, 8.0f)
                close()
                moveTo(13.5f, 8.0f)
                verticalLineTo(2.5f)
                lineTo(19.5f, 8.5f)
                horizontalLineTo(14.0f)
                curveTo(13.7239f, 8.5f, 13.5f, 8.2761f, 13.5f, 8.0f)
                close()
                moveTo(12.0f, 17.5f)
                curveTo(12.0f, 14.4624f, 9.5376f, 12.0f, 6.5f, 12.0f)
                curveTo(3.4624f, 12.0f, 1.0f, 14.4624f, 1.0f, 17.5f)
                curveTo(1.0f, 20.5376f, 3.4624f, 23.0f, 6.5f, 23.0f)
                curveTo(9.5376f, 23.0f, 12.0f, 20.5376f, 12.0f, 17.5f)
                close()
                moveTo(6.5f, 17.5001f)
                horizontalLineTo(8.5f)
                curveTo(8.7761f, 17.5001f, 9.0f, 17.7239f, 9.0f, 18.0001f)
                curveTo(9.0f, 18.2762f, 8.7761f, 18.5001f, 8.5f, 18.5001f)
                horizontalLineTo(6.0f)
                curveTo(5.7239f, 18.5001f, 5.5f, 18.2762f, 5.5f, 18.0001f)
                lineTo(5.5f, 17.9985f)
                lineTo(5.5f, 14.9999f)
                curveTo(5.5f, 14.7238f, 5.7239f, 14.4999f, 6.0f, 14.4999f)
                curveTo(6.2761f, 14.4999f, 6.5f, 14.7238f, 6.5f, 14.9999f)
                lineTo(6.5f, 17.5001f)
                close()
            }
        }
        .build()
        return _documentTextClock!!
    }

private var _documentTextClock: ImageVector? = null
