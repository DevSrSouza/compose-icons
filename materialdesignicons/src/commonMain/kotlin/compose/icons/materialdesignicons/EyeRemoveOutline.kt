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

public val MaterialDesignIcons.EyeRemoveOutline: ImageVector
    get() {
        if (_eyeRemoveOutline != null) {
            return _eyeRemoveOutline!!
        }
        _eyeRemoveOutline = Builder(name = "EyeRemoveOutline", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.54f, 16.88f)
                lineTo(20.41f, 19.0f)
                lineTo(22.54f, 21.12f)
                lineTo(21.12f, 22.54f)
                lineTo(19.0f, 20.41f)
                lineTo(16.88f, 22.54f)
                lineTo(15.47f, 21.12f)
                lineTo(17.59f, 19.0f)
                lineTo(15.47f, 16.88f)
                lineTo(16.88f, 15.47f)
                lineTo(19.0f, 17.59f)
                lineTo(21.12f, 15.47f)
                lineTo(22.54f, 16.88f)
                moveTo(12.0f, 9.0f)
                curveTo(10.34f, 9.0f, 9.0f, 10.34f, 9.0f, 12.0f)
                reflectiveCurveTo(10.34f, 15.0f, 12.0f, 15.0f)
                reflectiveCurveTo(15.0f, 13.66f, 15.0f, 12.0f)
                reflectiveCurveTo(13.66f, 9.0f, 12.0f, 9.0f)
                moveTo(12.0f, 17.5f)
                curveTo(8.24f, 17.5f, 4.83f, 15.36f, 3.18f, 12.0f)
                curveTo(4.83f, 8.64f, 8.24f, 6.5f, 12.0f, 6.5f)
                reflectiveCurveTo(19.17f, 8.64f, 20.82f, 12.0f)
                curveTo(20.63f, 12.39f, 20.41f, 12.77f, 20.17f, 13.13f)
                curveTo(20.85f, 13.26f, 21.5f, 13.5f, 22.07f, 13.85f)
                curveTo(22.43f, 13.27f, 22.74f, 12.65f, 23.0f, 12.0f)
                curveTo(21.27f, 7.61f, 17.0f, 4.5f, 12.0f, 4.5f)
                reflectiveCurveTo(2.73f, 7.61f, 1.0f, 12.0f)
                curveTo(2.73f, 16.39f, 7.0f, 19.5f, 12.0f, 19.5f)
                curveTo(12.35f, 19.5f, 12.69f, 19.5f, 13.03f, 19.45f)
                curveTo(13.0f, 19.3f, 13.0f, 19.15f, 13.0f, 19.0f)
                curveTo(13.0f, 18.45f, 13.08f, 17.92f, 13.22f, 17.41f)
                curveTo(12.82f, 17.46f, 12.41f, 17.5f, 12.0f, 17.5f)
                close()
            }
        }
        .build()
        return _eyeRemoveOutline!!
    }

private var _eyeRemoveOutline: ImageVector? = null
