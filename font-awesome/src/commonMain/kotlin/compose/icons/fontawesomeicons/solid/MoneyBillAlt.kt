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

public val SolidGroup.MoneyBillAlt: ImageVector
    get() {
        if (_moneyBillAlt != null) {
            return _moneyBillAlt!!
        }
        _moneyBillAlt = Builder(name = "MoneyBillAlt", defaultWidth = 640.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(352.0f, 288.0f)
                horizontalLineToRelative(-16.0f)
                verticalLineToRelative(-88.0f)
                curveToRelative(0.0f, -4.42f, -3.58f, -8.0f, -8.0f, -8.0f)
                horizontalLineToRelative(-13.58f)
                curveToRelative(-4.74f, 0.0f, -9.37f, 1.4f, -13.31f, 4.03f)
                lineToRelative(-15.33f, 10.22f)
                arcToRelative(7.99f, 7.99f, 0.0f, false, false, -2.22f, 11.09f)
                lineToRelative(8.88f, 13.31f)
                arcToRelative(7.99f, 7.99f, 0.0f, false, false, 11.09f, 2.22f)
                lineToRelative(0.47f, -0.31f)
                lineTo(304.0f, 288.0f)
                horizontalLineToRelative(-16.0f)
                curveToRelative(-4.42f, 0.0f, -8.0f, 3.58f, -8.0f, 8.0f)
                verticalLineToRelative(16.0f)
                curveToRelative(0.0f, 4.42f, 3.58f, 8.0f, 8.0f, 8.0f)
                horizontalLineToRelative(64.0f)
                curveToRelative(4.42f, 0.0f, 8.0f, -3.58f, 8.0f, -8.0f)
                verticalLineToRelative(-16.0f)
                curveToRelative(0.0f, -4.42f, -3.58f, -8.0f, -8.0f, -8.0f)
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
                moveTo(320.0f, 368.0f)
                curveToRelative(-53.02f, 0.0f, -96.0f, -50.15f, -96.0f, -112.0f)
                curveToRelative(0.0f, -61.86f, 42.98f, -112.0f, 96.0f, -112.0f)
                reflectiveCurveToRelative(96.0f, 50.14f, 96.0f, 112.0f)
                curveToRelative(0.0f, 61.87f, -43.0f, 112.0f, -96.0f, 112.0f)
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
        return _moneyBillAlt!!
    }

private var _moneyBillAlt: ImageVector? = null
