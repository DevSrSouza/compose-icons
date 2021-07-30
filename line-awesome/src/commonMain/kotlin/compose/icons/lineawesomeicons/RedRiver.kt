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

public val LineAwesomeIcons.RedRiver: ImageVector
    get() {
        if (_redRiver != null) {
            return _redRiver!!
        }
        _redRiver = Builder(name = "RedRiver", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 5.0f)
                lineTo(5.0f, 27.0f)
                lineTo(27.0f, 27.0f)
                lineTo(27.0f, 5.0f)
                lineTo(5.0f, 5.0f)
                close()
                moveTo(7.0f, 7.0f)
                lineTo(25.0f, 7.0f)
                lineTo(25.0f, 25.0f)
                lineTo(7.0f, 25.0f)
                lineTo(7.0f, 7.0f)
                close()
                moveTo(12.0f, 11.0f)
                curveTo(11.448f, 11.0f, 11.0f, 11.448f, 11.0f, 12.0f)
                lineTo(11.0f, 18.0f)
                curveTo(12.105f, 18.0f, 13.0f, 17.105f, 13.0f, 16.0f)
                lineTo(13.0f, 14.0f)
                curveTo(13.0f, 13.448f, 13.448f, 13.0f, 14.0f, 13.0f)
                lineTo(16.0f, 13.0f)
                curveTo(17.105f, 13.0f, 18.0f, 12.105f, 18.0f, 11.0f)
                lineTo(12.0f, 11.0f)
                close()
                moveTo(16.0f, 15.0f)
                curveTo(15.448f, 15.0f, 15.0f, 15.448f, 15.0f, 16.0f)
                lineTo(15.0f, 22.0f)
                curveTo(16.105f, 22.0f, 17.0f, 21.105f, 17.0f, 20.0f)
                lineTo(17.0f, 18.0f)
                curveTo(17.0f, 17.448f, 17.448f, 17.0f, 18.0f, 17.0f)
                lineTo(20.0f, 17.0f)
                curveTo(21.105f, 17.0f, 22.0f, 16.105f, 22.0f, 15.0f)
                lineTo(16.0f, 15.0f)
                close()
            }
        }
        .build()
        return _redRiver!!
    }

private var _redRiver: ImageVector? = null
