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

public val MaterialDesignIcons.CastAudio: ImageVector
    get() {
        if (_castAudio != null) {
            return _castAudio!!
        }
        _castAudio = Builder(name = "CastAudio", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 11.0f)
                verticalLineTo(13.0f)
                curveTo(7.0f, 13.0f, 11.0f, 17.0f, 11.0f, 22.0f)
                horizontalLineTo(13.0f)
                curveTo(13.0f, 15.9f, 8.1f, 11.0f, 2.0f, 11.0f)
                moveTo(20.0f, 2.0f)
                horizontalLineTo(10.0f)
                curveTo(8.9f, 2.0f, 8.0f, 2.9f, 8.0f, 4.0f)
                verticalLineTo(10.5f)
                curveTo(9.0f, 11.0f, 9.9f, 11.7f, 10.7f, 12.4f)
                curveTo(11.6f, 11.0f, 13.2f, 10.0f, 15.0f, 10.0f)
                curveTo(17.8f, 10.0f, 20.0f, 12.2f, 20.0f, 15.0f)
                reflectiveCurveTo(17.8f, 20.0f, 15.0f, 20.0f)
                horizontalLineTo(14.8f)
                curveTo(14.9f, 20.7f, 15.0f, 21.3f, 15.0f, 22.0f)
                horizontalLineTo(20.0f)
                curveTo(21.1f, 22.0f, 22.0f, 21.1f, 22.0f, 20.0f)
                verticalLineTo(4.0f)
                curveTo(22.0f, 2.9f, 21.1f, 2.0f, 20.0f, 2.0f)
                moveTo(15.0f, 8.0f)
                curveTo(13.9f, 8.0f, 13.0f, 7.1f, 13.0f, 6.0f)
                curveTo(13.0f, 4.9f, 13.9f, 4.0f, 15.0f, 4.0f)
                curveTo(16.1f, 4.0f, 17.0f, 4.9f, 17.0f, 6.0f)
                reflectiveCurveTo(16.1f, 8.0f, 15.0f, 8.0f)
                moveTo(15.0f, 18.0f)
                curveTo(14.8f, 18.0f, 14.5f, 18.0f, 14.3f, 17.9f)
                curveTo(13.8f, 16.4f, 13.1f, 15.1f, 12.2f, 13.9f)
                curveTo(12.6f, 12.8f, 13.7f, 11.9f, 15.0f, 11.9f)
                curveTo(16.7f, 11.9f, 18.0f, 13.2f, 18.0f, 14.9f)
                reflectiveCurveTo(16.7f, 18.0f, 15.0f, 18.0f)
                moveTo(2.0f, 15.0f)
                verticalLineTo(17.0f)
                curveTo(4.8f, 17.0f, 7.0f, 19.2f, 7.0f, 22.0f)
                horizontalLineTo(9.0f)
                curveTo(9.0f, 18.1f, 5.9f, 15.0f, 2.0f, 15.0f)
                moveTo(2.0f, 19.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(5.0f)
                curveTo(5.0f, 20.3f, 3.7f, 19.0f, 2.0f, 19.0f)
            }
        }
        .build()
        return _castAudio!!
    }

private var _castAudio: ImageVector? = null
