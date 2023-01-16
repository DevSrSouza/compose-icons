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

public val MaterialDesignIcons.CellphonePlay: ImageVector
    get() {
        if (_cellphonePlay != null) {
            return _cellphonePlay!!
        }
        _cellphonePlay = Builder(name = "CellphonePlay", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 19.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(17.0f)
                moveTo(17.0f, 1.0f)
                horizontalLineTo(7.0f)
                curveTo(5.89f, 1.0f, 5.0f, 1.89f, 5.0f, 3.0f)
                verticalLineTo(21.0f)
                curveTo(5.0f, 22.1f, 5.9f, 23.0f, 7.0f, 23.0f)
                horizontalLineTo(17.0f)
                curveTo(18.1f, 23.0f, 19.0f, 22.1f, 19.0f, 21.0f)
                verticalLineTo(3.0f)
                curveTo(19.0f, 1.89f, 18.1f, 1.0f, 17.0f, 1.0f)
                moveTo(10.0f, 9.0f)
                verticalLineTo(15.0f)
                lineTo(14.0f, 12.0f)
                lineTo(10.0f, 9.0f)
                close()
            }
        }
        .build()
        return _cellphonePlay!!
    }

private var _cellphonePlay: ImageVector? = null
