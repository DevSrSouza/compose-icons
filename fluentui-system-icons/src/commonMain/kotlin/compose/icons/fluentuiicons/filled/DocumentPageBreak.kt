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

public val FilledGroup.DocumentPageBreak: ImageVector
    get() {
        if (_documentPageBreak != null) {
            return _documentPageBreak!!
        }
        _documentPageBreak = Builder(name = "DocumentPageBreak", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.5f, 12.0f)
                curveTo(2.5f, 11.5858f, 2.8358f, 11.25f, 3.25f, 11.25f)
                horizontalLineTo(4.75f)
                curveTo(5.1642f, 11.25f, 5.5f, 11.5858f, 5.5f, 12.0f)
                curveTo(5.5f, 12.4142f, 5.1642f, 12.75f, 4.75f, 12.75f)
                horizontalLineTo(3.25f)
                curveTo(2.8358f, 12.75f, 2.5f, 12.4142f, 2.5f, 12.0f)
                close()
                moveTo(6.5f, 12.0f)
                curveTo(6.5f, 11.5858f, 6.8358f, 11.25f, 7.25f, 11.25f)
                horizontalLineTo(8.75f)
                curveTo(9.1642f, 11.25f, 9.5f, 11.5858f, 9.5f, 12.0f)
                curveTo(9.5f, 12.4142f, 9.1642f, 12.75f, 8.75f, 12.75f)
                horizontalLineTo(7.25f)
                curveTo(6.8358f, 12.75f, 6.5f, 12.4142f, 6.5f, 12.0f)
                close()
                moveTo(10.5f, 12.0f)
                curveTo(10.5f, 11.5858f, 10.8358f, 11.25f, 11.25f, 11.25f)
                horizontalLineTo(12.75f)
                curveTo(13.1642f, 11.25f, 13.5f, 11.5858f, 13.5f, 12.0f)
                curveTo(13.5f, 12.4142f, 13.1642f, 12.75f, 12.75f, 12.75f)
                horizontalLineTo(11.25f)
                curveTo(10.8358f, 12.75f, 10.5f, 12.4142f, 10.5f, 12.0f)
                close()
                moveTo(14.5f, 12.0f)
                curveTo(14.5f, 11.5858f, 14.8358f, 11.25f, 15.25f, 11.25f)
                horizontalLineTo(16.75f)
                curveTo(17.1642f, 11.25f, 17.5f, 11.5858f, 17.5f, 12.0f)
                curveTo(17.5f, 12.4142f, 17.1642f, 12.75f, 16.75f, 12.75f)
                horizontalLineTo(15.25f)
                curveTo(14.8358f, 12.75f, 14.5f, 12.4142f, 14.5f, 12.0f)
                close()
                moveTo(18.5f, 12.0f)
                curveTo(18.5f, 11.5858f, 18.8358f, 11.25f, 19.25f, 11.25f)
                horizontalLineTo(20.75f)
                curveTo(21.1642f, 11.25f, 21.5f, 11.5858f, 21.5f, 12.0f)
                curveTo(21.5f, 12.4142f, 21.1642f, 12.75f, 20.75f, 12.75f)
                horizontalLineTo(19.25f)
                curveTo(18.8358f, 12.75f, 18.5f, 12.4142f, 18.5f, 12.0f)
                close()
                moveTo(5.0f, 2.0f)
                curveTo(4.4477f, 2.0f, 4.0f, 2.4477f, 4.0f, 3.0f)
                verticalLineTo(7.0f)
                curveTo(4.0f, 8.104f, 4.896f, 9.0f, 6.0f, 9.0f)
                horizontalLineTo(18.0f)
                curveTo(19.104f, 9.0f, 20.0f, 8.104f, 20.0f, 7.0f)
                verticalLineTo(3.0f)
                curveTo(20.0f, 2.4477f, 19.5523f, 2.0f, 19.0f, 2.0f)
                horizontalLineTo(5.0f)
                close()
                moveTo(19.0f, 22.0f)
                curveTo(19.5523f, 22.0f, 20.0f, 21.5523f, 20.0f, 21.0f)
                verticalLineTo(17.0f)
                curveTo(20.0f, 15.896f, 19.104f, 15.0f, 18.0f, 15.0f)
                lineTo(6.0f, 15.0f)
                curveTo(4.896f, 15.0f, 4.0f, 15.896f, 4.0f, 17.0f)
                lineTo(4.0f, 21.0f)
                curveTo(4.0f, 21.5523f, 4.4477f, 22.0f, 5.0f, 22.0f)
                lineTo(19.0f, 22.0f)
                close()
            }
        }
        .build()
        return _documentPageBreak!!
    }

private var _documentPageBreak: ImageVector? = null
