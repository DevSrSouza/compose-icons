package compose.icons.tablericons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.TablerIcons

public val TablerIcons.CherryFilled: ImageVector
    get() {
        if (_cherryFilled != null) {
            return _cherryFilled!!
        }
        _cherryFilled = Builder(name = "CherryFilled", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Round, strokeLineJoin = StrokeJoin.Companion.Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.588f, 5.191f)
                lineToRelative(0.058f, 0.045f)
                lineToRelative(0.078f, 0.074f)
                lineToRelative(0.072f, 0.084f)
                lineToRelative(0.013f, 0.018f)
                arcToRelative(0.998f, 0.998f, 0.0f, false, true, 0.182f, 0.727f)
                lineToRelative(-0.022f, 0.111f)
                lineToRelative(-0.03f, 0.092f)
                curveToRelative(-0.99f, 2.725f, -0.666f, 5.158f, 0.679f, 7.706f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, -4.613f, 4.152f)
                lineToRelative(-0.005f, -0.2f)
                lineToRelative(0.005f, -0.2f)
                arcToRelative(4.002f, 4.002f, 0.0f, false, true, 2.5f, -3.511f)
                curveToRelative(-0.947f, -2.03f, -1.342f, -4.065f, -1.052f, -6.207f)
                curveToRelative(-0.166f, 0.077f, -0.332f, 0.15f, -0.499f, 0.218f)
                lineToRelative(0.094f, -0.064f)
                curveToRelative(-2.243f, 1.47f, -3.552f, 3.004f, -3.98f, 4.57f)
                arcToRelative(4.5f, 4.5f, 0.0f, true, true, -7.064f, 3.906f)
                lineToRelative(-0.004f, -0.212f)
                lineToRelative(0.005f, -0.212f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, true, 5.2f, -4.233f)
                curveToRelative(0.332f, -1.073f, 0.945f, -2.096f, 1.83f, -3.069f)
                curveToRelative(-1.794f, -0.096f, -3.586f, -0.759f, -5.355f, -1.986f)
                lineToRelative(-0.268f, -0.19f)
                lineToRelative(-0.051f, -0.04f)
                lineToRelative(-0.046f, -0.04f)
                lineToRelative(-0.044f, -0.044f)
                lineToRelative(-0.04f, -0.046f)
                lineToRelative(-0.04f, -0.05f)
                lineToRelative(-0.032f, -0.047f)
                lineToRelative(-0.035f, -0.06f)
                lineToRelative(-0.053f, -0.11f)
                lineToRelative(-0.038f, -0.116f)
                lineToRelative(-0.023f, -0.117f)
                lineToRelative(-0.005f, -0.042f)
                lineToRelative(-0.005f, -0.118f)
                lineToRelative(0.01f, -0.118f)
                lineToRelative(0.023f, -0.117f)
                lineToRelative(0.038f, -0.115f)
                lineToRelative(0.03f, -0.066f)
                lineToRelative(0.023f, -0.045f)
                lineToRelative(0.035f, -0.06f)
                lineToRelative(0.032f, -0.046f)
                lineToRelative(0.04f, -0.051f)
                lineToRelative(0.04f, -0.046f)
                lineToRelative(0.044f, -0.044f)
                lineToRelative(0.046f, -0.04f)
                lineToRelative(0.05f, -0.04f)
                curveToRelative(4.018f, -2.922f, 8.16f, -2.922f, 12.177f, 0.0f)
                close()
            }
        }
        .build()
        return _cherryFilled!!
    }

private var _cherryFilled: ImageVector? = null
