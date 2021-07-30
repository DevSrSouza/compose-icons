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

public val SolidGroup.MoneyBill: ImageVector
    get() {
        if (_moneyBill != null) {
            return _moneyBill!!
        }
        _moneyBill = Builder(name = "MoneyBill", defaultWidth = 640.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(608.0f, 64.0f)
                lineTo(32.0f, 64.0f)
                curveTo(14.33f, 64.0f, 0.0f, 78.33f, 0.0f, 96.0f)
                verticalLineToRelative(320.0f)
                curveToRelative(0.0f, 17.67f, 14.33f, 32.0f, 32.0f, 32.0f)
                horizontalLineToRelative(576.0f)
                curveToRelative(17.67f, 0.0f, 32.0f, -14.33f, 32.0f, -32.0f)
                lineTo(640.0f, 96.0f)
                curveToRelative(0.0f, -17.67f, -14.33f, -32.0f, -32.0f, -32.0f)
                close()
                moveTo(48.0f, 400.0f)
                verticalLineToRelative(-64.0f)
                curveToRelative(35.35f, 0.0f, 64.0f, 28.65f, 64.0f, 64.0f)
                lineTo(48.0f, 400.0f)
                close()
                moveTo(48.0f, 176.0f)
                verticalLineToRelative(-64.0f)
                horizontalLineToRelative(64.0f)
                curveToRelative(0.0f, 35.35f, -28.65f, 64.0f, -64.0f, 64.0f)
                close()
                moveTo(320.0f, 352.0f)
                curveToRelative(-44.19f, 0.0f, -80.0f, -42.99f, -80.0f, -96.0f)
                curveToRelative(0.0f, -53.02f, 35.82f, -96.0f, 80.0f, -96.0f)
                reflectiveCurveToRelative(80.0f, 42.98f, 80.0f, 96.0f)
                curveToRelative(0.0f, 53.03f, -35.83f, 96.0f, -80.0f, 96.0f)
                close()
                moveTo(592.0f, 400.0f)
                horizontalLineToRelative(-64.0f)
                curveToRelative(0.0f, -35.35f, 28.65f, -64.0f, 64.0f, -64.0f)
                verticalLineToRelative(64.0f)
                close()
                moveTo(592.0f, 176.0f)
                curveToRelative(-35.35f, 0.0f, -64.0f, -28.65f, -64.0f, -64.0f)
                horizontalLineToRelative(64.0f)
                verticalLineToRelative(64.0f)
                close()
            }
        }
        .build()
        return _moneyBill!!
    }

private var _moneyBill: ImageVector? = null
