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

public val MaterialDesignIcons.Kitesurfing: ImageVector
    get() {
        if (_kitesurfing != null) {
            return _kitesurfing!!
        }
        _kitesurfing = Builder(name = "Kitesurfing", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.5f, 4.5f)
                lineTo(15.5f, 3.43f)
                lineTo(17.92f, 1.0f)
                horizontalLineTo(20.0f)
                lineTo(16.5f, 4.5f)
                moveTo(20.96f, 23.0f)
                curveTo(19.9f, 23.0f, 18.9f, 22.75f, 17.96f, 22.25f)
                curveTo(16.12f, 23.25f, 13.81f, 23.25f, 11.97f, 22.25f)
                curveTo(10.13f, 23.25f, 7.82f, 23.25f, 6.0f, 22.25f)
                curveTo(4.77f, 22.94f, 3.36f, 23.05f, 2.0f, 23.0f)
                verticalLineTo(21.0f)
                curveTo(3.41f, 21.05f, 4.77f, 20.9f, 6.0f, 20.0f)
                curveTo(7.74f, 21.25f, 10.21f, 21.25f, 11.97f, 20.0f)
                curveTo(13.74f, 21.25f, 16.2f, 21.25f, 17.96f, 20.0f)
                curveTo(19.17f, 20.9f, 20.54f, 21.05f, 21.94f, 21.0f)
                verticalLineTo(23.0f)
                horizontalLineTo(20.96f)
                moveTo(20.35f, 12.26f)
                curveTo(18.3f, 11.5f, 16.14f, 12.61f, 14.08f, 13.36f)
                lineTo(12.39f, 11.5f)
                horizontalLineTo(9.58f)
                verticalLineTo(8.0f)
                curveTo(11.89f, 8.19f, 14.29f, 7.67f, 15.9f, 5.96f)
                lineTo(14.5f, 4.56f)
                curveTo(13.6f, 5.46f, 12.3f, 6.0f, 11.0f, 6.0f)
                horizontalLineTo(8.0f)
                curveTo(6.89f, 6.0f, 5.95f, 6.92f, 6.0f, 8.0f)
                curveTo(6.07f, 9.35f, 5.67f, 12.73f, 6.45f, 13.87f)
                lineTo(8.0f, 16.82f)
                curveTo(7.43f, 17.23f, 6.93f, 17.62f, 6.5f, 18.0f)
                curveTo(8.09f, 19.5f, 10.65f, 19.17f, 11.97f, 17.5f)
                curveTo(12.91f, 18.59f, 14.45f, 19.3f, 15.9f, 18.83f)
                curveTo(17.45f, 17.77f, 22.74f, 14.0f, 20.35f, 12.26f)
                moveTo(11.43f, 14.65f)
                curveTo(11.0f, 14.89f, 10.16f, 15.37f, 9.82f, 15.61f)
                lineTo(8.97f, 13.59f)
                lineTo(11.46f, 13.5f)
                lineTo(12.16f, 14.25f)
                lineTo(11.43f, 14.65f)
                moveTo(8.0f, 1.0f)
                curveTo(6.9f, 1.0f, 6.0f, 1.9f, 6.0f, 3.0f)
                reflectiveCurveTo(6.9f, 5.0f, 8.0f, 5.0f)
                reflectiveCurveTo(10.0f, 4.11f, 10.0f, 3.0f)
                reflectiveCurveTo(9.11f, 1.0f, 8.0f, 1.0f)
                close()
            }
        }
        .build()
        return _kitesurfing!!
    }

private var _kitesurfing: ImageVector? = null
