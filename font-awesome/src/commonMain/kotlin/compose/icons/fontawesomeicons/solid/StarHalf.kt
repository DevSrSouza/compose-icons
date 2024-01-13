package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.StarHalf: ImageVector
    get() {
        if (_starHalf != null) {
            return _starHalf!!
        }
        _starHalf = Builder(name = "StarHalf", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(288.0f, 0.0f)
                curveToRelative(-12.2f, 0.1f, -23.3f, 7.0f, -28.6f, 18.0f)
                lineTo(195.0f, 150.3f)
                lineTo(51.4f, 171.5f)
                curveToRelative(-12.0f, 1.8f, -22.0f, 10.2f, -25.7f, 21.7f)
                reflectiveCurveToRelative(-0.7f, 24.2f, 7.9f, 32.7f)
                lineTo(137.8f, 329.0f)
                lineTo(113.2f, 474.7f)
                curveToRelative(-2.0f, 12.0f, 3.0f, 24.2f, 12.9f, 31.3f)
                reflectiveCurveToRelative(23.0f, 8.0f, 33.8f, 2.3f)
                lineTo(288.0f, 439.8f)
                verticalLineTo(0.0f)
                close()
                moveTo(429.9f, 512.0f)
                curveToRelative(1.1f, 0.1f, 2.1f, 0.1f, 3.2f, 0.0f)
                horizontalLineToRelative(-3.2f)
                close()
            }
        }
        .build()
        return _starHalf!!
    }

private var _starHalf: ImageVector? = null
