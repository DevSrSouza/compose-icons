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

public val MaterialDesignIcons.RabbitVariant: ImageVector
    get() {
        if (_rabbitVariant != null) {
            return _rabbitVariant!!
        }
        _rabbitVariant = Builder(name = "RabbitVariant", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.84f, 14.5f)
                curveTo(16.58f, 14.33f, 16.22f, 13.89f, 16.05f, 13.68f)
                curveTo(17.24f, 12.0f, 19.0f, 8.87f, 19.0f, 5.0f)
                curveTo(19.0f, 3.05f, 18.26f, 2.0f, 17.0f, 2.0f)
                curveTo(15.46f, 2.0f, 13.04f, 4.06f, 12.0f, 7.97f)
                curveTo(10.96f, 4.06f, 8.54f, 2.0f, 7.0f, 2.0f)
                curveTo(5.74f, 2.0f, 5.0f, 3.05f, 5.0f, 5.0f)
                curveTo(5.0f, 8.87f, 6.76f, 12.0f, 7.95f, 13.68f)
                curveTo(7.78f, 13.89f, 7.42f, 14.33f, 7.16f, 14.5f)
                curveTo(6.66f, 14.93f, 5.5f, 15.89f, 5.5f, 17.5f)
                curveTo(5.5f, 19.71f, 7.29f, 21.5f, 9.5f, 21.5f)
                curveTo(11.05f, 21.5f, 12.0f, 20.94f, 12.0f, 20.94f)
                reflectiveCurveTo(12.95f, 21.5f, 14.5f, 21.5f)
                curveTo(16.71f, 21.5f, 18.5f, 19.71f, 18.5f, 17.5f)
                curveTo(18.5f, 15.89f, 17.34f, 14.93f, 16.84f, 14.5f)
                moveTo(9.35f, 12.2f)
                curveTo(8.34f, 10.7f, 7.0f, 8.12f, 7.0f, 5.0f)
                curveTo(7.0f, 4.5f, 7.06f, 4.2f, 7.12f, 4.03f)
                curveTo(8.06f, 4.34f, 10.36f, 6.74f, 10.5f, 11.67f)
                curveTo(10.03f, 11.79f, 9.66f, 11.97f, 9.35f, 12.2f)
                moveTo(10.5f, 16.75f)
                curveTo(10.22f, 16.75f, 10.0f, 16.41f, 10.0f, 16.0f)
                reflectiveCurveTo(10.22f, 15.25f, 10.5f, 15.25f)
                reflectiveCurveTo(11.0f, 15.59f, 11.0f, 16.0f)
                reflectiveCurveTo(10.78f, 16.75f, 10.5f, 16.75f)
                moveTo(12.0f, 19.5f)
                curveTo(11.45f, 19.5f, 11.0f, 18.78f, 11.0f, 18.5f)
                reflectiveCurveTo(11.45f, 18.0f, 12.0f, 18.0f)
                reflectiveCurveTo(13.0f, 18.22f, 13.0f, 18.5f)
                reflectiveCurveTo(12.55f, 19.5f, 12.0f, 19.5f)
                moveTo(13.5f, 16.75f)
                curveTo(13.22f, 16.75f, 13.0f, 16.41f, 13.0f, 16.0f)
                reflectiveCurveTo(13.22f, 15.25f, 13.5f, 15.25f)
                reflectiveCurveTo(14.0f, 15.59f, 14.0f, 16.0f)
                reflectiveCurveTo(13.78f, 16.75f, 13.5f, 16.75f)
                moveTo(13.5f, 11.67f)
                curveTo(13.64f, 6.74f, 15.94f, 4.34f, 16.88f, 4.03f)
                curveTo(16.94f, 4.2f, 17.0f, 4.5f, 17.0f, 5.0f)
                curveTo(17.0f, 8.12f, 15.66f, 10.7f, 14.65f, 12.2f)
                curveTo(14.34f, 11.97f, 13.97f, 11.79f, 13.5f, 11.67f)
                close()
            }
        }
        .build()
        return _rabbitVariant!!
    }

private var _rabbitVariant: ImageVector? = null
