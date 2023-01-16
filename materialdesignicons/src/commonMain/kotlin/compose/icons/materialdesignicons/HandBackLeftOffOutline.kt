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

public val MaterialDesignIcons.HandBackLeftOffOutline: ImageVector
    get() {
        if (_handBackLeftOffOutline != null) {
            return _handBackLeftOffOutline!!
        }
        _handBackLeftOffOutline = Builder(name = "HandBackLeftOffOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.11f, 21.46f)
                lineTo(2.39f, 1.73f)
                lineTo(1.11f, 3.0f)
                lineTo(3.56f, 5.45f)
                curveTo(3.21f, 5.87f, 3.0f, 6.41f, 3.0f, 7.0f)
                verticalLineTo(16.0f)
                curveTo(3.0f, 20.42f, 6.58f, 24.0f, 11.0f, 24.0f)
                curveTo(13.94f, 24.0f, 16.62f, 22.45f, 18.12f, 20.0f)
                lineTo(20.84f, 22.73f)
                lineTo(22.11f, 21.46f)
                moveTo(11.0f, 22.0f)
                curveTo(7.69f, 22.0f, 5.0f, 19.31f, 5.0f, 16.0f)
                verticalLineTo(7.0f)
                curveTo(5.0f, 6.97f, 5.0f, 6.94f, 5.0f, 6.91f)
                lineTo(6.0f, 7.89f)
                verticalLineTo(12.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(9.89f)
                lineTo(9.0f, 10.89f)
                verticalLineTo(12.0f)
                horizontalLineTo(10.11f)
                lineTo(16.65f, 18.54f)
                curveTo(15.57f, 20.64f, 13.41f, 22.0f, 11.0f, 22.0f)
                moveTo(8.0f, 4.8f)
                lineTo(6.21f, 3.0f)
                curveTo(6.59f, 2.12f, 7.47f, 1.5f, 8.5f, 1.5f)
                curveTo(8.73f, 1.5f, 8.96f, 1.53f, 9.17f, 1.59f)
                curveTo(9.54f, 0.66f, 10.44f, 0.0f, 11.5f, 0.0f)
                curveTo(12.73f, 0.0f, 13.75f, 0.89f, 13.96f, 2.06f)
                curveTo(14.13f, 2.0f, 14.31f, 2.0f, 14.5f, 2.0f)
                curveTo(15.88f, 2.0f, 17.0f, 3.12f, 17.0f, 4.5f)
                verticalLineTo(10.39f)
                curveTo(17.34f, 10.08f, 17.76f, 9.85f, 18.22f, 9.73f)
                lineTo(19.0f, 9.5f)
                curveTo(19.82f, 9.29f, 20.69f, 9.61f, 21.18f, 10.35f)
                curveTo(21.56f, 10.92f, 21.58f, 11.66f, 21.33f, 12.3f)
                lineTo(19.67f, 16.47f)
                lineTo(18.13f, 14.93f)
                lineTo(19.5f, 11.45f)
                lineTo(19.0f, 11.59f)
                curveTo(18.5f, 11.71f, 18.15f, 12.05f, 18.0f, 12.5f)
                lineTo(17.34f, 14.14f)
                lineTo(15.0f, 11.8f)
                verticalLineTo(4.5f)
                curveTo(15.0f, 4.22f, 14.78f, 4.0f, 14.5f, 4.0f)
                reflectiveCurveTo(14.0f, 4.22f, 14.0f, 4.5f)
                verticalLineTo(10.8f)
                lineTo(12.0f, 8.8f)
                verticalLineTo(2.5f)
                curveTo(12.0f, 2.22f, 11.78f, 2.0f, 11.5f, 2.0f)
                reflectiveCurveTo(11.0f, 2.22f, 11.0f, 2.5f)
                verticalLineTo(7.8f)
                lineTo(9.0f, 5.8f)
                verticalLineTo(4.0f)
                curveTo(9.0f, 3.72f, 8.78f, 3.5f, 8.5f, 3.5f)
                reflectiveCurveTo(8.0f, 3.72f, 8.0f, 4.0f)
                verticalLineTo(4.8f)
                close()
            }
        }
        .build()
        return _handBackLeftOffOutline!!
    }

private var _handBackLeftOffOutline: ImageVector? = null
