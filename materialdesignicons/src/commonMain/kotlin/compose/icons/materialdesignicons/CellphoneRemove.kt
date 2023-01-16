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

public val MaterialDesignIcons.CellphoneRemove: ImageVector
    get() {
        if (_cellphoneRemove != null) {
            return _cellphoneRemove!!
        }
        _cellphoneRemove = Builder(name = "CellphoneRemove", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.54f, 16.88f)
                lineTo(21.12f, 15.47f)
                lineTo(19.0f, 17.59f)
                lineTo(16.88f, 15.47f)
                lineTo(15.47f, 16.88f)
                lineTo(17.59f, 19.0f)
                lineTo(15.47f, 21.12f)
                lineTo(16.88f, 22.54f)
                lineTo(19.0f, 20.41f)
                lineTo(21.12f, 22.54f)
                lineTo(22.54f, 21.12f)
                lineTo(20.41f, 19.0f)
                lineTo(22.54f, 16.88f)
                moveTo(14.54f, 23.0f)
                horizontalLineTo(7.0f)
                curveTo(5.9f, 23.0f, 5.0f, 22.11f, 5.0f, 21.0f)
                verticalLineTo(3.0f)
                curveTo(5.0f, 1.89f, 5.89f, 1.0f, 7.0f, 1.0f)
                horizontalLineTo(17.0f)
                curveTo(18.1f, 1.0f, 19.0f, 1.89f, 19.0f, 3.0f)
                verticalLineTo(13.0f)
                curveTo(18.3f, 13.0f, 17.63f, 13.13f, 17.0f, 13.35f)
                verticalLineTo(5.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(13.0f)
                curveTo(13.0f, 20.54f, 13.58f, 21.94f, 14.54f, 23.0f)
                close()
            }
        }
        .build()
        return _cellphoneRemove!!
    }

private var _cellphoneRemove: ImageVector? = null
