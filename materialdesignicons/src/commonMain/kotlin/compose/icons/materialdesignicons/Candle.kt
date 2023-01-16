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

public val MaterialDesignIcons.Candle: ImageVector
    get() {
        if (_candle != null) {
            return _candle!!
        }
        _candle = Builder(name = "Candle", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.5f, 2.0f)
                curveTo(10.84f, 2.0f, 9.5f, 5.34f, 9.5f, 7.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 12.5f, 10.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 15.5f, 7.0f)
                curveTo(15.5f, 5.34f, 14.16f, 2.0f, 12.5f, 2.0f)
                moveTo(12.5f, 6.5f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 13.5f, 7.5f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 12.5f, 8.5f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 11.5f, 7.5f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 12.5f, 6.5f)
                moveTo(10.0f, 11.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 9.0f, 12.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(7.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 6.0f, 19.0f)
                verticalLineTo(18.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 5.0f, 17.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 4.0f, 18.0f)
                verticalLineTo(19.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 7.0f, 22.0f)
                horizontalLineTo(19.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 20.0f, 21.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 19.0f, 20.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(12.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 15.0f, 11.0f)
                horizontalLineTo(10.0f)
                close()
            }
        }
        .build()
        return _candle!!
    }

private var _candle: ImageVector? = null
