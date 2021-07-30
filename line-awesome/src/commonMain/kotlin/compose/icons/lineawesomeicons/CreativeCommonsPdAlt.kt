package compose.icons.lineawesomeicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.LineAwesomeIcons

public val LineAwesomeIcons.CreativeCommonsPdAlt: ImageVector
    get() {
        if (_creativeCommonsPdAlt != null) {
            return _creativeCommonsPdAlt!!
        }
        _creativeCommonsPdAlt = Builder(name = "CreativeCommonsPdAlt", defaultWidth = 32.0.dp,
                defaultHeight = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 3.0f)
                curveTo(8.832f, 3.0f, 3.0f, 8.832f, 3.0f, 16.0f)
                curveTo(3.0f, 23.168f, 8.832f, 29.0f, 16.0f, 29.0f)
                curveTo(23.168f, 29.0f, 29.0f, 23.168f, 29.0f, 16.0f)
                curveTo(29.0f, 8.832f, 23.168f, 3.0f, 16.0f, 3.0f)
                close()
                moveTo(16.0f, 5.0f)
                curveTo(22.065f, 5.0f, 27.0f, 9.935f, 27.0f, 16.0f)
                curveTo(27.0f, 22.065f, 22.065f, 27.0f, 16.0f, 27.0f)
                curveTo(9.935f, 27.0f, 5.0f, 22.065f, 5.0f, 16.0f)
                curveTo(5.0f, 9.935f, 9.935f, 5.0f, 16.0f, 5.0f)
                close()
                moveTo(9.0f, 12.0f)
                lineTo(9.0f, 20.0f)
                lineTo(11.0f, 20.0f)
                lineTo(11.0f, 18.0f)
                lineTo(13.0f, 18.0f)
                curveTo(14.654f, 18.0f, 16.0f, 16.654f, 16.0f, 15.0f)
                curveTo(16.0f, 13.346f, 14.654f, 12.0f, 13.0f, 12.0f)
                lineTo(9.0f, 12.0f)
                close()
                moveTo(17.0f, 12.0f)
                lineTo(17.0f, 20.0f)
                lineTo(20.5f, 20.0f)
                curveTo(22.43f, 20.0f, 24.0f, 18.206f, 24.0f, 16.0f)
                curveTo(24.0f, 13.794f, 22.43f, 12.0f, 20.5f, 12.0f)
                lineTo(17.0f, 12.0f)
                close()
                moveTo(11.0f, 14.0f)
                lineTo(13.0f, 14.0f)
                curveTo(13.551f, 14.0f, 14.0f, 14.448f, 14.0f, 15.0f)
                curveTo(14.0f, 15.552f, 13.551f, 16.0f, 13.0f, 16.0f)
                lineTo(11.0f, 16.0f)
                lineTo(11.0f, 14.0f)
                close()
                moveTo(19.0f, 14.0f)
                lineTo(20.5f, 14.0f)
                curveTo(21.313f, 14.0f, 22.0f, 14.916f, 22.0f, 16.0f)
                curveTo(22.0f, 17.084f, 21.313f, 18.0f, 20.5f, 18.0f)
                lineTo(19.0f, 18.0f)
                lineTo(19.0f, 14.0f)
                close()
            }
        }
        .build()
        return _creativeCommonsPdAlt!!
    }

private var _creativeCommonsPdAlt: ImageVector? = null
