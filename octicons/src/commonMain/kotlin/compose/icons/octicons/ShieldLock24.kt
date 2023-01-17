package compose.icons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.Octicons

public val Octicons.ShieldLock24: ImageVector
    get() {
        if (_shieldLock24 != null) {
            return _shieldLock24!!
        }
        _shieldLock24 = Builder(name = "ShieldLock24", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.46f, 1.137f)
                arcToRelative(1.748f, 1.748f, 0.0f, false, true, 1.08f, 0.0f)
                lineToRelative(8.25f, 2.675f)
                arcTo(1.75f, 1.75f, 0.0f, false, true, 22.0f, 5.476f)
                lineTo(22.0f, 10.5f)
                curveToRelative(0.0f, 6.19f, -3.77f, 10.705f, -9.401f, 12.83f)
                arcToRelative(1.704f, 1.704f, 0.0f, false, true, -1.198f, 0.0f)
                curveTo(5.771f, 21.204f, 2.0f, 16.69f, 2.0f, 10.5f)
                lineTo(2.0f, 5.476f)
                curveToRelative(0.0f, -0.76f, 0.49f, -1.43f, 1.21f, -1.664f)
                close()
                moveTo(12.077f, 2.563f)
                arcToRelative(0.253f, 0.253f, 0.0f, false, false, -0.154f, 0.0f)
                lineTo(3.673f, 5.24f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.173f, 0.237f)
                lineTo(3.5f, 10.5f)
                curveToRelative(0.0f, 5.461f, 3.28f, 9.483f, 8.43f, 11.426f)
                arcToRelative(0.199f, 0.199f, 0.0f, false, false, 0.14f, 0.0f)
                curveToRelative(5.15f, -1.943f, 8.43f, -5.965f, 8.43f, -11.426f)
                lineTo(20.5f, 5.476f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.173f, -0.237f)
                close()
                moveTo(13.0f, 12.232f)
                lineTo(13.0f, 15.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -2.0f, 0.0f)
                verticalLineToRelative(-2.768f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 2.0f, 0.0f)
                close()
            }
        }
        .build()
        return _shieldLock24!!
    }

private var _shieldLock24: ImageVector? = null
