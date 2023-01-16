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

public val MaterialDesignIcons.CheckboxMarkedOutline: ImageVector
    get() {
        if (_checkboxMarkedOutline != null) {
            return _checkboxMarkedOutline!!
        }
        _checkboxMarkedOutline = Builder(name = "CheckboxMarkedOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 19.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(5.0f)
                curveTo(3.89f, 3.0f, 3.0f, 3.89f, 3.0f, 5.0f)
                verticalLineTo(19.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 5.0f, 21.0f)
                horizontalLineTo(19.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 21.0f, 19.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(19.0f)
                moveTo(7.91f, 10.08f)
                lineTo(6.5f, 11.5f)
                lineTo(11.0f, 16.0f)
                lineTo(21.0f, 6.0f)
                lineTo(19.59f, 4.58f)
                lineTo(11.0f, 13.17f)
                lineTo(7.91f, 10.08f)
                close()
            }
        }
        .build()
        return _checkboxMarkedOutline!!
    }

private var _checkboxMarkedOutline: ImageVector? = null
