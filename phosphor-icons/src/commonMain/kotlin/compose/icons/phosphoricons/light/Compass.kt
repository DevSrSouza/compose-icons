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

public val LightGroup.Compass: ImageVector
    get() {
        if (_compass != null) {
            return _compass!!
        }
        _compass = Builder(name = "Compass", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.1f, 26.0f)
                arcToRelative(102.0f, 102.0f, 0.0f, true, false, 102.0f, 102.0f)
                arcTo(102.2f, 102.2f, 0.0f, false, false, 128.1f, 26.0f)
                close()
                moveTo(128.1f, 218.0f)
                arcToRelative(90.0f, 90.0f, 0.0f, true, true, 90.0f, -90.0f)
                arcTo(90.1f, 90.1f, 0.0f, false, true, 128.1f, 218.0f)
                close()
                moveTo(170.7f, 77.4f)
                lineToRelative(-62.0f, 28.2f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, false, -3.1f, 3.1f)
                lineTo(80.2f, 168.1f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 1.2f, 6.6f)
                arcToRelative(6.3f, 6.3f, 0.0f, false, false, 4.3f, 1.7f)
                arcToRelative(4.6f, 4.6f, 0.0f, false, false, 2.3f, -0.5f)
                lineToRelative(59.4f, -25.4f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, false, 3.1f, -3.1f)
                lineToRelative(28.1f, -62.1f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -7.9f, -7.9f)
                close()
                moveTo(140.6f, 140.4f)
                lineTo(97.1f, 159.0f)
                lineToRelative(18.6f, -43.5f)
                lineToRelative(45.4f, -20.6f)
                close()
            }
        }
        .build()
        return _compass!!
    }

private var _compass: ImageVector? = null
