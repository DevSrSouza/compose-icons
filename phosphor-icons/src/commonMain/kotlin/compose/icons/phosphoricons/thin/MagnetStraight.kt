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

public val ThinGroup.MagnetStraight: ImageVector
    get() {
        if (_magnetStraight != null) {
            return _magnetStraight!!
        }
        _magnetStraight = Builder(name = "MagnetStraight", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(200.0f, 44.0f)
                lineTo(160.0f, 44.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, 12.0f)
                verticalLineToRelative(88.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, -40.0f, 0.0f)
                lineTo(108.0f, 56.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 96.0f, 44.0f)
                lineTo(56.0f, 44.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 44.0f, 56.0f)
                verticalLineToRelative(88.0f)
                arcToRelative(84.0f, 84.0f, 0.0f, false, false, 84.0f, 84.0f)
                horizontalLineToRelative(0.6f)
                curveToRelative(46.0f, -0.3f, 83.4f, -38.5f, 83.4f, -85.0f)
                lineTo(212.0f, 56.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 200.0f, 44.0f)
                close()
                moveTo(160.0f, 52.0f)
                horizontalLineToRelative(40.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                lineTo(204.0f, 92.0f)
                lineTo(156.0f, 92.0f)
                lineTo(156.0f, 56.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 160.0f, 52.0f)
                close()
                moveTo(56.0f, 52.0f)
                lineTo(96.0f, 52.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                lineTo(100.0f, 92.0f)
                lineTo(52.0f, 92.0f)
                lineTo(52.0f, 56.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 56.0f, 52.0f)
                close()
                moveTo(128.6f, 220.0f)
                arcTo(76.1f, 76.1f, 0.0f, false, true, 52.0f, 144.0f)
                lineTo(52.0f, 100.0f)
                horizontalLineToRelative(48.0f)
                verticalLineToRelative(44.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, 56.0f, 0.0f)
                lineTo(156.0f, 100.0f)
                horizontalLineToRelative(48.0f)
                verticalLineToRelative(43.0f)
                curveTo(204.0f, 185.1f, 170.2f, 219.7f, 128.6f, 220.0f)
                close()
            }
        }
        .build()
        return _magnetStraight!!
    }

private var _magnetStraight: ImageVector? = null
