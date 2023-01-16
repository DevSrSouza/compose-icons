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

public val MaterialDesignIcons.SmokingPipe: ImageVector
    get() {
        if (_smokingPipe != null) {
            return _smokingPipe!!
        }
        _smokingPipe = Builder(name = "SmokingPipe", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 13.0f)
                curveTo(14.89f, 13.0f, 14.0f, 13.89f, 14.0f, 15.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(13.0f)
                curveTo(12.0f, 18.0f, 11.0f, 17.92f, 10.3f, 17.23f)
                lineTo(6.53f, 13.47f)
                curveTo(5.6f, 12.53f, 4.33f, 12.0f, 3.0f, 12.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(3.0f)
                curveTo(3.8f, 14.0f, 4.56f, 14.32f, 5.12f, 14.88f)
                lineTo(8.89f, 18.65f)
                curveTo(11.72f, 21.5f, 13.0f, 22.0f, 16.0f, 22.0f)
                horizontalLineTo(18.0f)
                curveTo(20.21f, 22.0f, 22.0f, 20.21f, 22.0f, 18.0f)
                verticalLineTo(15.0f)
                curveTo(22.0f, 13.89f, 21.11f, 13.0f, 20.0f, 13.0f)
                horizontalLineTo(16.0f)
                moveTo(14.0f, 7.2f)
                horizontalLineTo(12.5f)
                curveTo(11.45f, 7.12f, 10.65f, 6.25f, 10.65f, 5.2f)
                curveTo(10.67f, 4.22f, 11.5f, 3.43f, 12.46f, 3.45f)
                lineTo(12.5f, 3.45f)
                verticalLineTo(2.0f)
                curveTo(10.65f, 2.0f, 9.15f, 3.5f, 9.15f, 5.35f)
                reflectiveCurveTo(10.65f, 8.7f, 12.5f, 8.7f)
                horizontalLineTo(14.0f)
                curveTo(15.07f, 8.66f, 15.96f, 9.5f, 16.0f, 10.56f)
                curveTo(16.0f, 10.61f, 16.0f, 10.65f, 16.0f, 10.7f)
                verticalLineTo(12.0f)
                horizontalLineTo(17.5f)
                verticalLineTo(10.36f)
                curveTo(17.42f, 8.53f, 15.88f, 7.12f, 14.05f, 7.2f)
                lineTo(14.0f, 7.2f)
                moveTo(20.0f, 9.76f)
                verticalLineTo(12.0f)
                horizontalLineTo(18.5f)
                verticalLineTo(9.77f)
                lineTo(18.5f, 9.7f)
                curveTo(18.5f, 7.5f, 16.71f, 5.7f, 14.5f, 5.7f)
                verticalLineTo(4.2f)
                horizontalLineTo(14.5f)
                curveTo(15.5f, 4.2f, 16.35f, 3.37f, 16.35f, 2.35f)
                curveTo(16.35f, 2.23f, 16.34f, 2.11f, 16.32f, 2.0f)
                horizontalLineTo(17.79f)
                curveTo(17.89f, 3.0f, 17.58f, 4.0f, 16.82f, 4.73f)
                horizontalLineTo(16.85f)
                curveTo(18.78f, 5.66f, 20.0f, 7.62f, 20.0f, 9.76f)
                close()
            }
        }
        .build()
        return _smokingPipe!!
    }

private var _smokingPipe: ImageVector? = null
