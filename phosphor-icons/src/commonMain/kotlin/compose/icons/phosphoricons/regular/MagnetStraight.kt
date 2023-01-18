package compose.icons.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.RegularGroup

public val RegularGroup.MagnetStraight: ImageVector
    get() {
        if (_magnetStraight != null) {
            return _magnetStraight!!
        }
        _magnetStraight = Builder(name = "MagnetStraight", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(200.0f, 40.0f)
                lineTo(160.0f, 40.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, 16.0f)
                verticalLineToRelative(88.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -32.0f, 0.0f)
                lineTo(112.0f, 56.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 96.0f, 40.0f)
                lineTo(56.0f, 40.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 40.0f, 56.0f)
                verticalLineToRelative(88.0f)
                arcToRelative(87.9f, 87.9f, 0.0f, false, false, 88.0f, 88.0f)
                horizontalLineToRelative(0.7f)
                curveToRelative(48.1f, -0.4f, 87.3f, -40.3f, 87.3f, -89.0f)
                lineTo(216.0f, 56.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 200.0f, 40.0f)
                close()
                moveTo(200.0f, 56.0f)
                lineTo(200.0f, 88.0f)
                lineTo(160.0f, 88.0f)
                lineTo(160.0f, 56.0f)
                close()
                moveTo(96.0f, 56.0f)
                lineTo(96.0f, 88.0f)
                lineTo(56.0f, 88.0f)
                lineTo(56.0f, 56.0f)
                close()
                moveTo(128.5f, 216.0f)
                lineTo(128.0f, 216.0f)
                arcToRelative(72.0f, 72.0f, 0.0f, false, true, -72.0f, -72.0f)
                lineTo(56.0f, 104.0f)
                lineTo(96.0f, 104.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, 64.0f, 0.0f)
                lineTo(160.0f, 104.0f)
                horizontalLineToRelative(40.0f)
                verticalLineToRelative(39.0f)
                curveTo(200.0f, 183.0f, 167.9f, 215.7f, 128.5f, 216.0f)
                close()
            }
        }
        .build()
        return _magnetStraight!!
    }

private var _magnetStraight: ImageVector? = null
