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

public val RoundGroup.RampLeft: ImageVector
    get() {
        if (_rampLeft != null) {
            return _rampLeft!!
        }
        _rampLeft = Builder(name = "RampLeft", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 21.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f)
                verticalLineTo(6.83f)
                lineToRelative(-0.88f, 0.88f)
                curveTo(9.73f, 8.1f, 9.1f, 8.1f, 8.71f, 7.71f)
                curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0.0f, -1.41f)
                lineToRelative(2.59f, -2.59f)
                curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0.0f)
                lineToRelative(2.59f, 2.59f)
                curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0.0f, 1.41f)
                curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0.0f)
                lineTo(13.0f, 6.83f)
                verticalLineToRelative(0.0f)
                verticalLineTo(9.0f)
                curveToRelative(0.0f, 3.62f, 2.89f, 6.22f, 4.97f, 7.62f)
                curveToRelative(0.52f, 0.35f, 0.59f, 1.09f, 0.14f, 1.53f)
                curveToRelative(-0.33f, 0.33f, -0.87f, 0.4f, -1.26f, 0.13f)
                curveToRelative(-1.59f, -1.06f, -2.89f, -2.28f, -3.85f, -3.59f)
                lineToRelative(0.0f, 5.3f)
                curveTo(13.0f, 20.55f, 12.55f, 21.0f, 12.0f, 21.0f)
                close()
            }
        }
        .build()
        return _rampLeft!!
    }

private var _rampLeft: ImageVector? = null
