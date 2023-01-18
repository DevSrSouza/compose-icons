package compose.icons.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.FillGroup

public val FillGroup.MicrosoftWordLogo: ImageVector
    get() {
        if (_microsoftWordLogo != null) {
            return _microsoftWordLogo!!
        }
        _microsoftWordLogo = Builder(name = "MicrosoftWordLogo", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(200.0f, 24.0f)
                lineTo(72.0f, 24.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 56.0f, 40.0f)
                lineTo(56.0f, 64.0f)
                lineTo(40.0f, 64.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 24.0f, 80.0f)
                verticalLineToRelative(96.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                lineTo(56.0f, 192.0f)
                verticalLineToRelative(24.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                lineTo(200.0f, 232.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(216.0f, 40.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 200.0f, 24.0f)
                close()
                moveTo(68.2f, 153.9f)
                lineToRelative(-12.0f, -48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 15.6f, -3.8f)
                lineToRelative(6.3f, 25.4f)
                lineToRelative(6.6f, -14.7f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 14.6f, 0.0f)
                lineToRelative(6.6f, 14.7f)
                lineToRelative(6.3f, -25.4f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 15.6f, 3.8f)
                lineToRelative(-12.0f, 48.0f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, -7.1f, 6.1f)
                lineTo(108.0f, 160.0f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, true, -7.3f, -4.8f)
                lineTo(92.0f, 135.7f)
                lineToRelative(-8.7f, 19.5f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 4.8f)
                arcTo(8.1f, 8.1f, 0.0f, false, true, 68.2f, 153.9f)
                close()
                moveTo(200.0f, 216.0f)
                lineTo(72.0f, 216.0f)
                lineTo(72.0f, 192.0f)
                horizontalLineToRelative(72.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(40.0f)
                close()
                moveTo(200.0f, 152.0f)
                lineTo(160.0f, 152.0f)
                lineTo(160.0f, 104.0f)
                horizontalLineToRelative(40.0f)
                close()
                moveTo(200.0f, 88.0f)
                lineTo(160.0f, 88.0f)
                lineTo(160.0f, 80.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, -16.0f)
                lineTo(72.0f, 64.0f)
                lineTo(72.0f, 40.0f)
                lineTo(200.0f, 40.0f)
                close()
            }
        }
        .build()
        return _microsoftWordLogo!!
    }

private var _microsoftWordLogo: ImageVector? = null
