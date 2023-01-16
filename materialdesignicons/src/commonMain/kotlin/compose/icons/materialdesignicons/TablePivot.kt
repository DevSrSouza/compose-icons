package compose.icons.materialdesignicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.MaterialDesignIcons

public val MaterialDesignIcons.TablePivot: ImageVector
    get() {
        if (_tablePivot != null) {
            return _tablePivot!!
        }
        _tablePivot = Builder(name = "TablePivot", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 15.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(18.0f)
                curveTo(20.0f, 19.11f, 19.11f, 20.0f, 18.0f, 20.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(22.0f)
                lineTo(12.0f, 19.0f)
                lineTo(15.0f, 16.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(16.0f)
                lineTo(19.0f, 12.0f)
                lineTo(22.0f, 15.0f)
                moveTo(22.0f, 4.0f)
                verticalLineTo(8.0f)
                curveTo(22.0f, 9.1f, 21.1f, 10.0f, 20.0f, 10.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(20.0f)
                curveTo(10.0f, 21.1f, 9.1f, 22.0f, 8.0f, 22.0f)
                horizontalLineTo(4.0f)
                curveTo(2.9f, 22.0f, 2.0f, 21.1f, 2.0f, 20.0f)
                verticalLineTo(4.0f)
                curveTo(2.0f, 2.9f, 2.9f, 2.0f, 4.0f, 2.0f)
                horizontalLineTo(20.0f)
                curveTo(21.1f, 2.0f, 22.0f, 2.9f, 22.0f, 4.0f)
                moveTo(4.0f, 8.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(8.0f)
                moveTo(4.0f, 10.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(4.0f)
                moveTo(8.0f, 20.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(20.0f)
                lineTo(8.0f, 20.0f)
                moveTo(14.0f, 8.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(14.0f)
                moveTo(20.0f, 4.0f)
                lineTo(20.0f, 4.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(20.0f)
                lineTo(20.0f, 4.0f)
                close()
            }
        }
        .build()
        return _tablePivot!!
    }

private var _tablePivot: ImageVector? = null
