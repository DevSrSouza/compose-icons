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
                curveTo(7.029f, 21.0f, 3.0f, 16.971f, 3.0f, 12.0f)
                curveTo(3.0f, 7.029f, 7.029f, 3.0f, 12.0f, 3.0f)
                curveTo(16.971f, 3.0f, 21.0f, 7.029f, 21.0f, 12.0f)
                curveTo(21.0f, 16.971f, 16.971f, 21.0f, 12.0f, 21.0f)
                close()
                moveTo(1.0f, 12.0f)
                curveTo(1.0f, 5.925f, 5.925f, 1.0f, 12.0f, 1.0f)
                curveTo(18.075f, 1.0f, 23.0f, 5.925f, 23.0f, 12.0f)
                curveTo(23.0f, 18.075f, 18.075f, 23.0f, 12.0f, 23.0f)
                curveTo(5.925f, 23.0f, 1.0f, 18.075f, 1.0f, 12.0f)
                close()
                moveTo(14.0f, 9.0f)
                curveTo(14.0f, 8.448f, 14.448f, 8.0f, 15.0f, 8.0f)
                curveTo(15.552f, 8.0f, 16.0f, 8.448f, 16.0f, 9.0f)
                verticalLineTo(15.0f)
                curveTo(16.0f, 15.552f, 15.552f, 16.0f, 15.0f, 16.0f)
                curveTo(14.448f, 16.0f, 14.0f, 15.552f, 14.0f, 15.0f)
                verticalLineTo(9.0f)
                close()
                moveTo(13.0f, 12.0f)
                lineTo(7.0f, 15.464f)
                verticalLineTo(8.536f)
                lineTo(13.0f, 12.0f)
                close()
            }
        }
        .build()
        return _playTrackNextO!!
    }

private var _playTrackNextO: ImageVector? = null
