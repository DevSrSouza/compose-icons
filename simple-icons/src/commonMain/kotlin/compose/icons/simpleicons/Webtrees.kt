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

public val SimpleIcons.Webtrees: ImageVector
    get() {
        if (_webtrees != null) {
            return _webtrees!!
        }
        _webtrees = Builder(name = "Webtrees", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.957f, 4.34f)
                quadToRelative(0.647f, 0.0f, 1.269f, 0.243f)
                quadToRelative(0.634f, 0.243f, 1.093f, 0.7f)
                quadToRelative(0.459f, 0.448f, 0.662f, 1.0f)
                lineToRelative(1.592f, 4.59f)
                lineToRelative(1.31f, -3.82f)
                quadTo(9.84f, 4.26f, 11.92f, 4.26f)
                quadToRelative(0.459f, 0.0f, 1.106f, 0.203f)
                quadToRelative(0.729f, 0.23f, 1.228f, 0.809f)
                quadToRelative(0.5f, 0.58f, 0.905f, 1.782f)
                lineToRelative(1.296f, 3.82f)
                lineToRelative(1.606f, -4.59f)
                quadToRelative(0.189f, -0.54f, 0.649f, -0.998f)
                quadToRelative(0.472f, -0.459f, 1.079f, -0.703f)
                quadToRelative(0.608f, -0.243f, 1.283f, -0.243f)
                quadToRelative(0.62f, 0.04f, 1.241f, 0.338f)
                quadToRelative(0.783f, 0.378f, 1.228f, 1.106f)
                quadToRelative(0.459f, 0.73f, 0.459f, 1.66f)
                quadToRelative(0.0f, 0.81f, -0.364f, 1.54f)
                lineToRelative(-4.225f, 8.652f)
                quadToRelative(-1.025f, 2.106f, -3.037f, 2.106f)
                quadToRelative(-0.905f, -0.04f, -1.634f, -0.567f)
                quadToRelative(-0.728f, -0.54f, -1.133f, -1.498f)
                lineTo(12.0f, 13.72f)
                lineToRelative(-1.606f, 3.955f)
                quadToRelative(-0.243f, 0.634f, -0.647f, 1.093f)
                quadToRelative(-0.406f, 0.447f, -0.945f, 0.702f)
                quadToRelative(-0.54f, 0.257f, -1.134f, 0.27f)
                quadToRelative(-1.013f, 0.0f, -1.755f, -0.486f)
                quadToRelative(-0.742f, -0.5f, -1.297f, -1.62f)
                lineTo(0.392f, 8.983f)
                quadTo(0.0f, 8.16f, 0.0f, 7.443f)
                quadToRelative(0.0f, -0.89f, 0.46f, -1.632f)
                quadToRelative(0.459f, -0.756f, 1.254f, -1.134f)
                quadToRelative(0.622f, -0.297f, 1.243f, -0.337f)
                close()
            }
        }
        .build()
        return _webtrees!!
    }

private var _webtrees: ImageVector? = null
