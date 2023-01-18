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

public val RemixIcons.GameLine: ImageVector
    get() {
        if (_gameLine != null) {
            return _gameLine!!
        }
        _gameLine = Builder(name = "GameLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                arcToRelative(9.98f, 9.98f, 0.0f, false, true, 7.743f, 3.671f)
                lineTo(13.414f, 12.0f)
                lineToRelative(6.329f, 6.329f)
                arcTo(9.98f, 9.98f, 0.0f, false, true, 12.0f, 22.0f)
                curveTo(6.477f, 22.0f, 2.0f, 17.523f, 2.0f, 12.0f)
                reflectiveCurveTo(6.477f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(12.0f, 4.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 4.697f, 14.477f)
                lineToRelative(0.208f, -0.157f)
                lineToRelative(-6.32f, -6.32f)
                lineToRelative(6.32f, -6.321f)
                lineToRelative(-0.208f, -0.156f)
                arcToRelative(7.964f, 7.964f, 0.0f, false, false, -4.394f, -1.517f)
                lineTo(12.0f, 4.0f)
                close()
                moveTo(12.0f, 5.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 0.0f, 3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, -3.0f)
                close()
            }
        }
        .build()
        return _gameLine!!
    }

private var _gameLine: ImageVector? = null
