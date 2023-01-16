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

public val MaterialDesignIcons.CellphoneSound: ImageVector
    get() {
        if (_cellphoneSound != null) {
            return _cellphoneSound!!
        }
        _cellphoneSound = Builder(name = "CellphoneSound", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.1f, 8.7f)
                curveTo(20.9f, 10.5f, 20.9f, 13.3f, 19.1f, 15.2f)
                lineTo(20.1f, 16.2f)
                curveTo(22.6f, 13.9f, 22.6f, 10.1f, 20.1f, 7.7f)
                lineTo(19.1f, 8.7f)
                moveTo(18.0f, 9.8f)
                lineTo(17.0f, 10.8f)
                curveTo(17.5f, 11.5f, 17.5f, 12.4f, 17.0f, 13.1f)
                lineTo(18.0f, 14.1f)
                curveTo(19.2f, 12.9f, 19.2f, 11.1f, 18.0f, 9.8f)
                moveTo(14.0f, 1.0f)
                horizontalLineTo(4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 2.0f, 3.0f)
                verticalLineTo(21.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 4.0f, 23.0f)
                horizontalLineTo(14.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 16.0f, 21.0f)
                verticalLineTo(3.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 14.0f, 1.0f)
                moveTo(14.0f, 20.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(20.0f)
                close()
            }
        }
        .build()
        return _cellphoneSound!!
    }

private var _cellphoneSound: ImageVector? = null
