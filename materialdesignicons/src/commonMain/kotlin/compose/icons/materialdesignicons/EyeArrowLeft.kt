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

public val MaterialDesignIcons.EyeArrowLeft: ImageVector
    get() {
        if (_eyeArrowLeft != null) {
            return _eyeArrowLeft!!
        }
        _eyeArrowLeft = Builder(name = "EyeArrowLeft", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 4.5f)
                curveTo(7.0f, 4.5f, 2.73f, 7.61f, 1.0f, 12.0f)
                curveTo(2.73f, 16.39f, 7.0f, 19.5f, 12.0f, 19.5f)
                curveTo(12.36f, 19.5f, 12.72f, 19.5f, 13.08f, 19.45f)
                curveTo(13.03f, 19.13f, 13.0f, 18.82f, 13.0f, 18.5f)
                curveTo(13.0f, 17.94f, 13.08f, 17.38f, 13.24f, 16.84f)
                curveTo(12.83f, 16.94f, 12.42f, 17.0f, 12.0f, 17.0f)
                curveTo(9.24f, 17.0f, 7.0f, 14.76f, 7.0f, 12.0f)
                reflectiveCurveTo(9.24f, 7.0f, 12.0f, 7.0f)
                reflectiveCurveTo(17.0f, 9.24f, 17.0f, 12.0f)
                curveTo(17.0f, 12.29f, 16.97f, 12.59f, 16.92f, 12.88f)
                curveTo(17.58f, 12.63f, 18.29f, 12.5f, 19.0f, 12.5f)
                curveTo(20.17f, 12.5f, 21.31f, 12.84f, 22.29f, 13.5f)
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
        return _eyeArrowLeft!!
    }

private var _eyeArrowLeft: ImageVector? = null
