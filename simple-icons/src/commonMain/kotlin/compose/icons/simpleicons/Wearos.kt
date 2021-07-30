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

public val SimpleIcons.Wearos: ImageVector
    get() {
        if (_wearos != null) {
            return _wearos!!
        }
        _wearos = Builder(name = "Wearos", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.416f, 21.1346f)
                curveToRelative(-0.9687f, 0.0f, -1.8938f, -0.56f, -2.3135f, -1.5015f)
                lineTo(0.2193f, 6.4198f)
                curveTo(-0.3488f, 5.1432f, 0.2248f, 3.6472f, 1.5014f, 3.079f)
                curveToRelative(1.2767f, -0.5681f, 2.7727f, 0.0055f, 3.3408f, 1.2821f)
                lineToRelative(5.8832f, 13.2133f)
                curveToRelative(0.5681f, 1.2767f, -0.0055f, 2.7727f, -1.2821f, 3.3408f)
                arcToRelative(2.5254f, 2.5254f, 0.0f, false, true, -1.0273f, 0.2194f)
                close()
                moveTo(15.6112f, 21.1714f)
                curveToRelative(-0.891f, 0.0f, -1.7412f, -0.515f, -2.1268f, -1.3816f)
                lineTo(7.39f, 6.1024f)
                curveTo(6.867f, 4.9279f, 7.3955f, 3.5532f, 8.5686f, 3.03f)
                curveToRelative(1.173f, -0.5218f, 2.5492f, 0.0054f, 3.0724f, 1.1785f)
                lineToRelative(6.0943f, 13.6888f)
                curveToRelative(0.5232f, 1.1745f, -0.0054f, 2.5492f, -1.1785f, 3.0724f)
                arcToRelative(2.3111f, 2.3111f, 0.0f, false, true, -0.9456f, 0.2017f)
                close()
                moveTo(24.0f, 5.195f)
                arcToRelative(2.3271f, 2.3271f, 0.0f, false, true, -2.3271f, 2.327f)
                arcToRelative(2.3271f, 2.3271f, 0.0f, false, true, -2.3271f, -2.327f)
                arcToRelative(2.3271f, 2.3271f, 0.0f, false, true, 2.327f, -2.3271f)
                arcTo(2.3271f, 2.3271f, 0.0f, false, true, 24.0f, 5.1949f)
                close()
                moveTo(21.3881f, 10.311f)
                arcToRelative(2.4892f, 2.4892f, 0.0f, false, true, -2.4892f, 2.4893f)
                arcToRelative(2.4892f, 2.4892f, 0.0f, false, true, -2.4893f, -2.4892f)
                arcToRelative(2.4892f, 2.4892f, 0.0f, false, true, 2.4893f, -2.4893f)
                arcToRelative(2.4892f, 2.4892f, 0.0f, false, true, 2.4892f, 2.4893f)
                close()
            }
        }
        .build()
        return _wearos!!
    }

private var _wearos: ImageVector? = null
