package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Polkadot: ImageVector
    get() {
        if (_polkadot != null) {
            return _polkadot!!
        }
        _polkadot = Builder(name = "Polkadot", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveTo(6.985f, 0.0f, 2.886f, 4.075f, 2.886f, 9.114f)
                arcToRelative(9.55f, 9.55f, 0.0f, false, false, 0.482f, 2.966f)
                curveToRelative(0.217f, 0.651f, 0.94f, 1.013f, 1.615f, 0.796f)
                curveToRelative(0.651f, -0.217f, 1.013f, -0.94f, 0.796f, -1.616f)
                arcToRelative(6.42f, 6.42f, 0.0f, false, true, -0.362f, -2.338f)
                curveToRelative(0.097f, -3.4f, 2.846f, -6.197f, 6.245f, -6.366f)
                curveToRelative(3.786f, -0.193f, 6.92f, 2.821f, 6.92f, 6.558f)
                arcToRelative(6.579f, 6.579f, 0.0f, false, true, -6.196f, 6.559f)
                reflectiveCurveToRelative(-1.278f, 0.072f, -1.905f, 0.169f)
                curveToRelative(-0.314f, 0.048f, -0.555f, 0.096f, -0.723f, 0.12f)
                curveToRelative(-0.073f, 0.024f, -0.145f, -0.048f, -0.121f, -0.12f)
                lineToRelative(0.217f, -1.061f)
                lineToRelative(1.182f, -5.45f)
                arcToRelative(1.264f, 1.264f, 0.0f, false, false, -0.965f, -1.494f)
                arcToRelative(1.264f, 1.264f, 0.0f, false, false, -1.495f, 0.964f)
                reflectiveCurveToRelative(-2.845f, 13.262f, -2.87f, 13.406f)
                curveToRelative(-0.144f, 0.676f, 0.29f, 1.35f, 0.965f, 1.495f)
                curveToRelative(0.675f, 0.145f, 1.35f, -0.289f, 1.495f, -0.964f)
                curveToRelative(0.024f, -0.145f, 0.41f, -1.905f, 0.41f, -1.905f)
                arcToRelative(3.203f, 3.203f, 0.0f, false, true, 2.7f, -2.508f)
                curveToRelative(0.29f, -0.048f, 1.423f, -0.12f, 1.423f, -0.12f)
                curveToRelative(4.702f, -0.362f, 8.415f, -4.292f, 8.415f, -9.09f)
                curveTo(21.114f, 4.074f, 17.015f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(12.651f, 20.978f)
                arcToRelative(1.518f, 1.518f, 0.0f, false, false, -1.808f, 1.181f)
                curveToRelative(-0.17f, 0.82f, 0.337f, 1.64f, 1.181f, 1.809f)
                curveToRelative(0.82f, 0.168f, 1.64f, -0.338f, 1.809f, -1.182f)
                curveToRelative(0.168f, -0.844f, -0.338f, -1.64f, -1.182f, -1.808f)
                close()
            }
        }
        .build()
        return _polkadot!!
    }

private var _polkadot: ImageVector? = null
