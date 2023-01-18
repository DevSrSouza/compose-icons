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

public val RemixIcons.BlazeLine: ImageVector
    get() {
        if (_blazeLine != null) {
            return _blazeLine!!
        }
        _blazeLine = Builder(name = "BlazeLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 9.0f)
                curveToRelative(0.667f, 1.06f, 1.0f, 2.394f, 1.0f, 4.0f)
                curveToRelative(0.0f, 3.0f, -3.5f, 4.0f, -5.0f, 9.0f)
                curveToRelative(-0.667f, -0.575f, -1.0f, -1.408f, -1.0f, -2.5f)
                curveToRelative(0.0f, -3.482f, 5.0f, -5.29f, 5.0f, -10.5f)
                close()
                moveTo(14.5f, 5.0f)
                arcToRelative(8.31f, 8.31f, 0.0f, false, true, 1.0f, 4.0f)
                curveToRelative(0.0f, 5.0f, -6.0f, 6.0f, -4.0f, 13.0f)
                curveTo(9.833f, 20.84f, 9.0f, 19.173f, 9.0f, 17.0f)
                curveToRelative(0.0f, -3.325f, 5.5f, -6.0f, 5.5f, -12.0f)
                close()
                moveTo(10.0f, 1.0f)
                curveToRelative(0.667f, 1.333f, 1.0f, 2.833f, 1.0f, 4.5f)
                curveToRelative(0.0f, 6.0f, -9.0f, 7.5f, -3.0f, 16.5f)
                curveToRelative(-2.5f, -0.5f, -4.5f, -3.0f, -4.5f, -6.0f)
                curveTo(3.5f, 9.5f, 10.0f, 8.5f, 10.0f, 1.0f)
                close()
            }
        }
        .build()
        return _blazeLine!!
    }

private var _blazeLine: ImageVector? = null
