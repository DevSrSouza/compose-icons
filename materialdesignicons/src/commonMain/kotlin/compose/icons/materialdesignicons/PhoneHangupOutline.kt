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

public val MaterialDesignIcons.PhoneHangupOutline: ImageVector
    get() {
        if (_phoneHangupOutline != null) {
            return _phoneHangupOutline!!
        }
        _phoneHangupOutline = Builder(name = "PhoneHangupOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.71f, 11.67f)
                arcTo(17.0f, 17.0f, 0.0f, false, false, 0.29f, 11.67f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 0.0f, 12.38f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 0.29f, 13.08f)
                lineTo(2.77f, 15.56f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 3.5f, 15.85f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 4.18f, 15.57f)
                arcTo(11.5f, 11.5f, 0.0f, false, true, 6.84f, 13.72f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 7.4f, 12.82f)
                verticalLineTo(9.72f)
                arcTo(14.91f, 14.91f, 0.0f, false, true, 12.0f, 9.0f)
                arcTo(14.5f, 14.5f, 0.0f, false, true, 16.59f, 9.73f)
                verticalLineTo(12.83f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 17.15f, 13.73f)
                arcTo(11.27f, 11.27f, 0.0f, false, true, 19.82f, 15.58f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 20.5f, 15.86f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 21.23f, 15.57f)
                lineTo(23.71f, 13.09f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 23.71f, 11.67f)
                moveTo(5.4f, 12.22f)
                arcTo(13.68f, 13.68f, 0.0f, false, false, 3.53f, 13.5f)
                lineTo(2.46f, 12.42f)
                arcTo(15.54f, 15.54f, 0.0f, false, true, 5.4f, 10.5f)
                moveTo(20.5f, 13.5f)
                arcTo(13.75f, 13.75f, 0.0f, false, false, 18.6f, 12.23f)
                verticalLineTo(10.53f)
                arcTo(14.26f, 14.26f, 0.0f, false, true, 21.55f, 12.43f)
                close()
            }
        }
        .build()
        return _phoneHangupOutline!!
    }

private var _phoneHangupOutline: ImageVector? = null
