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

public val MaterialDesignIcons.FlashOff: ImageVector
    get() {
        if (_flashOff != null) {
            return _flashOff!!
        }
        _flashOff = Builder(name = "FlashOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 10.0f)
                horizontalLineTo(13.0f)
                lineTo(17.0f, 2.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(4.18f)
                lineTo(15.46f, 12.64f)
                moveTo(3.27f, 3.0f)
                lineTo(2.0f, 4.27f)
                lineTo(7.0f, 9.27f)
                verticalLineTo(13.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(22.0f)
                lineTo(13.58f, 15.86f)
                lineTo(17.73f, 20.0f)
                lineTo(19.0f, 18.73f)
                lineTo(3.27f, 3.0f)
                close()
            }
        }
        .build()
        return _flashOff!!
    }

private var _flashOff: ImageVector? = null
