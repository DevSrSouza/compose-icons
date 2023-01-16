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

public val MaterialDesignIcons.ImageSizeSelectSmall: ImageVector
    get() {
        if (_imageSizeSelectSmall != null) {
            return _imageSizeSelectSmall!!
        }
        _imageSizeSelectSmall = Builder(name = "ImageSizeSelectSmall", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0f, 15.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(23.0f)
                verticalLineTo(15.0f)
                moveTo(23.0f, 11.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(23.0f)
                verticalLineTo(11.0f)
                moveTo(23.0f, 19.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(21.0f)
                curveTo(22.0f, 21.0f, 23.0f, 20.0f, 23.0f, 19.0f)
                moveTo(15.0f, 3.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(3.0f)
                moveTo(23.0f, 7.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(23.0f)
                verticalLineTo(7.0f)
                moveTo(21.0f, 3.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(23.0f)
                curveTo(23.0f, 4.0f, 22.0f, 3.0f, 21.0f, 3.0f)
                moveTo(3.0f, 21.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(1.0f)
                verticalLineTo(19.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 3.0f, 21.0f)
                moveTo(3.0f, 7.0f)
                horizontalLineTo(1.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(7.0f)
                moveTo(15.0f, 19.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(19.0f)
                moveTo(19.0f, 3.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(3.0f)
                moveTo(19.0f, 19.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(19.0f)
                moveTo(3.0f, 3.0f)
                curveTo(2.0f, 3.0f, 1.0f, 4.0f, 1.0f, 5.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(3.0f)
                moveTo(3.0f, 11.0f)
                horizontalLineTo(1.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(11.0f)
                moveTo(11.0f, 3.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(3.0f)
                moveTo(7.0f, 3.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(3.0f)
                close()
            }
        }
        .build()
        return _imageSizeSelectSmall!!
    }

private var _imageSizeSelectSmall: ImageVector? = null
