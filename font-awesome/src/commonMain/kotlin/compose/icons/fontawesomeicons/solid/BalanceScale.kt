package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.BalanceScale: ImageVector
    get() {
        if (_balanceScale != null) {
            return _balanceScale!!
        }
        _balanceScale = Builder(name = "BalanceScale", defaultWidth = 640.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 336.0f)
                horizontalLineToRelative(-0.02f)
                curveToRelative(0.0f, -16.18f, 1.34f, -8.73f, -85.05f, -181.51f)
                curveToRelative(-17.65f, -35.29f, -68.19f, -35.36f, -85.87f, 0.0f)
                curveTo(-2.06f, 328.75f, 0.02f, 320.33f, 0.02f, 336.0f)
                lineTo(0.0f, 336.0f)
                curveToRelative(0.0f, 44.18f, 57.31f, 80.0f, 128.0f, 80.0f)
                reflectiveCurveToRelative(128.0f, -35.82f, 128.0f, -80.0f)
                close()
                moveTo(128.0f, 176.0f)
                lineToRelative(72.0f, 144.0f)
                lineTo(56.0f, 320.0f)
                lineToRelative(72.0f, -144.0f)
                close()
                moveTo(639.98f, 336.0f)
                curveToRelative(0.0f, -16.18f, 1.34f, -8.73f, -85.05f, -181.51f)
                curveToRelative(-17.65f, -35.29f, -68.19f, -35.36f, -85.87f, 0.0f)
                curveToRelative(-87.12f, 174.26f, -85.04f, 165.84f, -85.04f, 181.51f)
                lineTo(384.0f, 336.0f)
                curveToRelative(0.0f, 44.18f, 57.31f, 80.0f, 128.0f, 80.0f)
                reflectiveCurveToRelative(128.0f, -35.82f, 128.0f, -80.0f)
                horizontalLineToRelative(-0.02f)
                close()
                moveTo(440.0f, 320.0f)
                lineToRelative(72.0f, -144.0f)
                lineToRelative(72.0f, 144.0f)
                lineTo(440.0f, 320.0f)
                close()
                moveTo(528.0f, 448.0f)
                lineTo(352.0f, 448.0f)
                lineTo(352.0f, 153.25f)
                curveToRelative(23.51f, -10.29f, 41.16f, -31.48f, 46.39f, -57.25f)
                lineTo(528.0f, 96.0f)
                curveToRelative(8.84f, 0.0f, 16.0f, -7.16f, 16.0f, -16.0f)
                lineTo(544.0f, 48.0f)
                curveToRelative(0.0f, -8.84f, -7.16f, -16.0f, -16.0f, -16.0f)
                lineTo(383.64f, 32.0f)
                curveTo(369.04f, 12.68f, 346.09f, 0.0f, 320.0f, 0.0f)
                reflectiveCurveToRelative(-49.04f, 12.68f, -63.64f, 32.0f)
                lineTo(112.0f, 32.0f)
                curveToRelative(-8.84f, 0.0f, -16.0f, 7.16f, -16.0f, 16.0f)
                verticalLineToRelative(32.0f)
                curveToRelative(0.0f, 8.84f, 7.16f, 16.0f, 16.0f, 16.0f)
                horizontalLineToRelative(129.61f)
                curveToRelative(5.23f, 25.76f, 22.87f, 46.96f, 46.39f, 57.25f)
                lineTo(288.0f, 448.0f)
                lineTo(112.0f, 448.0f)
                curveToRelative(-8.84f, 0.0f, -16.0f, 7.16f, -16.0f, 16.0f)
                verticalLineToRelative(32.0f)
                curveToRelative(0.0f, 8.84f, 7.16f, 16.0f, 16.0f, 16.0f)
                horizontalLineToRelative(416.0f)
                curveToRelative(8.84f, 0.0f, 16.0f, -7.16f, 16.0f, -16.0f)
                verticalLineToRelative(-32.0f)
                curveToRelative(0.0f, -8.84f, -7.16f, -16.0f, -16.0f, -16.0f)
                close()
            }
        }
        .build()
        return _balanceScale!!
    }

private var _balanceScale: ImageVector? = null
