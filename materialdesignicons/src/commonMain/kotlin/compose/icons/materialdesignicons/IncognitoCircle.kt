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

public val MaterialDesignIcons.IncognitoCircle: ImageVector
    get() {
        if (_incognitoCircle != null) {
            return _incognitoCircle!!
        }
        _incognitoCircle = Builder(name = "IncognitoCircle", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(17.5f, 2.0f, 22.0f, 6.5f, 22.0f, 12.0f)
                reflectiveCurveTo(17.5f, 22.0f, 12.0f, 22.0f)
                reflectiveCurveTo(2.0f, 17.5f, 2.0f, 12.0f)
                reflectiveCurveTo(6.5f, 2.0f, 12.0f, 2.0f)
                moveTo(14.92f, 12.81f)
                curveTo(13.84f, 12.81f, 12.95f, 13.56f, 12.71f, 14.56f)
                curveTo(12.17f, 14.33f, 11.66f, 14.39f, 11.29f, 14.55f)
                curveTo(11.05f, 13.55f, 10.15f, 12.81f, 9.08f, 12.81f)
                curveTo(7.83f, 12.81f, 6.82f, 13.82f, 6.82f, 15.07f)
                curveTo(6.82f, 16.32f, 7.83f, 17.33f, 9.08f, 17.33f)
                curveTo(10.28f, 17.33f, 11.24f, 16.42f, 11.33f, 15.25f)
                curveTo(11.53f, 15.12f, 12.04f, 14.86f, 12.67f, 15.26f)
                curveTo(12.77f, 16.42f, 13.73f, 17.33f, 14.92f, 17.33f)
                curveTo(16.17f, 17.33f, 17.18f, 16.32f, 17.18f, 15.07f)
                curveTo(17.18f, 13.82f, 16.17f, 12.81f, 14.92f, 12.81f)
                moveTo(9.08f, 13.45f)
                curveTo(10.0f, 13.45f, 10.7f, 14.18f, 10.7f, 15.07f)
                curveTo(10.7f, 15.96f, 10.0f, 16.69f, 9.08f, 16.69f)
                curveTo(8.19f, 16.69f, 7.46f, 15.96f, 7.46f, 15.07f)
                curveTo(7.46f, 14.18f, 8.19f, 13.45f, 9.08f, 13.45f)
                moveTo(14.92f, 13.45f)
                curveTo(15.81f, 13.45f, 16.54f, 14.18f, 16.54f, 15.07f)
                curveTo(16.54f, 15.96f, 15.81f, 16.69f, 14.92f, 16.69f)
                curveTo(14.0f, 16.69f, 13.3f, 15.96f, 13.3f, 15.07f)
                curveTo(13.3f, 14.18f, 14.0f, 13.45f, 14.92f, 13.45f)
                moveTo(17.83f, 11.5f)
                horizontalLineTo(6.17f)
                verticalLineTo(12.17f)
                horizontalLineTo(17.83f)
                verticalLineTo(11.5f)
                moveTo(14.15f, 6.89f)
                curveTo(14.0f, 6.59f, 13.67f, 6.43f, 13.35f, 6.53f)
                lineTo(12.0f, 7.0f)
                lineTo(10.65f, 6.53f)
                lineTo(10.61f, 6.5f)
                curveTo(10.29f, 6.43f, 9.95f, 6.61f, 9.84f, 6.92f)
                lineTo(8.36f, 10.83f)
                horizontalLineTo(15.64f)
                lineTo(14.16f, 6.92f)
                lineTo(14.15f, 6.89f)
                close()
            }
        }
        .build()
        return _incognitoCircle!!
    }

private var _incognitoCircle: ImageVector? = null
