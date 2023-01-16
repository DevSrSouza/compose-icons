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

public val MaterialDesignIcons.SpeakerPause: ImageVector
    get() {
        if (_speakerPause != null) {
            return _speakerPause!!
        }
        _speakerPause = Builder(name = "SpeakerPause", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.28f, 19.81f)
                curveTo(11.87f, 19.92f, 11.45f, 20.0f, 11.0f, 20.0f)
                curveTo(8.24f, 20.0f, 6.0f, 17.76f, 6.0f, 15.0f)
                reflectiveCurveTo(8.24f, 10.0f, 11.0f, 10.0f)
                curveTo(12.89f, 10.0f, 14.5f, 11.06f, 15.37f, 12.61f)
                curveTo(16.16f, 12.23f, 17.06f, 12.0f, 18.0f, 12.0f)
                verticalLineTo(4.0f)
                curveTo(18.0f, 2.89f, 17.1f, 2.0f, 16.0f, 2.0f)
                horizontalLineTo(6.0f)
                curveTo(4.89f, 2.0f, 4.0f, 2.89f, 4.0f, 4.0f)
                verticalLineTo(20.0f)
                curveTo(4.0f, 21.11f, 4.89f, 22.0f, 6.0f, 22.0f)
                horizontalLineTo(13.54f)
                curveTo(13.0f, 21.37f, 12.54f, 20.63f, 12.28f, 19.81f)
                moveTo(11.0f, 4.0f)
                curveTo(12.11f, 4.0f, 13.0f, 4.89f, 13.0f, 6.0f)
                reflectiveCurveTo(12.11f, 8.0f, 11.0f, 8.0f)
                curveTo(9.89f, 8.0f, 9.0f, 7.1f, 9.0f, 6.0f)
                curveTo(9.0f, 4.89f, 9.89f, 4.0f, 11.0f, 4.0f)
                moveTo(13.74f, 13.78f)
                curveTo(12.7f, 14.82f, 12.06f, 16.24f, 12.0f, 17.81f)
                curveTo(11.69f, 17.93f, 11.36f, 18.0f, 11.0f, 18.0f)
                curveTo(9.34f, 18.0f, 8.0f, 16.66f, 8.0f, 15.0f)
                reflectiveCurveTo(9.34f, 12.0f, 11.0f, 12.0f)
                curveTo(12.22f, 12.0f, 13.27f, 12.73f, 13.74f, 13.78f)
                moveTo(19.0f, 15.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(19.0f)
                moveTo(15.0f, 15.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(15.0f)
                close()
            }
        }
        .build()
        return _speakerPause!!
    }

private var _speakerPause: ImageVector? = null
