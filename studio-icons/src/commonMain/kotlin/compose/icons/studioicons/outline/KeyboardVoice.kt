package compose.icons.studioicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.OutlineGroup

public val OutlineGroup.KeyboardVoice: ImageVector
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
                moveTo(10.8f, 5.9f)
                curveToRelative(0.0f, -0.66f, 0.54f, -1.2f, 1.2f, -1.2f)
                reflectiveCurveToRelative(1.2f, 0.54f, 1.2f, 1.2f)
                lineToRelative(-0.01f, 6.2f)
                curveToRelative(0.0f, 0.66f, -0.53f, 1.2f, -1.19f, 1.2f)
                reflectiveCurveToRelative(-1.2f, -0.54f, -1.2f, -1.2f)
                lineTo(10.8f, 5.9f)
                close()
                moveTo(17.3f, 12.0f)
                curveToRelative(0.0f, 3.0f, -2.54f, 5.1f, -5.3f, 5.1f)
                reflectiveCurveTo(6.7f, 15.0f, 6.7f, 12.0f)
                lineTo(5.0f, 12.0f)
                curveToRelative(0.0f, 3.41f, 2.72f, 6.23f, 6.0f, 6.72f)
                lineTo(11.0f, 22.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-3.28f)
                curveToRelative(3.28f, -0.48f, 6.0f, -3.3f, 6.0f, -6.72f)
                horizontalLineToRelative(-1.7f)
                close()
            }
        }
        .build()
        return _keyboardVoice!!
    }

private var _keyboardVoice: ImageVector? = null
