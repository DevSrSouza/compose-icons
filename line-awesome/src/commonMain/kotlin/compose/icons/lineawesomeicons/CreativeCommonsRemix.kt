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

public val LineAwesomeIcons.CreativeCommonsRemix: ImageVector
    get() {
        if (_creativeCommonsRemix != null) {
            return _creativeCommonsRemix!!
        }
        _creativeCommonsRemix = Builder(name = "CreativeCommonsRemix", defaultWidth = 32.0.dp,
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
                moveTo(14.498f, 9.0f)
                lineTo(11.0f, 10.3281f)
                lineTo(11.0f, 13.9531f)
                lineTo(11.0645f, 13.9785f)
                lineTo(10.998f, 14.0f)
                lineTo(8.0f, 15.1387f)
                lineTo(8.0f, 18.5156f)
                lineTo(11.002f, 20.0f)
                lineTo(14.0f, 18.5898f)
                lineTo(14.0f, 18.5918f)
                lineTo(20.502f, 21.0078f)
                lineTo(24.0f, 19.6777f)
                lineTo(24.0f, 16.0547f)
                lineTo(21.0f, 14.9395f)
                lineTo(21.0f, 11.418f)
                lineTo(14.498f, 9.0f)
                close()
                moveTo(19.7148f, 15.5273f)
                lineTo(22.0801f, 16.4063f)
                lineTo(20.498f, 17.0078f)
                lineTo(18.1348f, 16.1289f)
                lineTo(19.7148f, 15.5273f)
                close()
                moveTo(15.0f, 16.0273f)
                lineTo(20.0f, 17.8887f)
                lineTo(20.0f, 19.7539f)
                lineTo(15.0f, 17.8965f)
                lineTo(15.0f, 16.0273f)
                close()
                moveTo(23.0f, 17.127f)
                lineTo(23.0f, 18.9883f)
                lineTo(21.0f, 19.748f)
                lineTo(21.0f, 17.8867f)
                lineTo(23.0f, 17.127f)
                close()
            }
        }
        .build()
        return _creativeCommonsRemix!!
    }

private var _creativeCommonsRemix: ImageVector? = null
