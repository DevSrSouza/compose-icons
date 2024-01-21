package compose.icons.tablericons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.TablerIcons

public val TablerIcons.BounceRightFilled: ImageVector
    get() {
        if (_bounceRightFilled != null) {
            return _bounceRightFilled!!
        }
        _bounceRightFilled = Builder(name = "BounceRightFilled", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Round, strokeLineJoin = StrokeJoin.Companion.Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.143f, 11.486f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.714f, 1.028f)
                curveToRelative(-1.502f, 2.505f, -2.41f, 4.89f, -2.87f, 7.65f)
                curveToRelative(-0.16f, 0.956f, -1.448f, 1.15f, -1.881f, 0.283f)
                curveToRelative(-2.06f, -4.12f, -3.858f, -4.976f, -6.79f, -3.998f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, -0.632f, -1.898f)
                curveToRelative(3.2f, -1.067f, 5.656f, -0.373f, 7.803f, 2.623f)
                lineToRelative(0.091f, 0.13f)
                lineToRelative(0.011f, -0.04f)
                curveToRelative(0.522f, -1.828f, 1.267f, -3.55f, 2.273f, -5.3f)
                lineToRelative(0.28f, -0.478f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Round, strokeLineJoin = StrokeJoin.Companion.Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.0f, 4.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, false, 0.0f, 6.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 0.0f, -6.0f)
                close()
            }
        }
        .build()
        return _bounceRightFilled!!
    }

private var _bounceRightFilled: ImageVector? = null
