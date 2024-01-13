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

public val SolidGroup.MoneyBills: ImageVector
    get() {
        if (_moneyBills != null) {
            return _moneyBills!!
        }
        _moneyBills = Builder(name = "MoneyBills", defaultWidth = 640.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(96.0f, 96.0f)
                lineTo(96.0f, 320.0f)
                curveToRelative(0.0f, 35.3f, 28.7f, 64.0f, 64.0f, 64.0f)
                lineTo(576.0f, 384.0f)
                curveToRelative(35.3f, 0.0f, 64.0f, -28.7f, 64.0f, -64.0f)
                lineTo(640.0f, 96.0f)
                curveToRelative(0.0f, -35.3f, -28.7f, -64.0f, -64.0f, -64.0f)
                lineTo(160.0f, 32.0f)
                curveToRelative(-35.3f, 0.0f, -64.0f, 28.7f, -64.0f, 64.0f)
                close()
                moveTo(160.0f, 256.0f)
                curveToRelative(35.3f, 0.0f, 64.0f, 28.7f, 64.0f, 64.0f)
                lineTo(160.0f, 320.0f)
                lineTo(160.0f, 256.0f)
                close()
                moveTo(224.0f, 96.0f)
                curveToRelative(0.0f, 35.3f, -28.7f, 64.0f, -64.0f, 64.0f)
                lineTo(160.0f, 96.0f)
                horizontalLineToRelative(64.0f)
                close()
                moveTo(576.0f, 256.0f)
                verticalLineToRelative(64.0f)
                lineTo(512.0f, 320.0f)
                curveToRelative(0.0f, -35.3f, 28.7f, -64.0f, 64.0f, -64.0f)
                close()
                moveTo(512.0f, 96.0f)
                horizontalLineToRelative(64.0f)
                verticalLineToRelative(64.0f)
                curveToRelative(-35.3f, 0.0f, -64.0f, -28.7f, -64.0f, -64.0f)
                close()
                moveTo(288.0f, 208.0f)
                arcToRelative(80.0f, 80.0f, 0.0f, true, true, 160.0f, 0.0f)
                arcToRelative(80.0f, 80.0f, 0.0f, true, true, -160.0f, 0.0f)
                close()
                moveTo(48.0f, 120.0f)
                curveToRelative(0.0f, -13.3f, -10.7f, -24.0f, -24.0f, -24.0f)
                reflectiveCurveTo(0.0f, 106.7f, 0.0f, 120.0f)
                lineTo(0.0f, 360.0f)
                curveToRelative(0.0f, 66.3f, 53.7f, 120.0f, 120.0f, 120.0f)
                lineTo(520.0f, 480.0f)
                curveToRelative(13.3f, 0.0f, 24.0f, -10.7f, 24.0f, -24.0f)
                reflectiveCurveToRelative(-10.7f, -24.0f, -24.0f, -24.0f)
                lineTo(120.0f, 432.0f)
                curveToRelative(-39.8f, 0.0f, -72.0f, -32.2f, -72.0f, -72.0f)
                lineTo(48.0f, 120.0f)
                close()
            }
        }
        .build()
        return _moneyBills!!
    }

private var _moneyBills: ImageVector? = null
