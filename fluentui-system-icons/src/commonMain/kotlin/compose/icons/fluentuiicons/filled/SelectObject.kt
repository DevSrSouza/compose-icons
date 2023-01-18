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

public val FilledGroup.SelectObject: ImageVector
    get() {
        if (_selectObject != null) {
            return _selectObject!!
        }
        _selectObject = Builder(name = "SelectObject", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 5.0f)
                curveTo(7.0f, 6.1046f, 6.1046f, 7.0f, 5.0f, 7.0f)
                curveTo(3.8954f, 7.0f, 3.0f, 6.1046f, 3.0f, 5.0f)
                curveTo(3.0f, 3.8954f, 3.8954f, 3.0f, 5.0f, 3.0f)
                curveTo(6.1046f, 3.0f, 7.0f, 3.8954f, 7.0f, 5.0f)
                close()
                moveTo(8.0f, 5.0f)
                curveTo(8.0f, 5.5523f, 8.4477f, 6.0f, 9.0f, 6.0f)
                lineTo(15.0f, 6.0f)
                curveTo(15.5523f, 6.0f, 16.0f, 5.5523f, 16.0f, 5.0f)
                curveTo(16.0f, 4.4477f, 15.5523f, 4.0f, 15.0f, 4.0f)
                lineTo(9.0f, 4.0f)
                curveTo(8.4477f, 4.0f, 8.0f, 4.4477f, 8.0f, 5.0f)
                close()
                moveTo(5.0f, 8.0f)
                curveTo(4.4477f, 8.0f, 4.0f, 8.4477f, 4.0f, 9.0f)
                verticalLineTo(15.0f)
                curveTo(4.0f, 15.5523f, 4.4477f, 16.0f, 5.0f, 16.0f)
                curveTo(5.5523f, 16.0f, 6.0f, 15.5523f, 6.0f, 15.0f)
                verticalLineTo(9.0f)
                curveTo(6.0f, 8.4477f, 5.5523f, 8.0f, 5.0f, 8.0f)
                close()
                moveTo(19.0f, 8.0f)
                curveTo(18.4477f, 8.0f, 18.0f, 8.4477f, 18.0f, 9.0f)
                verticalLineTo(15.0f)
                curveTo(18.0f, 15.5523f, 18.4477f, 16.0f, 19.0f, 16.0f)
                curveTo(19.5523f, 16.0f, 20.0f, 15.5523f, 20.0f, 15.0f)
                verticalLineTo(9.0f)
                curveTo(20.0f, 8.4477f, 19.5523f, 8.0f, 19.0f, 8.0f)
                close()
                moveTo(9.0f, 20.0f)
                curveTo(8.4477f, 20.0f, 8.0f, 19.5523f, 8.0f, 19.0f)
                curveTo(8.0f, 18.4477f, 8.4477f, 18.0f, 9.0f, 18.0f)
                horizontalLineTo(15.0f)
                curveTo(15.5523f, 18.0f, 16.0f, 18.4477f, 16.0f, 19.0f)
                curveTo(16.0f, 19.5523f, 15.5523f, 20.0f, 15.0f, 20.0f)
                horizontalLineTo(9.0f)
                close()
                moveTo(5.0f, 21.0f)
                curveTo(6.1046f, 21.0f, 7.0f, 20.1046f, 7.0f, 19.0f)
                curveTo(7.0f, 17.8954f, 6.1046f, 17.0f, 5.0f, 17.0f)
                curveTo(3.8954f, 17.0f, 3.0f, 17.8954f, 3.0f, 19.0f)
                curveTo(3.0f, 20.1046f, 3.8954f, 21.0f, 5.0f, 21.0f)
                close()
                moveTo(21.0f, 5.0f)
                curveTo(21.0f, 6.1046f, 20.1046f, 7.0f, 19.0f, 7.0f)
                curveTo(17.8954f, 7.0f, 17.0f, 6.1046f, 17.0f, 5.0f)
                curveTo(17.0f, 3.8954f, 17.8954f, 3.0f, 19.0f, 3.0f)
                curveTo(20.1046f, 3.0f, 21.0f, 3.8954f, 21.0f, 5.0f)
                close()
                moveTo(19.0f, 21.0f)
                curveTo(20.1046f, 21.0f, 21.0f, 20.1046f, 21.0f, 19.0f)
                curveTo(21.0f, 17.8954f, 20.1046f, 17.0f, 19.0f, 17.0f)
                curveTo(17.8954f, 17.0f, 17.0f, 17.8954f, 17.0f, 19.0f)
                curveTo(17.0f, 20.1046f, 17.8954f, 21.0f, 19.0f, 21.0f)
                close()
            }
        }
        .build()
        return _selectObject!!
    }

private var _selectObject: ImageVector? = null
