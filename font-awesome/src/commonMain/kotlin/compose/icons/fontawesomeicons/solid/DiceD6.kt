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

public val SolidGroup.DiceD6: ImageVector
    get() {
        if (_diceD6 != null) {
            return _diceD6!!
        }
        _diceD6 = Builder(name = "DiceD6", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(422.19f, 109.95f)
                lineTo(256.21f, 9.07f)
                curveToRelative(-19.91f, -12.1f, -44.52f, -12.1f, -64.43f, 0.0f)
                lineTo(25.81f, 109.95f)
                curveToRelative(-5.32f, 3.23f, -5.29f, 11.27f, 0.06f, 14.46f)
                lineTo(224.0f, 242.55f)
                lineToRelative(198.14f, -118.14f)
                curveToRelative(5.35f, -3.19f, 5.38f, -11.22f, 0.05f, -14.46f)
                close()
                moveTo(436.03f, 154.58f)
                lineTo(240.0f, 271.46f)
                verticalLineToRelative(223.82f)
                curveToRelative(0.0f, 12.88f, 13.39f, 20.91f, 24.05f, 14.43f)
                lineToRelative(152.16f, -92.48f)
                curveToRelative(19.68f, -11.96f, 31.79f, -33.94f, 31.79f, -57.7f)
                verticalLineToRelative(-197.7f)
                curveToRelative(0.0f, -6.41f, -6.64f, -10.43f, -11.97f, -7.25f)
                close()
                moveTo(0.0f, 161.83f)
                verticalLineToRelative(197.7f)
                curveToRelative(0.0f, 23.77f, 12.11f, 45.74f, 31.79f, 57.7f)
                lineToRelative(152.16f, 92.47f)
                curveToRelative(10.67f, 6.48f, 24.05f, -1.54f, 24.05f, -14.43f)
                lineTo(208.0f, 271.46f)
                lineTo(11.97f, 154.58f)
                curveTo(6.64f, 151.4f, 0.0f, 155.42f, 0.0f, 161.83f)
                close()
            }
        }
        .build()
        return _diceD6!!
    }

private var _diceD6: ImageVector? = null
