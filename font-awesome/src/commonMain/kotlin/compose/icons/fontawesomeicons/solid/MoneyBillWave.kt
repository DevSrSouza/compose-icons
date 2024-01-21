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

public val SolidGroup.MoneyBillWave: ImageVector
    get() {
        if (_moneyBillWave != null) {
            return _moneyBillWave!!
        }
        _moneyBillWave = Builder(name = "MoneyBillWave", defaultWidth = 576.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 112.5f)
                lineTo(0.0f, 422.3f)
                curveToRelative(0.0f, 18.0f, 10.1f, 35.0f, 27.0f, 41.3f)
                curveToRelative(87.0f, 32.5f, 174.0f, 10.3f, 261.0f, -11.9f)
                curveToRelative(79.8f, -20.3f, 159.6f, -40.7f, 239.3f, -18.9f)
                curveToRelative(23.0f, 6.3f, 48.7f, -9.5f, 48.7f, -33.4f)
                lineTo(576.0f, 89.7f)
                curveToRelative(0.0f, -18.0f, -10.1f, -35.0f, -27.0f, -41.3f)
                curveTo(462.0f, 15.9f, 375.0f, 38.1f, 288.0f, 60.3f)
                curveTo(208.2f, 80.6f, 128.4f, 100.9f, 48.7f, 79.1f)
                curveTo(25.6f, 72.8f, 0.0f, 88.6f, 0.0f, 112.5f)
                close()
                moveTo(288.0f, 352.0f)
                curveToRelative(-44.2f, 0.0f, -80.0f, -43.0f, -80.0f, -96.0f)
                reflectiveCurveToRelative(35.8f, -96.0f, 80.0f, -96.0f)
                reflectiveCurveToRelative(80.0f, 43.0f, 80.0f, 96.0f)
                reflectiveCurveToRelative(-35.8f, 96.0f, -80.0f, 96.0f)
                close()
                moveTo(64.0f, 352.0f)
                curveToRelative(35.3f, 0.0f, 64.0f, 28.7f, 64.0f, 64.0f)
                lineTo(64.0f, 416.0f)
                lineTo(64.0f, 352.0f)
                close()
                moveTo(128.0f, 144.0f)
                curveToRelative(0.0f, 35.3f, -28.7f, 64.0f, -64.0f, 64.0f)
                lineTo(64.0f, 144.0f)
                horizontalLineToRelative(64.0f)
                close()
                moveTo(512.0f, 304.0f)
                verticalLineToRelative(64.0f)
                lineTo(448.0f, 368.0f)
                curveToRelative(0.0f, -35.3f, 28.7f, -64.0f, 64.0f, -64.0f)
                close()
                moveTo(448.0f, 96.0f)
                horizontalLineToRelative(64.0f)
                verticalLineToRelative(64.0f)
                curveToRelative(-35.3f, 0.0f, -64.0f, -28.7f, -64.0f, -64.0f)
                close()
            }
        }
        .build()
        return _moneyBillWave!!
    }

private var _moneyBillWave: ImageVector? = null
