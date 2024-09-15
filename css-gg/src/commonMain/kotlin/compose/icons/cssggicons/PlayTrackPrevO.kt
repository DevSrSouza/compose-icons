package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.CssGgIcons

public val CssGgIcons.PlayTrackPrevO: ImageVector
    get() {
        if (_playTrackPrevO != null) {
            return _playTrackPrevO!!
        }
        _playTrackPrevO = Builder(name = "PlayTrackPrevO", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(8.0f, 8.0f)
                curveTo(8.552f, 8.0f, 9.0f, 8.448f, 9.0f, 9.0f)
                verticalLineTo(15.0f)
                curveTo(9.0f, 15.552f, 8.552f, 16.0f, 8.0f, 16.0f)
                curveTo(7.448f, 16.0f, 7.0f, 15.552f, 7.0f, 15.0f)
                verticalLineTo(9.0f)
                curveTo(7.0f, 8.448f, 7.448f, 8.0f, 8.0f, 8.0f)
                close()
                moveTo(16.0f, 15.464f)
                lineTo(10.0f, 12.0f)
                lineTo(16.0f, 8.536f)
                verticalLineTo(15.464f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(3.0f, 12.0f)
                curveTo(3.0f, 16.971f, 7.029f, 21.0f, 12.0f, 21.0f)
                curveTo(16.971f, 21.0f, 21.0f, 16.971f, 21.0f, 12.0f)
                curveTo(21.0f, 7.029f, 16.971f, 3.0f, 12.0f, 3.0f)
                curveTo(7.029f, 3.0f, 3.0f, 7.029f, 3.0f, 12.0f)
                close()
                moveTo(12.0f, 1.0f)
                curveTo(5.925f, 1.0f, 1.0f, 5.925f, 1.0f, 12.0f)
                curveTo(1.0f, 18.075f, 5.925f, 23.0f, 12.0f, 23.0f)
                curveTo(18.075f, 23.0f, 23.0f, 18.075f, 23.0f, 12.0f)
                curveTo(23.0f, 5.925f, 18.075f, 1.0f, 12.0f, 1.0f)
                close()
            }
        }
        .build()
        return _playTrackPrevO!!
    }

private var _playTrackPrevO: ImageVector? = null
