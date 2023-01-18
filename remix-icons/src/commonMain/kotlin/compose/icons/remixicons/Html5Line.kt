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

public val RemixIcons.Html5Line: ImageVector
    get() {
        if (_html5Line != null) {
            return _html5Line!!
        }
        _html5Line = Builder(name = "Html5Line", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 18.178f)
                lineToRelative(-4.62f, -1.256f)
                lineToRelative(-0.328f, -3.544f)
                horizontalLineToRelative(2.27f)
                lineToRelative(0.158f, 1.844f)
                lineToRelative(2.52f, 0.667f)
                lineToRelative(2.52f, -0.667f)
                lineToRelative(0.26f, -2.866f)
                lineTo(6.96f, 12.356f)
                lineToRelative(-0.635f, -6.678f)
                horizontalLineToRelative(11.35f)
                lineToRelative(-0.227f, 2.21f)
                lineTo(8.822f, 7.888f)
                lineToRelative(0.204f, 2.256f)
                horizontalLineToRelative(8.217f)
                lineToRelative(-0.624f, 6.778f)
                lineTo(12.0f, 18.178f)
                close()
                moveTo(3.0f, 2.0f)
                horizontalLineToRelative(18.0f)
                lineToRelative(-1.623f, 18.0f)
                lineTo(12.0f, 22.0f)
                lineToRelative(-7.377f, -2.0f)
                lineTo(3.0f, 2.0f)
                close()
                moveTo(5.188f, 4.0f)
                lineTo(6.49f, 18.434f)
                lineTo(12.0f, 19.928f)
                lineToRelative(5.51f, -1.494f)
                lineTo(18.812f, 4.0f)
                lineTo(5.188f, 4.0f)
                close()
            }
        }
        .build()
        return _html5Line!!
    }

private var _html5Line: ImageVector? = null
