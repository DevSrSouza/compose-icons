package compose.icons.studioicons.round

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.RoundGroup

public val RoundGroup.KeyboardVoice: ImageVector
    get() {
        if (_keyboardVoice != null) {
            return _keyboardVoice!!
        }
        _keyboardVoice = Builder(name = "KeyboardVoice", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 15.0f)
                curveToRelative(1.66f, 0.0f, 2.99f, -1.34f, 2.99f, -3.0f)
                lineTo(15.0f, 6.0f)
                curveToRelative(0.0f, -1.66f, -1.34f, -3.0f, -3.0f, -3.0f)
                reflectiveCurveTo(9.0f, 4.34f, 9.0f, 6.0f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 1.66f, 1.34f, 3.0f, 3.0f, 3.0f)
                close()
                moveTo(18.08f, 12.0f)
                curveToRelative(-0.42f, 0.0f, -0.77f, 0.3f, -0.83f, 0.71f)
                curveToRelative(-0.37f, 2.61f, -2.72f, 4.39f, -5.25f, 4.39f)
                reflectiveCurveToRelative(-4.88f, -1.77f, -5.25f, -4.39f)
                curveToRelative(-0.06f, -0.41f, -0.42f, -0.71f, -0.83f, -0.71f)
                curveToRelative(-0.52f, 0.0f, -0.92f, 0.46f, -0.85f, 0.97f)
                curveToRelative(0.46f, 2.97f, 2.96f, 5.3f, 5.93f, 5.75f)
                lineTo(11.0f, 21.0f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.45f, 1.0f, -1.0f)
                verticalLineToRelative(-2.28f)
                curveToRelative(2.96f, -0.43f, 5.47f, -2.78f, 5.93f, -5.75f)
                curveToRelative(0.07f, -0.51f, -0.33f, -0.97f, -0.85f, -0.97f)
                close()
            }
        }
        .build()
        return _keyboardVoice!!
    }

private var _keyboardVoice: ImageVector? = null
