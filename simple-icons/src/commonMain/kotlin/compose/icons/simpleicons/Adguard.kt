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

public val SimpleIcons.Adguard: ImageVector
    get() {
        if (_adguard != null) {
            return _adguard!!
        }
        _adguard = Builder(name = "Adguard", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveTo(8.519f, 0.0f, 4.426f, 0.828f, 0.931f, 2.628f)
                lineToRelative(-0.545f, 0.279f)
                verticalLineToRelative(0.616f)
                curveToRelative(0.0f, 3.711f, 0.071f, 13.613f, 11.101f, 20.169f)
                lineTo(12.0f, 24.0f)
                lineToRelative(0.513f, -0.308f)
                curveToRelative(11.03f, -6.556f, 11.1f, -16.458f, 11.1f, -20.17f)
                verticalLineToRelative(-0.608f)
                lineToRelative(-0.538f, -0.282f)
                curveTo(19.622f, 0.825f, 15.481f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(12.0f, 2.012f)
                curveToRelative(2.978f, 0.0f, 6.584f, 0.763f, 9.576f, 2.197f)
                curveToRelative(-0.008f, 3.888f, -0.418f, 11.543f, -9.576f, 17.33f)
                curveToRelative(-9.158f, -5.787f, -9.569f, -13.442f, -9.576f, -17.33f)
                curveTo(5.46f, 2.77f, 9.022f, 2.012f, 12.0f, 2.012f)
                close()
                moveTo(17.035f, 7.577f)
                curveToRelative(-0.26f, 0.008f, -0.484f, 0.173f, -0.61f, 0.299f)
                lineToRelative(-5.38f, 5.58f)
                lineToRelative(-2.012f, -2.413f)
                curveToRelative(-0.955f, -1.106f, -2.262f, -0.251f, -2.564f, -0.05f)
                lineToRelative(4.677f, 5.43f)
                lineToRelative(6.385f, -8.648f)
                arcToRelative(0.7f, 0.7f, 0.0f, false, false, -0.496f, -0.198f)
                close()
            }
        }
        .build()
        return _adguard!!
    }

private var _adguard: ImageVector? = null
