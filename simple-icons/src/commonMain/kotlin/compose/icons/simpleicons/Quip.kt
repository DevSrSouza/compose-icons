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

public val SimpleIcons.Quip: ImageVector
    get() {
        if (_quip != null) {
            return _quip!!
        }
        _quip = Builder(name = "Quip", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.154f, 22.154f)
                lineTo(12.0f, 22.154f)
                arcToRelative(10.06f, 10.06f, 0.0f, false, true, -7.4f, -3.201f)
                curveTo(2.66f, 16.89f, 1.69f, 14.19f, 1.868f, 11.35f)
                curveToRelative(0.315f, -5.091f, 4.39f, -9.168f, 9.482f, -9.484f)
                curveToRelative(0.22f, -0.014f, 0.44f, -0.02f, 0.657f, -0.02f)
                arcTo(10.058f, 10.059f, 0.0f, false, true, 18.952f, 4.6f)
                arcToRelative(10.058f, 10.059f, 0.0f, false, true, 3.202f, 7.4f)
                close()
                moveTo(20.216f, 3.254f)
                curveTo(17.778f, 0.963f, 14.59f, -0.186f, 11.236f, 0.024f)
                curveTo(5.218f, 0.399f, 0.398f, 5.219f, 0.024f, 11.237f)
                curveToRelative(-0.207f, 3.353f, 0.94f, 6.543f, 3.231f, 8.98f)
                arcTo(12.047f, 12.048f, 0.0f, false, false, 12.0f, 24.0f)
                horizontalLineToRelative(11.077f)
                curveToRelative(0.51f, 0.0f, 0.923f, -0.413f, 0.923f, -0.922f)
                lineTo(24.0f, 12.0f)
                arcToRelative(12.047f, 12.048f, 0.0f, false, false, -3.784f, -8.745f)
                moveToRelative(-4.062f, 11.976f)
                lineTo(7.846f, 15.231f)
                arcToRelative(0.923f, 0.923f, 0.0f, false, false, 0.0f, 1.846f)
                horizontalLineToRelative(8.308f)
                arcToRelative(0.923f, 0.923f, 0.0f, false, false, 0.0f, -1.846f)
                moveTo(7.846f, 8.77f)
                horizontalLineToRelative(8.308f)
                arcToRelative(0.923f, 0.923f, 0.0f, false, false, 0.0f, -1.847f)
                lineTo(7.846f, 6.923f)
                arcToRelative(0.923f, 0.923f, 0.0f, false, false, 0.0f, 1.847f)
                moveToRelative(-2.769f, 2.308f)
                arcToRelative(0.923f, 0.923f, 0.0f, false, false, 0.0f, 1.845f)
                horizontalLineToRelative(13.846f)
                arcToRelative(0.923f, 0.923f, 0.0f, false, false, 0.0f, -1.846f)
                lineTo(5.077f, 11.077f)
                close()
            }
        }
        .build()
        return _quip!!
    }

private var _quip: ImageVector? = null
