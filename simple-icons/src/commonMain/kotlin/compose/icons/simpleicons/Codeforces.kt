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

public val SimpleIcons.Codeforces: ImageVector
    get() {
        if (_codeforces != null) {
            return _codeforces!!
        }
        _codeforces = Builder(name = "Codeforces", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.5f, 7.5f)
                curveTo(5.328f, 7.5f, 6.0f, 8.172f, 6.0f, 9.0f)
                verticalLineToRelative(10.5f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-3.0f)
                curveTo(0.673f, 21.0f, 0.0f, 20.328f, 0.0f, 19.5f)
                lineTo(0.0f, 9.0f)
                curveToRelative(0.0f, -0.828f, 0.673f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(3.0f)
                close()
                moveTo(13.5f, 3.0f)
                curveToRelative(0.828f, 0.0f, 1.5f, 0.672f, 1.5f, 1.5f)
                verticalLineToRelative(15.0f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-0.827f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                verticalLineToRelative(-15.0f)
                curveToRelative(0.0f, -0.828f, 0.673f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(3.0f)
                close()
                moveTo(22.5f, 10.5f)
                curveToRelative(0.828f, 0.0f, 1.5f, 0.672f, 1.5f, 1.5f)
                verticalLineToRelative(7.5f)
                curveToRelative(0.0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-0.828f, 0.0f, -1.5f, -0.672f, -1.5f, -1.5f)
                lineTo(18.0f, 12.0f)
                curveToRelative(0.0f, -0.828f, 0.672f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(3.0f)
                close()
            }
        }
        .build()
        return _codeforces!!
    }

private var _codeforces: ImageVector? = null
