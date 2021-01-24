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

public val SolidGroup.BalanceScaleRight: ImageVector
    get() {
        if (_balanceScaleRight != null) {
            return _balanceScaleRight!!
        }
        _balanceScaleRight = Builder(name = "BalanceScaleRight", defaultWidth = 640.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(96.0f, 464.0f)
                verticalLineToRelative(32.0f)
                curveToRelative(0.0f, 8.84f, 7.16f, 16.0f, 16.0f, 16.0f)
                horizontalLineToRelative(224.0f)
                curveToRelative(8.84f, 0.0f, 16.0f, -7.16f, 16.0f, -16.0f)
                lineTo(352.0f, 153.25f)
                curveToRelative(4.56f, -2.0f, 8.92f, -4.35f, 12.99f, -7.12f)
                lineToRelative(142.05f, 47.63f)
                curveToRelative(8.38f, 2.81f, 17.45f, -1.71f, 20.26f, -10.08f)
                lineToRelative(10.17f, -30.34f)
                curveToRelative(2.81f, -8.38f, -1.71f, -17.45f, -10.08f, -20.26f)
                lineToRelative(-128.4f, -43.05f)
                curveToRelative(0.42f, -3.32f, 1.01f, -6.6f, 1.01f, -10.03f)
                curveToRelative(0.0f, -44.18f, -35.82f, -80.0f, -80.0f, -80.0f)
                curveToRelative(-29.69f, 0.0f, -55.3f, 16.36f, -69.11f, 40.37f)
                lineTo(132.96f, 0.83f)
                curveToRelative(-8.38f, -2.81f, -17.45f, 1.71f, -20.26f, 10.08f)
                lineToRelative(-10.17f, 30.34f)
                curveToRelative(-2.81f, 8.38f, 1.71f, 17.45f, 10.08f, 20.26f)
                lineToRelative(132.0f, 44.26f)
                curveToRelative(7.28f, 21.25f, 22.96f, 38.54f, 43.38f, 47.47f)
                lineTo(287.99f, 448.0f)
                lineTo(112.0f, 448.0f)
                curveToRelative(-8.84f, 0.0f, -16.0f, 7.16f, -16.0f, 16.0f)
                close()
                moveTo(0.0f, 304.0f)
                curveToRelative(0.0f, 44.18f, 57.31f, 80.0f, 128.0f, 80.0f)
                reflectiveCurveToRelative(128.0f, -35.82f, 128.0f, -80.0f)
                horizontalLineToRelative(-0.02f)
                curveToRelative(0.0f, -15.67f, 2.08f, -7.25f, -85.05f, -181.51f)
                curveToRelative(-17.68f, -35.36f, -68.22f, -35.29f, -85.87f, 0.0f)
                curveTo(-1.32f, 295.27f, 0.02f, 287.82f, 0.02f, 304.0f)
                lineTo(0.0f, 304.0f)
                close()
                moveTo(56.0f, 288.0f)
                lineToRelative(72.0f, -144.0f)
                lineToRelative(72.0f, 144.0f)
                lineTo(56.0f, 288.0f)
                close()
                moveTo(384.02f, 432.0f)
                lineTo(384.0f, 432.0f)
                curveToRelative(0.0f, 44.18f, 57.31f, 80.0f, 128.0f, 80.0f)
                reflectiveCurveToRelative(128.0f, -35.82f, 128.0f, -80.0f)
                horizontalLineToRelative(-0.02f)
                curveToRelative(0.0f, -15.67f, 2.08f, -7.25f, -85.05f, -181.51f)
                curveToRelative(-17.68f, -35.36f, -68.22f, -35.29f, -85.87f, 0.0f)
                curveToRelative(-86.38f, 172.78f, -85.04f, 165.33f, -85.04f, 181.51f)
                close()
                moveTo(440.0f, 416.0f)
                lineToRelative(72.0f, -144.0f)
                lineToRelative(72.0f, 144.0f)
                lineTo(440.0f, 416.0f)
                close()
            }
        }
        .build()
        return _balanceScaleRight!!
    }

private var _balanceScaleRight: ImageVector? = null
