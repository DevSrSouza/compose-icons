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

public val MaterialDesignIcons.ImageRemove: ImageVector
    get() {
        if (_imageRemove != null) {
            return _imageRemove!!
        }
        _imageRemove = Builder(name = "ImageRemove", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 3.0f)
                curveTo(3.9f, 3.0f, 3.0f, 3.9f, 3.0f, 5.0f)
                verticalLineTo(19.0f)
                curveTo(3.0f, 20.11f, 3.9f, 21.0f, 5.0f, 21.0f)
                horizontalLineTo(14.09f)
                curveTo(14.03f, 20.67f, 14.0f, 20.34f, 14.0f, 20.0f)
                curveTo(14.0f, 19.32f, 14.12f, 18.64f, 14.35f, 18.0f)
                horizontalLineTo(5.0f)
                lineTo(8.5f, 13.5f)
                lineTo(11.0f, 16.5f)
                lineTo(14.5f, 12.0f)
                lineTo(16.73f, 14.97f)
                curveTo(17.7f, 14.34f, 18.84f, 14.0f, 20.0f, 14.0f)
                curveTo(20.34f, 14.0f, 20.67f, 14.03f, 21.0f, 14.09f)
                verticalLineTo(5.0f)
                curveTo(21.0f, 3.89f, 20.1f, 3.0f, 19.0f, 3.0f)
                horizontalLineTo(5.0f)
                moveTo(16.47f, 17.88f)
                lineTo(18.59f, 20.0f)
                lineTo(16.47f, 22.12f)
                lineTo(17.88f, 23.54f)
                lineTo(20.0f, 21.41f)
                lineTo(22.12f, 23.54f)
                lineTo(23.54f, 22.12f)
                lineTo(21.41f, 20.0f)
                lineTo(23.54f, 17.88f)
                lineTo(22.12f, 16.46f)
                lineTo(20.0f, 18.59f)
                lineTo(17.88f, 16.47f)
                lineTo(16.46f, 17.88f)
                close()
            }
        }
        .build()
        return _imageRemove!!
    }

private var _imageRemove: ImageVector? = null
