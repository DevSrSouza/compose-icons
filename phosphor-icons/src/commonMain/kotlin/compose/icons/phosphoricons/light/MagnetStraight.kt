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

public val LightGroup.MagnetStraight: ImageVector
    get() {
        if (_magnetStraight != null) {
            return _magnetStraight!!
        }
        _magnetStraight = Builder(name = "MagnetStraight", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(200.0f, 42.0f)
                lineTo(160.0f, 42.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -14.0f, 14.0f)
                verticalLineToRelative(88.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, false, true, -36.0f, 0.0f)
                lineTo(110.0f, 56.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 96.0f, 42.0f)
                lineTo(56.0f, 42.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 42.0f, 56.0f)
                verticalLineToRelative(88.0f)
                arcToRelative(86.0f, 86.0f, 0.0f, false, false, 86.0f, 86.0f)
                horizontalLineToRelative(0.7f)
                curveToRelative(47.0f, -0.4f, 85.3f, -39.4f, 85.3f, -87.0f)
                lineTo(214.0f, 56.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 200.0f, 42.0f)
                close()
                moveTo(160.0f, 54.0f)
                horizontalLineToRelative(40.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                lineTo(202.0f, 90.0f)
                lineTo(158.0f, 90.0f)
                lineTo(158.0f, 56.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 160.0f, 54.0f)
                close()
                moveTo(56.0f, 54.0f)
                lineTo(96.0f, 54.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                lineTo(98.0f, 90.0f)
                lineTo(54.0f, 90.0f)
                lineTo(54.0f, 56.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 56.0f, 54.0f)
                close()
                moveTo(128.6f, 218.0f)
                lineTo(128.0f, 218.0f)
                arcToRelative(74.1f, 74.1f, 0.0f, false, true, -74.0f, -74.0f)
                lineTo(54.0f, 102.0f)
                lineTo(98.0f, 102.0f)
                verticalLineToRelative(42.0f)
                arcToRelative(30.0f, 30.0f, 0.0f, false, false, 60.0f, 0.0f)
                lineTo(158.0f, 102.0f)
                horizontalLineToRelative(44.0f)
                verticalLineToRelative(41.0f)
                curveTo(202.0f, 184.1f, 169.1f, 217.7f, 128.6f, 218.0f)
                close()
            }
        }
        .build()
        return _magnetStraight!!
    }

private var _magnetStraight: ImageVector? = null
