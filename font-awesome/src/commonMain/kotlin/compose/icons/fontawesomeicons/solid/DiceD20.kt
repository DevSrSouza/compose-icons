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

public val SolidGroup.DiceD20: ImageVector
    get() {
        if (_diceD20 != null) {
            return _diceD20!!
        }
        _diceD20 = Builder(name = "DiceD20", defaultWidth = 480.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 480.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(106.75f, 215.06f)
                lineTo(1.2f, 370.95f)
                curveToRelative(-3.08f, 5.0f, 0.1f, 11.5f, 5.93f, 12.14f)
                lineToRelative(208.26f, 22.07f)
                lineToRelative(-108.64f, -190.1f)
                close()
                moveTo(7.41f, 315.43f)
                lineTo(82.7f, 193.08f)
                lineTo(6.06f, 147.1f)
                curveToRelative(-2.67f, -1.6f, -6.06f, 0.32f, -6.06f, 3.43f)
                verticalLineToRelative(162.81f)
                curveToRelative(0.0f, 4.03f, 5.29f, 5.53f, 7.41f, 2.09f)
                close()
                moveTo(18.25f, 423.6f)
                lineToRelative(194.4f, 87.66f)
                curveToRelative(5.3f, 2.45f, 11.35f, -1.43f, 11.35f, -7.26f)
                verticalLineToRelative(-65.67f)
                lineToRelative(-203.55f, -22.3f)
                curveToRelative(-4.45f, -0.5f, -6.23f, 5.59f, -2.2f, 7.57f)
                close()
                moveTo(99.47f, 165.82f)
                lineTo(179.4f, 22.88f)
                curveToRelative(4.34f, -7.06f, -3.59f, -15.25f, -10.78f, -11.14f)
                lineTo(17.81f, 110.35f)
                curveToRelative(-2.47f, 1.62f, -2.39f, 5.26f, 0.13f, 6.78f)
                lineToRelative(81.53f, 48.69f)
                close()
                moveTo(240.0f, 176.0f)
                horizontalLineToRelative(109.21f)
                lineTo(253.63f, 7.62f)
                curveTo(250.5f, 2.54f, 245.25f, 0.0f, 240.0f, 0.0f)
                reflectiveCurveToRelative(-10.5f, 2.54f, -13.63f, 7.62f)
                lineTo(130.79f, 176.0f)
                lineTo(240.0f, 176.0f)
                close()
                moveTo(473.94f, 147.1f)
                lineToRelative(-76.64f, 45.99f)
                lineToRelative(75.29f, 122.35f)
                curveToRelative(2.11f, 3.44f, 7.41f, 1.94f, 7.41f, -2.1f)
                lineTo(480.0f, 150.53f)
                curveToRelative(0.0f, -3.11f, -3.39f, -5.03f, -6.06f, -3.43f)
                close()
                moveTo(380.53f, 165.82f)
                lineToRelative(81.53f, -48.7f)
                curveToRelative(2.53f, -1.52f, 2.6f, -5.16f, 0.13f, -6.78f)
                lineToRelative(-150.81f, -98.6f)
                curveToRelative(-7.19f, -4.11f, -15.12f, 4.08f, -10.78f, 11.14f)
                lineToRelative(79.93f, 142.94f)
                close()
                moveTo(459.55f, 416.03f)
                lineTo(256.0f, 438.32f)
                verticalLineToRelative(65.67f)
                curveToRelative(0.0f, 5.84f, 6.05f, 9.71f, 11.35f, 7.26f)
                lineToRelative(194.4f, -87.66f)
                curveToRelative(4.03f, -1.97f, 2.25f, -8.06f, -2.2f, -7.56f)
                close()
                moveTo(373.25f, 215.06f)
                lineToRelative(-108.63f, 190.1f)
                lineToRelative(208.26f, -22.07f)
                curveToRelative(5.83f, -0.65f, 9.01f, -7.14f, 5.93f, -12.14f)
                lineTo(373.25f, 215.06f)
                close()
                moveTo(240.0f, 208.0f)
                lineTo(139.57f, 208.0f)
                lineTo(240.0f, 383.75f)
                lineTo(340.43f, 208.0f)
                lineTo(240.0f, 208.0f)
                close()
            }
        }
        .build()
        return _diceD20!!
    }

private var _diceD20: ImageVector? = null
