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

public val MaterialDesignIcons.BusSide: ImageVector
    get() {
        if (_busSide != null) {
            return _busSide!!
        }
        _busSide = Builder(name = "BusSide", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 6.0f)
                curveTo(1.89f, 6.0f, 1.0f, 6.89f, 1.0f, 8.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(3.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 6.0f, 18.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 9.0f, 15.0f)
                horizontalLineTo(15.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 18.0f, 18.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 21.0f, 15.0f)
                horizontalLineTo(23.0f)
                verticalLineTo(8.0f)
                curveTo(23.0f, 6.89f, 22.11f, 6.0f, 21.0f, 6.0f)
                horizontalLineTo(3.0f)
                moveTo(2.5f, 7.5f)
                horizontalLineTo(6.5f)
                verticalLineTo(10.0f)
                horizontalLineTo(2.5f)
                verticalLineTo(7.5f)
                moveTo(8.0f, 7.5f)
                horizontalLineTo(12.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(7.5f)
                moveTo(13.5f, 7.5f)
                horizontalLineTo(17.5f)
                verticalLineTo(10.0f)
                horizontalLineTo(13.5f)
                verticalLineTo(7.5f)
                moveTo(19.0f, 7.5f)
                horizontalLineTo(21.5f)
                verticalLineTo(13.0f)
                lineTo(19.0f, 11.0f)
                verticalLineTo(7.5f)
                moveTo(6.0f, 13.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 7.5f, 15.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 6.0f, 16.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 4.5f, 15.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 6.0f, 13.5f)
                moveTo(18.0f, 13.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 19.5f, 15.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 18.0f, 16.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 16.5f, 15.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 18.0f, 13.5f)
                close()
            }
        }
        .build()
        return _busSide!!
    }

private var _busSide: ImageVector? = null
