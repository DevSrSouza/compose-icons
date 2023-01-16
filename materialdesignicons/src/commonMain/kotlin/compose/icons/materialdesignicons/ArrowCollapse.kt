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

public val MaterialDesignIcons.ArrowCollapse: ImageVector
    get() {
        if (_arrowCollapse != null) {
            return _arrowCollapse!!
        }
        _arrowCollapse = Builder(name = "ArrowCollapse", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.5f, 3.09f)
                lineTo(15.0f, 7.59f)
                verticalLineTo(4.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(16.41f)
                lineTo(20.91f, 4.5f)
                lineTo(19.5f, 3.09f)
                moveTo(4.0f, 13.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(7.59f)
                lineTo(3.09f, 19.5f)
                lineTo(4.5f, 20.91f)
                lineTo(9.0f, 16.41f)
                verticalLineTo(20.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(4.0f)
                close()
            }
        }
        .build()
        return _arrowCollapse!!
    }

private var _arrowCollapse: ImageVector? = null
