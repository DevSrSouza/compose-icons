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

public val MaterialDesignIcons.Dishwasher: ImageVector
    get() {
        if (_dishwasher != null) {
            return _dishwasher!!
        }
        _dishwasher = Builder(name = "Dishwasher", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 2.0f)
                horizontalLineTo(6.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 4.0f, 4.0f)
                verticalLineTo(20.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 6.0f, 22.0f)
                horizontalLineTo(18.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 20.0f, 20.0f)
                verticalLineTo(4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 18.0f, 2.0f)
                moveTo(10.0f, 4.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 11.0f, 5.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 10.0f, 6.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 9.0f, 5.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 10.0f, 4.0f)
                moveTo(7.0f, 4.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 8.0f, 5.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 7.0f, 6.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 6.0f, 5.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 7.0f, 4.0f)
                moveTo(18.0f, 20.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(20.0f)
                moveTo(14.67f, 15.33f)
                curveTo(14.69f, 16.03f, 14.41f, 16.71f, 13.91f, 17.21f)
                curveTo(12.86f, 18.26f, 11.15f, 18.27f, 10.09f, 17.21f)
                curveTo(9.59f, 16.71f, 9.31f, 16.03f, 9.33f, 15.33f)
                curveTo(9.4f, 14.62f, 9.63f, 13.94f, 10.0f, 13.33f)
                curveTo(10.37f, 12.5f, 10.81f, 11.73f, 11.33f, 11.0f)
                lineTo(12.0f, 10.0f)
                curveTo(13.79f, 12.59f, 14.67f, 14.36f, 14.67f, 15.33f)
            }
        }
        .build()
        return _dishwasher!!
    }

private var _dishwasher: ImageVector? = null
