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

public val MaterialDesignIcons.Bike: ImageVector
    get() {
        if (_bike != null) {
            return _bike!!
        }
        _bike = Builder(name = "Bike", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 20.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 1.5f, 17.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 5.0f, 13.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 8.5f, 17.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 5.0f, 20.5f)
                moveTo(5.0f, 12.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 0.0f, 17.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 5.0f, 22.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 10.0f, 17.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 5.0f, 12.0f)
                moveTo(14.8f, 10.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(8.2f)
                horizontalLineTo(15.8f)
                lineTo(13.86f, 4.93f)
                curveTo(13.57f, 4.43f, 13.0f, 4.1f, 12.4f, 4.1f)
                curveTo(11.93f, 4.1f, 11.5f, 4.29f, 11.2f, 4.6f)
                lineTo(7.5f, 8.29f)
                curveTo(7.19f, 8.6f, 7.0f, 9.0f, 7.0f, 9.5f)
                curveTo(7.0f, 10.13f, 7.33f, 10.66f, 7.85f, 10.97f)
                lineTo(11.2f, 13.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(11.5f)
                lineTo(10.75f, 9.85f)
                lineTo(13.07f, 7.5f)
                moveTo(19.0f, 20.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 15.5f, 17.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 19.0f, 13.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 22.5f, 17.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, true, 19.0f, 20.5f)
                moveTo(19.0f, 12.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 14.0f, 17.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 19.0f, 22.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 24.0f, 17.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, false, 19.0f, 12.0f)
                moveTo(16.0f, 4.8f)
                curveTo(17.0f, 4.8f, 17.8f, 4.0f, 17.8f, 3.0f)
                curveTo(17.8f, 2.0f, 17.0f, 1.2f, 16.0f, 1.2f)
                curveTo(15.0f, 1.2f, 14.2f, 2.0f, 14.2f, 3.0f)
                curveTo(14.2f, 4.0f, 15.0f, 4.8f, 16.0f, 4.8f)
                close()
            }
        }
        .build()
        return _bike!!
    }

private var _bike: ImageVector? = null
