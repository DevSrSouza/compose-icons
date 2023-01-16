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

public val MaterialDesignIcons.PaperclipLock: ImageVector
    get() {
        if (_paperclipLock != null) {
            return _paperclipLock!!
        }
        _paperclipLock = Builder(name = "PaperclipLock", defaultWidth = 24.0.dp, defaultHeight =
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
                moveTo(8.9f, 2.0f)
                curveTo(6.8f, 2.0f, 5.0f, 3.8f, 5.0f, 6.0f)
                verticalLineTo(16.5f)
                curveTo(5.0f, 19.5f, 7.5f, 22.0f, 10.5f, 22.0f)
                curveTo(11.0f, 22.0f, 11.5f, 21.9f, 12.0f, 21.8f)
                verticalLineTo(20.2f)
                curveTo(11.5f, 20.4f, 11.0f, 20.5f, 10.5f, 20.5f)
                curveTo(8.3f, 20.5f, 6.5f, 18.7f, 6.5f, 16.5f)
                verticalLineTo(6.0f)
                curveTo(6.5f, 4.6f, 7.6f, 3.5f, 9.0f, 3.5f)
                reflectiveCurveTo(11.5f, 4.6f, 11.5f, 6.0f)
                verticalLineTo(14.5f)
                curveTo(11.5f, 15.1f, 11.1f, 15.5f, 10.5f, 15.5f)
                reflectiveCurveTo(9.5f, 15.1f, 9.5f, 14.5f)
                verticalLineTo(7.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(14.5f)
                curveTo(8.0f, 15.9f, 9.1f, 17.0f, 10.5f, 17.0f)
                reflectiveCurveTo(13.0f, 15.9f, 13.0f, 14.5f)
                verticalLineTo(6.0f)
                curveTo(13.0f, 3.8f, 11.2f, 2.0f, 8.9f, 2.0f)
                curveTo(9.0f, 2.0f, 9.0f, 2.0f, 8.9f, 2.0f)
                moveTo(14.5f, 7.0f)
                verticalLineTo(12.4f)
                curveTo(14.9f, 12.0f, 15.4f, 11.6f, 16.0f, 11.4f)
                verticalLineTo(7.0f)
                horizontalLineTo(14.5f)
                close()
            }
        }
        .build()
        return _paperclipLock!!
    }

private var _paperclipLock: ImageVector? = null
