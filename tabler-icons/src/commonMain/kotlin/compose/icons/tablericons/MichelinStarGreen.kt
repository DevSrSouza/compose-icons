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

public val TablerIcons.MichelinStarGreen: ImageVector
    get() {
        if (_michelinStarGreen != null) {
            return _michelinStarGreen!!
        }
        _michelinStarGreen = Builder(name = "MichelinStarGreen", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.432f, 17.949f)
                curveToRelative(0.863f, 1.544f, 2.589f, 1.976f, 4.13f, 1.112f)
                curveToRelative(1.54f, -0.865f, 1.972f, -2.594f, 1.048f, -4.138f)
                curveToRelative(-0.185f, -0.309f, -0.309f, -0.556f, -0.494f, -0.74f)
                curveToRelative(0.247f, 0.06f, 0.555f, 0.06f, 0.925f, 0.06f)
                curveToRelative(1.726f, 0.0f, 2.959f, -1.234f, 2.959f, -2.963f)
                curveToRelative(0.0f, -1.73f, -1.233f, -2.965f, -3.02f, -2.965f)
                curveToRelative(-0.37f, 0.0f, -0.617f, 0.0f, -0.925f, 0.062f)
                curveToRelative(0.185f, -0.185f, 0.308f, -0.432f, 0.493f, -0.74f)
                curveToRelative(0.863f, -1.545f, 0.431f, -3.274f, -1.048f, -4.138f)
                curveToRelative(-1.541f, -0.865f, -3.205f, -0.433f, -4.13f, 1.111f)
                curveToRelative(-0.185f, 0.309f, -0.308f, 0.556f, -0.432f, 0.803f)
                curveToRelative(-0.123f, -0.247f, -0.246f, -0.494f, -0.431f, -0.803f)
                curveToRelative(-0.802f, -1.605f, -2.528f, -2.038f, -4.007f, -1.173f)
                curveToRelative(-1.541f, 0.865f, -1.973f, 2.594f, -1.048f, 4.137f)
                curveToRelative(0.185f, 0.31f, 0.308f, 0.556f, 0.493f, 0.741f)
                curveToRelative(-0.246f, -0.061f, -0.555f, -0.061f, -0.924f, -0.061f)
                curveToRelative(-1.788f, 0.0f, -3.021f, 1.235f, -3.021f, 2.964f)
                curveToRelative(0.0f, 1.729f, 1.233f, 2.964f, 3.02f, 2.964f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.073f, 21.0f)
                curveToRelative(4.286f, -2.756f, 5.9f, -5.254f, 7.927f, -9.0f)
            }
        }
        .build()
        return _michelinStarGreen!!
    }

private var _michelinStarGreen: ImageVector? = null
