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

public val MaterialDesignIcons.MortarPestle: ImageVector
    get() {
        if (_mortarPestle != null) {
            return _mortarPestle!!
        }
        _mortarPestle = Builder(name = "MortarPestle", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 7.0f)
                lineTo(19.0f, 13.0f)
                lineTo(21.0f, 19.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(19.0f)
                lineTo(5.0f, 13.0f)
                lineTo(3.0f, 7.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(15.7f)
                lineTo(17.2f, 1.0f)
                lineTo(19.5f, 1.8f)
                lineTo(18.3f, 5.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(7.0f)
                close()
            }
        }
        .build()
        return _mortarPestle!!
    }

private var _mortarPestle: ImageVector? = null
