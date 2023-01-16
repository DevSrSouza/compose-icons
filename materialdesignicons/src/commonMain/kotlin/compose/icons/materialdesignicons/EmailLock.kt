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

public val MaterialDesignIcons.EmailLock: ImageVector
    get() {
        if (_emailLock != null) {
            return _emailLock!!
        }
        _emailLock = Builder(name = "EmailLock", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 18.2f)
                curveTo(12.0f, 17.24f, 12.5f, 16.34f, 13.2f, 15.74f)
                verticalLineTo(15.5f)
                curveTo(13.2f, 13.06f, 15.4f, 11.0f, 18.0f, 11.0f)
                curveTo(19.65f, 11.0f, 21.13f, 11.83f, 22.0f, 13.06f)
                verticalLineTo(6.0f)
                curveTo(22.0f, 4.89f, 21.1f, 4.0f, 20.0f, 4.0f)
                horizontalLineTo(4.0f)
                curveTo(2.89f, 4.0f, 2.0f, 4.89f, 2.0f, 6.0f)
                verticalLineTo(18.0f)
                curveTo(2.0f, 19.11f, 2.9f, 20.0f, 4.0f, 20.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(18.2f)
                moveTo(4.0f, 6.0f)
                lineTo(12.0f, 11.0f)
                lineTo(20.0f, 6.0f)
                verticalLineTo(8.0f)
                lineTo(12.0f, 13.0f)
                lineTo(4.0f, 8.0f)
                verticalLineTo(6.0f)
                moveTo(20.8f, 17.0f)
                verticalLineTo(15.5f)
                curveTo(20.8f, 14.1f, 19.4f, 13.0f, 18.0f, 13.0f)
                reflectiveCurveTo(15.2f, 14.1f, 15.2f, 15.5f)
                verticalLineTo(17.0f)
                curveTo(14.6f, 17.0f, 14.0f, 17.6f, 14.0f, 18.2f)
                verticalLineTo(21.7f)
                curveTo(14.0f, 22.4f, 14.6f, 23.0f, 15.2f, 23.0f)
                horizontalLineTo(20.7f)
                curveTo(21.4f, 23.0f, 22.0f, 22.4f, 22.0f, 21.8f)
                verticalLineTo(18.3f)
                curveTo(22.0f, 17.6f, 21.4f, 17.0f, 20.8f, 17.0f)
                moveTo(19.5f, 17.0f)
                horizontalLineTo(16.5f)
                verticalLineTo(15.5f)
                curveTo(16.5f, 14.7f, 17.2f, 14.2f, 18.0f, 14.2f)
                reflectiveCurveTo(19.5f, 14.7f, 19.5f, 15.5f)
                verticalLineTo(17.0f)
                close()
            }
        }
        .build()
        return _emailLock!!
    }

private var _emailLock: ImageVector? = null
