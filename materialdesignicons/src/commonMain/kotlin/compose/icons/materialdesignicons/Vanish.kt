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

public val MaterialDesignIcons.Vanish: ImageVector
    get() {
        if (_vanish != null) {
            return _vanish!!
        }
        _vanish = Builder(name = "Vanish", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 13.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(16.0f)
                moveTo(14.83f, 7.76f)
                lineTo(17.66f, 4.93f)
                lineTo(19.07f, 6.34f)
                lineTo(16.24f, 9.17f)
                lineTo(14.83f, 7.76f)
                moveTo(11.0f, 16.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(16.0f)
                moveTo(11.0f, 3.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(3.0f)
                moveTo(4.93f, 17.66f)
                lineTo(7.76f, 14.83f)
                lineTo(9.17f, 16.24f)
                lineTo(6.34f, 19.07f)
                lineTo(4.93f, 17.66f)
                moveTo(4.93f, 6.34f)
                lineTo(6.34f, 4.93f)
                lineTo(9.17f, 7.76f)
                lineTo(7.76f, 9.17f)
                lineTo(4.93f, 6.34f)
                moveTo(8.0f, 13.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(13.0f)
                moveTo(19.07f, 17.66f)
                lineTo(17.66f, 19.07f)
                lineTo(14.83f, 16.24f)
                lineTo(16.24f, 14.83f)
                lineTo(19.07f, 17.66f)
                close()
            }
        }
        .build()
        return _vanish!!
    }

private var _vanish: ImageVector? = null
