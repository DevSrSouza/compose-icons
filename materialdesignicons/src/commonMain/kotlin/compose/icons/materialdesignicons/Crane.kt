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

public val MaterialDesignIcons.Crane: ImageVector
    get() {
        if (_crane != null) {
            return _crane!!
        }
        _crane = Builder(name = "Crane", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 6.0f)
                verticalLineTo(5.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 19.0f, 4.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(19.92f)
                lineTo(12.0f, 17.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(10.62f)
                curveTo(16.53f, 10.79f, 16.19f, 11.23f, 16.19f, 11.76f)
                curveTo(16.19f, 12.2f, 16.43f, 12.6f, 16.8f, 12.82f)
                verticalLineTo(14.0f)
                horizontalLineTo(17.42f)
                curveTo(17.76f, 14.0f, 18.03f, 14.28f, 18.03f, 14.62f)
                curveTo(18.03f, 14.96f, 17.76f, 15.24f, 17.42f, 15.24f)
                curveTo(17.2f, 15.24f, 17.0f, 15.12f, 16.89f, 14.93f)
                curveTo(16.71f, 14.64f, 16.34f, 14.54f, 16.05f, 14.71f)
                curveTo(15.75f, 14.87f, 15.65f, 15.25f, 15.82f, 15.55f)
                curveTo(16.15f, 16.11f, 16.76f, 16.47f, 17.42f, 16.47f)
                curveTo(18.43f, 16.47f, 19.26f, 15.64f, 19.26f, 14.62f)
                curveTo(19.26f, 13.84f, 18.76f, 13.14f, 18.03f, 12.88f)
                verticalLineTo(12.82f)
                curveTo(18.41f, 12.6f, 18.65f, 12.2f, 18.65f, 11.76f)
                curveTo(18.65f, 11.3f, 18.38f, 10.91f, 18.0f, 10.7f)
                verticalLineTo(6.0f)
                horizontalLineTo(20.0f)
                moveTo(8.0f, 13.66f)
                lineTo(7.0f, 14.66f)
                verticalLineTo(13.24f)
                lineTo(8.0f, 12.24f)
                verticalLineTo(13.66f)
                moveTo(8.0f, 10.71f)
                lineTo(7.0f, 11.71f)
                verticalLineTo(10.29f)
                lineTo(8.0f, 9.29f)
                verticalLineTo(10.71f)
                moveTo(7.0f, 8.71f)
                verticalLineTo(7.29f)
                lineTo(8.0f, 6.29f)
                verticalLineTo(7.71f)
                lineTo(7.0f, 8.71f)
                close()
            }
        }
        .build()
        return _crane!!
    }

private var _crane: ImageVector? = null
