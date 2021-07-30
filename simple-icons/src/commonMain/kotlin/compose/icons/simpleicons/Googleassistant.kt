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

public val SimpleIcons.Googleassistant: ImageVector
    get() {
        if (_googleassistant != null) {
            return _googleassistant!!
        }
        _googleassistant = Builder(name = "Googleassistant", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.365f, 8.729f)
                curveToRelative(0.9f, 0.0f, 1.635f, -0.735f, 1.635f, -1.635f)
                reflectiveCurveToRelative(-0.735f, -1.636f, -1.635f, -1.636f)
                reflectiveCurveToRelative(-1.636f, 0.735f, -1.636f, 1.636f)
                reflectiveCurveToRelative(0.723f, 1.635f, 1.636f, 1.635f)
                moveToRelative(-4.907f, 5.452f)
                arcToRelative(3.27f, 3.27f, 0.0f, true, false, 0.0f, -6.542f)
                arcToRelative(3.27f, 3.27f, 0.0f, false, false, 0.0f, 6.542f)
                moveToRelative(0.0f, 8.722f)
                curveToRelative(2.105f, 0.0f, 3.816f, -1.711f, 3.816f, -3.829f)
                reflectiveCurveToRelative(-1.711f, -3.816f, -3.829f, -3.816f)
                arcToRelative(3.82f, 3.82f, 0.0f, false, false, -3.816f, 3.816f)
                arcToRelative(3.825f, 3.825f, 0.0f, false, false, 3.829f, 3.83f)
                moveTo(6.542f, 14.18f)
                arcToRelative(6.542f, 6.542f, 0.0f, true, false, 0.0f, -13.084f)
                arcToRelative(6.542f, 6.542f, 0.0f, true, false, 0.0f, 13.084f)
            }
        }
        .build()
        return _googleassistant!!
    }

private var _googleassistant: ImageVector? = null
