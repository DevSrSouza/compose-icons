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

public val RemixIcons.Css3Fill: ImageVector
    get() {
        if (_css3Fill != null) {
            return _css3Fill!!
        }
        _css3Fill = Builder(name = "Css3Fill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 3.0f)
                lineToRelative(-0.65f, 3.34f)
                horizontalLineToRelative(13.59f)
                lineTo(17.5f, 8.5f)
                horizontalLineTo(3.92f)
                lineToRelative(-0.66f, 3.33f)
                horizontalLineToRelative(13.59f)
                lineToRelative(-0.76f, 3.81f)
                lineToRelative(-5.48f, 1.81f)
                lineToRelative(-4.75f, -1.81f)
                lineToRelative(0.33f, -1.64f)
                horizontalLineTo(2.85f)
                lineToRelative(-0.79f, 4.0f)
                lineToRelative(7.85f, 3.0f)
                lineToRelative(9.05f, -3.0f)
                lineToRelative(1.2f, -6.03f)
                lineToRelative(0.24f, -1.21f)
                lineTo(21.94f, 3.0f)
                close()
            }
        }
        .build()
        return _css3Fill!!
    }

private var _css3Fill: ImageVector? = null
