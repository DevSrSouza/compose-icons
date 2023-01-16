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

public val MaterialDesignIcons.EyeArrowRight: ImageVector
    get() {
        if (_eyeArrowRight != null) {
            return _eyeArrowRight!!
        }
        _eyeArrowRight = Builder(name = "EyeArrowRight", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 4.5f)
                curveTo(7.0f, 4.5f, 2.7f, 7.6f, 1.0f, 12.0f)
                curveTo(2.7f, 16.4f, 7.0f, 19.5f, 12.0f, 19.5f)
                horizontalLineTo(13.1f)
                curveTo(13.0f, 19.2f, 13.0f, 18.9f, 13.0f, 18.5f)
                curveTo(13.0f, 17.9f, 13.1f, 17.4f, 13.2f, 16.8f)
                curveTo(12.8f, 16.9f, 12.4f, 17.0f, 12.0f, 17.0f)
                curveTo(9.2f, 17.0f, 7.0f, 14.8f, 7.0f, 12.0f)
                reflectiveCurveTo(9.2f, 7.0f, 12.0f, 7.0f)
                reflectiveCurveTo(17.0f, 9.2f, 17.0f, 12.0f)
                curveTo(17.0f, 12.3f, 17.0f, 12.6f, 16.9f, 12.9f)
                curveTo(17.6f, 12.7f, 18.3f, 12.5f, 19.0f, 12.5f)
                curveTo(20.2f, 12.5f, 21.3f, 12.8f, 22.3f, 13.5f)
                curveTo(22.6f, 13.0f, 22.8f, 12.5f, 23.0f, 12.0f)
                curveTo(21.3f, 7.6f, 17.0f, 4.5f, 12.0f, 4.5f)
                moveTo(12.0f, 9.0f)
                curveTo(10.3f, 9.0f, 9.0f, 10.3f, 9.0f, 12.0f)
                reflectiveCurveTo(10.3f, 15.0f, 12.0f, 15.0f)
                reflectiveCurveTo(15.0f, 13.7f, 15.0f, 12.0f)
                reflectiveCurveTo(13.7f, 9.0f, 12.0f, 9.0f)
                moveTo(19.0f, 21.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(15.0f)
                lineTo(22.0f, 18.0f)
                lineTo(19.0f, 21.0f)
            }
        }
        .build()
        return _eyeArrowRight!!
    }

private var _eyeArrowRight: ImageVector? = null
