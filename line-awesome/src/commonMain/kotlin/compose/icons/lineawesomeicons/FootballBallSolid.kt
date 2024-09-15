package compose.icons.lineawesomeicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.LineAwesomeIcons

public val LineAwesomeIcons.FootballBallSolid: ImageVector
    get() {
        if (_footballBallSolid != null) {
            return _footballBallSolid!!
        }
        _footballBallSolid = Builder(name = "FootballBallSolid", defaultWidth = 32.0.dp,
                defaultHeight = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.031f, 4.0f)
                curveTo(20.293f, 4.016f, 19.516f, 4.086f, 18.719f, 4.219f)
                curveTo(15.531f, 4.75f, 11.961f, 6.281f, 9.094f, 9.094f)
                curveTo(6.277f, 11.965f, 4.75f, 15.551f, 4.219f, 18.75f)
                curveTo(3.688f, 21.949f, 3.996f, 24.809f, 5.594f, 26.406f)
                curveTo(7.184f, 27.996f, 10.047f, 28.332f, 13.25f, 27.813f)
                curveTo(16.453f, 27.293f, 20.035f, 25.777f, 22.906f, 22.906f)
                curveTo(25.727f, 20.086f, 27.25f, 16.516f, 27.781f, 13.313f)
                curveTo(28.313f, 10.109f, 28.008f, 7.23f, 26.438f, 5.594f)
                lineTo(26.406f, 5.594f)
                lineTo(26.406f, 5.563f)
                curveTo(25.59f, 4.781f, 24.441f, 4.336f, 23.125f, 4.125f)
                curveTo(22.465f, 4.02f, 21.77f, 3.984f, 21.031f, 4.0f)
                close()
                moveTo(21.031f, 6.031f)
                curveTo(21.664f, 6.031f, 22.258f, 6.07f, 22.781f, 6.156f)
                curveTo(23.809f, 6.328f, 24.578f, 6.641f, 24.969f, 7.0f)
                curveTo(24.977f, 7.008f, 24.992f, 7.023f, 25.0f, 7.031f)
                curveTo(25.723f, 7.816f, 26.277f, 10.199f, 25.813f, 13.0f)
                curveTo(25.344f, 15.824f, 23.98f, 19.02f, 21.5f, 21.5f)
                curveTo(18.969f, 24.031f, 15.758f, 25.387f, 12.938f, 25.844f)
                curveTo(10.117f, 26.301f, 7.711f, 25.711f, 7.0f, 25.0f)
                curveTo(6.297f, 24.297f, 5.719f, 21.887f, 6.188f, 19.063f)
                curveTo(6.656f, 16.238f, 8.016f, 13.031f, 10.5f, 10.5f)
                curveTo(13.031f, 8.016f, 16.219f, 6.656f, 19.031f, 6.188f)
                curveTo(19.734f, 6.07f, 20.398f, 6.031f, 21.031f, 6.031f)
                close()
                moveTo(21.281f, 9.281f)
                lineTo(19.0f, 11.563f)
                lineTo(17.219f, 9.781f)
                lineTo(15.781f, 11.219f)
                lineTo(17.563f, 13.0f)
                lineTo(16.0f, 14.563f)
                lineTo(14.219f, 12.781f)
                lineTo(12.781f, 14.219f)
                lineTo(14.563f, 16.0f)
                lineTo(13.0f, 17.563f)
                lineTo(11.219f, 15.781f)
                lineTo(9.781f, 17.219f)
                lineTo(11.563f, 19.0f)
                lineTo(9.281f, 21.281f)
                lineTo(10.719f, 22.719f)
                lineTo(13.0f, 20.438f)
                lineTo(14.781f, 22.219f)
                lineTo(16.219f, 20.781f)
                lineTo(14.438f, 19.0f)
                lineTo(16.0f, 17.438f)
                lineTo(17.781f, 19.219f)
                lineTo(19.219f, 17.781f)
                lineTo(17.438f, 16.0f)
                lineTo(19.0f, 14.438f)
                lineTo(20.781f, 16.219f)
                lineTo(22.219f, 14.781f)
                lineTo(20.438f, 13.0f)
                lineTo(22.719f, 10.719f)
                close()
            }
        }
        .build()
        return _footballBallSolid!!
    }

private var _footballBallSolid: ImageVector? = null
