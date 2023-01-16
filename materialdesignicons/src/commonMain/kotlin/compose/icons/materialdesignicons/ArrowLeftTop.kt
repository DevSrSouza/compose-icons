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

public val MaterialDesignIcons.ArrowLeftTop: ImageVector
    get() {
        if (_arrowLeftTop != null) {
            return _arrowLeftTop!!
        }
        _arrowLeftTop = Builder(name = "ArrowLeftTop", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 13.5f)
                verticalLineTo(20.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(13.5f)
                curveTo(18.0f, 11.0f, 16.0f, 9.0f, 13.5f, 9.0f)
                horizontalLineTo(7.83f)
                lineTo(10.91f, 12.09f)
                lineTo(9.5f, 13.5f)
                lineTo(4.0f, 8.0f)
                lineTo(9.5f, 2.5f)
                lineTo(10.92f, 3.91f)
                lineTo(7.83f, 7.0f)
                horizontalLineTo(13.5f)
                curveTo(17.09f, 7.0f, 20.0f, 9.91f, 20.0f, 13.5f)
                close()
            }
        }
        .build()
        return _arrowLeftTop!!
    }

private var _arrowLeftTop: ImageVector? = null
