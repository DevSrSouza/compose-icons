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

public val MaterialDesignIcons.PencilMinus: ImageVector
    get() {
        if (_pencilMinus != null) {
            return _pencilMinus!!
        }
        _pencilMinus = Builder(name = "PencilMinus", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.7f, 7.0f)
                curveTo(21.1f, 6.6f, 21.1f, 6.0f, 20.7f, 5.6f)
                lineTo(18.4f, 3.3f)
                curveTo(18.0f, 2.9f, 17.4f, 2.9f, 17.0f, 3.3f)
                lineTo(15.2f, 5.1f)
                lineTo(19.0f, 8.9f)
                moveTo(3.0f, 17.2f)
                verticalLineTo(21.0f)
                horizontalLineTo(6.8f)
                lineTo(17.8f, 9.9f)
                lineTo(14.1f, 6.1f)
                lineTo(3.0f, 17.2f)
                moveTo(10.0f, 5.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(10.0f)
                close()
            }
        }
        .build()
        return _pencilMinus!!
    }

private var _pencilMinus: ImageVector? = null
