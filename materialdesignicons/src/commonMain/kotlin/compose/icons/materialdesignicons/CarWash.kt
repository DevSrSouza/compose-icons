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

public val MaterialDesignIcons.CarWash: ImageVector
    get() {
        if (_carWash != null) {
            return _carWash!!
        }
        _carWash = Builder(name = "CarWash", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 13.0f)
                lineTo(6.5f, 8.5f)
                horizontalLineTo(17.5f)
                lineTo(19.0f, 13.0f)
                moveTo(17.5f, 18.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 16.0f, 16.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 17.5f, 15.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 19.0f, 16.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 17.5f, 18.0f)
                moveTo(6.5f, 18.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 5.0f, 16.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 6.5f, 15.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 8.0f, 16.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 6.5f, 18.0f)
                moveTo(18.92f, 8.0f)
                curveTo(18.72f, 7.42f, 18.16f, 7.0f, 17.5f, 7.0f)
                horizontalLineTo(6.5f)
                curveTo(5.84f, 7.0f, 5.28f, 7.42f, 5.08f, 8.0f)
                lineTo(3.0f, 14.0f)
                verticalLineTo(22.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 4.0f, 23.0f)
                horizontalLineTo(5.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 6.0f, 22.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(22.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 19.0f, 23.0f)
                horizontalLineTo(20.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 21.0f, 22.0f)
                verticalLineTo(14.0f)
                moveTo(7.0f, 5.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 8.5f, 3.5f)
                curveTo(8.5f, 2.5f, 7.0f, 0.8f, 7.0f, 0.8f)
                curveTo(7.0f, 0.8f, 5.5f, 2.5f, 5.5f, 3.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 7.0f, 5.0f)
                moveTo(12.0f, 5.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 13.5f, 3.5f)
                curveTo(13.5f, 2.5f, 12.0f, 0.8f, 12.0f, 0.8f)
                curveTo(12.0f, 0.8f, 10.5f, 2.5f, 10.5f, 3.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 12.0f, 5.0f)
                moveTo(17.0f, 5.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 18.5f, 3.5f)
                curveTo(18.5f, 2.5f, 17.0f, 0.8f, 17.0f, 0.8f)
                curveTo(17.0f, 0.8f, 15.5f, 2.5f, 15.5f, 3.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 17.0f, 5.0f)
                close()
            }
        }
        .build()
        return _carWash!!
    }

private var _carWash: ImageVector? = null
