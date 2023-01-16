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

public val MaterialDesignIcons.WrenchCog: ImageVector
    get() {
        if (_wrenchCog != null) {
            return _wrenchCog!!
        }
        _wrenchCog = Builder(name = "WrenchCog", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.94f, 17.94f)
                curveTo(19.96f, 17.79f, 19.97f, 17.65f, 19.97f, 17.5f)
                reflectiveCurveTo(19.96f, 17.2f, 19.94f, 17.05f)
                lineTo(20.91f, 16.32f)
                curveTo(21.0f, 16.25f, 21.03f, 16.13f, 20.97f, 16.03f)
                lineTo(20.05f, 14.47f)
                curveTo(20.0f, 14.37f, 19.86f, 14.33f, 19.76f, 14.37f)
                lineTo(18.61f, 14.82f)
                curveTo(18.37f, 14.65f, 18.12f, 14.5f, 17.83f, 14.38f)
                lineTo(17.66f, 13.19f)
                curveTo(17.64f, 13.08f, 17.54f, 13.0f, 17.43f, 13.0f)
                horizontalLineTo(15.58f)
                curveTo(15.46f, 13.0f, 15.36f, 13.08f, 15.34f, 13.19f)
                lineTo(15.17f, 14.38f)
                curveTo(14.88f, 14.5f, 14.63f, 14.65f, 14.39f, 14.82f)
                lineTo(13.24f, 14.37f)
                curveTo(13.14f, 14.33f, 13.0f, 14.37f, 12.96f, 14.47f)
                lineTo(12.03f, 16.03f)
                curveTo(11.97f, 16.13f, 12.0f, 16.25f, 12.09f, 16.32f)
                lineTo(13.06f, 17.05f)
                curveTo(13.05f, 17.2f, 13.03f, 17.35f, 13.03f, 17.5f)
                reflectiveCurveTo(13.05f, 17.79f, 13.06f, 17.94f)
                lineTo(12.09f, 18.68f)
                curveTo(12.0f, 18.75f, 11.97f, 18.87f, 12.03f, 18.97f)
                lineTo(12.96f, 20.53f)
                curveTo(13.0f, 20.63f, 13.14f, 20.66f, 13.24f, 20.63f)
                lineTo(14.39f, 20.17f)
                curveTo(14.63f, 20.35f, 14.88f, 20.5f, 15.17f, 20.62f)
                lineTo(15.34f, 21.81f)
                curveTo(15.36f, 21.92f, 15.46f, 22.0f, 15.58f, 22.0f)
                horizontalLineTo(17.43f)
                curveTo(17.54f, 22.0f, 17.64f, 21.92f, 17.66f, 21.81f)
                lineTo(17.83f, 20.62f)
                curveTo(18.12f, 20.5f, 18.37f, 20.35f, 18.61f, 20.17f)
                lineTo(19.76f, 20.63f)
                curveTo(19.86f, 20.66f, 20.0f, 20.63f, 20.05f, 20.53f)
                lineTo(20.97f, 18.97f)
                curveTo(21.03f, 18.87f, 21.0f, 18.75f, 20.91f, 18.68f)
                lineTo(19.94f, 17.94f)
                moveTo(16.5f, 19.0f)
                curveTo(15.67f, 19.0f, 15.0f, 18.33f, 15.0f, 17.5f)
                reflectiveCurveTo(15.67f, 16.0f, 16.5f, 16.0f)
                reflectiveCurveTo(18.0f, 16.67f, 18.0f, 17.5f)
                reflectiveCurveTo(17.33f, 19.0f, 16.5f, 19.0f)
                moveTo(9.0f, 2.0f)
                curveTo(10.8f, 2.6f, 12.0f, 4.3f, 12.0f, 6.2f)
                curveTo(12.0f, 8.2f, 10.8f, 9.9f, 9.0f, 10.5f)
                verticalLineTo(21.5f)
                curveTo(9.0f, 21.8f, 8.8f, 22.0f, 8.5f, 22.0f)
                horizontalLineTo(6.5f)
                curveTo(6.2f, 22.0f, 6.0f, 21.8f, 6.0f, 21.4f)
                verticalLineTo(10.4f)
                curveTo(4.2f, 9.8f, 3.0f, 8.1f, 3.0f, 6.2f)
                reflectiveCurveTo(4.2f, 2.6f, 6.0f, 2.0f)
                verticalLineTo(5.7f)
                horizontalLineTo(9.0f)
                verticalLineTo(2.0f)
                close()
            }
        }
        .build()
        return _wrenchCog!!
    }

private var _wrenchCog: ImageVector? = null
