package compose.icons.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.BoldGroup

public val BoldGroup.Sparkle: ImageVector
    get() {
        if (_sparkle != null) {
            return _sparkle!!
        }
        _sparkle = Builder(name = "Sparkle", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(199.8f, 125.2f)
                lineToRelative(-50.5f, -18.5f)
                lineTo(130.8f, 56.2f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -37.6f, 0.0f)
                lineTo(74.7f, 106.7f)
                lineTo(24.2f, 125.2f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 0.0f, 37.6f)
                lineToRelative(50.5f, 18.5f)
                lineToRelative(18.5f, 50.5f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 37.6f, 0.0f)
                lineToRelative(18.5f, -50.5f)
                lineToRelative(50.5f, -18.5f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 0.0f, -37.6f)
                close()
                moveTo(139.3f, 159.5f)
                arcToRelative(19.7f, 19.7f, 0.0f, false, false, -11.8f, 11.8f)
                horizontalLineToRelative(0.0f)
                lineToRelative(-15.5f, 42.0f)
                lineToRelative(-15.5f, -42.0f)
                arcToRelative(19.7f, 19.7f, 0.0f, false, false, -11.8f, -11.8f)
                lineTo(42.7f, 144.0f)
                lineToRelative(42.0f, -15.5f)
                arcToRelative(19.7f, 19.7f, 0.0f, false, false, 11.8f, -11.8f)
                lineToRelative(15.5f, -42.0f)
                lineToRelative(15.5f, 42.0f)
                arcToRelative(19.7f, 19.7f, 0.0f, false, false, 11.8f, 11.8f)
                lineToRelative(42.0f, 15.5f)
                close()
                moveTo(140.0f, 40.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 12.0f, -12.0f)
                horizontalLineToRelative(12.0f)
                lineTo(164.0f, 16.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                lineTo(188.0f, 28.0f)
                horizontalLineToRelative(12.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 24.0f)
                lineTo(188.0f, 52.0f)
                lineTo(188.0f, 64.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                lineTo(164.0f, 52.0f)
                lineTo(152.0f, 52.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 140.0f, 40.0f)
                close()
                moveTo(252.0f, 88.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(4.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(-4.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                horizontalLineToRelative(4.0f)
                lineTo(212.0f, 72.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(4.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 252.0f, 88.0f)
                close()
            }
        }
        .build()
        return _sparkle!!
    }

private var _sparkle: ImageVector? = null
