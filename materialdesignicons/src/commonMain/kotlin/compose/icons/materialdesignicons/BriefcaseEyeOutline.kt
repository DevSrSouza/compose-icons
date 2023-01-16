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

public val MaterialDesignIcons.BriefcaseEyeOutline: ImageVector
    get() {
        if (_briefcaseEyeOutline != null) {
            return _briefcaseEyeOutline!!
        }
        _briefcaseEyeOutline = Builder(name = "BriefcaseEyeOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 18.0f)
                curveTo(17.6f, 18.0f, 18.0f, 18.4f, 18.0f, 19.0f)
                reflectiveCurveTo(17.6f, 20.0f, 17.0f, 20.0f)
                reflectiveCurveTo(16.0f, 19.6f, 16.0f, 19.0f)
                reflectiveCurveTo(16.4f, 18.0f, 17.0f, 18.0f)
                moveTo(17.0f, 15.0f)
                curveTo(14.3f, 15.0f, 11.9f, 16.7f, 11.0f, 19.0f)
                curveTo(11.9f, 21.3f, 14.3f, 23.0f, 17.0f, 23.0f)
                reflectiveCurveTo(22.1f, 21.3f, 23.0f, 19.0f)
                curveTo(22.1f, 16.7f, 19.7f, 15.0f, 17.0f, 15.0f)
                moveTo(17.0f, 21.5f)
                curveTo(15.6f, 21.5f, 14.5f, 20.4f, 14.5f, 19.0f)
                reflectiveCurveTo(15.6f, 16.5f, 17.0f, 16.5f)
                reflectiveCurveTo(19.5f, 17.6f, 19.5f, 19.0f)
                reflectiveCurveTo(18.4f, 21.5f, 17.0f, 21.5f)
                moveTo(9.1f, 19.7f)
                lineTo(8.8f, 19.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(13.6f)
                curveTo(20.7f, 13.9f, 21.4f, 14.2f, 22.0f, 14.7f)
                verticalLineTo(8.0f)
                curveTo(22.0f, 7.5f, 21.8f, 7.0f, 21.4f, 6.6f)
                curveTo(21.0f, 6.2f, 20.6f, 6.0f, 20.0f, 6.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(4.0f)
                curveTo(16.0f, 3.4f, 15.8f, 3.0f, 15.4f, 2.6f)
                curveTo(15.0f, 2.2f, 14.6f, 2.0f, 14.0f, 2.0f)
                horizontalLineTo(10.0f)
                curveTo(9.4f, 2.0f, 9.0f, 2.2f, 8.6f, 2.6f)
                curveTo(8.2f, 3.0f, 8.0f, 3.4f, 8.0f, 4.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(4.0f)
                curveTo(3.4f, 6.0f, 3.0f, 6.2f, 2.6f, 6.6f)
                curveTo(2.2f, 7.0f, 2.0f, 7.5f, 2.0f, 8.0f)
                verticalLineTo(19.0f)
                curveTo(2.0f, 19.5f, 2.2f, 20.0f, 2.6f, 20.4f)
                curveTo(3.0f, 20.8f, 3.4f, 21.0f, 4.0f, 21.0f)
                horizontalLineTo(9.8f)
                curveTo(9.5f, 20.6f, 9.3f, 20.2f, 9.1f, 19.7f)
                moveTo(10.0f, 4.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(4.0f)
                close()
            }
        }
        .build()
        return _briefcaseEyeOutline!!
    }

private var _briefcaseEyeOutline: ImageVector? = null
