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

public val ThinGroup.MicrosoftWordLogo: ImageVector
    get() {
        if (_microsoftWordLogo != null) {
            return _microsoftWordLogo!!
        }
        _microsoftWordLogo = Builder(name = "MicrosoftWordLogo", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(200.0f, 28.0f)
                lineTo(72.0f, 28.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 60.0f, 40.0f)
                lineTo(60.0f, 68.0f)
                lineTo(40.0f, 68.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 28.0f, 80.0f)
                verticalLineToRelative(96.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                lineTo(60.0f, 188.0f)
                verticalLineToRelative(28.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                lineTo(200.0f, 228.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(212.0f, 40.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 200.0f, 28.0f)
                close()
                moveTo(156.0f, 100.0f)
                horizontalLineToRelative(48.0f)
                verticalLineToRelative(56.0f)
                lineTo(156.0f, 156.0f)
                close()
                moveTo(68.0f, 40.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                lineTo(200.0f, 36.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                lineTo(204.0f, 92.0f)
                lineTo(156.0f, 92.0f)
                lineTo(156.0f, 80.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, -12.0f)
                lineTo(68.0f, 68.0f)
                close()
                moveTo(36.0f, 176.0f)
                lineTo(36.0f, 80.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                lineTo(144.0f, 76.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                verticalLineToRelative(96.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(40.0f, 180.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 36.0f, 176.0f)
                close()
                moveTo(200.0f, 220.0f)
                lineTo(72.0f, 220.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                lineTo(68.0f, 188.0f)
                horizontalLineToRelative(76.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(156.0f, 164.0f)
                horizontalLineToRelative(48.0f)
                verticalLineToRelative(52.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 200.0f, 220.0f)
                close()
                moveTo(72.1f, 153.0f)
                lineToRelative(-12.0f, -48.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 7.8f, -2.0f)
                lineToRelative(9.2f, 36.8f)
                lineToRelative(11.2f, -25.4f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, true, 7.4f, 0.0f)
                lineToRelative(11.2f, 25.4f)
                lineToRelative(9.2f, -36.8f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 7.8f, 2.0f)
                lineToRelative(-12.0f, 48.0f)
                arcToRelative(4.2f, 4.2f, 0.0f, false, true, -3.6f, 3.0f)
                lineTo(108.0f, 156.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.7f, -2.4f)
                lineTo(92.0f, 125.8f)
                lineTo(79.7f, 153.6f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 2.4f)
                arcTo(4.2f, 4.2f, 0.0f, false, true, 72.1f, 153.0f)
                close()
            }
        }
        .build()
        return _microsoftWordLogo!!
    }

private var _microsoftWordLogo: ImageVector? = null
