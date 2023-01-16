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

public val MaterialDesignIcons.EyeRemove: ImageVector
    get() {
        if (_eyeRemove != null) {
            return _eyeRemove!!
        }
        _eyeRemove = Builder(name = "EyeRemove", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
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
                moveTo(12.0f, 17.0f)
                curveTo(9.24f, 17.0f, 7.0f, 14.76f, 7.0f, 12.0f)
                reflectiveCurveTo(9.24f, 7.0f, 12.0f, 7.0f)
                reflectiveCurveTo(17.0f, 9.24f, 17.0f, 12.0f)
                curveTo(17.0f, 12.5f, 16.9f, 13.0f, 16.77f, 13.43f)
                curveTo(17.46f, 13.16f, 18.21f, 13.0f, 19.0f, 13.0f)
                curveTo(20.12f, 13.0f, 21.17f, 13.32f, 22.07f, 13.85f)
                curveTo(22.43f, 13.27f, 22.74f, 12.65f, 23.0f, 12.0f)
                curveTo(21.27f, 7.61f, 17.0f, 4.5f, 12.0f, 4.5f)
                reflectiveCurveTo(2.73f, 7.61f, 1.0f, 12.0f)
                curveTo(2.73f, 16.39f, 7.0f, 19.5f, 12.0f, 19.5f)
                curveTo(12.35f, 19.5f, 12.69f, 19.5f, 13.03f, 19.45f)
                curveTo(13.0f, 19.3f, 13.0f, 19.15f, 13.0f, 19.0f)
                curveTo(13.0f, 18.21f, 13.16f, 17.46f, 13.43f, 16.77f)
                curveTo(13.0f, 16.9f, 12.5f, 17.0f, 12.0f, 17.0f)
                close()
            }
        }
        .build()
        return _eyeRemove!!
    }

private var _eyeRemove: ImageVector? = null
