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

public val MaterialDesignIcons.ImageArea: ImageVector
    get() {
        if (_imageArea != null) {
            return _imageArea!!
        }
        _imageArea = Builder(name = "ImageArea", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 5.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 22.0f, 7.0f)
                verticalLineTo(17.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 20.0f, 19.0f)
                horizontalLineTo(4.0f)
                curveTo(2.89f, 19.0f, 2.0f, 18.1f, 2.0f, 17.0f)
                verticalLineTo(7.0f)
                curveTo(2.0f, 5.89f, 2.89f, 5.0f, 4.0f, 5.0f)
                horizontalLineTo(20.0f)
                moveTo(5.0f, 16.0f)
                horizontalLineTo(19.0f)
                lineTo(14.5f, 10.0f)
                lineTo(11.0f, 14.5f)
                lineTo(8.5f, 11.5f)
                lineTo(5.0f, 16.0f)
                close()
            }
        }
        .build()
        return _imageArea!!
    }

private var _imageArea: ImageVector? = null
