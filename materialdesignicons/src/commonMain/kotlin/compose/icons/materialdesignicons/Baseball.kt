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

public val MaterialDesignIcons.Baseball: ImageVector
    get() {
        if (_baseball != null) {
            return _baseball!!
        }
        _baseball = Builder(name = "Baseball", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(9.5f, 2.0f, 7.25f, 2.9f, 5.5f, 4.4f)
                curveTo(6.0f, 4.81f, 6.41f, 5.27f, 6.8f, 5.76f)
                lineTo(7.89f, 5.13f)
                lineTo(8.89f, 6.87f)
                lineTo(7.89f, 7.44f)
                curveTo(8.45f, 8.53f, 8.82f, 9.73f, 8.95f, 11.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(12.0f)
                lineTo(10.0f, 13.0f)
                horizontalLineTo(8.95f)
                curveTo(8.82f, 14.27f, 8.45f, 15.47f, 7.89f, 16.56f)
                lineTo(8.89f, 17.13f)
                lineTo(7.89f, 18.87f)
                lineTo(6.8f, 18.24f)
                curveTo(6.41f, 18.73f, 6.0f, 19.19f, 5.5f, 19.6f)
                curveTo(7.25f, 21.1f, 9.5f, 22.0f, 12.0f, 22.0f)
                curveTo(14.5f, 22.0f, 16.75f, 21.1f, 18.5f, 19.6f)
                curveTo(18.0f, 19.19f, 17.59f, 18.73f, 17.19f, 18.24f)
                lineTo(16.11f, 18.87f)
                lineTo(15.11f, 17.13f)
                lineTo(16.11f, 16.55f)
                curveTo(15.55f, 15.47f, 15.18f, 14.27f, 15.05f, 13.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(15.05f)
                curveTo(15.18f, 9.73f, 15.55f, 8.53f, 16.11f, 7.45f)
                lineTo(15.11f, 6.87f)
                lineTo(16.11f, 5.13f)
                lineTo(17.19f, 5.76f)
                curveTo(17.59f, 5.27f, 18.0f, 4.81f, 18.5f, 4.4f)
                curveTo(16.75f, 2.9f, 14.5f, 2.0f, 12.0f, 2.0f)
                moveTo(4.12f, 5.85f)
                curveTo(2.79f, 7.55f, 2.0f, 9.68f, 2.0f, 12.0f)
                curveTo(2.0f, 14.32f, 2.79f, 16.45f, 4.12f, 18.15f)
                curveTo(4.46f, 17.87f, 4.76f, 17.55f, 5.05f, 17.22f)
                lineTo(4.43f, 16.87f)
                lineTo(5.43f, 15.13f)
                lineTo(6.16f, 15.56f)
                curveTo(6.55f, 14.77f, 6.82f, 13.91f, 6.93f, 13.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(12.0f)
                lineTo(6.0f, 11.0f)
                horizontalLineTo(6.93f)
                curveTo(6.82f, 10.09f, 6.55f, 9.23f, 6.16f, 8.44f)
                lineTo(5.43f, 8.87f)
                lineTo(4.43f, 7.13f)
                lineTo(5.05f, 6.78f)
                curveTo(4.76f, 6.45f, 4.46f, 6.13f, 4.12f, 5.85f)
                moveTo(19.88f, 5.85f)
                curveTo(19.54f, 6.13f, 19.24f, 6.45f, 18.95f, 6.78f)
                lineTo(19.57f, 7.13f)
                lineTo(18.57f, 8.87f)
                lineTo(17.84f, 8.44f)
                curveTo(17.45f, 9.23f, 17.18f, 10.09f, 17.07f, 11.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(17.07f)
                curveTo(17.18f, 13.91f, 17.45f, 14.77f, 17.84f, 15.56f)
                lineTo(18.57f, 15.13f)
                lineTo(19.57f, 16.87f)
                lineTo(18.95f, 17.22f)
                curveTo(19.24f, 17.55f, 19.54f, 17.87f, 19.88f, 18.15f)
                curveTo(21.21f, 16.45f, 22.0f, 14.32f, 22.0f, 12.0f)
                curveTo(22.0f, 9.68f, 21.21f, 7.55f, 19.88f, 5.85f)
                close()
            }
        }
        .build()
        return _baseball!!
    }

private var _baseball: ImageVector? = null
