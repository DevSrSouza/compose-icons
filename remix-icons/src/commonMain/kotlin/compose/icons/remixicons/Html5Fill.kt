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

public val RemixIcons.Html5Fill: ImageVector
    get() {
        if (_html5Fill != null) {
            return _html5Fill!!
        }
        _html5Fill = Builder(name = "Html5Fill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 18.178f)
                lineToRelative(4.62f, -1.256f)
                lineToRelative(0.623f, -6.778f)
                horizontalLineTo(9.026f)
                lineTo(8.822f, 7.89f)
                horizontalLineToRelative(8.626f)
                lineToRelative(0.227f, -2.211f)
                horizontalLineTo(6.325f)
                lineToRelative(0.636f, 6.678f)
                horizontalLineToRelative(7.82f)
                lineToRelative(-0.261f, 2.866f)
                lineToRelative(-2.52f, 0.667f)
                lineToRelative(-2.52f, -0.667f)
                lineToRelative(-0.158f, -1.844f)
                horizontalLineToRelative(-2.27f)
                lineToRelative(0.329f, 3.544f)
                lineTo(12.0f, 18.178f)
                close()
                moveTo(3.0f, 2.0f)
                horizontalLineToRelative(18.0f)
                lineToRelative(-1.623f, 18.0f)
                lineTo(12.0f, 22.0f)
                lineToRelative(-7.377f, -2.0f)
                lineTo(3.0f, 2.0f)
                close()
            }
        }
        .build()
        return _html5Fill!!
    }

private var _html5Fill: ImageVector? = null
