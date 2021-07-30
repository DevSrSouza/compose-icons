package compose.icons.lineawesomeicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.LineAwesomeIcons

public val LineAwesomeIcons.WalletSolid: ImageVector
    get() {
        if (_walletSolid != null) {
            return _walletSolid!!
        }
        _walletSolid = Builder(name = "WalletSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.9688f, 4.0f)
                curveTo(22.8164f, 4.0039f, 22.6563f, 4.0234f, 22.5f, 4.0625f)
                lineTo(6.25f, 8.3438f)
                curveTo(4.9375f, 8.6875f, 4.0f, 9.8906f, 4.0f, 11.25f)
                lineTo(4.0f, 25.0f)
                curveTo(4.0f, 26.6445f, 5.3555f, 28.0f, 7.0f, 28.0f)
                lineTo(25.0f, 28.0f)
                curveTo(26.6445f, 28.0f, 28.0f, 26.6445f, 28.0f, 25.0f)
                lineTo(28.0f, 12.0f)
                curveTo(28.0f, 10.3555f, 26.6445f, 9.0f, 25.0f, 9.0f)
                lineTo(11.625f, 9.0f)
                lineTo(23.0f, 6.0f)
                lineTo(23.0f, 8.0f)
                lineTo(25.0f, 8.0f)
                lineTo(25.0f, 6.0f)
                curveTo(25.0f, 4.875f, 24.043f, 3.9844f, 22.9688f, 4.0f)
                close()
                moveTo(7.0f, 11.0f)
                lineTo(25.0f, 11.0f)
                curveTo(25.5664f, 11.0f, 26.0f, 11.4336f, 26.0f, 12.0f)
                lineTo(26.0f, 25.0f)
                curveTo(26.0f, 25.5664f, 25.5664f, 26.0f, 25.0f, 26.0f)
                lineTo(7.0f, 26.0f)
                curveTo(6.4336f, 26.0f, 6.0f, 25.5664f, 6.0f, 25.0f)
                lineTo(6.0f, 12.0f)
                curveTo(6.0f, 11.4336f, 6.4336f, 11.0f, 7.0f, 11.0f)
                close()
                moveTo(22.5f, 17.0f)
                curveTo(21.6719f, 17.0f, 21.0f, 17.6719f, 21.0f, 18.5f)
                curveTo(21.0f, 19.3281f, 21.6719f, 20.0f, 22.5f, 20.0f)
                curveTo(23.3281f, 20.0f, 24.0f, 19.3281f, 24.0f, 18.5f)
                curveTo(24.0f, 17.6719f, 23.3281f, 17.0f, 22.5f, 17.0f)
                close()
            }
        }
        .build()
        return _walletSolid!!
    }

private var _walletSolid: ImageVector? = null
