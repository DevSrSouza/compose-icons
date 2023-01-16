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

public val MaterialDesignIcons.CarInfo: ImageVector
    get() {
        if (_carInfo != null) {
            return _carInfo!!
        }
        _carInfo = Builder(name = "CarInfo", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 15.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(19.0f)
                moveTo(20.0f, 20.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(20.0f)
                moveTo(18.92f, 5.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 17.5f, 4.0f)
                horizontalLineTo(6.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 5.08f, 5.0f)
                lineTo(3.0f, 11.0f)
                verticalLineTo(19.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 4.0f, 20.0f)
                horizontalLineTo(5.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 6.0f, 19.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(11.0f)
                arcTo(7.0f, 7.0f, 0.0f, false, true, 18.0f, 11.0f)
                arcTo(6.84f, 6.84f, 0.0f, false, true, 21.0f, 11.68f)
                verticalLineTo(11.0f)
                moveTo(6.5f, 15.0f)
                arcTo(1.5f, 1.5f, 0.0f, true, true, 8.0f, 13.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 6.5f, 15.0f)
                moveTo(5.0f, 10.0f)
                lineTo(6.5f, 5.5f)
                horizontalLineTo(17.5f)
                lineTo(19.0f, 10.0f)
                close()
            }
        }
        .build()
        return _carInfo!!
    }

private var _carInfo: ImageVector? = null
