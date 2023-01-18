package compose.icons.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.LightGroup

public val LightGroup.Waves: ImageVector
    get() {
        if (_waves != null) {
            return _waves!!
        }
        _waves = Builder(name = "Waves", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(35.3f, 75.7f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 1.0f, -8.4f)
                arcTo(79.0f, 79.0f, 0.0f, false, true, 64.5f, 54.2f)
                curveToRelative(15.8f, -4.0f, 40.2f, -4.9f, 66.8f, 12.8f)
                curveToRelative(43.6f, 29.1f, 79.5f, 1.5f, 81.0f, 0.3f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 7.4f, 9.4f)
                arcToRelative(79.0f, 79.0f, 0.0f, false, true, -28.2f, 13.1f)
                arcToRelative(78.2f, 78.2f, 0.0f, false, true, -19.3f, 2.4f)
                curveToRelative(-13.7f, 0.0f, -30.1f, -3.6f, -47.5f, -15.2f)
                curveToRelative(-43.6f, -29.1f, -79.5f, -1.5f, -81.0f, -0.3f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 35.3f, 75.7f)
                close()
                moveTo(212.3f, 123.3f)
                curveToRelative(-1.5f, 1.2f, -37.4f, 28.8f, -81.0f, -0.3f)
                curveToRelative(-26.6f, -17.7f, -51.0f, -16.8f, -66.8f, -12.8f)
                arcToRelative(79.0f, 79.0f, 0.0f, false, false, -28.2f, 13.1f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 7.4f, 9.4f)
                curveToRelative(1.5f, -1.2f, 37.4f, -28.8f, 81.0f, 0.3f)
                curveToRelative(17.4f, 11.6f, 33.8f, 15.2f, 47.5f, 15.2f)
                arcToRelative(78.2f, 78.2f, 0.0f, false, false, 19.3f, -2.4f)
                arcToRelative(79.0f, 79.0f, 0.0f, false, false, 28.2f, -13.1f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -7.4f, -9.4f)
                close()
                moveTo(212.3f, 179.3f)
                curveToRelative(-1.5f, 1.2f, -37.4f, 28.8f, -81.0f, -0.3f)
                curveToRelative(-26.6f, -17.7f, -51.0f, -16.8f, -66.8f, -12.8f)
                arcToRelative(79.0f, 79.0f, 0.0f, false, false, -28.2f, 13.1f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 7.4f, 9.4f)
                curveToRelative(1.5f, -1.2f, 37.4f, -28.8f, 81.0f, 0.3f)
                curveToRelative(17.4f, 11.6f, 33.8f, 15.2f, 47.5f, 15.2f)
                arcToRelative(81.6f, 81.6f, 0.0f, false, false, 47.5f, -15.5f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -7.4f, -9.4f)
                close()
            }
        }
        .build()
        return _waves!!
    }

private var _waves: ImageVector? = null
