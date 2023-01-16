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

public val MaterialDesignIcons.TelevisionSpeaker: ImageVector
    get() {
        if (_televisionSpeaker != null) {
            return _televisionSpeaker!!
        }
        _televisionSpeaker = Builder(name = "TelevisionSpeaker", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 3.0f)
                curveTo(1.9f, 3.0f, 1.0f, 3.9f, 1.0f, 5.0f)
                verticalLineTo(17.0f)
                curveTo(1.0f, 18.1f, 1.9f, 19.0f, 3.0f, 19.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(23.0f)
                verticalLineTo(5.0f)
                curveTo(23.0f, 3.9f, 22.1f, 3.0f, 21.0f, 3.0f)
                horizontalLineTo(3.0f)
                moveTo(21.0f, 9.0f)
                horizontalLineTo(16.0f)
                curveTo(14.9f, 9.0f, 14.0f, 9.9f, 14.0f, 11.0f)
                verticalLineTo(20.0f)
                curveTo(14.0f, 21.1f, 14.9f, 22.0f, 16.0f, 22.0f)
                horizontalLineTo(21.0f)
                curveTo(22.1f, 22.0f, 23.0f, 21.1f, 23.0f, 20.0f)
                verticalLineTo(11.0f)
                curveTo(23.0f, 9.9f, 22.1f, 9.0f, 21.0f, 9.0f)
                moveTo(18.5f, 10.5f)
                curveTo(19.3f, 10.5f, 20.0f, 11.2f, 20.0f, 12.0f)
                reflectiveCurveTo(19.3f, 13.5f, 18.5f, 13.5f)
                reflectiveCurveTo(17.0f, 12.8f, 17.0f, 12.0f)
                reflectiveCurveTo(17.7f, 10.5f, 18.5f, 10.5f)
                moveTo(18.5f, 20.5f)
                curveTo(16.8f, 20.5f, 15.5f, 19.2f, 15.5f, 17.5f)
                curveTo(15.5f, 15.9f, 16.8f, 14.5f, 18.4f, 14.5f)
                horizontalLineTo(18.5f)
                curveTo(20.2f, 14.5f, 21.5f, 15.8f, 21.5f, 17.5f)
                reflectiveCurveTo(20.2f, 20.5f, 18.5f, 20.5f)
                moveTo(18.5f, 16.0f)
                curveTo(17.7f, 16.0f, 17.0f, 16.7f, 17.0f, 17.5f)
                reflectiveCurveTo(17.7f, 19.0f, 18.5f, 19.0f)
                reflectiveCurveTo(20.0f, 18.3f, 20.0f, 17.5f)
                reflectiveCurveTo(19.3f, 16.0f, 18.5f, 16.0f)
                close()
            }
        }
        .build()
        return _televisionSpeaker!!
    }

private var _televisionSpeaker: ImageVector? = null
