package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Vbulletin: ImageVector
    get() {
        if (_vbulletin != null) {
            return _vbulletin!!
        }
        _vbulletin = Builder(name = "Vbulletin", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.09f, 10.316f)
                lineTo(1.09f, 24.0f)
                horizontalLineToRelative(21.82f)
                lineTo(22.91f, 0.0f)
                horizontalLineToRelative(-2.417f)
                lineToRelative(-5.461f, 19.613f)
                horizontalLineToRelative(-6.09f)
                lineToRelative(-3.134f, -9.246f)
                close()
                moveTo(10.373f, 5.872f)
                lineToRelative(1.363f, 6.308f)
                lineTo(13.955f, 0.0f)
                lineTo(1.089f, 0.0f)
                verticalLineToRelative(5.872f)
                close()
            }
        }
        .build()
        return _vbulletin!!
    }

private var _vbulletin: ImageVector? = null
