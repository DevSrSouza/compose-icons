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

public val SimpleIcons.Stadia: ImageVector
    get() {
        if (_stadia != null) {
            return _stadia!!
        }
        _stadia = Builder(name = "Stadia", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.525f, 10.03f)
                arcToRelative(18.279f, 18.279f, 0.0f, false, true, 15.781f, 0.263f)
                curveToRelative(0.263f, 0.197f, 0.658f, 0.0f, 0.723f, -0.263f)
                lineToRelative(0.92f, -2.827f)
                curveToRelative(0.132f, -0.263f, 0.0f, -0.658f, -0.329f, -0.789f)
                arcTo(22.356f, 22.356f, 0.0f, false, false, 0.279f, 8.649f)
                arcToRelative(0.658f, 0.658f, 0.0f, false, false, -0.197f, 0.855f)
                lineToRelative(2.17f, 4.8f)
                curveToRelative(0.132f, 0.329f, 0.526f, 0.526f, 0.855f, 0.394f)
                curveToRelative(2.433f, -0.92f, 6.181f, -1.841f, 9.994f, -1.315f)
                curveToRelative(-2.63f, 0.46f, -4.668f, 1.381f, -6.312f, 2.367f)
                arcToRelative(0.658f, 0.658f, 0.0f, false, false, -0.197f, 0.855f)
                lineTo(7.906f, 19.63f)
                curveToRelative(0.132f, 0.263f, 0.46f, 0.329f, 0.658f, 0.132f)
                curveToRelative(0.526f, -0.526f, 1.052f, -0.92f, 1.512f, -1.184f)
                curveToRelative(2.104f, -1.184f, 4.997f, -2.104f, 8.877f, -1.907f)
                arcToRelative(0.658f, 0.658f, 0.0f, false, false, 0.658f, -0.46f)
                lineToRelative(0.986f, -2.959f)
                curveToRelative(0.132f, -0.263f, 0.0f, -0.658f, -0.263f, -0.789f)
                arcToRelative(20.054f, 20.054f, 0.0f, false, false, -13.874f, -2.433f)
                close()
            }
        }
        .build()
        return _stadia!!
    }

private var _stadia: ImageVector? = null
