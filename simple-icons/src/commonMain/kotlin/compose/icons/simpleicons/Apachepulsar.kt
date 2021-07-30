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

public val SimpleIcons.Apachepulsar: ImageVector
    get() {
        if (_apachepulsar != null) {
            return _apachepulsar!!
        }
        _apachepulsar = Builder(name = "Apachepulsar", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 8.925f)
                horizontalLineToRelative(-5.866f)
                curveToRelative(-1.586f, -3.041f, -3.262f, -5.402f, -5.544f, -5.402f)
                curveToRelative(-2.97f, 0.0f, -4.367f, 2.593f, -5.717f, 5.115f)
                lineToRelative(-0.118f, 0.22f)
                horizontalLineTo(0.0f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(3.934f)
                curveToRelative(1.39f, 0.0f, 1.673f, 0.468f, 1.673f, 0.468f)
                curveToRelative(-1.09f, 1.691f, -2.4f, 3.363f, -4.584f, 3.363f)
                horizontalLineTo(0.0f)
                verticalLineToRelative(1.574f)
                horizontalLineToRelative(1.03f)
                curveToRelative(4.234f, 0.0f, 6.083f, -3.434f, 7.567f, -6.193f)
                curveToRelative(1.361f, -2.541f, 2.31f, -4.08f, 3.993f, -4.08f)
                curveToRelative(1.747f, 0.0f, 3.584f, 3.801f, 5.201f, 7.157f)
                curveToRelative(0.237f, 0.488f, 0.477f, 0.988f, 0.72f, 1.483f)
                curveToRelative(-6.2f, 0.197f, -9.155f, 1.649f, -11.559f, 2.833f)
                curveToRelative(-1.759f, 0.866f, -3.147f, 1.94f, -5.433f, 1.94f)
                horizontalLineTo(0.0f)
                verticalLineToRelative(1.574f)
                horizontalLineToRelative(1.507f)
                curveToRelative(2.754f, 0.0f, 4.47f, -0.85f, 6.295f, -1.751f)
                curveToRelative(2.53f, -1.243f, 5.398f, -2.652f, 12.157f, -2.652f)
                horizontalLineToRelative(3.907f)
                verticalLineTo(14.5f)
                horizontalLineTo(21.66f)
                arcToRelative(1.18f, 1.18f, 0.0f, false, true, -0.972f, -0.393f)
                arcToRelative(70.83f, 70.83f, 0.0f, false, true, -1.133f, -2.321f)
                lineToRelative(-0.511f, -1.047f)
                reflectiveCurveToRelative(0.366f, -0.393f, 1.38f, -0.393f)
                horizontalLineTo(24.0f)
                close()
            }
        }
        .build()
        return _apachepulsar!!
    }

private var _apachepulsar: ImageVector? = null
