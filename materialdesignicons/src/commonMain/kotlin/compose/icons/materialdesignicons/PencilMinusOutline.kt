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

public val MaterialDesignIcons.PencilMinusOutline: ImageVector
    get() {
        if (_pencilMinusOutline != null) {
            return _pencilMinusOutline!!
        }
        _pencilMinusOutline = Builder(name = "PencilMinusOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.1f, 9.0f)
                lineTo(15.0f, 9.9f)
                lineTo(5.9f, 19.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(18.1f)
                lineTo(14.1f, 9.0f)
                moveTo(17.7f, 3.0f)
                curveTo(17.5f, 3.0f, 17.2f, 3.1f, 17.0f, 3.3f)
                lineTo(15.2f, 5.1f)
                lineTo(18.9f, 8.9f)
                lineTo(20.7f, 7.0f)
                curveTo(21.1f, 6.6f, 21.1f, 6.0f, 20.7f, 5.6f)
                lineTo(18.4f, 3.3f)
                curveTo(18.2f, 3.1f, 17.9f, 3.0f, 17.7f, 3.0f)
                moveTo(14.1f, 6.2f)
                lineTo(3.0f, 17.2f)
                verticalLineTo(21.0f)
                horizontalLineTo(6.8f)
                lineTo(17.8f, 9.9f)
                lineTo(14.1f, 6.2f)
                moveTo(10.0f, 5.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(10.0f)
                close()
            }
        }
        .build()
        return _pencilMinusOutline!!
    }

private var _pencilMinusOutline: ImageVector? = null
