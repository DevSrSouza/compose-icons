package compose.icons.tablericons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.TablerIcons

public val TablerIcons.GiftFilled: ImageVector
    get() {
        if (_giftFilled != null) {
            return _giftFilled!!
        }
        _giftFilled = Builder(name = "GiftFilled", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Round, strokeLineJoin = StrokeJoin.Companion.Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.0f, 14.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(-4.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -3.0f, -3.0f)
                verticalLineToRelative(-4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                horizontalLineToRelative(6.0f)
                close()
                moveTo(19.0f, 14.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(4.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -3.0f, 3.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(6.0f)
                close()
                moveTo(16.5f, 2.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, 3.163f, 5.0f)
                horizontalLineToRelative(0.337f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                verticalLineToRelative(1.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                horizontalLineToRelative(-7.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-7.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                verticalLineToRelative(-1.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                horizontalLineToRelative(0.337f)
                arcToRelative(3.486f, 3.486f, 0.0f, false, true, -0.337f, -1.5f)
                curveToRelative(0.0f, -1.933f, 1.567f, -3.5f, 3.483f, -3.5f)
                curveToRelative(1.755f, -0.03f, 3.312f, 1.092f, 4.381f, 2.934f)
                lineToRelative(0.136f, 0.243f)
                curveToRelative(1.033f, -1.914f, 2.56f, -3.114f, 4.291f, -3.175f)
                lineToRelative(0.209f, -0.002f)
                close()
                moveTo(7.5f, 4.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, 3.0f)
                horizontalLineToRelative(3.143f)
                curveToRelative(-0.741f, -1.905f, -1.949f, -3.02f, -3.143f, -3.0f)
                close()
                moveTo(16.483f, 4.0f)
                curveToRelative(-1.18f, -0.02f, -2.385f, 1.096f, -3.126f, 3.0f)
                horizontalLineToRelative(3.143f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, -0.017f, -3.0f)
                close()
            }
        }
        .build()
        return _giftFilled!!
    }

private var _giftFilled: ImageVector? = null
