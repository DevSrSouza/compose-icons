package compose.icons.fontawesomeicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.RegularGroup

public val RegularGroup.HandPaper: ImageVector
    get() {
        if (_handPaper != null) {
            return _handPaper!!
        }
        _handPaper = Builder(name = "HandPaper", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(372.57f, 112.64f)
                verticalLineToRelative(-10.82f)
                curveToRelative(0.0f, -43.61f, -40.52f, -76.69f, -83.04f, -65.55f)
                curveToRelative(-25.63f, -49.5f, -94.09f, -47.45f, -117.98f, 0.75f)
                curveTo(130.27f, 26.46f, 89.14f, 57.94f, 89.14f, 102.0f)
                verticalLineToRelative(126.13f)
                curveToRelative(-19.95f, -7.43f, -43.31f, -5.07f, -62.08f, 8.87f)
                curveToRelative(-29.35f, 21.8f, -35.79f, 63.33f, -14.55f, 93.15f)
                lineTo(132.48f, 498.57f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, 26.06f, 13.43f)
                horizontalLineToRelative(222.9f)
                curveToRelative(14.9f, 0.0f, 27.83f, -10.29f, 31.18f, -24.81f)
                lineToRelative(30.18f, -130.96f)
                arcTo(203.64f, 203.64f, 0.0f, false, false, 448.0f, 310.56f)
                lineTo(448.0f, 179.0f)
                curveToRelative(0.0f, -40.62f, -35.52f, -71.99f, -75.43f, -66.36f)
                close()
                moveTo(400.0f, 310.56f)
                curveToRelative(0.0f, 11.73f, -1.33f, 23.47f, -3.96f, 34.89f)
                lineTo(368.71f, 464.0f)
                horizontalLineToRelative(-201.92f)
                lineTo(51.59f, 302.3f)
                curveToRelative(-14.44f, -20.27f, 15.02f, -42.78f, 29.39f, -22.6f)
                lineToRelative(27.13f, 38.08f)
                curveToRelative(8.99f, 12.63f, 29.03f, 6.29f, 29.03f, -9.28f)
                lineTo(137.14f, 102.0f)
                curveToRelative(0.0f, -25.65f, 36.57f, -24.81f, 36.57f, 0.69f)
                lineTo(173.71f, 256.0f)
                curveToRelative(0.0f, 8.84f, 7.16f, 16.0f, 16.0f, 16.0f)
                horizontalLineToRelative(6.86f)
                curveToRelative(8.84f, 0.0f, 16.0f, -7.16f, 16.0f, -16.0f)
                lineTo(212.57f, 67.0f)
                curveToRelative(0.0f, -25.66f, 36.57f, -24.81f, 36.57f, 0.69f)
                lineTo(249.14f, 256.0f)
                curveToRelative(0.0f, 8.84f, 7.16f, 16.0f, 16.0f, 16.0f)
                horizontalLineToRelative(6.86f)
                curveToRelative(8.84f, 0.0f, 16.0f, -7.16f, 16.0f, -16.0f)
                lineTo(288.0f, 101.13f)
                curveToRelative(0.0f, -25.67f, 36.57f, -24.81f, 36.57f, 0.69f)
                lineTo(324.57f, 256.0f)
                curveToRelative(0.0f, 8.84f, 7.16f, 16.0f, 16.0f, 16.0f)
                horizontalLineToRelative(6.86f)
                curveToRelative(8.84f, 0.0f, 16.0f, -7.16f, 16.0f, -16.0f)
                verticalLineToRelative(-76.31f)
                curveToRelative(0.0f, -26.24f, 36.57f, -25.64f, 36.57f, -0.69f)
                verticalLineToRelative(131.56f)
                close()
            }
        }
        .build()
        return _handPaper!!
    }

private var _handPaper: ImageVector? = null
