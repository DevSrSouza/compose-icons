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

public val MaterialDesignIcons.Kayaking: ImageVector
    get() {
        if (_kayaking != null) {
            return _kayaking!!
        }
        _kayaking = Builder(name = "Kayaking", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 23.0f)
                verticalLineTo(21.0f)
                curveTo(20.58f, 21.05f, 19.21f, 20.9f, 18.0f, 20.0f)
                curveTo(16.23f, 21.25f, 13.77f, 21.25f, 12.0f, 20.0f)
                curveTo(10.23f, 21.25f, 7.77f, 21.25f, 6.0f, 20.0f)
                curveTo(4.79f, 20.9f, 3.42f, 21.05f, 2.0f, 21.0f)
                verticalLineTo(23.0f)
                curveTo(3.38f, 23.05f, 4.79f, 22.94f, 6.0f, 22.25f)
                curveTo(7.84f, 23.25f, 10.16f, 23.25f, 12.0f, 22.25f)
                curveTo(13.84f, 23.25f, 16.16f, 23.25f, 18.0f, 22.25f)
                curveTo(19.21f, 22.94f, 20.62f, 23.05f, 22.0f, 23.0f)
                moveTo(23.39f, 17.21f)
                curveTo(21.13f, 16.29f, 18.3f, 15.56f, 15.66f, 15.22f)
                lineTo(19.36f, 6.88f)
                lineTo(20.67f, 6.41f)
                lineTo(22.0f, 3.41f)
                lineTo(18.8f, 2.0f)
                lineTo(17.5f, 4.95f)
                lineTo(18.0f, 6.27f)
                lineTo(16.31f, 9.97f)
                lineTo(13.5f, 11.47f)
                lineTo(11.0f, 10.2f)
                curveTo(10.95f, 10.14f, 10.86f, 10.09f, 10.74f, 10.06f)
                curveTo(9.82f, 9.73f, 8.77f, 10.32f, 8.5f, 11.23f)
                lineTo(7.13f, 15.41f)
                curveTo(6.59f, 15.18f, 1.25f, 16.97f, 0.915f, 17.12f)
                lineTo(0.0f, 17.47f)
                curveTo(1.33f, 18.04f, 2.2f, 18.39f, 3.94f, 18.88f)
                curveTo(4.75f, 18.63f, 5.44f, 18.09f, 6.0f, 17.47f)
                curveTo(7.5f, 19.42f, 10.5f, 19.42f, 12.0f, 17.47f)
                curveTo(13.5f, 19.42f, 16.5f, 19.42f, 18.0f, 17.47f)
                curveTo(18.56f, 18.09f, 19.25f, 18.63f, 20.06f, 18.88f)
                lineTo(22.95f, 17.91f)
                lineTo(24.0f, 17.47f)
                lineTo(23.39f, 17.21f)
                moveTo(14.06f, 15.08f)
                curveTo(13.07f, 15.0f, 12.06f, 15.0f, 11.06f, 15.0f)
                lineTo(11.77f, 12.83f)
                lineTo(13.5f, 13.77f)
                lineTo(15.0f, 12.92f)
                lineTo(14.06f, 15.08f)
                moveTo(14.0f, 7.5f)
                curveTo(14.0f, 8.61f, 13.11f, 9.5f, 12.0f, 9.5f)
                reflectiveCurveTo(10.0f, 8.61f, 10.0f, 7.5f)
                reflectiveCurveTo(10.9f, 5.5f, 12.0f, 5.5f)
                reflectiveCurveTo(14.0f, 6.4f, 14.0f, 7.5f)
                close()
            }
        }
        .build()
        return _kayaking!!
    }

private var _kayaking: ImageVector? = null
