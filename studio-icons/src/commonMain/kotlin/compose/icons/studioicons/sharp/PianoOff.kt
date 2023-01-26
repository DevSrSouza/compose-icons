package compose.icons.studioicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.SharpGroup

public val SharpGroup.PianoOff: ImageVector
    get() {
        if (_pianoOff != null) {
            return _pianoOff!!
        }
        _pianoOff = Builder(name = "PianoOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.19f, 21.19f)
                lineTo(2.81f, 2.81f)
                lineTo(1.39f, 4.22f)
                lineTo(3.0f, 5.83f)
                verticalLineTo(21.0f)
                horizontalLineToRelative(15.17f)
                lineToRelative(1.61f, 1.61f)
                lineTo(21.19f, 21.19f)
                close()
                moveTo(8.25f, 19.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(7.83f)
                lineToRelative(2.0f, 2.0f)
                verticalLineToRelative(4.67f)
                horizontalLineToRelative(1.25f)
                verticalLineTo(19.0f)
                close()
                moveTo(9.75f, 19.0f)
                verticalLineToRelative(-4.5f)
                horizontalLineTo(11.0f)
                verticalLineToRelative(-0.67f)
                lineToRelative(3.25f, 3.25f)
                verticalLineTo(19.0f)
                horizontalLineTo(9.75f)
                close()
                moveTo(5.83f, 3.0f)
                horizontalLineTo(21.0f)
                verticalLineToRelative(15.17f)
                lineToRelative(-2.0f, -2.0f)
                verticalLineTo(5.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(9.17f)
                lineToRelative(-4.0f, -4.0f)
                verticalLineTo(5.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(3.17f)
                lineTo(5.83f, 3.0f)
                close()
            }
        }
        .build()
        return _pianoOff!!
    }

private var _pianoOff: ImageVector? = null
