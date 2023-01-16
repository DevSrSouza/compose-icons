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

public val MaterialDesignIcons.BankMinus: ImageVector
    get() {
        if (_bankMinus != null) {
            return _bankMinus!!
        }
        _bankMinus = Builder(name = "BankMinus", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 17.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(17.0f)
                moveTo(11.5f, 1.0f)
                lineTo(21.0f, 6.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(6.0f)
                lineTo(11.5f, 1.0f)
                moveTo(16.0f, 10.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(12.08f)
                lineTo(18.0f, 12.0f)
                curveTo(17.3f, 12.0f, 16.63f, 12.12f, 16.0f, 12.34f)
                verticalLineTo(10.0f)
                moveTo(2.0f, 22.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(12.08f)
                curveTo(12.27f, 20.14f, 12.79f, 21.17f, 13.53f, 22.0f)
                horizontalLineTo(2.0f)
                moveTo(10.0f, 10.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(14.68f)
                curveTo(12.54f, 15.37f, 12.22f, 16.15f, 12.08f, 17.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(10.0f)
                moveTo(4.0f, 10.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(10.0f)
                close()
            }
        }
        .build()
        return _bankMinus!!
    }

private var _bankMinus: ImageVector? = null
