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

public val LightGroup.Sparkle: ImageVector
    get() {
        if (_sparkle != null) {
            return _sparkle!!
        }
        _sparkle = Builder(name = "Sparkle", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(197.7f, 130.9f)
                lineToRelative(-52.2f, -19.3f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.1f, -1.1f)
                lineTo(125.1f, 58.3f)
                arcToRelative(13.9f, 13.9f, 0.0f, false, false, -26.2f, 0.0f)
                lineTo(79.6f, 110.5f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.1f, 1.1f)
                lineTo(26.3f, 130.9f)
                arcToRelative(13.9f, 13.9f, 0.0f, false, false, 0.0f, 26.2f)
                lineToRelative(52.2f, 19.3f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.1f, 1.1f)
                lineToRelative(19.3f, 52.2f)
                arcToRelative(13.9f, 13.9f, 0.0f, false, false, 26.2f, 0.0f)
                lineToRelative(19.3f, -52.2f)
                horizontalLineToRelative(0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.1f, -1.1f)
                lineToRelative(52.2f, -19.3f)
                arcToRelative(13.9f, 13.9f, 0.0f, false, false, 0.0f, -26.2f)
                close()
                moveTo(193.6f, 145.9f)
                lineTo(141.4f, 165.1f)
                arcToRelative(13.7f, 13.7f, 0.0f, false, false, -8.3f, 8.3f)
                horizontalLineToRelative(0.0f)
                lineToRelative(-19.2f, 52.2f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -3.8f, 0.0f)
                lineTo(90.9f, 173.4f)
                arcToRelative(13.7f, 13.7f, 0.0f, false, false, -8.3f, -8.3f)
                lineTo(30.4f, 145.9f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.0f, -3.8f)
                lineToRelative(52.2f, -19.2f)
                arcToRelative(13.7f, 13.7f, 0.0f, false, false, 8.3f, -8.3f)
                lineToRelative(19.2f, -52.2f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 3.8f, 0.0f)
                lineToRelative(19.2f, 52.2f)
                arcToRelative(13.7f, 13.7f, 0.0f, false, false, 8.3f, 8.3f)
                lineToRelative(52.2f, 19.2f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.0f, 3.8f)
                close()
                moveTo(146.0f, 40.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 6.0f, -6.0f)
                horizontalLineToRelative(18.0f)
                lineTo(170.0f, 16.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f)
                lineTo(182.0f, 34.0f)
                horizontalLineToRelative(18.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 12.0f)
                lineTo(182.0f, 46.0f)
                lineTo(182.0f, 64.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                lineTo(170.0f, 46.0f)
                lineTo(152.0f, 46.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 146.0f, 40.0f)
                close()
                moveTo(246.0f, 88.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f)
                lineTo(230.0f, 94.0f)
                verticalLineToRelative(10.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                lineTo(218.0f, 94.0f)
                lineTo(208.0f, 94.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                horizontalLineToRelative(10.0f)
                lineTo(218.0f, 72.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f)
                lineTo(230.0f, 82.0f)
                horizontalLineToRelative(10.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 246.0f, 88.0f)
                close()
            }
        }
        .build()
        return _sparkle!!
    }

private var _sparkle: ImageVector? = null
