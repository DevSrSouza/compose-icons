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

public val RemixIcons.EyeFill: ImageVector
    get() {
        if (_eyeFill != null) {
            return _eyeFill!!
        }
        _eyeFill = Builder(name = "EyeFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.181f, 12.0f)
                curveTo(2.121f, 6.88f, 6.608f, 3.0f, 12.0f, 3.0f)
                curveToRelative(5.392f, 0.0f, 9.878f, 3.88f, 10.819f, 9.0f)
                curveToRelative(-0.94f, 5.12f, -5.427f, 9.0f, -10.819f, 9.0f)
                curveToRelative(-5.392f, 0.0f, -9.878f, -3.88f, -10.819f, -9.0f)
                close()
                moveTo(12.0f, 17.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, true, false, 0.0f, -10.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, false, 0.0f, 10.0f)
                close()
                moveTo(12.0f, 15.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, true, 0.0f, -6.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 0.0f, 6.0f)
                close()
            }
        }
        .build()
        return _eyeFill!!
    }

private var _eyeFill: ImageVector? = null
