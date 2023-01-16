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

public val MaterialDesignIcons.FlashRedEye: ImageVector
    get() {
        if (_flashRedEye != null) {
            return _flashRedEye!!
        }
        _flashRedEye = Builder(name = "FlashRedEye", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 5.0f)
                curveTo(15.44f, 5.0f, 15.0f, 5.44f, 15.0f, 6.0f)
                curveTo(15.0f, 6.56f, 15.44f, 7.0f, 16.0f, 7.0f)
                curveTo(16.56f, 7.0f, 17.0f, 6.56f, 17.0f, 6.0f)
                curveTo(17.0f, 5.44f, 16.56f, 5.0f, 16.0f, 5.0f)
                moveTo(16.0f, 2.0f)
                curveTo(13.27f, 2.0f, 10.94f, 3.66f, 10.0f, 6.0f)
                curveTo(10.94f, 8.34f, 13.27f, 10.0f, 16.0f, 10.0f)
                curveTo(18.73f, 10.0f, 21.06f, 8.34f, 22.0f, 6.0f)
                curveTo(21.06f, 3.66f, 18.73f, 2.0f, 16.0f, 2.0f)
                moveTo(16.0f, 3.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 18.5f, 6.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 16.0f, 8.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 13.5f, 6.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 16.0f, 3.5f)
                moveTo(3.0f, 2.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(23.0f)
                lineTo(13.0f, 11.0f)
                horizontalLineTo(9.0f)
                lineTo(10.12f, 8.5f)
                curveTo(9.44f, 7.76f, 8.88f, 6.93f, 8.5f, 6.0f)
                curveTo(9.19f, 4.29f, 10.5f, 2.88f, 12.11f, 2.0f)
                horizontalLineTo(3.0f)
                close()
            }
        }
        .build()
        return _flashRedEye!!
    }

private var _flashRedEye: ImageVector? = null
