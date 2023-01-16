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

public val MaterialDesignIcons.FlashOffOutline: ImageVector
    get() {
        if (_flashOffOutline != null) {
            return _flashOffOutline!!
        }
        _flashOffOutline = Builder(name = "FlashOffOutline", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 6.19f)
                lineTo(7.0f, 4.19f)
                verticalLineTo(2.0f)
                horizontalLineTo(17.0f)
                lineTo(13.5f, 9.0f)
                horizontalLineTo(17.0f)
                lineTo(15.18f, 12.37f)
                lineTo(11.43f, 8.62f)
                lineTo(13.76f, 4.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(6.19f)
                moveTo(19.0f, 18.73f)
                lineTo(17.73f, 20.0f)
                lineTo(13.41f, 15.68f)
                lineTo(10.0f, 22.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(9.27f)
                lineTo(2.0f, 4.27f)
                lineTo(3.27f, 3.0f)
                lineTo(19.0f, 18.73f)
                close()
            }
        }
        .build()
        return _flashOffOutline!!
    }

private var _flashOffOutline: ImageVector? = null
