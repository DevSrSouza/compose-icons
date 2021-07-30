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

public val SolidGroup.Adjust: ImageVector
    get() {
        if (_adjust != null) {
            return _adjust!!
        }
        _adjust = Builder(name = "Adjust", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 256.0f)
                curveToRelative(0.0f, 136.966f, 111.033f, 248.0f, 248.0f, 248.0f)
                reflectiveCurveToRelative(248.0f, -111.034f, 248.0f, -248.0f)
                reflectiveCurveTo(392.966f, 8.0f, 256.0f, 8.0f)
                reflectiveCurveTo(8.0f, 119.033f, 8.0f, 256.0f)
                close()
                moveTo(256.0f, 440.0f)
                lineTo(256.0f, 72.0f)
                curveToRelative(101.705f, 0.0f, 184.0f, 82.311f, 184.0f, 184.0f)
                curveToRelative(0.0f, 101.705f, -82.311f, 184.0f, -184.0f, 184.0f)
                close()
            }
        }
        .build()
        return _adjust!!
    }

private var _adjust: ImageVector? = null
