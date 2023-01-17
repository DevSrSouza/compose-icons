package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Doubanread: ImageVector
    get() {
        if (_doubanread != null) {
            return _doubanread!!
        }
        _doubanread = Builder(name = "Doubanread", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.328f, 5.553f)
                curveToRelative(-2.648f, 0.906f, -4.008f, 4.372f, -7.101f, 4.833f)
                curveTo(4.827f, 10.833f, 0.752f, 7.205f, 0.0f, 6.0f)
                curveToRelative(0.0f, 0.0f, 0.526f, 0.906f, 1.28f, 2.105f)
                curveTo(5.205f, 14.297f, 7.772f, 18.224f, 12.0f, 18.75f)
                curveToRelative(5.28f, 0.68f, 8.146f, -4.535f, 8.826f, -6.64f)
                curveToRelative(0.607f, -1.732f, 1.733f, -1.66f, 2.494f, -1.433f)
                lineToRelative(0.68f, 0.227f)
                reflectiveCurveToRelative(-2.729f, -7.402f, -8.688f, -5.36f)
                lineToRelative(0.016f, 0.008f)
                close()
            }
        }
        .build()
        return _doubanread!!
    }

private var _doubanread: ImageVector? = null
