package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Twilio: ImageVector
    get() {
        if (_twilio != null) {
            return _twilio!!
        }
        _twilio = Builder(name = "Twilio", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveTo(5.381f, -0.008f, 0.008f, 5.352f, 0.0f, 11.971f)
                lineTo(0.0f, 12.0f)
                curveToRelative(0.0f, 6.64f, 5.359f, 12.0f, 12.0f, 12.0f)
                curveToRelative(6.64f, 0.0f, 12.0f, -5.36f, 12.0f, -12.0f)
                curveToRelative(0.0f, -6.641f, -5.36f, -12.0f, -12.0f, -12.0f)
                close()
                moveTo(12.0f, 20.801f)
                curveToRelative(-4.846f, 0.015f, -8.786f, -3.904f, -8.801f, -8.75f)
                lineTo(3.199f, 12.0f)
                curveToRelative(-0.014f, -4.846f, 3.904f, -8.786f, 8.75f, -8.801f)
                lineTo(12.0f, 3.199f)
                curveToRelative(4.847f, -0.014f, 8.786f, 3.904f, 8.801f, 8.75f)
                lineTo(20.801f, 12.0f)
                curveToRelative(0.015f, 4.847f, -3.904f, 8.786f, -8.75f, 8.801f)
                lineTo(12.0f, 20.801f)
                close()
                moveTo(17.44f, 9.041f)
                curveToRelative(0.0f, 1.359f, -1.12f, 2.479f, -2.481f, 2.479f)
                curveToRelative(-1.366f, -0.007f, -2.472f, -1.113f, -2.479f, -2.479f)
                curveToRelative(0.0f, -1.361f, 1.12f, -2.481f, 2.479f, -2.481f)
                curveToRelative(1.361f, 0.0f, 2.481f, 1.12f, 2.481f, 2.481f)
                close()
                moveTo(17.44f, 14.96f)
                curveToRelative(0.0f, 1.36f, -1.12f, 2.48f, -2.481f, 2.48f)
                curveToRelative(-1.367f, -0.008f, -2.473f, -1.114f, -2.479f, -2.48f)
                curveToRelative(0.0f, -1.359f, 1.12f, -2.479f, 2.479f, -2.479f)
                curveToRelative(1.361f, -0.001f, 2.481f, 1.12f, 2.481f, 2.479f)
                close()
                moveTo(11.521f, 14.96f)
                curveToRelative(0.0f, 1.36f, -1.12f, 2.48f, -2.479f, 2.48f)
                curveToRelative(-1.368f, -0.007f, -2.475f, -1.113f, -2.481f, -2.48f)
                curveToRelative(0.0f, -1.359f, 1.12f, -2.479f, 2.481f, -2.479f)
                curveToRelative(1.358f, -0.001f, 2.479f, 1.12f, 2.479f, 2.479f)
                close()
                moveTo(11.521f, 9.041f)
                curveToRelative(0.0f, 1.359f, -1.12f, 2.479f, -2.479f, 2.479f)
                curveToRelative(-1.367f, -0.007f, -2.475f, -1.112f, -2.481f, -2.479f)
                curveToRelative(0.0f, -1.361f, 1.12f, -2.481f, 2.481f, -2.481f)
                curveToRelative(1.358f, 0.0f, 2.479f, 1.12f, 2.479f, 2.481f)
                close()
            }
        }
        .build()
        return _twilio!!
    }

private var _twilio: ImageVector? = null
