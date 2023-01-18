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

public val RemixIcons.AwardLine: ImageVector
    get() {
        if (_awardLine != null) {
            return _awardLine!!
        }
        _awardLine = Builder(name = "AwardLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 15.245f)
                verticalLineToRelative(6.872f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.757f, 0.429f)
                lineTo(12.0f, 20.0f)
                lineToRelative(-4.243f, 2.546f)
                arcToRelative(0.5f, 0.5f, 0.0f, false, true, -0.757f, -0.43f)
                verticalLineToRelative(-6.87f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 10.0f, 0.0f)
                close()
                moveTo(9.0f, 16.418f)
                verticalLineToRelative(3.05f)
                lineToRelative(3.0f, -1.8f)
                lineToRelative(3.0f, 1.8f)
                verticalLineToRelative(-3.05f)
                arcTo(7.978f, 7.978f, 0.0f, false, true, 12.0f, 17.0f)
                arcToRelative(7.978f, 7.978f, 0.0f, false, true, -3.0f, -0.582f)
                close()
                moveTo(12.0f, 15.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, 0.0f, -12.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                close()
            }
        }
        .build()
        return _awardLine!!
    }

private var _awardLine: ImageVector? = null
