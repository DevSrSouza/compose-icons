package compose.icons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.Octicons

public val Octicons.Shield24: ImageVector
    get() {
        if (_shield24 != null) {
            return _shield24!!
        }
        _shield24 = Builder(name = "Shield24", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 15.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 2.0f, 0.0f)
                close()
                moveTo(12.75f, 7.25f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.5f, 0.0f)
                verticalLineToRelative(4.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.5f, 0.0f)
                verticalLineToRelative(-4.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.46f, 0.637f)
                arcToRelative(1.748f, 1.748f, 0.0f, false, true, 1.08f, 0.0f)
                lineToRelative(8.25f, 2.675f)
                arcTo(1.75f, 1.75f, 0.0f, false, true, 22.0f, 4.976f)
                lineTo(22.0f, 10.0f)
                curveToRelative(0.0f, 6.19f, -3.77f, 10.705f, -9.401f, 12.83f)
                arcToRelative(1.704f, 1.704f, 0.0f, false, true, -1.198f, 0.0f)
                curveTo(5.771f, 20.704f, 2.0f, 16.19f, 2.0f, 10.0f)
                lineTo(2.0f, 4.976f)
                curveToRelative(0.0f, -0.76f, 0.49f, -1.43f, 1.21f, -1.664f)
                close()
                moveTo(12.077f, 2.063f)
                arcToRelative(0.253f, 0.253f, 0.0f, false, false, -0.154f, 0.0f)
                lineTo(3.673f, 4.74f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.173f, 0.237f)
                lineTo(3.5f, 10.0f)
                curveToRelative(0.0f, 5.461f, 3.28f, 9.483f, 8.43f, 11.426f)
                arcToRelative(0.199f, 0.199f, 0.0f, false, false, 0.14f, 0.0f)
                curveTo(17.22f, 19.483f, 20.5f, 15.46f, 20.5f, 10.0f)
                lineTo(20.5f, 4.976f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.173f, -0.237f)
                close()
            }
        }
        .build()
        return _shield24!!
    }

private var _shield24: ImageVector? = null
