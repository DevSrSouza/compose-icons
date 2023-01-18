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

public val ThinGroup.CookingPot: ImageVector
    get() {
        if (_cookingPot != null) {
            return _cookingPot!!
        }
        _cookingPot = Builder(name = "CookingPot", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(92.0f, 48.0f)
                lineTo(92.0f, 16.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f)
                lineTo(100.0f, 48.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                close()
                moveTo(128.0f, 52.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                lineTo(132.0f, 16.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -8.0f, 0.0f)
                lineTo(124.0f, 48.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 128.0f, 52.0f)
                close()
                moveTo(160.0f, 52.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                lineTo(164.0f, 16.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -8.0f, 0.0f)
                lineTo(156.0f, 48.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 160.0f, 52.0f)
                close()
                moveTo(250.4f, 99.2f)
                lineTo(220.0f, 122.0f)
                verticalLineToRelative(62.0f)
                arcToRelative(28.1f, 28.1f, 0.0f, false, true, -28.0f, 28.0f)
                lineTo(64.0f, 212.0f)
                arcToRelative(28.1f, 28.1f, 0.0f, false, true, -28.0f, -28.0f)
                lineTo(36.0f, 122.0f)
                lineTo(5.6f, 99.2f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.8f, -6.4f)
                lineTo(36.0f, 112.0f)
                lineTo(36.0f, 88.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 48.0f, 76.0f)
                lineTo(208.0f, 76.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 12.0f, 12.0f)
                verticalLineToRelative(24.0f)
                lineToRelative(25.6f, -19.2f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 4.8f, 6.4f)
                close()
                moveTo(212.0f, 88.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, -4.0f)
                lineTo(48.0f, 84.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                verticalLineToRelative(96.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, 20.0f, 20.0f)
                lineTo(192.0f, 204.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, 20.0f, -20.0f)
                close()
            }
        }
        .build()
        return _cookingPot!!
    }

private var _cookingPot: ImageVector? = null
