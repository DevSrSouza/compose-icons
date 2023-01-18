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

public val RemixIcons.AwardFill: ImageVector
    get() {
        if (_awardFill != null) {
            return _awardFill!!
        }
        _awardFill = Builder(name = "AwardFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
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
                moveTo(12.0f, 15.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, 0.0f, -12.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                close()
                moveTo(12.0f, 13.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 0.0f, -8.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 8.0f)
                close()
            }
        }
        .build()
        return _awardFill!!
    }

private var _awardFill: ImageVector? = null
