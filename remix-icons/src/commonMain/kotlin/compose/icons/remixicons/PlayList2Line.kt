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

public val RemixIcons.PlayList2Line: ImageVector
    get() {
        if (_playList2Line != null) {
            return _playList2Line!!
        }
        _playList2Line = Builder(name = "PlayList2Line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 18.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(2.0f)
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
                horizontalLineTo(12.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(10.0f)
                close()
                moveTo(4.0f, 7.108f)
                verticalLineToRelative(2.784f)
                lineTo(6.226f, 8.5f)
                lineTo(4.0f, 7.108f)
                close()
                moveTo(22.0f, 4.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(4.0f)
                horizontalLineToRelative(10.0f)
                close()
            }
        }
        .build()
        return _playList2Line!!
    }

private var _playList2Line: ImageVector? = null
