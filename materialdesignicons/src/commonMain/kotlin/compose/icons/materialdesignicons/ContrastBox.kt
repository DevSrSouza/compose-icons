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

public val MaterialDesignIcons.ContrastBox: ImageVector
    get() {
        if (_contrastBox != null) {
            return _contrastBox!!
        }
        _contrastBox = Builder(name = "ContrastBox", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 15.5f)
                horizontalLineTo(12.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(17.0f)
                moveTo(19.0f, 19.0f)
                horizontalLineTo(5.0f)
                lineTo(19.0f, 5.0f)
                moveTo(5.5f, 7.5f)
                horizontalLineTo(7.5f)
                verticalLineTo(5.5f)
                horizontalLineTo(9.0f)
                verticalLineTo(7.5f)
                horizontalLineTo(11.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(7.5f)
                verticalLineTo(9.0f)
                horizontalLineTo(5.5f)
                moveTo(19.0f, 3.0f)
                horizontalLineTo(5.0f)
                curveTo(3.89f, 3.0f, 3.0f, 3.89f, 3.0f, 5.0f)
                verticalLineTo(19.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 5.0f, 21.0f)
                horizontalLineTo(19.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 21.0f, 19.0f)
                verticalLineTo(5.0f)
                curveTo(21.0f, 3.89f, 20.1f, 3.0f, 19.0f, 3.0f)
                close()
            }
        }
        .build()
        return _contrastBox!!
    }

private var _contrastBox: ImageVector? = null
