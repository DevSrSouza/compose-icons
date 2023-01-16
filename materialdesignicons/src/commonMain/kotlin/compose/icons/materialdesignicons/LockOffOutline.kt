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

public val MaterialDesignIcons.LockOffOutline: ImageVector
    get() {
        if (_lockOffOutline != null) {
            return _lockOffOutline!!
        }
        _lockOffOutline = Builder(name = "LockOffOutline", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 5.82f)
                lineTo(7.36f, 4.16f)
                curveTo(8.09f, 2.31f, 9.89f, 1.0f, 12.0f, 1.0f)
                curveTo(14.76f, 1.0f, 17.0f, 3.24f, 17.0f, 6.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(18.0f)
                curveTo(19.11f, 8.0f, 20.0f, 8.9f, 20.0f, 10.0f)
                verticalLineTo(16.8f)
                lineTo(18.0f, 14.8f)
                verticalLineTo(10.0f)
                horizontalLineTo(13.2f)
                lineTo(11.2f, 8.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(6.0f)
                curveTo(15.0f, 4.34f, 13.66f, 3.0f, 12.0f, 3.0f)
                curveTo(10.41f, 3.0f, 9.11f, 4.25f, 9.0f, 5.82f)
                moveTo(22.11f, 21.46f)
                lineTo(20.84f, 22.73f)
                lineTo(19.46f, 21.35f)
                curveTo(19.1f, 21.75f, 18.58f, 22.0f, 18.0f, 22.0f)
                horizontalLineTo(6.0f)
                curveTo(4.89f, 22.0f, 4.0f, 21.1f, 4.0f, 20.0f)
                verticalLineTo(10.0f)
                curveTo(4.0f, 8.89f, 4.89f, 8.0f, 6.0f, 8.0f)
                horizontalLineTo(6.11f)
                lineTo(1.11f, 3.0f)
                lineTo(2.39f, 1.73f)
                lineTo(22.11f, 21.46f)
                moveTo(18.0f, 19.89f)
                lineTo(13.85f, 15.74f)
                curveTo(13.56f, 16.5f, 12.84f, 17.0f, 12.0f, 17.0f)
                curveTo(10.89f, 17.0f, 10.0f, 16.1f, 10.0f, 15.0f)
                curveTo(10.0f, 14.15f, 10.5f, 13.44f, 11.26f, 13.15f)
                lineTo(8.11f, 10.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(19.89f)
                close()
            }
        }
        .build()
        return _lockOffOutline!!
    }

private var _lockOffOutline: ImageVector? = null
