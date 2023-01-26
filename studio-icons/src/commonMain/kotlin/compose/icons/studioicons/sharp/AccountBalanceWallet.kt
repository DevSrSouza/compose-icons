package compose.icons.studioicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.SharpGroup

public val SharpGroup.AccountBalanceWallet: ImageVector
    get() {
        if (_accountBalanceWallet != null) {
            return _accountBalanceWallet!!
        }
        _accountBalanceWallet = Builder(name = "AccountBalanceWallet", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 18.0f)
                verticalLineToRelative(3.0f)
                lineTo(3.0f, 21.0f)
                lineTo(3.0f, 3.0f)
                horizontalLineToRelative(18.0f)
                verticalLineToRelative(3.0f)
                lineTo(10.0f, 6.0f)
                verticalLineToRelative(12.0f)
                horizontalLineToRelative(11.0f)
                close()
                moveTo(12.0f, 16.0f)
                horizontalLineToRelative(10.0f)
                lineTo(22.0f, 8.0f)
                lineTo(12.0f, 8.0f)
                verticalLineToRelative(8.0f)
                close()
                moveTo(16.0f, 13.5f)
                curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }
        .build()
        return _accountBalanceWallet!!
    }

private var _accountBalanceWallet: ImageVector? = null
