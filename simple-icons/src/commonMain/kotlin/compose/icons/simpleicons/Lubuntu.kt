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

public val SimpleIcons.Lubuntu: ImageVector
    get() {
        if (_lubuntu != null) {
            return _lubuntu!!
        }
        _lubuntu = Builder(name = "Lubuntu", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveTo(5.373f, 0.0f, 0.001f, 5.374f, 0.001f, 12.001f)
                curveToRelative(0.0f, 0.154f, 0.003f, 0.307f, 0.009f, 0.46f)
                curveToRelative(3.832f, -2.705f, 10.368f, -7.163f, 11.987f, -7.28f)
                curveToRelative(0.537f, -0.68f, 2.37f, -1.22f, 2.704f, -1.209f)
                lineToRelative(-0.957f, 1.198f)
                reflectiveCurveToRelative(-0.03f, 1.224f, -0.388f, 1.462f)
                curveToRelative(3.34f, 2.233f, 4.944f, 10.262f, 5.626f, 15.126f)
                arcTo(11.98f, 11.98f, 0.0f, false, false, 24.0f, 12.001f)
                curveTo(24.0f, 5.374f, 18.629f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(11.407f, 10.842f)
                curveToRelative(-0.899f, 0.027f, -2.743f, 2.712f, -4.825f, 5.588f)
                curveToRelative(-1.001f, 1.382f, -2.035f, 2.823f, -2.988f, 4.134f)
                arcTo(11.96f, 11.96f, 0.0f, false, false, 12.0f, 24.0f)
                curveToRelative(2.347f, 0.0f, 4.537f, -0.672f, 6.386f, -1.837f)
                curveToRelative(-1.423f, -4.35f, -4.128f, -11.299f, -6.897f, -11.315f)
                arcToRelative(0.394f, 0.394f, 0.0f, false, false, -0.082f, -0.006f)
                close()
                moveTo(4.679f, 11.94f)
                curveToRelative(-0.823f, -0.007f, -2.86f, 0.701f, -4.607f, 1.375f)
                curveToRelative(0.178f, 1.632f, 0.681f, 3.166f, 1.447f, 4.535f)
                curveToRelative(0.35f, -0.53f, 0.716f, -1.077f, 1.08f, -1.61f)
                curveToRelative(1.386f, -2.038f, 2.729f, -3.838f, 2.413f, -4.21f)
                curveToRelative(-0.056f, -0.062f, -0.171f, -0.09f, -0.333f, -0.09f)
                close()
                moveTo(6.844f, 12.965f)
                curveToRelative(-0.664f, 0.1f, -3.064f, 3.09f, -4.97f, 5.478f)
                curveToRelative(0.31f, 0.487f, 0.653f, 0.948f, 1.028f, 1.384f)
                curveToRelative(1.96f, -3.21f, 4.153f, -6.707f, 4.035f, -6.851f)
                arcToRelative(0.16f, 0.16f, 0.0f, false, false, -0.093f, -0.011f)
                close()
            }
        }
        .build()
        return _lubuntu!!
    }

private var _lubuntu: ImageVector? = null
