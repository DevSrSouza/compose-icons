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

public val MaterialDesignIcons.LockRemoveOutline: ImageVector
    get() {
        if (_lockRemoveOutline != null) {
            return _lockRemoveOutline!!
        }
        _lockRemoveOutline = Builder(name = "LockRemoveOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 15.0f)
                curveTo(14.0f, 16.11f, 13.11f, 17.0f, 12.0f, 17.0f)
                curveTo(10.89f, 17.0f, 10.0f, 16.1f, 10.0f, 15.0f)
                curveTo(10.0f, 13.89f, 10.89f, 13.0f, 12.0f, 13.0f)
                curveTo(13.11f, 13.0f, 14.0f, 13.9f, 14.0f, 15.0f)
                moveTo(13.09f, 20.0f)
                curveTo(13.21f, 20.72f, 13.46f, 21.39f, 13.81f, 22.0f)
                horizontalLineTo(6.0f)
                curveTo(4.89f, 22.0f, 4.0f, 21.1f, 4.0f, 20.0f)
                verticalLineTo(10.0f)
                curveTo(4.0f, 8.89f, 4.89f, 8.0f, 6.0f, 8.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(6.0f)
                curveTo(7.0f, 3.24f, 9.24f, 1.0f, 12.0f, 1.0f)
                reflectiveCurveTo(17.0f, 3.24f, 17.0f, 6.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(18.0f)
                curveTo(19.11f, 8.0f, 20.0f, 8.9f, 20.0f, 10.0f)
                verticalLineTo(13.09f)
                curveTo(19.67f, 13.04f, 19.34f, 13.0f, 19.0f, 13.0f)
                curveTo(18.66f, 13.0f, 18.33f, 13.04f, 18.0f, 13.09f)
                verticalLineTo(10.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(13.09f)
                moveTo(9.0f, 8.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(6.0f)
                curveTo(15.0f, 4.34f, 13.66f, 3.0f, 12.0f, 3.0f)
                reflectiveCurveTo(9.0f, 4.34f, 9.0f, 6.0f)
                verticalLineTo(8.0f)
                moveTo(22.54f, 16.88f)
                lineTo(21.12f, 15.47f)
                lineTo(19.0f, 17.59f)
                lineTo(16.88f, 15.47f)
                lineTo(15.47f, 16.88f)
                lineTo(17.59f, 19.0f)
                lineTo(15.47f, 21.12f)
                lineTo(16.88f, 22.54f)
                lineTo(19.0f, 20.41f)
                lineTo(21.12f, 22.54f)
                lineTo(22.54f, 21.12f)
                lineTo(20.41f, 19.0f)
                lineTo(22.54f, 16.88f)
                close()
            }
        }
        .build()
        return _lockRemoveOutline!!
    }

private var _lockRemoveOutline: ImageVector? = null
