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

public val MaterialDesignIcons.ImageAutoAdjust: ImageVector
    get() {
        if (_imageAutoAdjust != null) {
            return _imageAutoAdjust!!
        }
        _imageAutoAdjust = Builder(name = "ImageAutoAdjust", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 10.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(5.0f)
                curveTo(3.92f, 3.0f, 3.0f, 3.9f, 3.0f, 5.0f)
                verticalLineTo(19.0f)
                curveTo(3.0f, 20.1f, 3.92f, 21.0f, 5.0f, 21.0f)
                horizontalLineTo(19.0f)
                curveTo(20.12f, 21.0f, 21.0f, 20.1f, 21.0f, 19.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(19.0f)
                moveTo(17.0f, 10.0f)
                lineTo(17.94f, 7.94f)
                lineTo(20.0f, 7.0f)
                lineTo(17.94f, 6.06f)
                lineTo(17.0f, 4.0f)
                lineTo(16.06f, 6.06f)
                lineTo(14.0f, 7.0f)
                lineTo(16.06f, 7.94f)
                lineTo(17.0f, 10.0f)
                moveTo(13.25f, 10.75f)
                lineTo(12.0f, 8.0f)
                lineTo(10.75f, 10.75f)
                lineTo(8.0f, 12.0f)
                lineTo(10.75f, 13.25f)
                lineTo(12.0f, 16.0f)
                lineTo(13.25f, 13.25f)
                lineTo(16.0f, 12.0f)
                lineTo(13.25f, 10.75f)
                close()
            }
        }
        .build()
        return _imageAutoAdjust!!
    }

private var _imageAutoAdjust: ImageVector? = null
