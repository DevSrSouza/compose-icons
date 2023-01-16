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

public val MaterialDesignIcons.JellyfishOutline: ImageVector
    get() {
        if (_jellyfishOutline != null) {
            return _jellyfishOutline!!
        }
        _jellyfishOutline = Builder(name = "JellyfishOutline", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 4.0f)
                curveTo(15.8f, 4.0f, 18.5f, 6.8f, 18.5f, 10.8f)
                curveTo(14.31f, 12.39f, 9.69f, 12.39f, 5.5f, 10.8f)
                curveTo(5.5f, 6.8f, 8.2f, 4.0f, 12.0f, 4.0f)
                moveTo(12.0f, 2.0f)
                curveTo(7.3f, 2.0f, 3.5f, 5.5f, 3.5f, 10.9f)
                curveTo(3.56f, 11.7f, 4.06f, 12.4f, 4.8f, 12.7f)
                lineTo(6.5f, 13.2f)
                verticalLineTo(15.5f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 6.0f, 16.0f)
                arcTo(0.5f, 0.5f, 0.0f, false, true, 5.5f, 15.5f)
                curveTo(5.57f, 14.92f, 5.08f, 14.43f, 4.5f, 14.5f)
                curveTo(3.92f, 14.43f, 3.43f, 14.92f, 3.5f, 15.5f)
                curveTo(3.44f, 16.86f, 4.54f, 18.0f, 5.9f, 18.0f)
                horizontalLineTo(6.0f)
                curveTo(7.41f, 18.06f, 8.56f, 16.91f, 8.5f, 15.5f)
                verticalLineTo(13.7f)
                horizontalLineTo(9.5f)
                verticalLineTo(19.4f)
                curveTo(9.5f, 20.07f, 8.5f, 20.07f, 8.5f, 19.4f)
                curveTo(8.57f, 18.82f, 8.08f, 18.33f, 7.5f, 18.4f)
                curveTo(6.92f, 18.33f, 6.43f, 18.82f, 6.5f, 19.4f)
                curveTo(6.39f, 20.8f, 7.5f, 22.0f, 8.9f, 22.0f)
                horizontalLineTo(9.0f)
                curveTo(10.41f, 22.06f, 11.56f, 20.91f, 11.5f, 19.5f)
                verticalLineTo(14.0f)
                horizontalLineTo(12.5f)
                verticalLineTo(19.5f)
                curveTo(12.44f, 20.91f, 13.59f, 22.06f, 15.0f, 22.0f)
                horizontalLineTo(15.1f)
                curveTo(16.47f, 22.0f, 17.56f, 20.86f, 17.5f, 19.5f)
                curveTo(17.5f, 18.17f, 15.5f, 18.17f, 15.5f, 19.5f)
                curveTo(15.5f, 20.17f, 14.5f, 20.17f, 14.5f, 19.5f)
                verticalLineTo(13.8f)
                horizontalLineTo(15.5f)
                verticalLineTo(15.6f)
                curveTo(15.5f, 16.96f, 16.63f, 18.06f, 18.0f, 18.0f)
                horizontalLineTo(18.1f)
                curveTo(19.47f, 18.0f, 20.56f, 16.86f, 20.5f, 15.5f)
                curveTo(20.5f, 14.17f, 18.5f, 14.17f, 18.5f, 15.5f)
                curveTo(18.5f, 16.17f, 17.5f, 16.17f, 17.5f, 15.5f)
                verticalLineTo(13.2f)
                lineTo(19.2f, 12.7f)
                curveTo(19.92f, 12.36f, 20.41f, 11.68f, 20.5f, 10.9f)
                curveTo(20.5f, 5.5f, 16.7f, 2.0f, 12.0f, 2.0f)
                moveTo(12.0f, 6.2f)
                curveTo(10.53f, 6.6f, 9.24f, 7.53f, 8.4f, 8.8f)
                curveTo(8.0f, 9.33f, 7.2f, 8.73f, 7.6f, 8.2f)
                curveTo(8.6f, 6.73f, 10.09f, 5.67f, 11.8f, 5.2f)
                curveTo(12.08f, 5.14f, 12.35f, 5.32f, 12.4f, 5.6f)
                curveTo(12.5f, 5.9f, 12.3f, 6.1f, 12.0f, 6.2f)
                close()
            }
        }
        .build()
        return _jellyfishOutline!!
    }

private var _jellyfishOutline: ImageVector? = null
