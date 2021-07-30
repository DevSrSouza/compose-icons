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

public val SolidGroup.BalanceScaleLeft: ImageVector
    get() {
        if (_balanceScaleLeft != null) {
            return _balanceScaleLeft!!
        }
        _balanceScaleLeft = Builder(name = "BalanceScaleLeft", defaultWidth = 640.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(528.0f, 448.0f)
                lineTo(352.0f, 448.0f)
                lineTo(352.0f, 153.25f)
                curveToRelative(20.42f, -8.94f, 36.1f, -26.22f, 43.38f, -47.47f)
                lineToRelative(132.0f, -44.26f)
                curveToRelative(8.38f, -2.81f, 12.89f, -11.88f, 10.08f, -20.26f)
                lineToRelative(-10.17f, -30.34f)
                curveTo(524.48f, 2.54f, 515.41f, -1.97f, 507.03f, 0.84f)
                lineTo(389.11f, 40.37f)
                curveTo(375.3f, 16.36f, 349.69f, 0.0f, 320.0f, 0.0f)
                curveToRelative(-44.18f, 0.0f, -80.0f, 35.82f, -80.0f, 80.0f)
                curveToRelative(0.0f, 3.43f, 0.59f, 6.71f, 1.01f, 10.03f)
                lineToRelative(-128.39f, 43.05f)
                curveToRelative(-8.38f, 2.81f, -12.89f, 11.88f, -10.08f, 20.26f)
                lineToRelative(10.17f, 30.34f)
                curveToRelative(2.81f, 8.38f, 11.88f, 12.89f, 20.26f, 10.08f)
                lineToRelative(142.05f, -47.63f)
                curveToRelative(4.07f, 2.77f, 8.43f, 5.12f, 12.99f, 7.12f)
                lineTo(288.01f, 496.0f)
                curveToRelative(0.0f, 8.84f, 7.16f, 16.0f, 16.0f, 16.0f)
                horizontalLineToRelative(224.0f)
                curveToRelative(8.84f, 0.0f, 16.0f, -7.16f, 16.0f, -16.0f)
                verticalLineToRelative(-32.0f)
                curveToRelative(-0.01f, -8.84f, -7.17f, -16.0f, -16.01f, -16.0f)
                close()
                moveTo(639.98f, 304.0f)
                curveToRelative(0.0f, -16.18f, 1.34f, -8.73f, -85.05f, -181.51f)
                curveToRelative(-17.65f, -35.29f, -68.19f, -35.36f, -85.87f, 0.0f)
                curveToRelative(-87.12f, 174.26f, -85.04f, 165.84f, -85.04f, 181.51f)
                lineTo(384.0f, 304.0f)
                curveToRelative(0.0f, 44.18f, 57.31f, 80.0f, 128.0f, 80.0f)
                reflectiveCurveToRelative(128.0f, -35.82f, 128.0f, -80.0f)
                horizontalLineToRelative(-0.02f)
                close()
                moveTo(440.0f, 288.0f)
                lineToRelative(72.0f, -144.0f)
                lineToRelative(72.0f, 144.0f)
                lineTo(440.0f, 288.0f)
                close()
                moveTo(170.93f, 250.49f)
                curveToRelative(-17.65f, -35.29f, -68.19f, -35.36f, -85.87f, 0.0f)
                curveTo(-2.06f, 424.75f, 0.02f, 416.33f, 0.02f, 432.0f)
                lineTo(0.0f, 432.0f)
                curveToRelative(0.0f, 44.18f, 57.31f, 80.0f, 128.0f, 80.0f)
                reflectiveCurveToRelative(128.0f, -35.82f, 128.0f, -80.0f)
                horizontalLineToRelative(-0.02f)
                curveToRelative(0.0f, -16.18f, 1.34f, -8.73f, -85.05f, -181.51f)
                close()
                moveTo(56.0f, 416.0f)
                lineToRelative(72.0f, -144.0f)
                lineToRelative(72.0f, 144.0f)
                lineTo(56.0f, 416.0f)
                close()
            }
        }
        .build()
        return _balanceScaleLeft!!
    }

private var _balanceScaleLeft: ImageVector? = null
