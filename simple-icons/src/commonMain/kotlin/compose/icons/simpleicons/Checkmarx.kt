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

public val SimpleIcons.Checkmarx: ImageVector
    get() {
        if (_checkmarx != null) {
            return _checkmarx!!
        }
        _checkmarx = Builder(name = "Checkmarx", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.544f, 0.12f)
                arcTo(6.553f, 6.553f, 0.0f, false, false, 0.0f, 6.664f)
                verticalLineToRelative(10.674f)
                arcToRelative(6.551f, 6.551f, 0.0f, false, false, 6.544f, 6.542f)
                horizontalLineToRelative(10.912f)
                arcTo(6.551f, 6.551f, 0.0f, false, false, 24.0f, 17.338f)
                verticalLineToRelative(-0.831f)
                arcToRelative(2.193f, 2.193f, 0.0f, false, false, -4.388f, 0.0f)
                verticalLineToRelative(0.83f)
                curveToRelative(0.0f, 1.19f, -0.967f, 2.157f, -2.156f, 2.157f)
                horizontalLineTo(6.544f)
                arcToRelative(2.16f, 2.16f, 0.0f, false, true, -2.158f, -2.156f)
                verticalLineTo(6.748f)
                curveToRelative(0.0f, -1.19f, 0.969f, -2.16f, 2.158f, -2.16f)
                curveToRelative(3.843f, 0.004f, 7.814f, -0.009f, 11.612f, 0.001f)
                curveToRelative(0.556f, 0.138f, 0.892f, 0.445f, 1.058f, 0.848f)
                curveToRelative(0.193f, 0.47f, 0.343f, 1.118f, -0.404f, 1.748f)
                lineToRelative(-6.26f, 4.596f)
                lineToRelative(-1.892f, -2.441f)
                arcToRelative(2.191f, 2.191f, 0.0f, false, false, -3.075f, -0.391f)
                arcToRelative(2.191f, 2.191f, 0.0f, false, false, -0.391f, 3.076f)
                lineToRelative(3.198f, 4.133f)
                arcToRelative(2.197f, 2.197f, 0.0f, false, false, 3.035f, 0.424f)
                lineToRelative(7.252f, -5.301f)
                arcToRelative(56.68f, 56.68f, 0.0f, false, false, 1.22f, -0.977f)
                curveToRelative(2.106f, -1.926f, 2.517f, -4.393f, 1.627f, -6.553f)
                curveTo(22.603f, 1.51f, 20.268f, 0.12f, 17.435f, 0.12f)
                close()
            }
        }
        .build()
        return _checkmarx!!
    }

private var _checkmarx: ImageVector? = null
