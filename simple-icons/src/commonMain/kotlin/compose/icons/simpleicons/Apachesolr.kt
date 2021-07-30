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

public val SimpleIcons.Apachesolr: ImageVector
    get() {
        if (_apachesolr != null) {
            return _apachesolr!!
        }
        _apachesolr = Builder(name = "Apachesolr", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.741f, 3.8f)
                lineTo(8.926f, 16.573f)
                lineToRelative(14.849f, -6.851f)
                arcTo(11.979f, 11.979f, 0.0f, false, false, 20.741f, 3.8f)
                moveTo(11.975f, 0.0f)
                curveToRelative(-1.637f, 0.0f, -3.197f, 0.328f, -4.619f, 0.921f)
                lineToRelative(-1.585f, 13.36f)
                lineTo(13.693f, 0.124f)
                arcTo(12.168f, 12.168f, 0.0f, false, false, 11.975f, 0.0f)
                moveToRelative(11.918f, 10.459f)
                lineToRelative(-14.07f, 7.874f)
                lineToRelative(13.201f, -1.566f)
                arcToRelative(11.976f, 11.976f, 0.0f, false, false, 0.869f, -6.308f)
                moveToRelative(-5.188f, 11.527f)
                arcToRelative(12.084f, 12.084f, 0.0f, false, false, 3.8f, -4.16f)
                lineToRelative(-12.374f, 2.457f)
                lineToRelative(8.574f, 1.703f)
                close()
                moveTo(14.417f, 0.249f)
                lineTo(7.53f, 15.177f)
                lineTo(20.306f, 3.36f)
                arcTo(11.978f, 11.978f, 0.0f, false, false, 14.417f, 0.249f)
                moveTo(12.98f, 24.0f)
                arcToRelative(11.938f, 11.938f, 0.0f, false, false, 3.774f, -0.945f)
                lineToRelative(-6.931f, -0.822f)
                lineTo(12.98f, 24.0f)
                close()
                moveTo(1.016f, 7.08f)
                arcToRelative(11.944f, 11.944f, 0.0f, false, false, -1.013f, 3.864f)
                lineToRelative(1.867f, 3.337f)
                lineToRelative(-0.854f, -7.201f)
                close()
                moveTo(6.314f, 1.415f)
                arcToRelative(12.076f, 12.076f, 0.0f, false, false, -4.236f, 3.784f)
                lineToRelative(1.743f, 8.773f)
                lineTo(6.314f, 1.415f)
                close()
            }
        }
        .build()
        return _apachesolr!!
    }

private var _apachesolr: ImageVector? = null
