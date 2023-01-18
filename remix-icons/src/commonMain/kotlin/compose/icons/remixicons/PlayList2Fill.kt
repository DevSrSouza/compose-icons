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

public val RemixIcons.PlayList2Fill: ImageVector
    get() {
        if (_playList2Fill != null) {
            return _playList2Fill!!
        }
        _playList2Fill = Builder(name = "PlayList2Fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 18.0f)
                verticalLineToRelative(2.0f)
                lineTo(2.0f, 20.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(20.0f)
                close()
                moveTo(2.0f, 3.5f)
                lineToRelative(8.0f, 5.0f)
                lineToRelative(-8.0f, 5.0f)
                verticalLineToRelative(-10.0f)
                close()
                moveTo(22.0f, 11.0f)
                verticalLineToRelative(2.0f)
                lineTo(12.0f, 13.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(10.0f)
                close()
                moveTo(22.0f, 4.0f)
                verticalLineToRelative(2.0f)
                lineTo(12.0f, 6.0f)
                lineTo(12.0f, 4.0f)
                horizontalLineToRelative(10.0f)
                close()
            }
        }
        .build()
        return _playList2Fill!!
    }

private var _playList2Fill: ImageVector? = null
