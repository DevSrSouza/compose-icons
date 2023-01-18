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

public val FilledGroup.NumberRow: ImageVector
    get() {
        if (_numberRow != null) {
            return _numberRow!!
        }
        _numberRow = Builder(name = "NumberRow", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.75f, 4.0f)
                horizontalLineTo(8.75f)
                curveTo(10.2688f, 4.0f, 11.5f, 5.2312f, 11.5f, 6.75f)
                verticalLineTo(17.25f)
                curveTo(11.5f, 18.7688f, 10.2688f, 20.0f, 8.75f, 20.0f)
                horizontalLineTo(4.75f)
                curveTo(3.2312f, 20.0f, 2.0f, 18.7688f, 2.0f, 17.25f)
                verticalLineTo(6.75f)
                curveTo(2.0f, 5.2312f, 3.2312f, 4.0f, 4.75f, 4.0f)
                close()
                moveTo(6.0f, 9.0f)
                verticalLineTo(15.0f)
                curveTo(6.0f, 15.4142f, 6.3358f, 15.75f, 6.75f, 15.75f)
                curveTo(7.1642f, 15.75f, 7.5f, 15.4142f, 7.5f, 15.0f)
                verticalLineTo(9.0f)
                curveTo(7.5f, 8.5858f, 7.1642f, 8.25f, 6.75f, 8.25f)
                curveTo(6.3358f, 8.25f, 6.0f, 8.5858f, 6.0f, 9.0f)
                close()
                moveTo(15.25f, 4.0f)
                horizontalLineTo(19.25f)
                curveTo(20.7688f, 4.0f, 22.0f, 5.2312f, 22.0f, 6.75f)
                verticalLineTo(17.25f)
                curveTo(22.0f, 18.7688f, 20.7688f, 20.0f, 19.25f, 20.0f)
                horizontalLineTo(15.25f)
                curveTo(13.7312f, 20.0f, 12.5f, 18.7688f, 12.5f, 17.25f)
                verticalLineTo(6.75f)
                curveTo(12.5f, 5.2312f, 13.7312f, 4.0f, 15.25f, 4.0f)
                close()
                moveTo(17.5f, 9.75f)
                verticalLineTo(11.25f)
                horizontalLineTo(16.25f)
                curveTo(15.8358f, 11.25f, 15.5f, 11.5858f, 15.5f, 12.0f)
                verticalLineTo(15.0f)
                curveTo(15.5f, 15.4142f, 15.8358f, 15.75f, 16.25f, 15.75f)
                horizontalLineTo(18.25f)
                curveTo(18.6642f, 15.75f, 19.0f, 15.4142f, 19.0f, 15.0f)
                curveTo(19.0f, 14.5858f, 18.6642f, 14.25f, 18.25f, 14.25f)
                horizontalLineTo(17.0f)
                verticalLineTo(12.75f)
                horizontalLineTo(18.25f)
                curveTo(18.6642f, 12.75f, 19.0f, 12.4142f, 19.0f, 12.0f)
                verticalLineTo(9.0f)
                curveTo(19.0f, 8.5858f, 18.6642f, 8.25f, 18.25f, 8.25f)
                horizontalLineTo(16.25f)
                curveTo(15.8358f, 8.25f, 15.5f, 8.5858f, 15.5f, 9.0f)
                curveTo(15.5f, 9.4142f, 15.8358f, 9.75f, 16.25f, 9.75f)
                horizontalLineTo(17.5f)
                close()
            }
        }
        .build()
        return _numberRow!!
    }

private var _numberRow: ImageVector? = null
