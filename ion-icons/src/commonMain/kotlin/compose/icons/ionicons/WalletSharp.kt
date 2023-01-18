package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.WalletSharp: ImageVector
    get() {
        if (_walletSharp != null) {
            return _walletSharp!!
        }
        _walletSharp = Builder(name = "WalletSharp", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(47.5f, 104.0f)
                horizontalLineTo(432.0f)
                verticalLineTo(51.52f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -19.14f, -15.69f)
                lineToRelative(-368.0f, 60.48f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -12.0f, 10.47f)
                arcTo(39.69f, 39.69f, 0.0f, false, true, 47.5f, 104.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(463.5f, 128.0f)
                horizontalLineTo(47.5f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, 16.0f)
                verticalLineTo(432.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                horizontalLineToRelative(416.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                verticalLineTo(144.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 463.5f, 128.0f)
                close()
                moveTo(368.0f, 320.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 32.0f, -32.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 368.0f, 320.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(31.33f, 259.5f)
                verticalLineTo(116.0f)
                curveToRelative(0.0f, -12.33f, 5.72f, -18.48f, 15.42f, -20.0f)
                curveToRelative(35.2f, -5.53f, 108.58f, -8.5f, 108.58f, -8.5f)
                reflectiveCurveToRelative(-8.33f, 16.0f, -27.33f, 16.0f)
                verticalLineTo(128.0f)
                curveToRelative(18.5f, 0.0f, 31.33f, 23.5f, 31.33f, 23.5f)
                lineTo(84.83f, 236.0f)
                close()
            }
        }
        .build()
        return _walletSharp!!
    }

private var _walletSharp: ImageVector? = null
