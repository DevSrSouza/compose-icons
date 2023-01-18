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

public val RemixIcons.EyeLine: ImageVector
    get() {
        if (_eyeLine != null) {
            return _eyeLine!!
        }
        _eyeLine = Builder(name = "EyeLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 3.0f)
                curveToRelative(5.392f, 0.0f, 9.878f, 3.88f, 10.819f, 9.0f)
                curveToRelative(-0.94f, 5.12f, -5.427f, 9.0f, -10.819f, 9.0f)
                curveToRelative(-5.392f, 0.0f, -9.878f, -3.88f, -10.819f, -9.0f)
                curveTo(2.121f, 6.88f, 6.608f, 3.0f, 12.0f, 3.0f)
                close()
                moveTo(12.0f, 19.0f)
                arcToRelative(9.005f, 9.005f, 0.0f, false, false, 8.777f, -7.0f)
                arcToRelative(9.005f, 9.005f, 0.0f, false, false, -17.554f, 0.0f)
                arcTo(9.005f, 9.005f, 0.0f, false, false, 12.0f, 19.0f)
                close()
                moveTo(12.0f, 16.5f)
                arcToRelative(4.5f, 4.5f, 0.0f, true, true, 0.0f, -9.0f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, 0.0f, 9.0f)
                close()
                moveTo(12.0f, 14.5f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, false, 0.0f, -5.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, false, 0.0f, 5.0f)
                close()
            }
        }
        .build()
        return _eyeLine!!
    }

private var _eyeLine: ImageVector? = null
