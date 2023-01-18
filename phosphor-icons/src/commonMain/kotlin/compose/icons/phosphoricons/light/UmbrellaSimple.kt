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

public val LightGroup.UmbrellaSimple: ImageVector
    get() {
        if (_umbrellaSimple != null) {
            return _umbrellaSimple!!
        }
        _umbrellaSimple = Builder(name = "UmbrellaSimple", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
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
                moveTo(225.1f, 129.4f)
                arcToRelative(1.7f, 1.7f, 0.0f, false, true, -1.4f, 0.6f)
                lineTo(32.3f, 130.0f)
                arcToRelative(1.7f, 1.7f, 0.0f, false, true, -1.4f, -0.6f)
                arcToRelative(2.2f, 2.2f, 0.0f, false, true, -0.6f, -1.6f)
                arcToRelative(98.0f, 98.0f, 0.0f, false, true, 195.4f, 0.0f)
                arcTo(2.2f, 2.2f, 0.0f, false, true, 225.1f, 129.4f)
                close()
            }
        }
        .build()
        return _umbrellaSimple!!
    }

private var _umbrellaSimple: ImageVector? = null
