package compose.icons.lineawesomeicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.LineAwesomeIcons

public val LineAwesomeIcons.MoneyBillAltSolid: ImageVector
    get() {
        if (_moneyBillAltSolid != null) {
            return _moneyBillAltSolid!!
        }
        _moneyBillAltSolid = Builder(name = "MoneyBillAltSolid", defaultWidth = 32.0.dp,
                defaultHeight = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 7.0f)
                lineTo(2.0f, 24.0f)
                lineTo(30.0f, 24.0f)
                lineTo(30.0f, 7.0f)
                lineTo(2.0f, 7.0f)
                close()
                moveTo(6.0f, 9.0f)
                lineTo(26.0f, 9.0f)
                curveTo(26.0f, 10.105f, 26.895f, 11.0f, 28.0f, 11.0f)
                lineTo(28.0f, 20.0f)
                curveTo(26.895f, 20.0f, 26.0f, 20.895f, 26.0f, 22.0f)
                lineTo(6.0f, 22.0f)
                curveTo(6.0f, 20.895f, 5.105f, 20.0f, 4.0f, 20.0f)
                lineTo(4.0f, 11.0f)
                curveTo(5.105f, 11.0f, 6.0f, 10.105f, 6.0f, 9.0f)
                close()
                moveTo(15.0f, 11.0f)
                curveTo(15.0f, 12.439f, 14.439f, 13.0f, 13.0f, 13.0f)
                lineTo(13.0f, 15.0f)
                curveTo(13.7758f, 15.0f, 14.4368f, 14.8488f, 15.0f, 14.5879f)
                lineTo(15.0f, 20.0f)
                lineTo(17.0f, 20.0f)
                lineTo(17.0f, 11.0f)
                lineTo(15.0f, 11.0f)
                close()
                moveTo(8.5f, 14.0f)
                curveTo(7.672f, 14.0f, 7.0f, 14.672f, 7.0f, 15.5f)
                curveTo(7.0f, 16.328f, 7.672f, 17.0f, 8.5f, 17.0f)
                curveTo(9.328f, 17.0f, 10.0f, 16.328f, 10.0f, 15.5f)
                curveTo(10.0f, 14.672f, 9.328f, 14.0f, 8.5f, 14.0f)
                close()
                moveTo(23.5f, 14.0f)
                curveTo(22.672f, 14.0f, 22.0f, 14.672f, 22.0f, 15.5f)
                curveTo(22.0f, 16.328f, 22.672f, 17.0f, 23.5f, 17.0f)
                curveTo(24.328f, 17.0f, 25.0f, 16.328f, 25.0f, 15.5f)
                curveTo(25.0f, 14.672f, 24.328f, 14.0f, 23.5f, 14.0f)
                close()
            }
        }
        .build()
        return _moneyBillAltSolid!!
    }

private var _moneyBillAltSolid: ImageVector? = null
