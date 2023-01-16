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

public val MaterialDesignIcons.Amplifier: ImageVector
    get() {
        if (_amplifier != null) {
            return _amplifier!!
        }
        _amplifier = Builder(name = "Amplifier", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 2.0f)
                horizontalLineTo(14.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 15.0f, 3.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(19.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 18.0f, 22.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 17.0f, 21.0f)
                horizontalLineTo(7.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 6.0f, 22.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 5.0f, 21.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(9.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 10.0f, 2.0f)
                moveTo(5.0f, 5.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(5.0f)
                moveTo(7.0f, 6.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 8.0f, 7.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 7.0f, 8.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 6.0f, 7.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 7.0f, 6.0f)
                moveTo(12.0f, 6.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(6.0f)
                moveTo(15.0f, 6.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(6.0f)
                moveTo(17.0f, 6.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(6.0f)
                moveTo(12.0f, 11.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 8.0f, 15.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 12.0f, 19.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 16.0f, 15.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 12.0f, 11.0f)
                moveTo(10.0f, 6.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 11.0f, 7.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 10.0f, 8.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 9.0f, 7.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 10.0f, 6.0f)
                close()
            }
        }
        .build()
        return _amplifier!!
    }

private var _amplifier: ImageVector? = null
