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

public val MaterialDesignIcons.ImageSizeSelectActual: ImageVector
    get() {
        if (_imageSizeSelectActual != null) {
            return _imageSizeSelectActual!!
        }
        _imageSizeSelectActual = Builder(name = "ImageSizeSelectActual", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 3.0f)
                horizontalLineTo(3.0f)
                curveTo(2.0f, 3.0f, 1.0f, 4.0f, 1.0f, 5.0f)
                verticalLineTo(19.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 3.0f, 21.0f)
                horizontalLineTo(21.0f)
                curveTo(22.0f, 21.0f, 23.0f, 20.0f, 23.0f, 19.0f)
                verticalLineTo(5.0f)
                curveTo(23.0f, 4.0f, 22.0f, 3.0f, 21.0f, 3.0f)
                moveTo(5.0f, 17.0f)
                lineTo(8.5f, 12.5f)
                lineTo(11.0f, 15.5f)
                lineTo(14.5f, 11.0f)
                lineTo(19.0f, 17.0f)
                horizontalLineTo(5.0f)
                close()
            }
        }
        .build()
        return _imageSizeSelectActual!!
    }

private var _imageSizeSelectActual: ImageVector? = null
