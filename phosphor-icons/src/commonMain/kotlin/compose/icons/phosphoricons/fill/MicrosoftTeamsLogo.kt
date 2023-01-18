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

public val FillGroup.MicrosoftTeamsLogo: ImageVector
    get() {
        if (_microsoftTeamsLogo != null) {
            return _microsoftTeamsLogo!!
        }
        _microsoftTeamsLogo = Builder(name = "MicrosoftTeamsLogo", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(219.3f, 80.0f)
                horizontalLineToRelative(-4.5f)
                arcTo(33.5f, 33.5f, 0.0f, false, false, 220.0f, 62.0f)
                arcToRelative(34.0f, 34.0f, 0.0f, false, false, -51.4f, -29.2f)
                arcTo(40.0f, 40.0f, 0.0f, false, false, 96.0f, 56.0f)
                arcToRelative(42.6f, 42.6f, 0.0f, false, false, 0.8f, 8.0f)
                lineTo(40.0f, 64.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 24.0f, 80.0f)
                verticalLineToRelative(96.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                lineTo(76.7f, 192.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, false, false, 118.7f, -0.2f)
                arcTo(40.0f, 40.0f, 0.0f, false, false, 232.0f, 152.0f)
                lineTo(232.0f, 92.7f)
                arcTo(12.7f, 12.7f, 0.0f, false, false, 219.3f, 80.0f)
                close()
                moveTo(136.0f, 32.0f)
                arcToRelative(24.1f, 24.1f, 0.0f, false, true, 24.0f, 24.0f)
                arcToRelative(24.3f, 24.3f, 0.0f, false, true, -4.1f, 13.4f)
                arcTo(15.9f, 15.9f, 0.0f, false, false, 144.0f, 64.0f)
                lineTo(113.4f, 64.0f)
                arcToRelative(24.5f, 24.5f, 0.0f, false, true, -1.4f, -8.0f)
                arcTo(24.1f, 24.1f, 0.0f, false, true, 136.0f, 32.0f)
                close()
                moveTo(84.0f, 152.0f)
                lineTo(84.0f, 112.0f)
                lineTo(74.0f, 112.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineToRelative(36.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                lineTo(100.0f, 112.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                close()
                moveTo(184.0f, 168.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, true, -48.0f, 48.0f)
                arcToRelative(48.5f, 48.5f, 0.0f, false, true, -41.6f, -24.0f)
                lineTo(144.0f, 192.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(160.0f, 96.0f)
                horizontalLineToRelative(24.0f)
                close()
                moveTo(186.0f, 80.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, false, true, -14.0f, -6.7f)
                arcTo(39.2f, 39.2f, 0.0f, false, false, 176.0f, 56.0f)
                arcToRelative(37.7f, 37.7f, 0.0f, false, false, -0.9f, -8.3f)
                arcTo(17.7f, 17.7f, 0.0f, false, true, 186.0f, 44.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, false, true, 0.0f, 36.0f)
                close()
                moveTo(216.0f, 152.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, -16.4f, 22.7f)
                arcToRelative(49.2f, 49.2f, 0.0f, false, false, 0.4f, -6.7f)
                lineTo(200.0f, 96.0f)
                horizontalLineToRelative(16.0f)
                close()
            }
        }
        .build()
        return _microsoftTeamsLogo!!
    }

private var _microsoftTeamsLogo: ImageVector? = null
