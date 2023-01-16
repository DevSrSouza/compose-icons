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

public val MaterialDesignIcons.ArrowExpandRight: ImageVector
    get() {
        if (_arrowExpandRight != null) {
            return _arrowExpandRight!!
        }
        _arrowExpandRight = Builder(name = "ArrowExpandRight", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 2.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(18.17f)
                lineTo(12.67f, 18.5f)
                lineTo(14.08f, 19.92f)
                lineTo(22.0f, 12.0f)
                lineTo(14.08f, 4.08f)
                lineTo(12.67f, 5.5f)
                lineTo(18.17f, 11.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(2.0f)
                close()
            }
        }
        .build()
        return _arrowExpandRight!!
    }

private var _arrowExpandRight: ImageVector? = null
