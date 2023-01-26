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

public val RoundGroup.Beenhere: ImageVector
    get() {
        if (_beenhere != null) {
            return _beenhere!!
        }
        _beenhere = Builder(name = "Beenhere", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 1.0f)
                lineTo(5.0f, 1.0f)
                curveToRelative(-1.1f, 0.0f, -1.99f, 0.9f, -1.99f, 2.0f)
                lineTo(3.0f, 15.93f)
                curveToRelative(0.0f, 0.69f, 0.35f, 1.3f, 0.88f, 1.66f)
                lineToRelative(7.57f, 5.04f)
                curveToRelative(0.34f, 0.22f, 0.77f, 0.22f, 1.11f, 0.0f)
                lineToRelative(7.56f, -5.04f)
                curveToRelative(0.53f, -0.36f, 0.88f, -0.97f, 0.88f, -1.66f)
                lineTo(21.0f, 3.0f)
                curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f)
                close()
                moveTo(18.3f, 7.7f)
                lineToRelative(-7.59f, 7.59f)
                curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0.0f)
                lineTo(5.71f, 11.7f)
                curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0.0f, -1.41f)
                reflectiveCurveToRelative(1.02f, -0.39f, 1.41f, 0.0f)
                lineTo(10.0f, 13.17f)
                lineToRelative(6.88f, -6.88f)
                curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0.0f)
                reflectiveCurveToRelative(0.4f, 1.02f, 0.01f, 1.41f)
                close()
            }
        }
        .build()
        return _beenhere!!
    }

private var _beenhere: ImageVector? = null
