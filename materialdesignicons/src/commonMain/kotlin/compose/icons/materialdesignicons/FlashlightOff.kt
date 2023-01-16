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

public val MaterialDesignIcons.FlashlightOff: ImageVector
    get() {
        if (_flashlightOff != null) {
            return _flashlightOff!!
        }
        _flashlightOff = Builder(name = "FlashlightOff", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 5.27f)
                lineTo(3.28f, 4.0f)
                lineTo(20.0f, 20.72f)
                lineTo(18.73f, 22.0f)
                lineTo(15.0f, 18.27f)
                verticalLineTo(22.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(12.27f)
                lineTo(2.0f, 5.27f)
                moveTo(18.0f, 5.0f)
                lineTo(15.0f, 10.0f)
                horizontalLineTo(11.82f)
                lineTo(6.82f, 5.0f)
                horizontalLineTo(18.0f)
                moveTo(18.0f, 4.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(4.0f)
                moveTo(15.0f, 11.0f)
                verticalLineTo(13.18f)
                lineTo(12.82f, 11.0f)
                horizontalLineTo(15.0f)
                close()
            }
        }
        .build()
        return _flashlightOff!!
    }

private var _flashlightOff: ImageVector? = null
