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

public val SimpleIcons.Checkio: ImageVector
    get() {
        if (_checkio != null) {
            return _checkio!!
        }
        _checkio = Builder(name = "Checkio", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.846f, 8.886f)
                lineTo(24.0f, 2.932f)
                verticalLineToRelative(13.82f)
                lineTo(9.621f, 21.068f)
                lineTo(0.0f, 14.09f)
                lineToRelative(3.35f, -9.956f)
                lineToRelative(7.496f, 4.751f)
                verticalLineToRelative(0.001f)
                close()
                moveTo(6.264f, 10.953f)
                lineToRelative(3.923f, -1.768f)
                lineToRelative(-6.065f, -3.85f)
                lineToRelative(2.142f, 5.618f)
                close()
                moveTo(0.871f, 13.393f)
                lineToRelative(4.842f, -2.187f)
                lineToRelative(-2.179f, -5.717f)
                lineToRelative(-2.662f, 7.904f)
                lineTo(0.871f, 13.393f)
                close()
                moveTo(23.397f, 15.933f)
                lineTo(23.397f, 4.256f)
                lineToRelative(-5.96f, 7.37f)
                lineToRelative(5.96f, 4.307f)
                close()
                moveTo(10.532f, 20.166f)
                lineToRelative(12.497f, -3.758f)
                lineToRelative(-5.973f, -4.316f)
                lineToRelative(-6.524f, 8.074f)
                close()
                moveTo(0.94f, 14.029f)
                lineToRelative(8.092f, 5.867f)
                lineToRelative(-3.106f, -8.124f)
                lineTo(0.94f, 14.029f)
                close()
                moveTo(22.662f, 4.203f)
                curveToRelative(-5.085f, 2.296f, -10.163f, 4.6f, -15.25f, 6.895f)
                lineToRelative(9.445f, 0.284f)
                lineToRelative(5.805f, -7.178f)
                verticalLineToRelative(-0.001f)
                close()
                moveTo(9.775f, 20.143f)
                lineToRelative(6.608f, -8.173f)
                lineToRelative(-9.844f, -0.29f)
                lineToRelative(3.236f, 8.462f)
                verticalLineToRelative(0.001f)
                close()
            }
        }
        .build()
        return _checkio!!
    }

private var _checkio: ImageVector? = null
