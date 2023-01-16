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

public val MaterialDesignIcons.AudioVideoOff: ImageVector
    get() {
        if (_audioVideoOff != null) {
            return _audioVideoOff!!
        }
        _audioVideoOff = Builder(name = "AudioVideoOff", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.1f, 21.5f)
                lineTo(2.4f, 1.7f)
                lineTo(1.1f, 3.0f)
                lineTo(5.1f, 7.0f)
                horizontalLineTo(4.0f)
                curveTo(2.9f, 7.0f, 2.0f, 7.9f, 2.0f, 9.0f)
                verticalLineTo(15.0f)
                curveTo(2.0f, 16.1f, 2.9f, 17.0f, 4.0f, 17.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(18.0f)
                curveTo(5.0f, 18.6f, 5.4f, 19.0f, 6.0f, 19.0f)
                horizontalLineTo(8.0f)
                curveTo(8.6f, 19.0f, 9.0f, 18.6f, 9.0f, 18.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(18.0f)
                curveTo(15.0f, 18.6f, 15.4f, 19.0f, 16.0f, 19.0f)
                horizontalLineTo(17.1f)
                lineTo(20.8f, 22.7f)
                lineTo(22.1f, 21.5f)
                moveTo(6.0f, 15.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(15.0f)
                moveTo(4.0f, 12.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(8.1f)
                lineTo(10.1f, 12.0f)
                horizontalLineTo(4.0f)
                moveTo(10.0f, 15.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(15.0f)
                moveTo(12.0f, 15.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(12.1f)
                lineTo(13.1f, 15.0f)
                horizontalLineTo(12.0f)
                moveTo(14.0f, 10.0f)
                verticalLineTo(10.8f)
                lineTo(20.2f, 17.0f)
                curveTo(21.2f, 16.9f, 22.0f, 16.1f, 22.0f, 15.0f)
                verticalLineTo(9.0f)
                curveTo(22.0f, 7.9f, 21.1f, 7.0f, 20.0f, 7.0f)
                horizontalLineTo(10.2f)
                lineTo(13.2f, 10.0f)
                horizontalLineTo(14.0f)
                moveTo(18.0f, 9.0f)
                curveTo(19.1f, 9.0f, 20.0f, 9.9f, 20.0f, 11.0f)
                reflectiveCurveTo(19.1f, 13.0f, 18.0f, 13.0f)
                reflectiveCurveTo(16.0f, 12.1f, 16.0f, 11.0f)
                reflectiveCurveTo(16.9f, 9.0f, 18.0f, 9.0f)
                close()
            }
        }
        .build()
        return _audioVideoOff!!
    }

private var _audioVideoOff: ImageVector? = null
