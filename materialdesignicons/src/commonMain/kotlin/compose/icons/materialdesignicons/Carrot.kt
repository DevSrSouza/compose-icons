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

public val MaterialDesignIcons.Carrot: ImageVector
    get() {
        if (_carrot != null) {
            return _carrot!!
        }
        _carrot = Builder(name = "Carrot", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 10.0f)
                lineTo(15.8f, 11.0f)
                horizontalLineTo(13.5f)
                arcTo(0.5f, 0.5f, 0.0f, false, false, 13.0f, 11.5f)
                arcTo(0.5f, 0.5f, 0.0f, false, false, 13.5f, 12.0f)
                horizontalLineTo(15.6f)
                lineTo(14.6f, 17.0f)
                horizontalLineTo(12.5f)
                arcTo(0.5f, 0.5f, 0.0f, false, false, 12.0f, 17.5f)
                arcTo(0.5f, 0.5f, 0.0f, false, false, 12.5f, 18.0f)
                horizontalLineTo(14.4f)
                lineTo(14.0f, 20.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 12.0f, 22.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 10.0f, 20.0f)
                lineTo(9.0f, 15.0f)
                horizontalLineTo(10.5f)
                arcTo(0.5f, 0.5f, 0.0f, false, false, 11.0f, 14.5f)
                arcTo(0.5f, 0.5f, 0.0f, false, false, 10.5f, 14.0f)
                horizontalLineTo(8.8f)
                lineTo(8.0f, 10.0f)
                curveTo(8.0f, 8.8f, 8.93f, 7.77f, 10.29f, 7.29f)
                lineTo(8.9f, 5.28f)
                curveTo(8.59f, 4.82f, 8.7f, 4.2f, 9.16f, 3.89f)
                curveTo(9.61f, 3.57f, 10.23f, 3.69f, 10.55f, 4.14f)
                lineTo(11.0f, 4.8f)
                verticalLineTo(3.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 12.0f, 2.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 13.0f, 3.0f)
                verticalLineTo(5.28f)
                lineTo(14.5f, 3.54f)
                curveTo(14.83f, 3.12f, 15.47f, 3.07f, 15.89f, 3.43f)
                curveTo(16.31f, 3.78f, 16.36f, 4.41f, 16.0f, 4.84f)
                lineTo(13.87f, 7.35f)
                curveTo(15.14f, 7.85f, 16.0f, 8.85f, 16.0f, 10.0f)
                close()
            }
        }
        .build()
        return _carrot!!
    }

private var _carrot: ImageVector? = null
