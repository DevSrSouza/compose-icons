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

public val MaterialDesignIcons.DoorbellVideo: ImageVector
    get() {
        if (_doorbellVideo != null) {
            return _doorbellVideo!!
        }
        _doorbellVideo = Builder(name = "DoorbellVideo", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 15.0f)
                curveTo(14.0f, 16.11f, 13.11f, 17.0f, 12.0f, 17.0f)
                reflectiveCurveTo(10.0f, 16.11f, 10.0f, 15.0f)
                reflectiveCurveTo(10.9f, 13.0f, 12.0f, 13.0f)
                reflectiveCurveTo(14.0f, 13.9f, 14.0f, 15.0f)
                moveTo(18.0f, 4.0f)
                verticalLineTo(20.0f)
                curveTo(18.0f, 21.1f, 17.11f, 22.0f, 16.0f, 22.0f)
                horizontalLineTo(8.0f)
                curveTo(6.9f, 22.0f, 6.0f, 21.11f, 6.0f, 20.0f)
                verticalLineTo(4.0f)
                curveTo(6.0f, 2.9f, 6.9f, 2.0f, 8.0f, 2.0f)
                horizontalLineTo(16.0f)
                curveTo(17.11f, 2.0f, 18.0f, 2.9f, 18.0f, 4.0f)
                moveTo(10.5f, 7.0f)
                curveTo(10.5f, 7.83f, 11.17f, 8.5f, 12.0f, 8.5f)
                reflectiveCurveTo(13.5f, 7.83f, 13.5f, 7.0f)
                reflectiveCurveTo(12.83f, 5.5f, 12.0f, 5.5f)
                reflectiveCurveTo(10.5f, 6.17f, 10.5f, 7.0f)
                moveTo(16.0f, 10.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(10.0f)
                close()
            }
        }
        .build()
        return _doorbellVideo!!
    }

private var _doorbellVideo: ImageVector? = null
