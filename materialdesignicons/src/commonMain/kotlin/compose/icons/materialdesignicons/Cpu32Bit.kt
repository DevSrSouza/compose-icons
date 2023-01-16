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

public val MaterialDesignIcons.Cpu32Bit: ImageVector
    get() {
        if (_cpu32Bit != null) {
            return _cpu32Bit!!
        }
        _cpu32Bit = Builder(name = "Cpu32Bit", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 3.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(7.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 5.0f, 7.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(17.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 7.0f, 19.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(17.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 19.0f, 17.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(7.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 17.0f, 5.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(3.0f)
                moveTo(7.0f, 9.0f)
                horizontalLineTo(10.5f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 11.5f, 10.0f)
                verticalLineTo(14.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 10.5f, 15.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(13.5f)
                horizontalLineTo(10.0f)
                verticalLineTo(12.75f)
                horizontalLineTo(8.5f)
                verticalLineTo(11.25f)
                horizontalLineTo(10.0f)
                verticalLineTo(10.5f)
                horizontalLineTo(7.0f)
                moveTo(12.5f, 9.0f)
                horizontalLineTo(16.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 17.0f, 10.0f)
                verticalLineTo(11.75f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 16.0f, 12.75f)
                horizontalLineTo(14.0f)
                verticalLineTo(13.5f)
                horizontalLineTo(17.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(12.5f)
                verticalLineTo(12.25f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 13.5f, 11.25f)
                horizontalLineTo(15.5f)
                verticalLineTo(10.5f)
                horizontalLineTo(12.5f)
            }
        }
        .build()
        return _cpu32Bit!!
    }

private var _cpu32Bit: ImageVector? = null
