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

public val MaterialDesignIcons.CellphoneArrowDownVariant: ImageVector
    get() {
        if (_cellphoneArrowDownVariant != null) {
            return _cellphoneArrowDownVariant!!
        }
        _cellphoneArrowDownVariant = Builder(name = "CellphoneArrowDownVariant", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 14.0f)
                lineTo(23.0f, 9.0f)
                lineTo(21.6f, 7.6f)
                lineTo(19.0f, 10.2f)
                verticalLineTo(3.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(10.2f)
                lineTo(14.4f, 7.6f)
                lineTo(13.0f, 9.0f)
                lineTo(18.0f, 14.0f)
                moveTo(19.0f, 16.0f)
                verticalLineTo(21.0f)
                curveTo(19.0f, 22.1f, 18.1f, 23.0f, 17.0f, 23.0f)
                horizontalLineTo(7.0f)
                curveTo(5.9f, 23.0f, 5.0f, 22.1f, 5.0f, 21.0f)
                verticalLineTo(3.0f)
                curveTo(5.0f, 1.9f, 5.9f, 1.0f, 7.0f, 1.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(19.0f)
                close()
            }
        }
        .build()
        return _cellphoneArrowDownVariant!!
    }

private var _cellphoneArrowDownVariant: ImageVector? = null
