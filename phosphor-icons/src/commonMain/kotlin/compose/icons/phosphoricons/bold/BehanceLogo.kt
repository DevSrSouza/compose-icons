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

public val BoldGroup.BehanceLogo: ImageVector
    get() {
        if (_behanceLogo != null) {
            return _behanceLogo!!
        }
        _behanceLogo = Builder(name = "BehanceLogo", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(156.0f, 76.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 12.0f, -12.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 24.0f)
                lineTo(168.0f, 88.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 156.0f, 76.0f)
                close()
                moveTo(136.0f, 158.0f)
                arcToRelative(46.0f, 46.0f, 0.0f, false, true, -46.0f, 46.0f)
                lineTo(28.0f, 204.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, -12.0f)
                lineTo(16.0f, 64.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 28.0f, 52.0f)
                lineTo(78.0f, 52.0f)
                arcToRelative(42.0f, 42.0f, 0.0f, false, true, 34.5f, 65.9f)
                arcTo(46.0f, 46.0f, 0.0f, false, true, 136.0f, 158.0f)
                close()
                moveTo(40.0f, 112.0f)
                lineTo(78.0f, 112.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, false, false, 0.0f, -36.0f)
                lineTo(40.0f, 76.0f)
                close()
                moveTo(112.0f, 158.0f)
                arcToRelative(22.1f, 22.1f, 0.0f, false, false, -22.0f, -22.0f)
                lineTo(40.0f, 136.0f)
                verticalLineToRelative(44.0f)
                lineTo(90.0f, 180.0f)
                arcTo(22.1f, 22.1f, 0.0f, false, false, 112.0f, 158.0f)
                close()
                moveTo(252.0f, 152.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f)
                lineTo(174.7f, 164.0f)
                arcTo(28.0f, 28.0f, 0.0f, false, false, 200.0f, 180.0f)
                arcToRelative(27.0f, 27.0f, 0.0f, false, false, 12.2f, -2.8f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 10.5f, 21.6f)
                arcTo(52.0f, 52.0f, 0.0f, true, true, 252.0f, 152.0f)
                close()
                moveTo(225.3f, 140.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, -50.6f, 0.0f)
                close()
            }
        }
        .build()
        return _behanceLogo!!
    }

private var _behanceLogo: ImageVector? = null
