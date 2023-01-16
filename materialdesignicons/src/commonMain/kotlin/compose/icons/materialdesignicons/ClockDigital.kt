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

public val MaterialDesignIcons.ClockDigital: ImageVector
    get() {
        if (_clockDigital != null) {
            return _clockDigital!!
        }
        _clockDigital = Builder(name = "ClockDigital", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 6.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 0.0f, 8.0f)
                verticalLineTo(16.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 2.0f, 18.0f)
                horizontalLineTo(22.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 24.0f, 16.0f)
                verticalLineTo(8.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 22.0f, 6.0f)
                moveTo(2.0f, 8.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(2.0f)
                moveTo(3.0f, 9.0f)
                verticalLineTo(10.5f)
                horizontalLineTo(6.25f)
                lineTo(3.0f, 15.0f)
                horizontalLineTo(4.75f)
                lineTo(8.0f, 10.5f)
                verticalLineTo(9.0f)
                moveTo(9.25f, 9.0f)
                verticalLineTo(10.5f)
                horizontalLineTo(10.75f)
                verticalLineTo(9.0f)
                moveTo(12.0f, 9.0f)
                verticalLineTo(10.5f)
                horizontalLineTo(13.5f)
                verticalLineTo(15.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(9.0f)
                moveTo(17.0f, 9.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 16.0f, 10.0f)
                verticalLineTo(14.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 17.0f, 15.0f)
                horizontalLineTo(20.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 21.0f, 14.0f)
                verticalLineTo(10.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 20.0f, 9.0f)
                moveTo(17.5f, 10.5f)
                horizontalLineTo(19.5f)
                verticalLineTo(13.5f)
                horizontalLineTo(17.5f)
                moveTo(9.25f, 13.5f)
                verticalLineTo(15.0f)
                horizontalLineTo(10.75f)
                verticalLineTo(13.5f)
            }
        }
        .build()
        return _clockDigital!!
    }

private var _clockDigital: ImageVector? = null
