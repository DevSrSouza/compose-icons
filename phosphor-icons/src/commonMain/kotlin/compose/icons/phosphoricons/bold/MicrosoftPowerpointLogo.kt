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

public val BoldGroup.MicrosoftPowerpointLogo: ImageVector
    get() {
        if (_microsoftPowerpointLogo != null) {
            return _microsoftPowerpointLogo!!
        }
        _microsoftPowerpointLogo = Builder(name = "MicrosoftPowerpointLogo", defaultWidth =
                256.0.dp, defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight =
                256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(98.0f, 92.0f)
                lineTo(82.0f, 92.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, 12.0f)
                verticalLineToRelative(48.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(4.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, 0.0f, -56.0f)
                close()
                moveTo(98.0f, 124.0f)
                lineTo(94.0f, 124.0f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(4.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 8.0f)
                close()
                moveTo(136.0f, 20.0f)
                arcTo(107.6f, 107.6f, 0.0f, false, false, 55.5f, 56.0f)
                lineTo(40.0f, 56.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, false, 20.0f, 76.0f)
                lineTo(20.0f, 180.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, 20.0f, 20.0f)
                lineTo(55.5f, 200.0f)
                arcTo(108.0f, 108.0f, 0.0f, true, false, 136.0f, 20.0f)
                close()
                moveTo(136.0f, 44.0f)
                arcToRelative(84.0f, 84.0f, 0.0f, false, true, 83.1f, 72.0f)
                lineTo(172.0f, 116.0f)
                lineTo(172.0f, 76.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, -20.0f, -20.0f)
                lineTo(92.7f, 56.0f)
                arcTo(83.5f, 83.5f, 0.0f, false, true, 136.0f, 44.0f)
                close()
                moveTo(44.0f, 80.0f)
                lineTo(148.0f, 80.0f)
                verticalLineToRelative(96.0f)
                lineTo(44.0f, 176.0f)
                close()
                moveTo(136.0f, 212.0f)
                arcToRelative(83.5f, 83.5f, 0.0f, false, true, -43.3f, -12.0f)
                lineTo(152.0f, 200.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, 20.0f, -20.0f)
                lineTo(172.0f, 140.0f)
                horizontalLineToRelative(47.1f)
                arcTo(84.0f, 84.0f, 0.0f, false, true, 136.0f, 212.0f)
                close()
            }
        }
        .build()
        return _microsoftPowerpointLogo!!
    }

private var _microsoftPowerpointLogo: ImageVector? = null
