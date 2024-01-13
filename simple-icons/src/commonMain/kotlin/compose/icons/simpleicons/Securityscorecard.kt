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

public val SimpleIcons.Securityscorecard: ImageVector
    get() {
        if (_securityscorecard != null) {
            return _securityscorecard!!
        }
        _securityscorecard = Builder(name = "Securityscorecard", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.3696f, 2.5006f)
                lineTo(12.0006f, 5.0f)
                lineTo(7.6303f, 7.5006f)
                verticalLineToRelative(-5.0f)
                lineTo(12.0006f, 0.0f)
                close()
                moveTo(22.4873f, 5.9996f)
                lineTo(22.4901f, 10.9856f)
                lineTo(13.7619f, 5.9927f)
                lineTo(18.1183f, 3.5004f)
                close()
                moveTo(18.1183f, 15.5081f)
                lineTo(18.1169f, 20.5053f)
                lineTo(22.4943f, 18.0046f)
                lineTo(22.4915f, 12.9866f)
                lineTo(18.1183f, 10.4846f)
                close()
                moveTo(7.6274f, 21.502f)
                lineTo(12.0006f, 24.0f)
                lineToRelative(4.369f, -2.4952f)
                verticalLineToRelative(-4.9972f)
                close()
                moveTo(7.6303f, 9.5f)
                verticalLineToRelative(5.0014f)
                lineToRelative(4.3703f, 2.4992f)
                lineToRelative(4.369f, -2.4937f)
                lineTo(16.3696f, 9.5001f)
                lineToRelative(-4.369f, -2.4993f)
                close()
                moveTo(1.5055f, 18.0044f)
                lineTo(1.5083f, 12.9989f)
                lineTo(10.2547f, 18.0016f)
                lineTo(5.8787f, 20.5024f)
                close()
                moveTo(5.8815f, 3.5004f)
                lineTo(1.5125f, 6.001f)
                lineToRelative(-0.0028f, 4.9985f)
                lineToRelative(4.3718f, 2.502f)
                close()
            }
        }
        .build()
        return _securityscorecard!!
    }

private var _securityscorecard: ImageVector? = null
