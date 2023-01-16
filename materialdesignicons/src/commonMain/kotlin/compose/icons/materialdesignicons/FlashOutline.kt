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

public val MaterialDesignIcons.FlashOutline: ImageVector
    get() {
        if (_flashOutline != null) {
            return _flashOutline!!
        }
        _flashOutline = Builder(name = "FlashOutline", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 2.0f)
                horizontalLineTo(17.0f)
                lineTo(13.5f, 9.0f)
                horizontalLineTo(17.0f)
                lineTo(10.0f, 22.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(2.0f)
                moveTo(9.0f, 4.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(14.66f)
                lineTo(14.0f, 11.0f)
                horizontalLineTo(10.24f)
                lineTo(13.76f, 4.0f)
                horizontalLineTo(9.0f)
                close()
            }
        }
        .build()
        return _flashOutline!!
    }

private var _flashOutline: ImageVector? = null
