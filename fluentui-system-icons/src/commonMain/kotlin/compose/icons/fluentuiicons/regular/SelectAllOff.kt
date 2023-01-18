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

public val RegularGroup.SelectAllOff: ImageVector
    get() {
        if (_selectAllOff != null) {
            return _selectAllOff!!
        }
        _selectAllOff = Builder(name = "SelectAllOff", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.4962f, 5.6267f)
                curveTo(21.3721f, 5.9345f, 22.0f, 6.7689f, 22.0f, 7.75f)
                verticalLineTo(17.75f)
                curveTo(22.0f, 20.0972f, 20.0972f, 22.0f, 17.75f, 22.0f)
                horizontalLineTo(7.75f)
                curveTo(6.7689f, 22.0f, 5.9345f, 21.3721f, 5.6267f, 20.4962f)
                lineTo(7.724f, 20.4996f)
                lineTo(17.75f, 20.5f)
                curveTo(19.2688f, 20.5f, 20.5f, 19.2688f, 20.5f, 17.75f)
                verticalLineTo(7.75f)
                lineTo(20.496f, 7.699f)
                lineTo(20.4962f, 5.6267f)
                close()
                moveTo(17.2468f, 2.0f)
                curveTo(18.4895f, 2.0f, 19.4968f, 3.0074f, 19.4968f, 4.25f)
                verticalLineTo(17.2468f)
                curveTo(19.4968f, 18.4895f, 18.4895f, 19.4968f, 17.2468f, 19.4968f)
                horizontalLineTo(4.25f)
                curveTo(3.0074f, 19.4968f, 2.0f, 18.4895f, 2.0f, 17.2468f)
                verticalLineTo(4.25f)
                curveTo(2.0f, 3.0074f, 3.0074f, 2.0f, 4.25f, 2.0f)
                horizontalLineTo(17.2468f)
                close()
                moveTo(17.2468f, 3.5f)
                horizontalLineTo(4.25f)
                curveTo(3.8358f, 3.5f, 3.5f, 3.8358f, 3.5f, 4.25f)
                verticalLineTo(17.2468f)
                curveTo(3.5f, 17.661f, 3.8358f, 17.9968f, 4.25f, 17.9968f)
                horizontalLineTo(17.2468f)
                curveTo(17.661f, 17.9968f, 17.9968f, 17.661f, 17.9968f, 17.2468f)
                verticalLineTo(4.25f)
                curveTo(17.9968f, 3.8358f, 17.661f, 3.5f, 17.2468f, 3.5f)
                close()
            }
        }
        .build()
        return _selectAllOff!!
    }

private var _selectAllOff: ImageVector? = null
