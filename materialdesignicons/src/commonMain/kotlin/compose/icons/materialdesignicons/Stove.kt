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

public val MaterialDesignIcons.Stove: ImageVector
    get() {
        if (_stove != null) {
            return _stove!!
        }
        _stove = Builder(name = "Stove", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 14.0f)
                horizontalLineTo(8.0f)
                lineTo(11.0f, 17.0f)
                horizontalLineTo(9.0f)
                lineTo(6.0f, 14.0f)
                moveTo(4.0f, 4.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(3.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 6.0f, 2.0f)
                horizontalLineTo(10.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 11.0f, 3.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(3.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 14.0f, 2.0f)
                horizontalLineTo(18.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 19.0f, 3.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(20.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 22.0f, 6.0f)
                verticalLineTo(19.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 20.0f, 21.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(21.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 2.0f, 19.0f)
                verticalLineTo(6.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 4.0f, 4.0f)
                moveTo(18.0f, 7.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 19.0f, 8.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 18.0f, 9.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 17.0f, 8.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 18.0f, 7.0f)
                moveTo(14.0f, 7.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 15.0f, 8.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 14.0f, 9.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 13.0f, 8.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 14.0f, 7.0f)
                moveTo(20.0f, 6.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(6.0f)
                moveTo(4.0f, 19.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(19.0f)
                moveTo(6.0f, 7.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 7.0f, 8.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 6.0f, 9.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 5.0f, 8.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 6.0f, 7.0f)
                moveTo(13.0f, 14.0f)
                horizontalLineTo(15.0f)
                lineTo(18.0f, 17.0f)
                horizontalLineTo(16.0f)
                lineTo(13.0f, 14.0f)
                close()
            }
        }
        .build()
        return _stove!!
    }

private var _stove: ImageVector? = null
