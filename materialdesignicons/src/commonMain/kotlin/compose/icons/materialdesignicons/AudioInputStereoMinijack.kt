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

public val MaterialDesignIcons.AudioInputStereoMinijack: ImageVector
    get() {
        if (_audioInputStereoMinijack != null) {
            return _audioInputStereoMinijack!!
        }
        _audioInputStereoMinijack = Builder(name = "AudioInputStereoMinijack", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 4.0f)
                verticalLineTo(3.0f)
                curveTo(11.0f, 2.45f, 11.45f, 2.0f, 12.0f, 2.0f)
                reflectiveCurveTo(13.0f, 2.45f, 13.0f, 3.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(11.0f)
                moveTo(13.0f, 9.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(15.0f)
                curveTo(9.0f, 16.3f, 9.84f, 17.4f, 11.0f, 17.82f)
                verticalLineTo(22.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(17.82f)
                curveTo(14.16f, 17.4f, 15.0f, 16.3f, 15.0f, 15.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(13.0f)
                close()
            }
        }
        .build()
        return _audioInputStereoMinijack!!
    }

private var _audioInputStereoMinijack: ImageVector? = null
