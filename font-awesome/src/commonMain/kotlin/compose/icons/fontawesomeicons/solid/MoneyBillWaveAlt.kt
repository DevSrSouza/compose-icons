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

public val SolidGroup.MoneyBillWaveAlt: ImageVector
    get() {
        if (_moneyBillWaveAlt != null) {
            return _moneyBillWaveAlt!!
        }
        _moneyBillWaveAlt = Builder(name = "MoneyBillWaveAlt", defaultWidth = 640.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(621.16f, 54.46f)
                curveTo(582.37f, 38.19f, 543.55f, 32.0f, 504.75f, 32.0f)
                curveToRelative(-123.17f, -0.01f, -246.33f, 62.34f, -369.5f, 62.34f)
                curveToRelative(-30.89f, 0.0f, -61.76f, -3.92f, -92.65f, -13.72f)
                curveToRelative(-3.47f, -1.1f, -6.95f, -1.62f, -10.35f, -1.62f)
                curveTo(15.04f, 79.0f, 0.0f, 92.32f, 0.0f, 110.81f)
                verticalLineToRelative(317.26f)
                curveToRelative(0.0f, 12.63f, 7.23f, 24.6f, 18.84f, 29.46f)
                curveTo(57.63f, 473.81f, 96.45f, 480.0f, 135.25f, 480.0f)
                curveToRelative(123.17f, 0.0f, 246.34f, -62.35f, 369.51f, -62.35f)
                curveToRelative(30.89f, 0.0f, 61.76f, 3.92f, 92.65f, 13.72f)
                curveToRelative(3.47f, 1.1f, 6.95f, 1.62f, 10.35f, 1.62f)
                curveToRelative(17.21f, 0.0f, 32.25f, -13.32f, 32.25f, -31.81f)
                verticalLineTo(83.93f)
                curveToRelative(-0.01f, -12.64f, -7.24f, -24.6f, -18.85f, -29.47f)
                close()
                moveTo(320.0f, 352.0f)
                curveToRelative(-44.19f, 0.0f, -80.0f, -42.99f, -80.0f, -96.0f)
                curveToRelative(0.0f, -53.02f, 35.82f, -96.0f, 80.0f, -96.0f)
                reflectiveCurveToRelative(80.0f, 42.98f, 80.0f, 96.0f)
                curveToRelative(0.0f, 53.03f, -35.83f, 96.0f, -80.0f, 96.0f)
                close()
            }
        }
        .build()
        return _moneyBillWaveAlt!!
    }

private var _moneyBillWaveAlt: ImageVector? = null
