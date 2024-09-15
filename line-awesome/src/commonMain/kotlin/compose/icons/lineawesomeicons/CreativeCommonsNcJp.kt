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

public val LineAwesomeIcons.CreativeCommonsNcJp: ImageVector
    get() {
        if (_creativeCommonsNcJp != null) {
            return _creativeCommonsNcJp!!
        }
        _creativeCommonsNcJp = Builder(name = "CreativeCommonsNcJp", defaultWidth = 32.0.dp,
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
                curveTo(27.0f, 17.238f, 26.783f, 18.425f, 26.404f, 19.537f)
                lineTo(17.553f, 15.596f)
                lineTo(21.0f, 11.0f)
                lineTo(18.625f, 11.0f)
                lineTo(16.0f, 14.313f)
                lineTo(13.531f, 11.0f)
                lineTo(11.156f, 11.0f)
                lineTo(13.125f, 13.625f)
                lineTo(6.408f, 10.635f)
                curveTo(8.294f, 7.278f, 11.884f, 5.0f, 16.0f, 5.0f)
                close()
                moveTo(5.596f, 12.463f)
                lineTo(13.0f, 15.76f)
                lineTo(13.0f, 18.0f)
                lineTo(15.0f, 18.0f)
                lineTo(15.0f, 19.0f)
                lineTo(13.0f, 19.0f)
                lineTo(13.0f, 21.0f)
                lineTo(15.0f, 21.0f)
                lineTo(15.0f, 22.0f)
                lineTo(17.0f, 22.0f)
                lineTo(17.0f, 21.0f)
                lineTo(19.0f, 21.0f)
                lineTo(19.0f, 19.0f)
                lineTo(17.0f, 19.0f)
                lineTo(17.0f, 18.0f)
                lineTo(18.033f, 18.0f)
                lineTo(25.592f, 21.365f)
                curveTo(23.706f, 24.722f, 20.116f, 27.0f, 16.0f, 27.0f)
                curveTo(9.935f, 27.0f, 5.0f, 22.065f, 5.0f, 16.0f)
                curveTo(5.0f, 14.762f, 5.217f, 13.575f, 5.596f, 12.463f)
                close()
            }
        }
        .build()
        return _creativeCommonsNcJp!!
    }

private var _creativeCommonsNcJp: ImageVector? = null
