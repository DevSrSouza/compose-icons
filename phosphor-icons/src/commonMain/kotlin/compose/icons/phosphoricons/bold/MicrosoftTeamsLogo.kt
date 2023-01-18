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

public val BoldGroup.MicrosoftTeamsLogo: ImageVector
    get() {
        if (_microsoftTeamsLogo != null) {
            return _microsoftTeamsLogo!!
        }
        _microsoftTeamsLogo = Builder(name = "MicrosoftTeamsLogo", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(126.0f, 104.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(36.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                lineTo(84.0f, 116.0f)
                lineTo(78.0f, 116.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                horizontalLineToRelative(36.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 126.0f, 104.0f)
                close()
                moveTo(232.0f, 88.0f)
                verticalLineToRelative(80.0f)
                arcToRelative(68.0f, 68.0f, 0.0f, false, true, -128.0f, 32.0f)
                lineTo(40.0f, 200.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, true, -20.0f, -20.0f)
                lineTo(20.0f, 76.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, true, 40.0f, 56.0f)
                horizontalLineToRelative(80.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, true, 88.0f, 0.0f)
                arcToRelative(43.4f, 43.4f, 0.0f, false, true, -4.8f, 20.0f)
                lineTo(220.0f, 76.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 232.0f, 88.0f)
                close()
                moveTo(144.0f, 56.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, 19.9f, 18.4f)
                arcTo(20.0f, 20.0f, 0.0f, true, false, 144.0f, 56.0f)
                close()
                moveTo(44.0f, 176.0f)
                lineTo(148.0f, 176.0f)
                lineTo(148.0f, 80.0f)
                lineTo(44.0f, 80.0f)
                close()
                moveTo(208.0f, 100.0f)
                lineTo(172.0f, 100.0f)
                verticalLineToRelative(80.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, true, -20.0f, 20.0f)
                lineTo(133.9f, 200.0f)
                arcTo(43.9f, 43.9f, 0.0f, false, false, 208.0f, 168.0f)
                close()
            }
        }
        .build()
        return _microsoftTeamsLogo!!
    }

private var _microsoftTeamsLogo: ImageVector? = null
