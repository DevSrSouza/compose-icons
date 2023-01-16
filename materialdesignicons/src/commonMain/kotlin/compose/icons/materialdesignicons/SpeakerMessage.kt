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

public val MaterialDesignIcons.SpeakerMessage: ImageVector
    get() {
        if (_speakerMessage != null) {
            return _speakerMessage!!
        }
        _speakerMessage = Builder(name = "SpeakerMessage", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.5f, 3.0f)
                horizontalLineTo(21.5f)
                curveTo(22.3f, 3.0f, 23.0f, 3.7f, 23.0f, 4.5f)
                verticalLineTo(7.5f)
                curveTo(23.0f, 8.3f, 22.3f, 9.0f, 21.5f, 9.0f)
                horizontalLineTo(18.0f)
                lineTo(15.0f, 12.0f)
                verticalLineTo(4.5f)
                curveTo(15.0f, 3.7f, 15.7f, 3.0f, 16.5f, 3.0f)
                moveTo(3.0f, 3.0f)
                curveTo(1.9f, 3.0f, 1.0f, 3.9f, 1.0f, 5.0f)
                verticalLineTo(19.0f)
                curveTo(1.0f, 20.1f, 1.9f, 21.0f, 3.0f, 21.0f)
                horizontalLineTo(11.0f)
                curveTo(12.1f, 21.0f, 13.0f, 20.1f, 13.0f, 19.0f)
                verticalLineTo(5.0f)
                curveTo(13.0f, 3.9f, 12.1f, 3.0f, 11.0f, 3.0f)
                horizontalLineTo(3.0f)
                moveTo(7.0f, 5.0f)
                curveTo(8.1f, 5.0f, 9.0f, 5.9f, 9.0f, 7.0f)
                reflectiveCurveTo(8.1f, 9.0f, 7.0f, 9.0f)
                reflectiveCurveTo(5.0f, 8.1f, 5.0f, 7.0f)
                reflectiveCurveTo(5.9f, 5.0f, 7.0f, 5.0f)
                moveTo(7.0f, 11.0f)
                curveTo(9.2f, 11.0f, 11.0f, 12.8f, 11.0f, 15.0f)
                reflectiveCurveTo(9.2f, 19.0f, 7.0f, 19.0f)
                reflectiveCurveTo(3.0f, 17.2f, 3.0f, 15.0f)
                reflectiveCurveTo(4.8f, 11.0f, 7.0f, 11.0f)
                moveTo(7.0f, 13.0f)
                curveTo(5.9f, 13.0f, 5.0f, 13.9f, 5.0f, 15.0f)
                reflectiveCurveTo(5.9f, 17.0f, 7.0f, 17.0f)
                reflectiveCurveTo(9.0f, 16.1f, 9.0f, 15.0f)
                reflectiveCurveTo(8.1f, 13.0f, 7.0f, 13.0f)
            }
        }
        .build()
        return _speakerMessage!!
    }

private var _speakerMessage: ImageVector? = null
