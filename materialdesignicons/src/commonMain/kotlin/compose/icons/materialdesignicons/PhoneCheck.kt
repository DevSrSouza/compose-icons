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

public val MaterialDesignIcons.PhoneCheck: ImageVector
    get() {
        if (_phoneCheck != null) {
            return _phoneCheck!!
        }
        _phoneCheck = Builder(name = "PhoneCheck", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.62f, 10.79f)
                arcTo(15.1f, 15.1f, 0.0f, false, false, 13.21f, 17.38f)
                lineTo(15.41f, 15.18f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 16.41f, 14.93f)
                arcTo(11.36f, 11.36f, 0.0f, false, false, 20.0f, 15.5f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 21.0f, 16.5f)
                verticalLineTo(20.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 20.0f, 21.0f)
                arcTo(17.0f, 17.0f, 0.0f, false, true, 3.0f, 4.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 4.0f, 3.0f)
                horizontalLineTo(7.5f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 8.5f, 4.0f)
                arcTo(11.36f, 11.36f, 0.0f, false, false, 9.07f, 7.57f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 8.82f, 8.57f)
                moveTo(21.71f, 4.71f)
                lineTo(20.29f, 3.29f)
                lineTo(15.0f, 8.59f)
                lineTo(12.71f, 6.29f)
                lineTo(11.29f, 7.71f)
                lineTo(15.0f, 11.41f)
                close()
            }
        }
        .build()
        return _phoneCheck!!
    }

private var _phoneCheck: ImageVector? = null
