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

public val MaterialDesignIcons.BankOutline: ImageVector
    get() {
        if (_bankOutline != null) {
            return _bankOutline!!
        }
        _bankOutline = Builder(name = "BankOutline", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.5f, 10.0f)
                horizontalLineTo(4.5f)
                verticalLineTo(17.0f)
                horizontalLineTo(6.5f)
                verticalLineTo(10.0f)
                moveTo(12.5f, 10.0f)
                horizontalLineTo(10.5f)
                verticalLineTo(17.0f)
                horizontalLineTo(12.5f)
                verticalLineTo(10.0f)
                moveTo(21.0f, 19.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(19.0f)
                moveTo(18.5f, 10.0f)
                horizontalLineTo(16.5f)
                verticalLineTo(17.0f)
                horizontalLineTo(18.5f)
                verticalLineTo(10.0f)
                moveTo(11.5f, 3.26f)
                lineTo(16.71f, 6.0f)
                horizontalLineTo(6.29f)
                lineTo(11.5f, 3.26f)
                moveTo(11.5f, 1.0f)
                lineTo(2.0f, 6.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(6.0f)
                lineTo(11.5f, 1.0f)
                close()
            }
        }
        .build()
        return _bankOutline!!
    }

private var _bankOutline: ImageVector? = null
