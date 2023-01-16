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

public val MaterialDesignIcons.ImageFrame: ImageVector
    get() {
        if (_imageFrame != null) {
            return _imageFrame!!
        }
        _imageFrame = Builder(name = "ImageFrame", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 14.29f)
                lineTo(6.5f, 19.0f)
                horizontalLineTo(17.46f)
                lineTo(14.75f, 15.46f)
                lineTo(12.78f, 17.8f)
                lineTo(10.0f, 14.29f)
                moveTo(5.0f, 21.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(18.96f)
                verticalLineTo(21.0f)
                horizontalLineTo(5.0f)
                moveTo(12.0f, 2.4f)
                lineTo(14.61f, 5.03f)
                horizontalLineTo(9.37f)
                lineTo(12.0f, 2.4f)
                moveTo(5.0f, 5.03f)
                curveTo(4.5f, 5.03f, 4.0f, 5.22f, 3.61f, 5.61f)
                curveTo(3.2f, 6.0f, 3.0f, 6.46f, 3.0f, 7.0f)
                verticalLineTo(21.0f)
                curveTo(3.0f, 21.5f, 3.2f, 22.0f, 3.61f, 22.39f)
                curveTo(4.0f, 22.8f, 4.5f, 23.0f, 5.0f, 23.0f)
                horizontalLineTo(18.96f)
                curveTo(19.5f, 23.0f, 19.96f, 22.8f, 20.37f, 22.39f)
                curveTo(20.77f, 22.0f, 21.0f, 21.5f, 21.0f, 21.0f)
                verticalLineTo(7.0f)
                curveTo(21.0f, 6.46f, 20.77f, 6.0f, 20.37f, 5.61f)
                curveTo(19.96f, 5.22f, 19.5f, 5.03f, 18.96f, 5.03f)
                horizontalLineTo(16.0f)
                lineTo(12.0f, 1.0f)
                lineTo(7.96f, 5.03f)
                horizontalLineTo(5.0f)
                close()
            }
        }
        .build()
        return _imageFrame!!
    }

private var _imageFrame: ImageVector? = null
