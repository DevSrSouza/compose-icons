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

public val MaterialDesignIcons.CarMultiple: ImageVector
    get() {
        if (_carMultiple != null) {
            return _carMultiple!!
        }
        _carMultiple = Builder(name = "CarMultiple", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 11.0f)
                lineTo(9.5f, 6.5f)
                horizontalLineTo(18.5f)
                lineTo(20.0f, 11.0f)
                moveTo(18.5f, 16.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 17.0f, 14.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 18.5f, 13.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 20.0f, 14.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 18.5f, 16.0f)
                moveTo(9.5f, 16.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 8.0f, 14.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 9.5f, 13.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 11.0f, 14.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 9.5f, 16.0f)
                moveTo(19.92f, 6.0f)
                curveTo(19.71f, 5.4f, 19.14f, 5.0f, 18.5f, 5.0f)
                horizontalLineTo(9.5f)
                curveTo(8.86f, 5.0f, 8.29f, 5.4f, 8.08f, 6.0f)
                lineTo(6.0f, 12.0f)
                verticalLineTo(20.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 7.0f, 21.0f)
                horizontalLineTo(8.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 9.0f, 20.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(20.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 20.0f, 21.0f)
                horizontalLineTo(21.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 22.0f, 20.0f)
                verticalLineTo(12.0f)
                lineTo(19.92f, 6.0f)
                moveTo(14.92f, 3.0f)
                curveTo(14.71f, 2.4f, 14.14f, 2.0f, 13.5f, 2.0f)
                horizontalLineTo(4.5f)
                curveTo(3.86f, 2.0f, 3.29f, 2.4f, 3.08f, 3.0f)
                lineTo(1.0f, 9.0f)
                verticalLineTo(17.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 2.0f, 18.0f)
                horizontalLineTo(3.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 4.0f, 17.0f)
                verticalLineTo(12.91f)
                curveTo(3.22f, 12.63f, 2.82f, 11.77f, 3.1f, 11.0f)
                curveTo(3.32f, 10.4f, 3.87f, 10.0f, 4.5f, 10.0f)
                horizontalLineTo(4.57f)
                lineTo(5.27f, 8.0f)
                horizontalLineTo(3.0f)
                lineTo(4.5f, 3.5f)
                horizontalLineTo(15.09f)
                lineTo(14.92f, 3.0f)
                close()
            }
        }
        .build()
        return _carMultiple!!
    }

private var _carMultiple: ImageVector? = null
