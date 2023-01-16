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

public val MaterialDesignIcons.MortarPestlePlus: ImageVector
    get() {
        if (_mortarPestlePlus != null) {
            return _mortarPestlePlus!!
        }
        _mortarPestlePlus = Builder(name = "MortarPestlePlus", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 14.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(16.0f)
                moveTo(21.0f, 5.0f)
                horizontalLineTo(18.35f)
                lineTo(19.5f, 1.85f)
                lineTo(17.15f, 1.0f)
                lineTo(15.69f, 5.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(7.0f)
                lineTo(5.0f, 13.0f)
                lineTo(3.0f, 19.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(19.0f)
                lineTo(19.0f, 13.0f)
                lineTo(21.0f, 7.0f)
                verticalLineTo(5.0f)
                close()
            }
        }
        .build()
        return _mortarPestlePlus!!
    }

private var _mortarPestlePlus: ImageVector? = null
