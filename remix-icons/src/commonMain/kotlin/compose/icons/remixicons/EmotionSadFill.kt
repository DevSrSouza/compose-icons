package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.EmotionSadFill: ImageVector
    get() {
        if (_emotionSadFill != null) {
            return _emotionSadFill!!
        }
        _emotionSadFill = Builder(name = "EmotionSadFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveToRelative(5.523f, 0.0f, 10.0f, 4.477f, 10.0f, 10.0f)
                arcToRelative(9.958f, 9.958f, 0.0f, false, true, -1.065f, 4.496f)
                arcToRelative(1.977f, 1.977f, 0.0f, false, false, -0.398f, -0.775f)
                lineToRelative(-0.123f, -0.135f)
                lineTo(19.0f, 14.172f)
                lineToRelative(-1.414f, 1.414f)
                lineToRelative(-0.117f, 0.127f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 1.679f, 3.282f)
                arcTo(9.974f, 9.974f, 0.0f, false, true, 12.0f, 22.0f)
                curveTo(6.477f, 22.0f, 2.0f, 17.523f, 2.0f, 12.0f)
                reflectiveCurveTo(6.477f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(12.0f, 15.0f)
                curveToRelative(-1.38f, 0.0f, -2.63f, 0.56f, -3.534f, 1.463f)
                lineToRelative(-0.166f, 0.174f)
                lineToRelative(0.945f, 0.86f)
                curveTo(10.035f, 17.182f, 10.982f, 17.0f, 12.0f, 17.0f)
                curveToRelative(0.905f, 0.0f, 1.754f, 0.144f, 2.486f, 0.396f)
                lineToRelative(0.269f, 0.1f)
                lineToRelative(0.945f, -0.86f)
                arcTo(4.987f, 4.987f, 0.0f, false, false, 12.0f, 15.0f)
                close()
                moveTo(8.5f, 10.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 0.0f, 3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, -3.0f)
                close()
                moveTo(15.5f, 10.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, false, 0.0f, 3.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, -3.0f)
                close()
            }
        }
        .build()
        return _emotionSadFill!!
    }

private var _emotionSadFill: ImageVector? = null
