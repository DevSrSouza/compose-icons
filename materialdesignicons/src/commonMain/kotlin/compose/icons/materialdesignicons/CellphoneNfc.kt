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

public val MaterialDesignIcons.CellphoneNfc: ImageVector
    get() {
        if (_cellphoneNfc != null) {
            return _cellphoneNfc!!
        }
        _cellphoneNfc = Builder(name = "CellphoneNfc", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 16.0f)
                verticalLineTo(18.0f)
                arcTo(5.0f, 5.0f, 0.0f, false, true, 7.0f, 23.0f)
                horizontalLineTo(9.0f)
                arcTo(7.0f, 7.0f, 0.0f, false, false, 2.0f, 16.0f)
                moveTo(2.0f, 20.0f)
                verticalLineTo(23.0f)
                horizontalLineTo(5.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 2.0f, 20.0f)
                moveTo(2.0f, 12.0f)
                verticalLineTo(14.0f)
                arcTo(9.0f, 9.0f, 0.0f, false, true, 11.0f, 23.0f)
                horizontalLineTo(13.0f)
                curveTo(13.0f, 16.92f, 8.08f, 12.0f, 2.0f, 12.0f)
                moveTo(17.0f, 1.0f)
                horizontalLineTo(7.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 5.0f, 3.0f)
                verticalLineTo(10.37f)
                curveTo(5.69f, 10.53f, 6.36f, 10.74f, 7.0f, 11.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(13.97f)
                curveTo(14.5f, 19.25f, 14.81f, 20.59f, 14.92f, 22.0f)
                horizontalLineTo(17.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 19.0f, 20.0f)
                verticalLineTo(3.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 17.0f, 1.0f)
                close()
            }
        }
        .build()
        return _cellphoneNfc!!
    }

private var _cellphoneNfc: ImageVector? = null
