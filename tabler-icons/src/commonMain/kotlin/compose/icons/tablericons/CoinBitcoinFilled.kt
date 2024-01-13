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

public val TablerIcons.CoinBitcoinFilled: ImageVector
    get() {
        if (_coinBitcoinFilled != null) {
            return _coinBitcoinFilled!!
        }
        _coinBitcoinFilled = Builder(name = "CoinBitcoinFilled", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Round, strokeLineJoin = StrokeJoin.Companion.Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.0f, 3.34f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, -15.0f, 8.66f)
                lineToRelative(0.005f, -0.324f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, true, 14.995f, -8.336f)
                close()
                moveTo(13.0f, 6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, 1.0f)
                horizontalLineToRelative(-1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, 2.0f)
                verticalLineToRelative(6.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                curveToRelative(0.0f, 1.333f, 2.0f, 1.333f, 2.0f, 0.0f)
                horizontalLineToRelative(1.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 2.0f, 0.0f)
                verticalLineToRelative(-0.15f)
                curveToRelative(1.167f, -0.394f, 2.0f, -1.527f, 2.0f, -2.85f)
                lineToRelative(-0.005f, -0.175f)
                arcToRelative(3.063f, 3.063f, 0.0f, false, false, -0.734f, -1.827f)
                curveToRelative(0.46f, -0.532f, 0.739f, -1.233f, 0.739f, -1.998f)
                curveToRelative(0.0f, -1.323f, -0.833f, -2.456f, -2.0f, -2.85f)
                verticalLineToRelative(-0.15f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.0f, -1.0f)
                close()
                moveTo(13.09f, 13.0f)
                curveToRelative(0.492f, 0.0f, 0.91f, 0.437f, 0.91f, 1.0f)
                reflectiveCurveToRelative(-0.418f, 1.0f, -0.91f, 1.0f)
                horizontalLineToRelative(-2.09f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.09f)
                close()
                moveTo(13.09f, 9.0f)
                curveToRelative(0.492f, 0.0f, 0.91f, 0.437f, 0.91f, 1.0f)
                curveToRelative(0.0f, 0.522f, -0.36f, 0.937f, -0.806f, 0.993f)
                lineToRelative(-0.104f, 0.007f)
                horizontalLineToRelative(-2.09f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.09f)
                close()
            }
        }
        .build()
        return _coinBitcoinFilled!!
    }

private var _coinBitcoinFilled: ImageVector? = null
