package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.MoneyCheck: ImageVector
    get() {
        if (_moneyCheck != null) {
            return _moneyCheck!!
        }
        _moneyCheck = Builder(name = "MoneyCheck", defaultWidth = 640.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 448.0f)
                curveToRelative(0.0f, 17.67f, 14.33f, 32.0f, 32.0f, 32.0f)
                horizontalLineToRelative(576.0f)
                curveToRelative(17.67f, 0.0f, 32.0f, -14.33f, 32.0f, -32.0f)
                lineTo(640.0f, 128.0f)
                lineTo(0.0f, 128.0f)
                verticalLineToRelative(320.0f)
                close()
                moveTo(448.0f, 240.0f)
                curveToRelative(0.0f, -8.84f, 7.16f, -16.0f, 16.0f, -16.0f)
                horizontalLineToRelative(96.0f)
                curveToRelative(8.84f, 0.0f, 16.0f, 7.16f, 16.0f, 16.0f)
                verticalLineToRelative(32.0f)
                curveToRelative(0.0f, 8.84f, -7.16f, 16.0f, -16.0f, 16.0f)
                horizontalLineToRelative(-96.0f)
                curveToRelative(-8.84f, 0.0f, -16.0f, -7.16f, -16.0f, -16.0f)
                verticalLineToRelative(-32.0f)
                close()
                moveTo(448.0f, 360.0f)
                curveToRelative(0.0f, -4.42f, 3.58f, -8.0f, 8.0f, -8.0f)
                horizontalLineToRelative(112.0f)
                curveToRelative(4.42f, 0.0f, 8.0f, 3.58f, 8.0f, 8.0f)
                verticalLineToRelative(16.0f)
                curveToRelative(0.0f, 4.42f, -3.58f, 8.0f, -8.0f, 8.0f)
                lineTo(456.0f, 384.0f)
                curveToRelative(-4.42f, 0.0f, -8.0f, -3.58f, -8.0f, -8.0f)
                verticalLineToRelative(-16.0f)
                close()
                moveTo(64.0f, 264.0f)
                curveToRelative(0.0f, -4.42f, 3.58f, -8.0f, 8.0f, -8.0f)
                horizontalLineToRelative(304.0f)
                curveToRelative(4.42f, 0.0f, 8.0f, 3.58f, 8.0f, 8.0f)
                verticalLineToRelative(16.0f)
                curveToRelative(0.0f, 4.42f, -3.58f, 8.0f, -8.0f, 8.0f)
                lineTo(72.0f, 288.0f)
                curveToRelative(-4.42f, 0.0f, -8.0f, -3.58f, -8.0f, -8.0f)
                verticalLineToRelative(-16.0f)
                close()
                moveTo(64.0f, 360.0f)
                curveToRelative(0.0f, -4.42f, 3.58f, -8.0f, 8.0f, -8.0f)
                horizontalLineToRelative(176.0f)
                curveToRelative(4.42f, 0.0f, 8.0f, 3.58f, 8.0f, 8.0f)
                verticalLineToRelative(16.0f)
                curveToRelative(0.0f, 4.42f, -3.58f, 8.0f, -8.0f, 8.0f)
                lineTo(72.0f, 384.0f)
                curveToRelative(-4.42f, 0.0f, -8.0f, -3.58f, -8.0f, -8.0f)
                verticalLineToRelative(-16.0f)
                close()
                moveTo(624.0f, 32.0f)
                lineTo(16.0f, 32.0f)
                curveTo(7.16f, 32.0f, 0.0f, 39.16f, 0.0f, 48.0f)
                verticalLineToRelative(48.0f)
                horizontalLineToRelative(640.0f)
                lineTo(640.0f, 48.0f)
                curveToRelative(0.0f, -8.84f, -7.16f, -16.0f, -16.0f, -16.0f)
                close()
            }
        }
        .build()
        return _moneyCheck!!
    }

private var _moneyCheck: ImageVector? = null
