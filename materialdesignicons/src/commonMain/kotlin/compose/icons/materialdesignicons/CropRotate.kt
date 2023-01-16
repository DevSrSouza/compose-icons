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

public val MaterialDesignIcons.CropRotate: ImageVector
    get() {
        if (_cropRotate != null) {
            return _cropRotate!!
        }
        _cropRotate = Builder(name = "CropRotate", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.47f, 21.5f)
                curveTo(4.2f, 19.93f, 1.86f, 16.76f, 1.5f, 13.0f)
                horizontalLineTo(0.0f)
                curveTo(0.5f, 19.16f, 5.66f, 24.0f, 11.95f, 24.0f)
                curveTo(12.18f, 24.0f, 12.39f, 24.0f, 12.61f, 23.97f)
                lineTo(8.8f, 20.15f)
                lineTo(7.47f, 21.5f)
                moveTo(12.05f, 0.0f)
                curveTo(11.82f, 0.0f, 11.61f, 0.0f, 11.39f, 0.04f)
                lineTo(15.2f, 3.85f)
                lineTo(16.53f, 2.5f)
                curveTo(19.8f, 4.07f, 22.14f, 7.24f, 22.5f, 11.0f)
                horizontalLineTo(24.0f)
                curveTo(23.5f, 4.84f, 18.34f, 0.0f, 12.05f, 0.0f)
                moveTo(16.0f, 14.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(8.0f)
                curveTo(18.0f, 6.89f, 17.1f, 6.0f, 16.0f, 6.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(14.0f)
                moveTo(8.0f, 16.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(16.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 8.0f, 18.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(8.0f)
                close()
            }
        }
        .build()
        return _cropRotate!!
    }

private var _cropRotate: ImageVector? = null
