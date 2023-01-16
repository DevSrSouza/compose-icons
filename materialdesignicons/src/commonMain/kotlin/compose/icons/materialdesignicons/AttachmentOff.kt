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

public val MaterialDesignIcons.AttachmentOff: ImageVector
    get() {
        if (_attachmentOff != null) {
            return _attachmentOff!!
        }
        _attachmentOff = Builder(name = "AttachmentOff", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 10.0f)
                verticalLineTo(11.5f)
                horizontalLineTo(14.7f)
                lineTo(13.2f, 10.0f)
                horizontalLineTo(17.0f)
                moveTo(18.0f, 8.5f)
                curveTo(19.38f, 8.5f, 20.5f, 9.62f, 20.5f, 11.0f)
                reflectiveCurveTo(19.38f, 13.5f, 18.0f, 13.5f)
                horizontalLineTo(16.7f)
                lineTo(18.18f, 15.0f)
                curveTo(20.31f, 14.89f, 22.0f, 13.15f, 22.0f, 11.0f)
                curveTo(22.0f, 8.79f, 20.21f, 7.0f, 18.0f, 7.0f)
                horizontalLineTo(10.2f)
                lineTo(11.7f, 8.5f)
                horizontalLineTo(18.0f)
                moveTo(22.11f, 21.46f)
                lineTo(20.84f, 22.73f)
                lineTo(16.11f, 18.0f)
                horizontalLineTo(7.5f)
                curveTo(4.46f, 18.0f, 2.0f, 15.54f, 2.0f, 12.5f)
                curveTo(2.0f, 10.17f, 3.45f, 8.19f, 5.5f, 7.38f)
                lineTo(1.11f, 3.0f)
                lineTo(2.39f, 1.73f)
                lineTo(22.11f, 21.46f)
                moveTo(8.5f, 12.5f)
                curveTo(8.5f, 13.05f, 8.95f, 13.5f, 9.5f, 13.5f)
                horizontalLineTo(11.61f)
                lineTo(9.61f, 11.5f)
                horizontalLineTo(9.5f)
                curveTo(8.95f, 11.5f, 8.5f, 11.95f, 8.5f, 12.5f)
                moveTo(14.61f, 16.5f)
                lineTo(13.11f, 15.0f)
                horizontalLineTo(9.5f)
                curveTo(8.12f, 15.0f, 7.0f, 13.88f, 7.0f, 12.5f)
                curveTo(7.0f, 11.5f, 7.57f, 10.69f, 8.38f, 10.27f)
                lineTo(6.69f, 8.58f)
                curveTo(4.87f, 8.96f, 3.5f, 10.57f, 3.5f, 12.5f)
                curveTo(3.5f, 14.71f, 5.29f, 16.5f, 7.5f, 16.5f)
                horizontalLineTo(14.61f)
                close()
            }
        }
        .build()
        return _attachmentOff!!
    }

private var _attachmentOff: ImageVector? = null
