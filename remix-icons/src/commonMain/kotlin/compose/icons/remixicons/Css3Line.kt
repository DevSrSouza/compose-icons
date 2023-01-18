package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.Css3Line: ImageVector
    get() {
        if (_css3Line != null) {
            return _css3Line!!
        }
        _css3Line = Builder(name = "Css3Line", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.8f, 14.0f)
                horizontalLineToRelative(2.04f)
                lineToRelative(-0.545f, 2.725f)
                lineToRelative(5.744f, 2.154f)
                lineToRelative(7.227f, -2.41f)
                lineTo(18.36f, 11.0f)
                horizontalLineTo(3.4f)
                lineToRelative(0.4f, -2.0f)
                horizontalLineToRelative(14.96f)
                lineToRelative(0.8f, -4.0f)
                horizontalLineTo(4.6f)
                lineTo(5.0f, 3.0f)
                horizontalLineToRelative(17.0f)
                lineToRelative(-3.0f, 15.0f)
                lineToRelative(-9.0f, 3.0f)
                lineToRelative(-8.0f, -3.0f)
                close()
            }
        }
        .build()
        return _css3Line!!
    }

private var _css3Line: ImageVector? = null
