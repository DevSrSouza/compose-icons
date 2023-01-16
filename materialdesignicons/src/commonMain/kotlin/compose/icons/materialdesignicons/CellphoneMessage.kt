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

public val MaterialDesignIcons.CellphoneMessage: ImageVector
    get() {
        if (_cellphoneMessage != null) {
            return _cellphoneMessage!!
        }
        _cellphoneMessage = Builder(name = "CellphoneMessage", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 17.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(11.0f)
                moveTo(11.0f, 3.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 13.0f, 5.0f)
                verticalLineTo(19.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 11.0f, 21.0f)
                horizontalLineTo(4.0f)
                curveTo(2.89f, 21.0f, 2.0f, 20.1f, 2.0f, 19.0f)
                verticalLineTo(5.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 4.0f, 3.0f)
                horizontalLineTo(11.0f)
                moveTo(16.5f, 3.0f)
                horizontalLineTo(21.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 23.0f, 4.5f)
                verticalLineTo(7.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 21.5f, 9.0f)
                horizontalLineTo(18.0f)
                lineTo(15.0f, 12.0f)
                verticalLineTo(9.0f)
                lineTo(15.0f, 4.5f)
                arcTo(1.5f, 1.5f, 0.0f, false, true, 16.5f, 3.0f)
                close()
            }
        }
        .build()
        return _cellphoneMessage!!
    }

private var _cellphoneMessage: ImageVector? = null
