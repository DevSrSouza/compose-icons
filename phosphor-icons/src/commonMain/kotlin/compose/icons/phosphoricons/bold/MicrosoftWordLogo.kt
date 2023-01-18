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

public val BoldGroup.MicrosoftWordLogo: ImageVector
    get() {
        if (_microsoftWordLogo != null) {
            return _microsoftWordLogo!!
        }
        _microsoftWordLogo = Builder(name = "MicrosoftWordLogo", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(200.0f, 20.0f)
                lineTo(72.0f, 20.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, false, 52.0f, 40.0f)
                lineTo(52.0f, 56.0f)
                lineTo(40.0f, 56.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, false, 20.0f, 76.0f)
                lineTo(20.0f, 180.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, 20.0f, 20.0f)
                lineTo(52.0f, 200.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, 20.0f, 20.0f)
                lineTo(200.0f, 236.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, 20.0f, -20.0f)
                lineTo(220.0f, 40.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, false, 200.0f, 20.0f)
                close()
                moveTo(172.0f, 108.0f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(40.0f)
                lineTo(172.0f, 148.0f)
                close()
                moveTo(76.0f, 44.0f)
                lineTo(196.0f, 44.0f)
                lineTo(196.0f, 84.0f)
                lineTo(172.0f, 84.0f)
                lineTo(172.0f, 76.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, -20.0f, -20.0f)
                lineTo(76.0f, 56.0f)
                close()
                moveTo(44.0f, 80.0f)
                lineTo(148.0f, 80.0f)
                verticalLineToRelative(96.0f)
                lineTo(44.0f, 176.0f)
                close()
                moveTo(76.0f, 212.0f)
                lineTo(76.0f, 200.0f)
                horizontalLineToRelative(76.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, 20.0f, -20.0f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(40.0f)
                close()
                moveTo(68.4f, 154.9f)
                lineTo(56.4f, 106.9f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 23.2f, -5.8f)
                lineToRelative(3.6f, 14.2f)
                lineToRelative(1.8f, -4.2f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, true, 22.0f, 0.0f)
                lineToRelative(1.8f, 4.2f)
                lineToRelative(3.6f, -14.2f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 23.2f, 5.8f)
                lineToRelative(-12.0f, 48.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 113.0f, 164.0f)
                horizontalLineToRelative(-1.0f)
                arcToRelative(12.2f, 12.2f, 0.0f, false, true, -11.0f, -7.1f)
                lineToRelative(-5.0f, -11.4f)
                lineToRelative(-5.0f, 11.4f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -22.6f, -2.0f)
                close()
            }
        }
        .build()
        return _microsoftWordLogo!!
    }

private var _microsoftWordLogo: ImageVector? = null
