package compose.icons.fontawesomeicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.RegularGroup

public val RegularGroup.MoneyBillAlt: ImageVector
    get() {
        if (_moneyBillAlt != null) {
            return _moneyBillAlt!!
        }
        _moneyBillAlt = Builder(name = "MoneyBillAlt", defaultWidth = 640.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(320.0f, 144.0f)
                curveToRelative(-53.02f, 0.0f, -96.0f, 50.14f, -96.0f, 112.0f)
                curveToRelative(0.0f, 61.85f, 42.98f, 112.0f, 96.0f, 112.0f)
                curveToRelative(53.0f, 0.0f, 96.0f, -50.13f, 96.0f, -112.0f)
                curveToRelative(0.0f, -61.86f, -42.98f, -112.0f, -96.0f, -112.0f)
                close()
                moveTo(360.0f, 312.0f)
                curveToRelative(0.0f, 4.42f, -3.58f, 8.0f, -8.0f, 8.0f)
                horizontalLineToRelative(-64.0f)
                curveToRelative(-4.42f, 0.0f, -8.0f, -3.58f, -8.0f, -8.0f)
                verticalLineToRelative(-16.0f)
                curveToRelative(0.0f, -4.42f, 3.58f, -8.0f, 8.0f, -8.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(-55.44f)
                lineToRelative(-0.47f, 0.31f)
                arcToRelative(7.992f, 7.992f, 0.0f, false, true, -11.09f, -2.22f)
                lineToRelative(-8.88f, -13.31f)
                arcToRelative(7.992f, 7.992f, 0.0f, false, true, 2.22f, -11.09f)
                lineToRelative(15.33f, -10.22f)
                arcToRelative(23.99f, 23.99f, 0.0f, false, true, 13.31f, -4.03f)
                lineTo(328.0f, 192.0f)
                curveToRelative(4.42f, 0.0f, 8.0f, 3.58f, 8.0f, 8.0f)
                verticalLineToRelative(88.0f)
                horizontalLineToRelative(16.0f)
                curveToRelative(4.42f, 0.0f, 8.0f, 3.58f, 8.0f, 8.0f)
                verticalLineToRelative(16.0f)
                close()
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
                moveTo(592.0f, 336.0f)
                curveToRelative(-35.35f, 0.0f, -64.0f, 28.65f, -64.0f, 64.0f)
                lineTo(112.0f, 400.0f)
                curveToRelative(0.0f, -35.35f, -28.65f, -64.0f, -64.0f, -64.0f)
                lineTo(48.0f, 176.0f)
                curveToRelative(35.35f, 0.0f, 64.0f, -28.65f, 64.0f, -64.0f)
                horizontalLineToRelative(416.0f)
                curveToRelative(0.0f, 35.35f, 28.65f, 64.0f, 64.0f, 64.0f)
                verticalLineToRelative(160.0f)
                close()
            }
        }
        .build()
        return _moneyBillAlt!!
    }

private var _moneyBillAlt: ImageVector? = null
