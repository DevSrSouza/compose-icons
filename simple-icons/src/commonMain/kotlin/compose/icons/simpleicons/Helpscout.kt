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

public val SimpleIcons.Helpscout: ImageVector
    get() {
        if (_helpscout != null) {
            return _helpscout!!
        }
        _helpscout = Builder(name = "Helpscout", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(3.497f, 14.044f)
                lineToRelative(7.022f, -7.021f)
                arcToRelative(4.946f, 4.946f, 0.0f, false, false, 1.474f, -3.526f)
                arcTo(4.99f, 4.99f, 0.0f, false, false, 10.563f, 0.0f)
                lineTo(3.54f, 7.024f)
                arcToRelative(4.945f, 4.945f, 0.0f, false, false, -1.473f, 3.525f)
                curveToRelative(0.0f, 1.373f, 0.55f, 2.6f, 1.43f, 3.496f)
                close()
                moveTo(20.504f, 9.941f)
                lineTo(13.481f, 16.963f)
                arcToRelative(4.946f, 4.946f, 0.0f, false, false, -1.473f, 3.525f)
                curveToRelative(0.0f, 1.36f, 0.55f, 2.601f, 1.43f, 3.497f)
                lineToRelative(7.022f, -7.022f)
                arcToRelative(4.943f, 4.943f, 0.0f, false, false, 1.474f, -3.526f)
                curveToRelative(0.0f, -1.373f, -0.55f, -2.6f, -1.43f, -3.496f)
                close()
                moveTo(20.46f, 7.037f)
                arcToRelative(4.944f, 4.944f, 0.0f, false, false, 1.474f, -3.525f)
                curveToRelative(0.0f, -1.36f, -0.55f, -2.6f, -1.43f, -3.497f)
                lineTo(3.54f, 16.965f)
                arcTo(4.986f, 4.986f, 0.0f, false, false, 3.497f, 24.0f)
                close()
            }
        }
        .build()
        return _helpscout!!
    }

private var _helpscout: ImageVector? = null
