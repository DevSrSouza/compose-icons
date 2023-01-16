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

public val MaterialDesignIcons.MusicNoteOff: ImageVector
    get() {
        if (_musicNoteOff != null) {
            return _musicNoteOff!!
        }
        _musicNoteOff = Builder(name = "MusicNoteOff", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.27f, 3.0f)
                lineTo(3.0f, 4.27f)
                lineTo(12.0f, 13.27f)
                verticalLineTo(13.55f)
                curveTo(11.41f, 13.21f, 10.73f, 13.0f, 10.0f, 13.0f)
                curveTo(7.79f, 13.0f, 6.0f, 14.79f, 6.0f, 17.0f)
                reflectiveCurveTo(7.79f, 21.0f, 10.0f, 21.0f)
                reflectiveCurveTo(14.0f, 19.21f, 14.0f, 17.0f)
                verticalLineTo(15.27f)
                lineTo(19.73f, 21.0f)
                lineTo(21.0f, 19.73f)
                lineTo(4.27f, 3.0f)
                moveTo(14.0f, 7.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(8.18f)
                lineTo(14.0f, 10.18f)
                close()
            }
        }
        .build()
        return _musicNoteOff!!
    }

private var _musicNoteOff: ImageVector? = null
