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

public val MaterialDesignIcons.ImagePlus: ImageVector
    get() {
        if (_imagePlus != null) {
            return _imagePlus!!
        }
        _imagePlus = Builder(name = "ImagePlus", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 15.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(23.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(23.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(18.0f)
                moveTo(13.3f, 21.0f)
                horizontalLineTo(5.0f)
                curveTo(3.9f, 21.0f, 3.0f, 20.1f, 3.0f, 19.0f)
                verticalLineTo(5.0f)
                curveTo(3.0f, 3.9f, 3.9f, 3.0f, 5.0f, 3.0f)
                horizontalLineTo(19.0f)
                curveTo(20.1f, 3.0f, 21.0f, 3.9f, 21.0f, 5.0f)
                verticalLineTo(13.3f)
                curveTo(20.4f, 13.1f, 19.7f, 13.0f, 19.0f, 13.0f)
                curveTo(17.9f, 13.0f, 16.8f, 13.3f, 15.9f, 13.9f)
                lineTo(14.5f, 12.0f)
                lineTo(11.0f, 16.5f)
                lineTo(8.5f, 13.5f)
                lineTo(5.0f, 18.0f)
                horizontalLineTo(13.1f)
                curveTo(13.0f, 18.3f, 13.0f, 18.7f, 13.0f, 19.0f)
                curveTo(13.0f, 19.7f, 13.1f, 20.4f, 13.3f, 21.0f)
                close()
            }
        }
        .build()
        return _imagePlus!!
    }

private var _imagePlus: ImageVector? = null
