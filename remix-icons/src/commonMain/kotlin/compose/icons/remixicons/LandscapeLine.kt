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

public val RemixIcons.LandscapeLine: ImageVector
    get() {
        if (_landscapeLine != null) {
            return _landscapeLine!!
        }
        _landscapeLine = Builder(name = "LandscapeLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.27f, 12.216f)
                lineTo(15.0f, 6.0f)
                lineToRelative(8.0f, 15.0f)
                lineTo(2.0f, 21.0f)
                lineTo(9.0f, 8.0f)
                lineToRelative(2.27f, 4.216f)
                close()
                moveTo(12.39f, 14.238f)
                lineTo(14.987f, 19.0f)
                horizontalLineToRelative(4.68f)
                lineToRelative(-4.77f, -8.942f)
                lineToRelative(-2.507f, 4.18f)
                close()
                moveTo(5.348f, 19.0f)
                horizontalLineToRelative(7.304f)
                lineTo(9.0f, 12.219f)
                lineTo(5.348f, 19.0f)
                close()
                moveTo(5.5f, 8.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, 0.0f, -5.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 0.0f, 5.0f)
                close()
            }
        }
        .build()
        return _landscapeLine!!
    }

private var _landscapeLine: ImageVector? = null
