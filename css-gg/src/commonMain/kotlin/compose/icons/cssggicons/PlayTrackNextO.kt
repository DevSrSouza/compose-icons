package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.CssGgIcons

public val CssGgIcons.PlayTrackNextO: ImageVector
    get() {
        if (_playTrackNextO != null) {
            return _playTrackNextO!!
        }
        _playTrackNextO = Builder(name = "PlayTrackNextO", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 21.0f)
                curveTo(7.0294f, 21.0f, 3.0f, 16.9706f, 3.0f, 12.0f)
                curveTo(3.0f, 7.0294f, 7.0294f, 3.0f, 12.0f, 3.0f)
                curveTo(16.9706f, 3.0f, 21.0f, 7.0294f, 21.0f, 12.0f)
                curveTo(21.0f, 16.9706f, 16.9706f, 21.0f, 12.0f, 21.0f)
                close()
                moveTo(1.0f, 12.0f)
                curveTo(1.0f, 5.9249f, 5.9249f, 1.0f, 12.0f, 1.0f)
                curveTo(18.0751f, 1.0f, 23.0f, 5.9249f, 23.0f, 12.0f)
                curveTo(23.0f, 18.0751f, 18.0751f, 23.0f, 12.0f, 23.0f)
                curveTo(5.9249f, 23.0f, 1.0f, 18.0751f, 1.0f, 12.0f)
                close()
                moveTo(14.0f, 9.0f)
                curveTo(14.0f, 8.4477f, 14.4477f, 8.0f, 15.0f, 8.0f)
                curveTo(15.5523f, 8.0f, 16.0f, 8.4477f, 16.0f, 9.0f)
                verticalLineTo(15.0f)
                curveTo(16.0f, 15.5523f, 15.5523f, 16.0f, 15.0f, 16.0f)
                curveTo(14.4477f, 16.0f, 14.0f, 15.5523f, 14.0f, 15.0f)
                verticalLineTo(9.0f)
                close()
                moveTo(13.0f, 12.0f)
                lineTo(7.0f, 15.4641f)
                verticalLineTo(8.5359f)
                lineTo(13.0f, 12.0f)
                close()
            }
        }
        .build()
        return _playTrackNextO!!
    }

private var _playTrackNextO: ImageVector? = null
