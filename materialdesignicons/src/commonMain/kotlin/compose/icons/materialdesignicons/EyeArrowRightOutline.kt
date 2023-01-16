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

public val MaterialDesignIcons.EyeArrowRightOutline: ImageVector
    get() {
        if (_eyeArrowRightOutline != null) {
            return _eyeArrowRightOutline!!
        }
        _eyeArrowRightOutline = Builder(name = "EyeArrowRightOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 4.5f)
                curveTo(7.0f, 4.5f, 2.7f, 7.6f, 1.0f, 12.0f)
                curveTo(2.7f, 16.4f, 7.0f, 19.5f, 12.0f, 19.5f)
                horizontalLineTo(13.1f)
                curveTo(13.0f, 19.2f, 13.0f, 18.9f, 13.0f, 18.5f)
                curveTo(13.0f, 18.1f, 13.0f, 17.8f, 13.1f, 17.4f)
                curveTo(12.7f, 17.4f, 12.4f, 17.5f, 12.0f, 17.5f)
                curveTo(8.2f, 17.5f, 4.8f, 15.4f, 3.2f, 12.0f)
                curveTo(4.8f, 8.6f, 8.2f, 6.5f, 12.0f, 6.5f)
                reflectiveCurveTo(19.2f, 8.6f, 20.8f, 12.0f)
                curveTo(20.7f, 12.2f, 20.5f, 12.4f, 20.4f, 12.7f)
                curveTo(21.1f, 12.9f, 21.7f, 13.1f, 22.3f, 13.5f)
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
        return _eyeArrowRightOutline!!
    }

private var _eyeArrowRightOutline: ImageVector? = null
