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

public val MaterialDesignIcons.MusicNoteOffOutline: ImageVector
    get() {
        if (_musicNoteOffOutline != null) {
            return _musicNoteOffOutline!!
        }
        _musicNoteOffOutline = Builder(name = "MusicNoteOffOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 7.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(7.61f)
                lineTo(14.0f, 9.61f)
                moveTo(12.0f, 10.44f)
                lineTo(4.41f, 2.86f)
                lineTo(3.0f, 4.27f)
                lineTo(12.0f, 13.27f)
                verticalLineTo(13.55f)
                arcTo(3.94f, 3.94f, 0.0f, false, false, 8.67f, 13.23f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 10.65f, 20.95f)
                arcTo(4.1f, 4.1f, 0.0f, false, false, 14.0f, 16.85f)
                verticalLineTo(15.27f)
                lineTo(19.73f, 21.0f)
                lineTo(21.14f, 19.59f)
                moveTo(10.0f, 19.0f)
                arcTo(2.0f, 2.0f, 0.0f, true, true, 12.0f, 17.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 10.0f, 19.0f)
                close()
            }
        }
        .build()
        return _musicNoteOffOutline!!
    }

private var _musicNoteOffOutline: ImageVector? = null
