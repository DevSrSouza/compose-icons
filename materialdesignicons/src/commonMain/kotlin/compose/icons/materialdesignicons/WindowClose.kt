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

public val MaterialDesignIcons.WindowClose: ImageVector
    get() {
        if (_windowClose != null) {
            return _windowClose!!
        }
        _windowClose = Builder(name = "WindowClose", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.46f, 12.0f)
                lineTo(19.0f, 17.54f)
                verticalLineTo(19.0f)
                horizontalLineTo(17.54f)
                lineTo(12.0f, 13.46f)
                lineTo(6.46f, 19.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(17.54f)
                lineTo(10.54f, 12.0f)
                lineTo(5.0f, 6.46f)
                verticalLineTo(5.0f)
                horizontalLineTo(6.46f)
                lineTo(12.0f, 10.54f)
                lineTo(17.54f, 5.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(6.46f)
                lineTo(13.46f, 12.0f)
                close()
            }
        }
        .build()
        return _windowClose!!
    }

private var _windowClose: ImageVector? = null
