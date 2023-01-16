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

public val MaterialDesignIcons.ImageSearchOutline: ImageVector
    get() {
        if (_imageSearchOutline != null) {
            return _imageSearchOutline!!
        }
        _imageSearchOutline = Builder(name = "ImageSearchOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.5f, 9.0f)
                curveTo(16.2f, 9.0f, 16.79f, 8.76f, 17.27f, 8.27f)
                curveTo(17.76f, 7.79f, 18.0f, 7.2f, 18.0f, 6.5f)
                curveTo(18.0f, 5.83f, 17.76f, 5.23f, 17.27f, 4.73f)
                curveTo(16.79f, 4.23f, 16.2f, 4.0f, 15.5f, 4.0f)
                curveTo(14.83f, 4.0f, 14.23f, 4.23f, 13.73f, 4.73f)
                curveTo(13.23f, 5.23f, 13.0f, 5.83f, 13.0f, 6.5f)
                curveTo(13.0f, 7.2f, 13.23f, 7.79f, 13.73f, 8.27f)
                curveTo(14.23f, 8.76f, 14.83f, 9.0f, 15.5f, 9.0f)
                moveTo(19.31f, 8.91f)
                lineTo(22.41f, 12.0f)
                lineTo(21.0f, 13.41f)
                lineTo(17.86f, 10.31f)
                curveTo(17.08f, 10.78f, 16.28f, 11.0f, 15.47f, 11.0f)
                curveTo(14.22f, 11.0f, 13.16f, 10.58f, 12.3f, 9.7f)
                curveTo(11.45f, 8.83f, 11.0f, 7.77f, 11.0f, 6.5f)
                curveTo(11.0f, 5.27f, 11.45f, 4.2f, 12.33f, 3.33f)
                curveTo(13.2f, 2.45f, 14.27f, 2.0f, 15.5f, 2.0f)
                curveTo(16.77f, 2.0f, 17.83f, 2.45f, 18.7f, 3.33f)
                curveTo(19.58f, 4.2f, 20.0f, 5.27f, 20.0f, 6.5f)
                curveTo(20.0f, 7.33f, 19.78f, 8.13f, 19.31f, 8.91f)
                moveTo(16.5f, 18.0f)
                horizontalLineTo(5.5f)
                lineTo(8.25f, 14.5f)
                lineTo(10.22f, 16.83f)
                lineTo(12.94f, 13.31f)
                lineTo(16.5f, 18.0f)
                moveTo(18.0f, 13.0f)
                lineTo(20.0f, 15.0f)
                verticalLineTo(20.0f)
                curveTo(20.0f, 20.55f, 19.81f, 21.0f, 19.41f, 21.4f)
                curveTo(19.0f, 21.79f, 18.53f, 22.0f, 18.0f, 22.0f)
                horizontalLineTo(4.0f)
                curveTo(3.45f, 22.0f, 3.0f, 21.79f, 2.6f, 21.4f)
                curveTo(2.21f, 21.0f, 2.0f, 20.55f, 2.0f, 20.0f)
                verticalLineTo(6.0f)
                curveTo(2.0f, 5.47f, 2.21f, 5.0f, 2.6f, 4.59f)
                curveTo(3.0f, 4.19f, 3.45f, 4.0f, 4.0f, 4.0f)
                horizontalLineTo(9.5f)
                curveTo(9.2f, 4.64f, 9.03f, 5.31f, 9.0f, 6.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(13.0f)
                close()
            }
        }
        .build()
        return _imageSearchOutline!!
    }

private var _imageSearchOutline: ImageVector? = null
