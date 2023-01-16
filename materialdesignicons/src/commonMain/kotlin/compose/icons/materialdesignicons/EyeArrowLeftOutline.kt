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

public val MaterialDesignIcons.EyeArrowLeftOutline: ImageVector
    get() {
        if (_eyeArrowLeftOutline != null) {
            return _eyeArrowLeftOutline!!
        }
        _eyeArrowLeftOutline = Builder(name = "EyeArrowLeftOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 4.5f)
                curveTo(7.0f, 4.5f, 2.73f, 7.61f, 1.0f, 12.0f)
                curveTo(2.73f, 16.39f, 7.0f, 19.5f, 12.0f, 19.5f)
                curveTo(12.36f, 19.5f, 12.72f, 19.5f, 13.08f, 19.45f)
                curveTo(13.03f, 19.13f, 13.0f, 18.82f, 13.0f, 18.5f)
                curveTo(13.0f, 18.14f, 13.04f, 17.78f, 13.1f, 17.42f)
                curveTo(12.74f, 17.46f, 12.37f, 17.5f, 12.0f, 17.5f)
                curveTo(8.24f, 17.5f, 4.83f, 15.36f, 3.18f, 12.0f)
                curveTo(4.83f, 8.64f, 8.24f, 6.5f, 12.0f, 6.5f)
                reflectiveCurveTo(19.17f, 8.64f, 20.82f, 12.0f)
                curveTo(20.7f, 12.24f, 20.56f, 12.45f, 20.43f, 12.68f)
                curveTo(21.09f, 12.84f, 21.72f, 13.11f, 22.29f, 13.5f)
                curveTo(22.56f, 13.0f, 22.8f, 12.5f, 23.0f, 12.0f)
                curveTo(21.27f, 7.61f, 17.0f, 4.5f, 12.0f, 4.5f)
                moveTo(12.0f, 9.0f)
                curveTo(10.34f, 9.0f, 9.0f, 10.34f, 9.0f, 12.0f)
                reflectiveCurveTo(10.34f, 15.0f, 12.0f, 15.0f)
                reflectiveCurveTo(15.0f, 13.66f, 15.0f, 12.0f)
                reflectiveCurveTo(13.66f, 9.0f, 12.0f, 9.0f)
                moveTo(18.0f, 15.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(21.0f)
                lineTo(15.0f, 18.0f)
                lineTo(18.0f, 15.0f)
            }
        }
        .build()
        return _eyeArrowLeftOutline!!
    }

private var _eyeArrowLeftOutline: ImageVector? = null
