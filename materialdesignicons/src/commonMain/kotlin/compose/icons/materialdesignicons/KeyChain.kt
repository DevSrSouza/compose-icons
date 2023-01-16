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

public val MaterialDesignIcons.KeyChain: ImageVector
    get() {
        if (_keyChain != null) {
            return _keyChain!!
        }
        _keyChain = Builder(name = "KeyChain", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.67f, 13.67f)
                curveTo(12.2f, 14.13f, 11.63f, 14.5f, 11.0f, 14.73f)
                verticalLineTo(23.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(14.72f)
                curveTo(6.26f, 14.1f, 5.0f, 12.46f, 5.0f, 10.5f)
                curveTo(5.0f, 8.0f, 7.0f, 6.0f, 9.5f, 6.0f)
                curveTo(9.54f, 6.0f, 9.57f, 6.0f, 9.6f, 6.0f)
                curveTo(9.13f, 6.95f, 8.92f, 8.0f, 9.03f, 9.08f)
                curveTo(8.44f, 9.28f, 8.0f, 9.84f, 8.0f, 10.5f)
                curveTo(8.0f, 11.33f, 8.67f, 12.0f, 9.5f, 12.0f)
                curveTo(9.73f, 12.0f, 9.95f, 11.94f, 10.15f, 11.85f)
                curveTo(10.79f, 12.69f, 11.67f, 13.32f, 12.67f, 13.67f)
                moveTo(20.73f, 19.44f)
                lineTo(17.97f, 20.6f)
                lineTo(17.19f, 18.76f)
                lineTo(14.43f, 19.93f)
                lineTo(13.26f, 17.16f)
                lineTo(16.03f, 16.0f)
                lineTo(14.76f, 13.0f)
                curveTo(12.91f, 13.08f, 11.11f, 12.05f, 10.35f, 10.25f)
                curveTo(9.39f, 7.96f, 10.47f, 5.32f, 12.76f, 4.35f)
                curveTo(13.0f, 4.25f, 13.26f, 4.18f, 13.5f, 4.12f)
                curveTo(12.84f, 2.87f, 11.5f, 2.0f, 10.0f, 2.0f)
                curveTo(7.79f, 2.0f, 6.0f, 3.79f, 6.0f, 6.0f)
                curveTo(6.0f, 6.08f, 6.0f, 6.16f, 6.0f, 6.24f)
                curveTo(5.7f, 6.5f, 5.4f, 6.82f, 5.15f, 7.15f)
                curveTo(5.06f, 6.78f, 5.0f, 6.4f, 5.0f, 6.0f)
                curveTo(5.0f, 3.24f, 7.24f, 1.0f, 10.0f, 1.0f)
                reflectiveCurveTo(15.0f, 3.24f, 15.0f, 6.0f)
                curveTo(15.0f, 7.42f, 14.4f, 8.67f, 13.45f, 9.57f)
                curveTo(13.87f, 10.0f, 14.5f, 10.13f, 15.08f, 9.88f)
                curveTo(15.85f, 9.56f, 16.2f, 8.68f, 15.88f, 7.92f)
                curveTo(15.85f, 7.83f, 15.8f, 7.74f, 15.74f, 7.66f)
                curveTo(15.9f, 7.13f, 16.0f, 6.58f, 16.0f, 6.0f)
                curveTo(16.0f, 5.37f, 15.9f, 4.76f, 15.72f, 4.19f)
                curveTo(17.0f, 4.55f, 18.1f, 5.44f, 18.65f, 6.76f)
                curveTo(19.41f, 8.56f, 18.89f, 10.57f, 17.5f, 11.81f)
                lineTo(20.73f, 19.44f)
                moveTo(13.0f, 8.6f)
                curveTo(13.37f, 8.19f, 13.65f, 7.71f, 13.82f, 7.18f)
                curveTo(13.28f, 7.45f, 12.97f, 8.0f, 13.0f, 8.6f)
                close()
            }
        }
        .build()
        return _keyChain!!
    }

private var _keyChain: ImageVector? = null
