package compose.icons.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.RegularGroup

public val RegularGroup.CookingPot: ImageVector
    get() {
        if (_cookingPot != null) {
            return _cookingPot!!
        }
        _cookingPot = Builder(name = "CookingPot", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(88.0f, 48.0f)
                lineTo(88.0f, 16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                lineTo(104.0f, 48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                close()
                moveTo(128.0f, 56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.0f)
                lineTo(136.0f, 16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f)
                lineTo(120.0f, 48.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 128.0f, 56.0f)
                close()
                moveTo(160.0f, 56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.0f)
                lineTo(168.0f, 16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f)
                lineTo(152.0f, 48.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 160.0f, 56.0f)
                close()
                moveTo(252.8f, 102.4f)
                lineTo(224.0f, 124.0f)
                verticalLineToRelative(60.0f)
                arcToRelative(32.1f, 32.1f, 0.0f, false, true, -32.0f, 32.0f)
                lineTo(64.0f, 216.0f)
                arcToRelative(32.1f, 32.1f, 0.0f, false, true, -32.0f, -32.0f)
                lineTo(32.0f, 124.0f)
                lineTo(3.2f, 102.4f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 9.6f, -12.8f)
                lineTo(32.0f, 104.0f)
                lineTo(32.0f, 88.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 48.0f, 72.0f)
                lineTo(208.0f, 72.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 16.0f, 16.0f)
                verticalLineToRelative(16.0f)
                lineToRelative(19.2f, -14.4f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 9.6f, 12.8f)
                close()
                moveTo(208.0f, 88.0f)
                lineTo(48.0f, 88.0f)
                verticalLineToRelative(96.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                lineTo(192.0f, 200.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                close()
            }
        }
        .build()
        return _cookingPot!!
    }

private var _cookingPot: ImageVector? = null
