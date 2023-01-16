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

public val MaterialDesignIcons.EyeRefreshOutline: ImageVector
    get() {
        if (_eyeRefreshOutline != null) {
            return _eyeRefreshOutline!!
        }
        _eyeRefreshOutline = Builder(name = "EyeRefreshOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 9.0f)
                curveTo(13.7f, 9.0f, 15.0f, 10.3f, 15.0f, 12.0f)
                reflectiveCurveTo(13.7f, 15.0f, 12.0f, 15.0f)
                reflectiveCurveTo(9.0f, 13.7f, 9.0f, 12.0f)
                reflectiveCurveTo(10.3f, 9.0f, 12.0f, 9.0f)
                moveTo(18.0f, 18.5f)
                lineTo(19.8f, 16.7f)
                curveTo(19.3f, 16.3f, 18.7f, 16.0f, 18.0f, 16.0f)
                curveTo(16.6f, 16.0f, 15.5f, 17.1f, 15.5f, 18.5f)
                reflectiveCurveTo(16.6f, 21.0f, 18.0f, 21.0f)
                curveTo(18.8f, 21.0f, 19.5f, 20.6f, 20.0f, 20.0f)
                horizontalLineTo(21.7f)
                curveTo(21.1f, 21.5f, 19.7f, 22.5f, 18.0f, 22.5f)
                curveTo(15.8f, 22.5f, 14.0f, 20.7f, 14.0f, 18.5f)
                reflectiveCurveTo(15.8f, 14.5f, 18.0f, 14.5f)
                curveTo(19.1f, 14.5f, 20.1f, 14.9f, 20.8f, 15.7f)
                lineTo(22.0f, 14.5f)
                verticalLineTo(18.5f)
                horizontalLineTo(18.0f)
                moveTo(12.0f, 18.5f)
                curveTo(12.0f, 18.2f, 12.0f, 17.8f, 12.1f, 17.5f)
                horizontalLineTo(12.0f)
                curveTo(8.2f, 17.5f, 4.8f, 15.4f, 3.2f, 12.0f)
                curveTo(4.8f, 8.6f, 8.2f, 6.5f, 12.0f, 6.5f)
                reflectiveCurveTo(19.2f, 8.6f, 20.8f, 12.0f)
                curveTo(20.7f, 12.1f, 20.7f, 12.2f, 20.6f, 12.4f)
                curveTo(21.2f, 12.6f, 21.8f, 12.9f, 22.4f, 13.3f)
                curveTo(22.6f, 12.9f, 22.8f, 12.4f, 23.0f, 12.0f)
                curveTo(21.3f, 7.6f, 17.0f, 4.5f, 12.0f, 4.5f)
                reflectiveCurveTo(2.7f, 7.6f, 1.0f, 12.0f)
                curveTo(2.7f, 16.4f, 7.0f, 19.5f, 12.0f, 19.5f)
                horizontalLineTo(12.1f)
                curveTo(12.0f, 19.2f, 12.0f, 18.8f, 12.0f, 18.5f)
                close()
            }
        }
        .build()
        return _eyeRefreshOutline!!
    }

private var _eyeRefreshOutline: ImageVector? = null
