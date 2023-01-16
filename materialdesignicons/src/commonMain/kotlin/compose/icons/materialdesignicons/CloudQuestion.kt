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

public val MaterialDesignIcons.CloudQuestion: ImageVector
    get() {
        if (_cloudQuestion != null) {
            return _cloudQuestion!!
        }
        _cloudQuestion = Builder(name = "CloudQuestion", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.86f, 12.5f)
                curveTo(21.1f, 11.63f, 20.15f, 11.13f, 19.0f, 11.0f)
                curveTo(19.0f, 9.05f, 18.32f, 7.4f, 16.96f, 6.04f)
                curveTo(15.6f, 4.68f, 13.95f, 4.0f, 12.0f, 4.0f)
                curveTo(10.42f, 4.0f, 9.0f, 4.47f, 7.75f, 5.43f)
                reflectiveCurveTo(5.67f, 7.62f, 5.25f, 9.15f)
                curveTo(4.0f, 9.43f, 2.96f, 10.08f, 2.17f, 11.1f)
                reflectiveCurveTo(1.0f, 13.28f, 1.0f, 14.58f)
                curveTo(1.0f, 16.09f, 1.54f, 17.38f, 2.61f, 18.43f)
                curveTo(3.69f, 19.5f, 5.0f, 20.0f, 6.5f, 20.0f)
                horizontalLineTo(18.5f)
                curveTo(19.75f, 20.0f, 20.81f, 19.56f, 21.69f, 18.69f)
                curveTo(22.56f, 17.81f, 23.0f, 16.75f, 23.0f, 15.5f)
                curveTo(23.0f, 14.35f, 22.62f, 13.35f, 21.86f, 12.5f)
                moveTo(13.0f, 17.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(17.0f)
                moveTo(14.8f, 11.82f)
                curveTo(14.5f, 12.21f, 14.13f, 12.5f, 13.67f, 12.75f)
                curveTo(13.41f, 12.91f, 13.24f, 13.07f, 13.15f, 13.26f)
                curveTo(13.06f, 13.45f, 13.0f, 13.69f, 13.0f, 14.0f)
                horizontalLineTo(11.0f)
                curveTo(11.0f, 13.45f, 11.11f, 13.08f, 11.3f, 12.82f)
                curveTo(11.5f, 12.56f, 11.85f, 12.25f, 12.37f, 11.91f)
                curveTo(12.63f, 11.75f, 12.84f, 11.56f, 13.0f, 11.32f)
                curveTo(13.15f, 11.09f, 13.23f, 10.81f, 13.23f, 10.5f)
                curveTo(13.23f, 10.18f, 13.14f, 9.94f, 12.96f, 9.76f)
                curveTo(12.78f, 9.56f, 12.5f, 9.47f, 12.2f, 9.47f)
                curveTo(11.93f, 9.47f, 11.71f, 9.55f, 11.5f, 9.7f)
                curveTo(11.35f, 9.85f, 11.25f, 10.08f, 11.25f, 10.39f)
                horizontalLineTo(9.28f)
                curveTo(9.23f, 9.64f, 9.5f, 9.0f, 10.06f, 8.59f)
                curveTo(10.6f, 8.2f, 11.31f, 8.0f, 12.2f, 8.0f)
                curveTo(13.14f, 8.0f, 13.89f, 8.23f, 14.43f, 8.68f)
                reflectiveCurveTo(15.24f, 9.75f, 15.24f, 10.5f)
                curveTo(15.24f, 11.0f, 15.09f, 11.41f, 14.8f, 11.82f)
                close()
            }
        }
        .build()
        return _cloudQuestion!!
    }

private var _cloudQuestion: ImageVector? = null
