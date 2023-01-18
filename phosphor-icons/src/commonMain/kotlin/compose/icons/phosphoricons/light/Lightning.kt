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

public val LightGroup.Lightning: ImageVector
    get() {
        if (_lightning != null) {
            return _lightning!!
        }
        _lightning = Builder(name = "Lightning", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(96.0f, 246.0f)
                arcToRelative(5.2f, 5.2f, 0.0f, false, true, -2.7f, -0.7f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -3.2f, -6.5f)
                lineToRelative(15.0f, -75.0f)
                lineTo(45.9f, 141.6f)
                arcToRelative(5.8f, 5.8f, 0.0f, false, true, -3.7f, -4.3f)
                arcToRelative(5.6f, 5.6f, 0.0f, false, true, 1.4f, -5.4f)
                lineToRelative(112.0f, -120.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 7.1f, -1.3f)
                arcToRelative(6.2f, 6.2f, 0.0f, false, true, 3.2f, 6.6f)
                lineToRelative(-15.0f, 74.9f)
                lineToRelative(59.2f, 22.3f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 2.3f, 9.7f)
                lineToRelative(-112.0f, 120.0f)
                arcTo(6.3f, 6.3f, 0.0f, false, true, 96.0f, 246.0f)
                close()
                moveTo(58.5f, 133.5f)
                lineToRelative(55.6f, 20.9f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, true, 3.8f, 6.8f)
                lineTo(106.0f, 220.4f)
                lineToRelative(91.5f, -98.0f)
                lineToRelative(-55.6f, -20.8f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, true, -3.8f, -6.8f)
                lineTo(150.0f, 35.5f)
                close()
            }
        }
        .build()
        return _lightning!!
    }

private var _lightning: ImageVector? = null
