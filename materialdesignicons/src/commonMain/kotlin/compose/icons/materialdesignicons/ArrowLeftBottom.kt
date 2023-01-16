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

public val MaterialDesignIcons.ArrowLeftBottom: ImageVector
    get() {
        if (_arrowLeftBottom != null) {
            return _arrowLeftBottom!!
        }
        _arrowLeftBottom = Builder(name = "ArrowLeftBottom", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 4.0f)
                verticalLineTo(10.5f)
                curveTo(20.0f, 14.09f, 17.09f, 17.0f, 13.5f, 17.0f)
                horizontalLineTo(7.83f)
                lineTo(10.92f, 20.09f)
                lineTo(9.5f, 21.5f)
                lineTo(4.0f, 16.0f)
                lineTo(9.5f, 10.5f)
                lineTo(10.91f, 11.91f)
                lineTo(7.83f, 15.0f)
                horizontalLineTo(13.5f)
                curveTo(16.0f, 15.0f, 18.0f, 13.0f, 18.0f, 10.5f)
                verticalLineTo(4.0f)
                horizontalLineTo(20.0f)
                close()
            }
        }
        .build()
        return _arrowLeftBottom!!
    }

private var _arrowLeftBottom: ImageVector? = null
