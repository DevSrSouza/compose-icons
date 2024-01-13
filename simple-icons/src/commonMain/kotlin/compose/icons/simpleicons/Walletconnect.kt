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

public val SimpleIcons.Walletconnect: ImageVector
    get() {
        if (_walletconnect != null) {
            return _walletconnect!!
        }
        _walletconnect = Builder(name = "Walletconnect", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.913f, 7.519f)
                curveToRelative(3.915f, -3.831f, 10.26f, -3.831f, 14.174f, 0.0f)
                lineToRelative(0.471f, 0.461f)
                arcToRelative(0.483f, 0.483f, 0.0f, false, true, 0.0f, 0.694f)
                lineToRelative(-1.611f, 1.577f)
                arcToRelative(0.252f, 0.252f, 0.0f, false, true, -0.354f, 0.0f)
                lineToRelative(-0.649f, -0.634f)
                curveToRelative(-2.73f, -2.673f, -7.157f, -2.673f, -9.887f, 0.0f)
                lineToRelative(-0.694f, 0.68f)
                arcToRelative(0.255f, 0.255f, 0.0f, false, true, -0.355f, 0.0f)
                lineTo(4.397f, 8.719f)
                arcToRelative(0.482f, 0.482f, 0.0f, false, true, 0.0f, -0.693f)
                lineToRelative(0.516f, -0.507f)
                close()
                moveTo(22.419f, 10.782f)
                lineTo(23.853f, 12.186f)
                arcToRelative(0.483f, 0.483f, 0.0f, false, true, 0.0f, 0.694f)
                lineToRelative(-6.466f, 6.331f)
                arcToRelative(0.508f, 0.508f, 0.0f, false, true, -0.709f, 0.0f)
                lineToRelative(-4.588f, -4.493f)
                arcToRelative(0.126f, 0.126f, 0.0f, false, false, -0.178f, 0.0f)
                lineToRelative(-4.589f, 4.493f)
                arcToRelative(0.508f, 0.508f, 0.0f, false, true, -0.709f, 0.0f)
                lineTo(0.147f, 12.88f)
                arcToRelative(0.483f, 0.483f, 0.0f, false, true, 0.0f, -0.694f)
                lineToRelative(1.434f, -1.404f)
                arcToRelative(0.508f, 0.508f, 0.0f, false, true, 0.709f, 0.0f)
                lineToRelative(4.589f, 4.493f)
                curveToRelative(0.05f, 0.048f, 0.129f, 0.048f, 0.178f, 0.0f)
                lineToRelative(4.589f, -4.493f)
                arcToRelative(0.508f, 0.508f, 0.0f, false, true, 0.709f, 0.0f)
                lineToRelative(4.589f, 4.493f)
                curveToRelative(0.05f, 0.048f, 0.128f, 0.048f, 0.178f, 0.0f)
                lineToRelative(4.589f, -4.493f)
                arcToRelative(0.507f, 0.507f, 0.0f, false, true, 0.708f, 0.0f)
                close()
            }
        }
        .build()
        return _walletconnect!!
    }

private var _walletconnect: ImageVector? = null
