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

public val RoundGroup.ArrowForwardIos: ImageVector
    get() {
        if (_arrowForwardIos != null) {
            return _arrowForwardIos!!
        }
        _arrowForwardIos = Builder(name = "ArrowForwardIos", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.38f, 21.01f)
                curveToRelative(0.49f, 0.49f, 1.28f, 0.49f, 1.77f, 0.0f)
                lineToRelative(8.31f, -8.31f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f)
                lineTo(9.15f, 2.98f)
                curveToRelative(-0.49f, -0.49f, -1.28f, -0.49f, -1.77f, 0.0f)
                reflectiveCurveToRelative(-0.49f, 1.28f, 0.0f, 1.77f)
                lineTo(14.62f, 12.0f)
                lineToRelative(-7.25f, 7.25f)
                curveToRelative(-0.48f, 0.48f, -0.48f, 1.28f, 0.01f, 1.76f)
                close()
            }
        }
        .build()
        return _arrowForwardIos!!
    }

private var _arrowForwardIos: ImageVector? = null
