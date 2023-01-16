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

public val MaterialDesignIcons.PhoneCheckOutline: ImageVector
    get() {
        if (_phoneCheckOutline != null) {
            return _phoneCheckOutline!!
        }
        _phoneCheckOutline = Builder(name = "PhoneCheckOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 15.5f)
                arcTo(11.36f, 11.36f, 0.0f, false, true, 16.43f, 14.93f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 15.43f, 15.18f)
                lineTo(13.23f, 17.38f)
                arcTo(15.1f, 15.1f, 0.0f, false, true, 6.64f, 10.79f)
                lineTo(8.84f, 8.59f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 9.09f, 7.59f)
                arcTo(11.36f, 11.36f, 0.0f, false, true, 8.5f, 4.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 7.5f, 3.0f)
                horizontalLineTo(4.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 3.0f, 4.0f)
                arcTo(17.0f, 17.0f, 0.0f, false, false, 20.0f, 21.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 21.0f, 20.0f)
                verticalLineTo(16.5f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 20.0f, 15.5f)
                moveTo(5.0f, 5.0f)
                horizontalLineTo(6.54f)
                arcTo(12.54f, 12.54f, 0.0f, false, false, 7.0f, 7.59f)
                lineTo(5.79f, 8.8f)
                arcTo(15.0f, 15.0f, 0.0f, false, true, 5.0f, 5.0f)
                moveTo(19.0f, 19.0f)
                arcTo(15.0f, 15.0f, 0.0f, false, true, 15.2f, 18.24f)
                lineTo(16.41f, 17.0f)
                arcTo(12.31f, 12.31f, 0.0f, false, false, 19.0f, 17.45f)
                moveTo(15.0f, 11.44f)
                lineTo(11.29f, 7.74f)
                lineTo(12.71f, 6.32f)
                lineTo(15.0f, 8.59f)
                lineTo(20.29f, 3.29f)
                lineTo(21.71f, 4.71f)
                close()
            }
        }
        .build()
        return _phoneCheckOutline!!
    }

private var _phoneCheckOutline: ImageVector? = null
