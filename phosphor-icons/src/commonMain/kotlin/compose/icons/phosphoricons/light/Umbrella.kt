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

public val LightGroup.Umbrella: ImageVector
    get() {
        if (_umbrella != null) {
            return _umbrella!!
        }
        _umbrella = Builder(name = "Umbrella", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(237.6f, 126.8f)
                arcToRelative(110.0f, 110.0f, 0.0f, false, false, -219.2f, 0.0f)
                arcTo(14.4f, 14.4f, 0.0f, false, false, 22.0f, 137.5f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 32.3f, 142.0f)
                lineTo(122.0f, 142.0f)
                verticalLineToRelative(58.0f)
                arcToRelative(30.0f, 30.0f, 0.0f, false, false, 60.0f, 0.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -12.0f, 0.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, false, true, -36.0f, 0.0f)
                lineTo(134.0f, 142.0f)
                horizontalLineToRelative(89.7f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 10.3f, -4.5f)
                arcTo(14.4f, 14.4f, 0.0f, false, false, 237.6f, 126.8f)
                close()
                moveTo(94.1f, 130.0f)
                curveToRelative(1.7f, -51.2f, 24.7f, -80.2f, 33.9f, -89.7f)
                curveToRelative(9.2f, 9.6f, 32.2f, 38.5f, 33.9f, 89.7f)
                close()
                moveTo(30.9f, 129.4f)
                arcToRelative(2.2f, 2.2f, 0.0f, false, true, -0.6f, -1.6f)
                arcToRelative(98.0f, 98.0f, 0.0f, false, true, 82.6f, -88.6f)
                curveToRelative(-12.0f, 14.9f, -29.4f, 44.4f, -30.8f, 90.8f)
                lineTo(32.3f, 130.0f)
                arcTo(1.7f, 1.7f, 0.0f, false, true, 30.9f, 129.4f)
                close()
                moveTo(225.1f, 129.4f)
                arcToRelative(1.7f, 1.7f, 0.0f, false, true, -1.4f, 0.6f)
                lineTo(173.9f, 130.0f)
                curveToRelative(-1.4f, -46.4f, -18.8f, -75.9f, -30.8f, -90.8f)
                arcToRelative(98.0f, 98.0f, 0.0f, false, true, 82.6f, 88.6f)
                arcTo(2.2f, 2.2f, 0.0f, false, true, 225.1f, 129.4f)
                close()
            }
        }
        .build()
        return _umbrella!!
    }

private var _umbrella: ImageVector? = null
