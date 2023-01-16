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

public val MaterialDesignIcons.BankCheck: ImageVector
    get() {
        if (_bankCheck != null) {
            return _bankCheck!!
        }
        _bankCheck = Builder(name = "BankCheck", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.8f, 21.2f)
                lineTo(15.0f, 18.2f)
                lineTo(16.2f, 17.0f)
                lineTo(17.8f, 18.6f)
                lineTo(21.4f, 15.0f)
                lineTo(22.6f, 16.4f)
                lineTo(17.8f, 21.2f)
                moveTo(13.0f, 10.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(12.1f)
                curveTo(12.2f, 16.2f, 12.6f, 15.4f, 13.0f, 14.7f)
                verticalLineTo(10.0f)
                moveTo(16.0f, 10.0f)
                verticalLineTo(12.3f)
                curveTo(16.6f, 12.1f, 17.3f, 12.0f, 18.0f, 12.0f)
                curveTo(18.3f, 12.0f, 18.7f, 12.0f, 19.0f, 12.1f)
                verticalLineTo(10.0f)
                horizontalLineTo(16.0f)
                moveTo(12.1f, 19.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(13.5f)
                curveTo(12.8f, 21.2f, 12.3f, 20.1f, 12.1f, 19.0f)
                moveTo(21.0f, 6.0f)
                lineTo(11.5f, 1.0f)
                lineTo(2.0f, 6.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(6.0f)
                moveTo(7.0f, 17.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(7.0f)
                close()
            }
        }
        .build()
        return _bankCheck!!
    }

private var _bankCheck: ImageVector? = null
