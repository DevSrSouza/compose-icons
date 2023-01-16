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

public val MaterialDesignIcons.AudioInputRca: ImageVector
    get() {
        if (_audioInputRca != null) {
            return _audioInputRca!!
        }
        _audioInputRca = Builder(name = "AudioInputRca", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 6.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(2.0f)
                curveTo(7.0f, 1.45f, 7.45f, 1.0f, 8.0f, 1.0f)
                reflectiveCurveTo(9.0f, 1.45f, 9.0f, 2.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(11.0f)
                moveTo(5.0f, 14.0f)
                verticalLineTo(16.0f)
                curveTo(5.0f, 17.3f, 5.84f, 18.4f, 7.0f, 18.82f)
                verticalLineTo(23.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(18.82f)
                curveTo(10.16f, 18.4f, 11.0f, 17.3f, 11.0f, 16.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(5.0f)
                moveTo(17.0f, 6.0f)
                verticalLineTo(2.0f)
                curveTo(17.0f, 1.45f, 16.55f, 1.0f, 16.0f, 1.0f)
                reflectiveCurveTo(15.0f, 1.45f, 15.0f, 2.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(17.0f)
                moveTo(13.0f, 14.0f)
                verticalLineTo(16.0f)
                curveTo(13.0f, 17.3f, 13.84f, 18.4f, 15.0f, 18.82f)
                verticalLineTo(23.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(18.82f)
                curveTo(18.16f, 18.4f, 19.0f, 17.3f, 19.0f, 16.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(13.0f)
                close()
            }
        }
        .build()
        return _audioInputRca!!
    }

private var _audioInputRca: ImageVector? = null
