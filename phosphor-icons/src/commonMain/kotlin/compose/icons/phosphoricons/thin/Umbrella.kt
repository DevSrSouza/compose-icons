package compose.icons.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.ThinGroup

public val ThinGroup.Umbrella: ImageVector
    get() {
        if (_umbrella != null) {
            return _umbrella!!
        }
        _umbrella = Builder(name = "Umbrella", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(235.6f, 127.0f)
                arcTo(108.0f, 108.0f, 0.0f, false, false, 128.0f, 28.0f)
                horizontalLineToRelative(0.0f)
                arcTo(108.0f, 108.0f, 0.0f, false, false, 20.4f, 127.0f)
                arcToRelative(11.7f, 11.7f, 0.0f, false, false, 3.1f, 9.1f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 8.8f, 3.9f)
                lineTo(124.0f, 140.0f)
                verticalLineToRelative(60.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, 56.0f, 0.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -8.0f, 0.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, -40.0f, 0.0f)
                lineTo(132.0f, 140.0f)
                horizontalLineToRelative(91.7f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 8.8f, -3.9f)
                arcTo(11.7f, 11.7f, 0.0f, false, false, 235.6f, 127.0f)
                close()
                moveTo(92.1f, 132.0f)
                curveToRelative(1.2f, -56.0f, 27.6f, -86.4f, 35.9f, -94.6f)
                curveToRelative(8.3f, 8.2f, 34.7f, 38.6f, 35.9f, 94.6f)
                close()
                moveTo(29.4f, 130.7f)
                arcToRelative(4.2f, 4.2f, 0.0f, false, true, -1.1f, -3.1f)
                arcToRelative(100.2f, 100.2f, 0.0f, false, true, 89.4f, -91.1f)
                curveTo(106.0f, 49.8f, 85.1f, 80.5f, 84.0f, 132.0f)
                lineTo(32.3f, 132.0f)
                arcTo(4.1f, 4.1f, 0.0f, false, true, 29.4f, 130.7f)
                close()
                moveTo(226.6f, 130.7f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, true, -2.9f, 1.3f)
                lineTo(172.0f, 132.0f)
                curveToRelative(-1.1f, -51.5f, -22.0f, -82.2f, -33.7f, -95.5f)
                arcToRelative(100.2f, 100.2f, 0.0f, false, true, 89.4f, 91.1f)
                arcTo(4.2f, 4.2f, 0.0f, false, true, 226.6f, 130.7f)
                close()
            }
        }
        .build()
        return _umbrella!!
    }

private var _umbrella: ImageVector? = null
