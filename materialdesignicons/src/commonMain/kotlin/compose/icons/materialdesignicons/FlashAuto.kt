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

public val MaterialDesignIcons.FlashAuto: ImageVector
    get() {
        if (_flashAuto != null) {
            return _flashAuto!!
        }
        _flashAuto = Builder(name = "FlashAuto", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.85f, 7.65f)
                lineTo(18.0f, 4.0f)
                lineTo(19.15f, 7.65f)
                moveTo(19.0f, 2.0f)
                horizontalLineTo(17.0f)
                lineTo(13.8f, 11.0f)
                horizontalLineTo(15.7f)
                lineTo(16.4f, 9.0f)
                horizontalLineTo(19.6f)
                lineTo(20.3f, 11.0f)
                horizontalLineTo(22.2f)
                moveTo(3.0f, 2.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(23.0f)
                lineTo(13.0f, 11.0f)
                horizontalLineTo(9.0f)
                lineTo(13.0f, 2.0f)
                horizontalLineTo(3.0f)
                close()
            }
        }
        .build()
        return _flashAuto!!
    }

private var _flashAuto: ImageVector? = null
