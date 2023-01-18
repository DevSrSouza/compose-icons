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

public val RemixIcons.RestTimeFill: ImageVector
    get() {
        if (_restTimeFill != null) {
            return _restTimeFill!!
        }
        _restTimeFill = Builder(name = "RestTimeFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 6.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(8.0f)
                curveToRelative(0.0f, 4.418f, -3.582f, 8.0f, -8.0f, 8.0f)
                reflectiveCurveToRelative(-8.0f, -3.582f, -8.0f, -8.0f)
                curveToRelative(0.0f, -4.335f, 3.58f, -8.0f, 8.0f, -8.0f)
                close()
                moveTo(21.0f, 2.0f)
                verticalLineToRelative(2.0f)
                lineToRelative(-5.327f, 6.0f)
                lineTo(21.0f, 10.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-8.0f)
                verticalLineToRelative(-2.0f)
                lineToRelative(5.326f, -6.0f)
                lineTo(13.0f, 4.0f)
                lineTo(13.0f, 2.0f)
                horizontalLineToRelative(8.0f)
                close()
            }
        }
        .build()
        return _restTimeFill!!
    }

private var _restTimeFill: ImageVector? = null
