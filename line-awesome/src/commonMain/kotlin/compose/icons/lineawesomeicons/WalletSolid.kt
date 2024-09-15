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
                moveTo(22.969f, 4.0f)
                curveTo(22.816f, 4.004f, 22.656f, 4.023f, 22.5f, 4.063f)
                lineTo(6.25f, 8.344f)
                curveTo(4.938f, 8.688f, 4.0f, 9.891f, 4.0f, 11.25f)
                lineTo(4.0f, 25.0f)
                curveTo(4.0f, 26.645f, 5.355f, 28.0f, 7.0f, 28.0f)
                lineTo(25.0f, 28.0f)
                curveTo(26.645f, 28.0f, 28.0f, 26.645f, 28.0f, 25.0f)
                lineTo(28.0f, 12.0f)
                curveTo(28.0f, 10.355f, 26.645f, 9.0f, 25.0f, 9.0f)
                lineTo(11.625f, 9.0f)
                lineTo(23.0f, 6.0f)
                lineTo(23.0f, 8.0f)
                lineTo(25.0f, 8.0f)
                lineTo(25.0f, 6.0f)
                curveTo(25.0f, 4.875f, 24.043f, 3.984f, 22.969f, 4.0f)
                close()
                moveTo(7.0f, 11.0f)
                lineTo(25.0f, 11.0f)
                curveTo(25.566f, 11.0f, 26.0f, 11.434f, 26.0f, 12.0f)
                lineTo(26.0f, 25.0f)
                curveTo(26.0f, 25.566f, 25.566f, 26.0f, 25.0f, 26.0f)
                lineTo(7.0f, 26.0f)
                curveTo(6.434f, 26.0f, 6.0f, 25.566f, 6.0f, 25.0f)
                lineTo(6.0f, 12.0f)
                curveTo(6.0f, 11.434f, 6.434f, 11.0f, 7.0f, 11.0f)
                close()
                moveTo(22.5f, 17.0f)
                curveTo(21.672f, 17.0f, 21.0f, 17.672f, 21.0f, 18.5f)
                curveTo(21.0f, 19.328f, 21.672f, 20.0f, 22.5f, 20.0f)
                curveTo(23.328f, 20.0f, 24.0f, 19.328f, 24.0f, 18.5f)
                curveTo(24.0f, 17.672f, 23.328f, 17.0f, 22.5f, 17.0f)
                close()
            }
        }
        .build()
        return _walletSolid!!
    }

private var _walletSolid: ImageVector? = null
