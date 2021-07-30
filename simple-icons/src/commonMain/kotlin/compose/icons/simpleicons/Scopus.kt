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

public val SimpleIcons.Scopus: ImageVector
    get() {
        if (_scopus != null) {
            return _scopus!!
        }
        _scopus = Builder(name = "Scopus", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 19.059f)
                lineToRelative(-0.14f, -1.777f)
                curveToRelative(-1.426f, 0.772f, -2.945f, 1.076f, -4.465f, 1.076f)
                curveToRelative(-3.319f, 0.0f, -5.96f, -2.782f, -5.96f, -6.475f)
                curveToRelative(0.0f, -3.903f, 2.595f, -6.31f, 5.633f, -6.31f)
                curveToRelative(1.917f, 0.0f, 3.39f, 0.303f, 4.792f, 1.075f)
                lineTo(24.0f, 4.895f)
                curveToRelative(-1.286f, -0.608f, -2.337f, -0.889f, -4.698f, -0.889f)
                curveToRelative(-4.534f, 0.0f, -7.97f, 3.53f, -7.97f, 8.017f)
                curveToRelative(0.0f, 5.12f, 4.09f, 7.924f, 7.9f, 7.924f)
                curveToRelative(1.916f, 0.0f, 3.506f, -0.257f, 4.768f, -0.888f)
                close()
                moveTo(9.046f, 15.599f)
                curveToRelative(0.0f, -2.22f, -1.964f, -3.225f, -3.857f, -4.347f)
                curveTo(3.716f, 10.364f, 2.15f, 9.756f, 2.15f, 8.12f)
                curveToRelative(0.0f, -1.215f, 0.889f, -2.548f, 2.642f, -2.548f)
                curveToRelative(1.519f, 0.0f, 2.57f, 0.234f, 3.903f, 1.029f)
                lineToRelative(0.117f, -1.847f)
                curveToRelative(-1.239f, -0.514f, -2.127f, -0.748f, -4.137f, -0.748f)
                curveTo(1.8f, 4.006f, 0.047f, 5.876f, 0.047f, 8.26f)
                curveToRelative(0.0f, 2.384f, 2.103f, 3.413f, 4.02f, 4.581f)
                curveToRelative(1.426f, 0.865f, 2.922f, 1.45f, 2.922f, 2.992f)
                curveToRelative(0.0f, 1.496f, -1.333f, 2.571f, -2.922f, 2.571f)
                curveToRelative(-1.566f, 0.0f, -2.594f, -0.35f, -3.786f, -1.075f)
                lineTo(0.0f, 19.176f)
                curveToRelative(1.215f, 0.56f, 2.454f, 0.818f, 4.16f, 0.818f)
                curveToRelative(2.385f, 0.0f, 4.885f, -1.473f, 4.885f, -4.395f)
                close()
            }
        }
        .build()
        return _scopus!!
    }

private var _scopus: ImageVector? = null
