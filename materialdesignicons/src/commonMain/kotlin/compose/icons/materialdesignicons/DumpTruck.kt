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

public val MaterialDesignIcons.DumpTruck: ImageVector
    get() {
        if (_dumpTruck != null) {
            return _dumpTruck!!
        }
        _dumpTruck = Builder(name = "DumpTruck", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 8.0f)
                horizontalLineTo(19.0f)
                lineTo(17.0f, 8.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(3.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 6.0f, 20.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 9.0f, 17.0f)
                horizontalLineTo(15.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 18.0f, 20.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 21.0f, 17.0f)
                horizontalLineTo(23.0f)
                verticalLineTo(12.0f)
                lineTo(20.0f, 8.0f)
                moveTo(6.0f, 18.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 4.5f, 17.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 6.0f, 15.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 7.5f, 17.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 6.0f, 18.5f)
                moveTo(18.0f, 18.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 16.5f, 17.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 18.0f, 15.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 19.5f, 17.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 18.0f, 18.5f)
                moveTo(17.0f, 12.0f)
                verticalLineTo(9.5f)
                horizontalLineTo(19.5f)
                lineTo(21.46f, 12.0f)
                horizontalLineTo(17.0f)
                moveTo(18.0f, 7.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(3.0f)
                lineTo(1.57f, 8.0f)
                horizontalLineTo(1.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(13.0f)
                lineTo(14.0f, 5.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(7.0f)
                close()
            }
        }
        .build()
        return _dumpTruck!!
    }

private var _dumpTruck: ImageVector? = null
