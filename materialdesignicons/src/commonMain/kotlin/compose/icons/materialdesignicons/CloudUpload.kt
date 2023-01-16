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

public val MaterialDesignIcons.CloudUpload: ImageVector
    get() {
        if (_cloudUpload != null) {
            return _cloudUpload!!
        }
        _cloudUpload = Builder(name = "CloudUpload", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 20.0f)
                horizontalLineTo(6.5f)
                quadTo(4.22f, 20.0f, 2.61f, 18.43f)
                quadTo(1.0f, 16.85f, 1.0f, 14.58f)
                quadTo(1.0f, 12.63f, 2.17f, 11.1f)
                quadTo(3.35f, 9.57f, 5.25f, 9.15f)
                quadTo(5.88f, 6.85f, 7.75f, 5.43f)
                quadTo(9.63f, 4.0f, 12.0f, 4.0f)
                quadTo(14.93f, 4.0f, 16.96f, 6.04f)
                quadTo(19.0f, 8.07f, 19.0f, 11.0f)
                quadTo(20.73f, 11.2f, 21.86f, 12.5f)
                quadTo(23.0f, 13.78f, 23.0f, 15.5f)
                quadTo(23.0f, 17.38f, 21.69f, 18.69f)
                quadTo(20.38f, 20.0f, 18.5f, 20.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(12.85f)
                lineTo(14.6f, 14.4f)
                lineTo(16.0f, 13.0f)
                lineTo(12.0f, 9.0f)
                lineTo(8.0f, 13.0f)
                lineTo(9.4f, 14.4f)
                lineTo(11.0f, 12.85f)
                close()
            }
        }
        .build()
        return _cloudUpload!!
    }

private var _cloudUpload: ImageVector? = null
