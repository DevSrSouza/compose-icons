package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.StrokeJoin.Companion.Round
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.WalletOutline: ImageVector
    get() {
        if (_walletOutline != null) {
            return _walletOutline!!
        }
        _walletOutline = Builder(name = "WalletOutline", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Butt, strokeLineJoin = Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(96.0f, 144.0f)
                lineTo(416.0f, 144.0f)
                arcTo(48.0f, 48.0f, 0.0f, false, true, 464.0f, 192.0f)
                lineTo(464.0f, 384.0f)
                arcTo(48.0f, 48.0f, 0.0f, false, true, 416.0f, 432.0f)
                lineTo(96.0f, 432.0f)
                arcTo(48.0f, 48.0f, 0.0f, false, true, 48.0f, 384.0f)
                lineTo(48.0f, 192.0f)
                arcTo(48.0f, 48.0f, 0.0f, false, true, 96.0f, 144.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 32.0f, strokeLineCap = Butt, strokeLineJoin = Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(411.36f, 144.0f)
                verticalLineTo(114.0f)
                arcTo(50.0f, 50.0f, 0.0f, false, false, 352.0f, 64.9f)
                lineTo(88.64f, 109.85f)
                arcTo(50.0f, 50.0f, 0.0f, false, false, 48.0f, 159.0f)
                verticalLineToRelative(49.0f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(368.0f, 320.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 32.0f, -32.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 368.0f, 320.0f)
                close()
            }
        }
        .build()
        return _walletOutline!!
    }

private var _walletOutline: ImageVector? = null
