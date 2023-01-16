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

public val MaterialDesignIcons.Spray: ImageVector
    get() {
        if (_spray != null) {
            return _spray!!
        }
        _spray = Builder(name = "Spray", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 4.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(4.0f)
                moveTo(7.0f, 3.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(3.0f)
                moveTo(7.0f, 6.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(6.0f)
                moveTo(6.0f, 8.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(6.0f)
                moveTo(6.0f, 5.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(6.0f)
                moveTo(6.0f, 2.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(6.0f)
                moveTo(13.0f, 22.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 11.0f, 20.0f)
                verticalLineTo(10.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 13.0f, 8.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(8.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 20.0f, 10.0f)
                verticalLineTo(20.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 18.0f, 22.0f)
                horizontalLineTo(13.0f)
                moveTo(13.0f, 10.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(13.0f)
                close()
            }
        }
        .build()
        return _spray!!
    }

private var _spray: ImageVector? = null
