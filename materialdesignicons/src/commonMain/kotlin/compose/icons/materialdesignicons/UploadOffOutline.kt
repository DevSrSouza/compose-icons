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

public val MaterialDesignIcons.UploadOffOutline: ImageVector
    get() {
        if (_uploadOffOutline != null) {
            return _uploadOffOutline!!
        }
        _uploadOffOutline = Builder(name = "UploadOffOutline", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.11f, 21.46f)
                lineTo(2.39f, 1.73f)
                lineTo(1.11f, 3.0f)
                lineTo(6.56f, 8.45f)
                lineTo(5.0f, 10.0f)
                horizontalLineTo(8.11f)
                lineTo(9.0f, 10.89f)
                verticalLineTo(16.0f)
                horizontalLineTo(14.11f)
                lineTo(16.11f, 18.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(18.11f)
                lineTo(20.84f, 22.73f)
                lineTo(22.11f, 21.46f)
                moveTo(11.0f, 14.0f)
                verticalLineTo(12.89f)
                lineTo(12.11f, 14.0f)
                horizontalLineTo(11.0f)
                moveTo(12.0f, 5.8f)
                lineTo(14.2f, 8.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(9.8f)
                lineTo(15.0f, 11.8f)
                verticalLineTo(10.0f)
                horizontalLineTo(19.0f)
                lineTo(12.0f, 3.0f)
                lineTo(9.1f, 5.9f)
                lineTo(10.5f, 7.3f)
                lineTo(12.0f, 5.8f)
                close()
            }
        }
        .build()
        return _uploadOffOutline!!
    }

private var _uploadOffOutline: ImageVector? = null
