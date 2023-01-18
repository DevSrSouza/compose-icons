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

public val RemixIcons.EmotionLaughLine: ImageVector
    get() {
        if (_emotionLaughLine != null) {
            return _emotionLaughLine!!
        }
        _emotionLaughLine = Builder(name = "EmotionLaughLine", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveToRelative(5.523f, 0.0f, 10.0f, 4.477f, 10.0f, 10.0f)
                reflectiveCurveToRelative(-4.477f, 10.0f, -10.0f, 10.0f)
                reflectiveCurveTo(2.0f, 17.523f, 2.0f, 12.0f)
                reflectiveCurveTo(6.477f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(12.0f, 4.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 0.0f, 16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                close()
                moveTo(12.0f, 11.0f)
                curveToRelative(2.0f, 0.0f, 3.667f, 0.333f, 5.0f, 1.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, -10.0f, 0.0f)
                curveToRelative(1.333f, -0.667f, 3.0f, -1.0f, 5.0f, -1.0f)
                close()
                moveTo(8.5f, 7.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 2.45f, 2.0f)
                horizontalLineToRelative(-4.9f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 8.5f, 7.0f)
                close()
                moveTo(15.5f, 7.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 2.45f, 2.0f)
                horizontalLineToRelative(-4.9f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 2.45f, -2.0f)
                close()
            }
        }
        .build()
        return _emotionLaughLine!!
    }

private var _emotionLaughLine: ImageVector? = null