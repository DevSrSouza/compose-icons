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

public val MaterialDesignIcons.AttachmentLock: ImageVector
    get() {
        if (_attachmentLock != null) {
            return _attachmentLock!!
        }
        _attachmentLock = Builder(name = "AttachmentLock", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 13.0f)
                curveTo(16.6f, 13.0f, 15.2f, 14.1f, 15.2f, 15.5f)
                verticalLineTo(17.0f)
                curveTo(14.6f, 17.0f, 14.0f, 17.6f, 14.0f, 18.2f)
                verticalLineTo(21.7f)
                curveTo(14.0f, 22.4f, 14.6f, 23.0f, 15.2f, 23.0f)
                horizontalLineTo(20.7f)
                curveTo(21.4f, 23.0f, 22.0f, 22.4f, 22.0f, 21.8f)
                verticalLineTo(18.3f)
                curveTo(22.0f, 17.6f, 21.4f, 17.0f, 20.8f, 17.0f)
                verticalLineTo(15.5f)
                curveTo(20.8f, 14.1f, 19.4f, 13.0f, 18.0f, 13.0f)
                moveTo(18.0f, 14.2f)
                curveTo(18.8f, 14.2f, 19.5f, 14.7f, 19.5f, 15.5f)
                verticalLineTo(17.0f)
                horizontalLineTo(16.5f)
                verticalLineTo(15.5f)
                curveTo(16.5f, 14.7f, 17.2f, 14.2f, 18.0f, 14.2f)
                moveTo(7.5f, 5.0f)
                curveTo(4.5f, 5.0f, 2.0f, 7.5f, 2.0f, 10.5f)
                reflectiveCurveTo(4.5f, 16.0f, 7.5f, 16.0f)
                horizontalLineTo(13.2f)
                verticalLineTo(15.5f)
                curveTo(13.2f, 15.2f, 13.2f, 14.8f, 13.3f, 14.5f)
                horizontalLineTo(7.5f)
                curveTo(5.3f, 14.5f, 3.5f, 12.7f, 3.5f, 10.5f)
                reflectiveCurveTo(5.3f, 6.5f, 7.5f, 6.5f)
                horizontalLineTo(18.0f)
                curveTo(19.4f, 6.5f, 20.5f, 7.6f, 20.5f, 9.0f)
                curveTo(20.5f, 9.9f, 20.0f, 10.7f, 19.2f, 11.2f)
                curveTo(19.8f, 11.3f, 20.3f, 11.6f, 20.8f, 11.9f)
                curveTo(21.6f, 11.1f, 22.0f, 10.1f, 22.0f, 9.0f)
                curveTo(22.0f, 6.8f, 20.2f, 5.0f, 18.0f, 5.0f)
                horizontalLineTo(7.5f)
                moveTo(9.5f, 8.0f)
                curveTo(8.1f, 8.0f, 7.0f, 9.1f, 7.0f, 10.5f)
                reflectiveCurveTo(8.1f, 13.0f, 9.5f, 13.0f)
                horizontalLineTo(14.0f)
                curveTo(14.5f, 12.3f, 15.1f, 11.8f, 15.8f, 11.5f)
                horizontalLineTo(9.5f)
                curveTo(8.9f, 11.5f, 8.5f, 11.1f, 8.5f, 10.5f)
                reflectiveCurveTo(8.9f, 9.5f, 9.5f, 9.5f)
                horizontalLineTo(17.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(9.5f)
                close()
            }
        }
        .build()
        return _attachmentLock!!
    }

private var _attachmentLock: ImageVector? = null
