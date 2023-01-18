package compose.icons.fluentuiicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.RegularGroup

public val RegularGroup.SelectObject: ImageVector
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
                moveTo(8.0f, 4.75f)
                curveTo(8.0f, 5.1642f, 8.3358f, 5.5f, 8.75f, 5.5f)
                lineTo(15.25f, 5.5f)
                curveTo(15.6642f, 5.5f, 16.0f, 5.1642f, 16.0f, 4.75f)
                curveTo(16.0f, 4.3358f, 15.6642f, 4.0f, 15.25f, 4.0f)
                lineTo(8.75f, 4.0f)
                curveTo(8.3358f, 4.0f, 8.0f, 4.3358f, 8.0f, 4.75f)
                close()
                moveTo(4.75f, 8.0f)
                curveTo(4.3358f, 8.0f, 4.0f, 8.3358f, 4.0f, 8.75f)
                verticalLineTo(15.25f)
                curveTo(4.0f, 15.6642f, 4.3358f, 16.0f, 4.75f, 16.0f)
                curveTo(5.1642f, 16.0f, 5.5f, 15.6642f, 5.5f, 15.25f)
                verticalLineTo(8.75f)
                curveTo(5.5f, 8.3358f, 5.1642f, 8.0f, 4.75f, 8.0f)
                close()
                moveTo(19.25f, 8.0f)
                curveTo(18.8358f, 8.0f, 18.5f, 8.3358f, 18.5f, 8.75f)
                verticalLineTo(15.25f)
                curveTo(18.5f, 15.6642f, 18.8358f, 16.0f, 19.25f, 16.0f)
                curveTo(19.6642f, 16.0f, 20.0f, 15.6642f, 20.0f, 15.25f)
                verticalLineTo(8.75f)
                curveTo(20.0f, 8.3358f, 19.6642f, 8.0f, 19.25f, 8.0f)
                close()
                moveTo(8.75f, 20.0f)
                curveTo(8.3358f, 20.0f, 8.0f, 19.6642f, 8.0f, 19.25f)
                curveTo(8.0f, 18.8358f, 8.3358f, 18.5f, 8.75f, 18.5f)
                horizontalLineTo(15.25f)
                curveTo(15.6642f, 18.5f, 16.0f, 18.8358f, 16.0f, 19.25f)
                curveTo(16.0f, 19.6642f, 15.6642f, 20.0f, 15.25f, 20.0f)
                horizontalLineTo(8.75f)
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
