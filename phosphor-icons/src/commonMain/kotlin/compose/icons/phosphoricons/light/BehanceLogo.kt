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

public val LightGroup.BehanceLogo: ImageVector
    get() {
        if (_behanceLogo != null) {
            return _behanceLogo!!
        }
        _behanceLogo = Builder(name = "BehanceLogo", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(162.0f, 80.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 6.0f, -6.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 12.0f)
                lineTo(168.0f, 86.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 162.0f, 80.0f)
                close()
                moveTo(246.0f, 152.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f)
                lineTo(166.5f, 158.0f)
                arcTo(34.1f, 34.1f, 0.0f, false, false, 200.0f, 186.0f)
                arcToRelative(33.3f, 33.3f, 0.0f, false, false, 24.0f, -10.0f)
                arcToRelative(6.1f, 6.1f, 0.0f, false, true, 8.5f, 0.0f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, true, 0.0f, 8.5f)
                arcTo(46.0f, 46.0f, 0.0f, true, true, 246.0f, 152.0f)
                close()
                moveTo(233.5f, 146.0f)
                arcToRelative(34.0f, 34.0f, 0.0f, false, false, -67.0f, 0.0f)
                close()
                moveTo(138.0f, 158.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, true, -40.0f, 40.0f)
                lineTo(32.0f, 198.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, -6.0f)
                lineTo(26.0f, 64.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 6.0f, -6.0f)
                lineTo(86.0f, 58.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, true, 24.8f, 62.1f)
                arcTo(40.0f, 40.0f, 0.0f, false, true, 138.0f, 158.0f)
                close()
                moveTo(38.0f, 118.0f)
                lineTo(86.0f, 118.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, 0.0f, -48.0f)
                lineTo(38.0f, 70.0f)
                close()
                moveTo(126.0f, 158.0f)
                arcToRelative(28.1f, 28.1f, 0.0f, false, false, -28.0f, -28.0f)
                lineTo(38.0f, 130.0f)
                verticalLineToRelative(56.0f)
                lineTo(98.0f, 186.0f)
                arcTo(28.1f, 28.1f, 0.0f, false, false, 126.0f, 158.0f)
                close()
            }
        }
        .build()
        return _behanceLogo!!
    }

private var _behanceLogo: ImageVector? = null
