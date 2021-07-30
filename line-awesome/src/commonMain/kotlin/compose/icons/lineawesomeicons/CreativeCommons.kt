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

public val LineAwesomeIcons.CreativeCommons: ImageVector
    get() {
        if (_creativeCommons != null) {
            return _creativeCommons!!
        }
        _creativeCommons = Builder(name = "CreativeCommons", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 4.0f)
                curveTo(9.3828f, 4.0f, 4.0f, 9.3828f, 4.0f, 16.0f)
                curveTo(4.0f, 22.6172f, 9.3828f, 28.0f, 16.0f, 28.0f)
                curveTo(22.6172f, 28.0f, 28.0f, 22.6172f, 28.0f, 16.0f)
                curveTo(28.0f, 9.3828f, 22.6172f, 4.0f, 16.0f, 4.0f)
                close()
                moveTo(16.0f, 6.0f)
                curveTo(21.5352f, 6.0f, 26.0f, 10.4648f, 26.0f, 16.0f)
                curveTo(26.0f, 21.5352f, 21.5352f, 26.0f, 16.0f, 26.0f)
                curveTo(10.4648f, 26.0f, 6.0f, 21.5352f, 6.0f, 16.0f)
                curveTo(6.0f, 10.4648f, 10.4648f, 6.0f, 16.0f, 6.0f)
                close()
                moveTo(12.0f, 12.0f)
                curveTo(10.3555f, 12.0f, 9.0f, 13.3555f, 9.0f, 15.0f)
                lineTo(9.0f, 17.0f)
                curveTo(9.0f, 18.6445f, 10.3555f, 20.0f, 12.0f, 20.0f)
                curveTo(13.6445f, 20.0f, 15.0f, 18.6445f, 15.0f, 17.0f)
                lineTo(13.0f, 17.0f)
                curveTo(13.0f, 17.5664f, 12.5664f, 18.0f, 12.0f, 18.0f)
                curveTo(11.4336f, 18.0f, 11.0f, 17.5664f, 11.0f, 17.0f)
                lineTo(11.0f, 15.0f)
                curveTo(11.0f, 14.4336f, 11.4336f, 14.0f, 12.0f, 14.0f)
                curveTo(12.5664f, 14.0f, 13.0f, 14.4336f, 13.0f, 15.0f)
                lineTo(15.0f, 15.0f)
                curveTo(15.0f, 13.3555f, 13.6445f, 12.0f, 12.0f, 12.0f)
                close()
                moveTo(20.0f, 12.0f)
                curveTo(18.3555f, 12.0f, 17.0f, 13.3555f, 17.0f, 15.0f)
                lineTo(17.0f, 17.0f)
                curveTo(17.0f, 18.6445f, 18.3555f, 20.0f, 20.0f, 20.0f)
                curveTo(21.6445f, 20.0f, 23.0f, 18.6445f, 23.0f, 17.0f)
                lineTo(21.0f, 17.0f)
                curveTo(21.0f, 17.5664f, 20.5664f, 18.0f, 20.0f, 18.0f)
                curveTo(19.4336f, 18.0f, 19.0f, 17.5664f, 19.0f, 17.0f)
                lineTo(19.0f, 15.0f)
                curveTo(19.0f, 14.4336f, 19.4336f, 14.0f, 20.0f, 14.0f)
                curveTo(20.5664f, 14.0f, 21.0f, 14.4336f, 21.0f, 15.0f)
                lineTo(23.0f, 15.0f)
                curveTo(23.0f, 13.3555f, 21.6445f, 12.0f, 20.0f, 12.0f)
                close()
            }
        }
        .build()
        return _creativeCommons!!
    }

private var _creativeCommons: ImageVector? = null
