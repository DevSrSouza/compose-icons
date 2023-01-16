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

public val MaterialDesignIcons.CarOff: ImageVector
    get() {
        if (_carOff != null) {
            return _carOff!!
        }
        _carOff = Builder(name = "CarOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.5f, 19.85f)
                lineTo(6.41f, 5.76f)
                lineTo(2.41f, 1.76f)
                lineTo(1.11f, 3.0f)
                lineTo(4.57f, 6.46f)
                lineTo(3.0f, 11.0f)
                verticalLineTo(19.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 4.0f, 20.0f)
                horizontalLineTo(5.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 6.0f, 19.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(16.11f)
                lineTo(20.84f, 22.73f)
                lineTo(22.11f, 21.46f)
                lineTo(20.5f, 19.85f)
                moveTo(6.5f, 15.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 5.0f, 13.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 6.5f, 12.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 8.0f, 13.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 6.5f, 15.0f)
                moveTo(5.0f, 10.0f)
                lineTo(5.78f, 7.67f)
                lineTo(8.11f, 10.0f)
                horizontalLineTo(5.0f)
                moveTo(17.5f, 5.5f)
                lineTo(19.0f, 10.0f)
                horizontalLineTo(13.2f)
                lineTo(16.12f, 12.92f)
                curveTo(16.5f, 12.17f, 17.37f, 11.86f, 18.12f, 12.21f)
                curveTo(18.87f, 12.57f, 19.18f, 13.47f, 18.83f, 14.21f)
                curveTo(18.68f, 14.5f, 18.43f, 14.77f, 18.12f, 14.92f)
                lineTo(21.0f, 17.8f)
                verticalLineTo(11.0f)
                lineTo(18.92f, 5.0f)
                curveTo(18.71f, 4.4f, 18.14f, 4.0f, 17.5f, 4.0f)
                horizontalLineTo(7.2f)
                lineTo(8.7f, 5.5f)
                horizontalLineTo(17.5f)
                close()
            }
        }
        .build()
        return _carOff!!
    }

private var _carOff: ImageVector? = null
