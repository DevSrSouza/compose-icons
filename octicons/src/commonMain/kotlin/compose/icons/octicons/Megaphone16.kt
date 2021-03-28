package compose.icons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.Octicons

public val Octicons.Megaphone16: ImageVector
    get() {
        if (_megaphone16 != null) {
            return _megaphone16!!
        }
        _megaphone16 = Builder(name = "Megaphone16", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(15.571f, 0.572f)
                arcTo(0.75f, 0.75f, 0.0f, false, true, 16.0f, 1.25f)
                lineTo(14.777f, 0.668f)
                curveToRelative(0.001f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f)
                lineToRelative(-0.015f, 0.012f)
                lineToRelative(-0.076f, 0.056f)
                arcToRelative(5.508f, 5.508f, 0.0f, false, true, -0.345f, 0.224f)
                arcToRelative(9.982f, 9.982f, 0.0f, false, true, -1.463f, 0.719f)
                curveToRelative(-1.322f, 0.528f, -3.351f, 1.07f, -6.124f, 1.071f)
                arcToRelative(1.6f, 1.6f, 0.0f, false, false, -0.861f, -0.25f)
                horizontalLineTo(4.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -1.499f, 7.71f)
                arcToRelative(0.758f, 0.758f, 0.0f, false, false, -0.001f, 0.04f)
                curveToRelative(0.0f, 2.32f, 0.486f, 3.93f, 0.813f, 4.75f)
                curveToRelative(0.262f, 0.66f, 0.897f, 1.0f, 1.517f, 1.0f)
                horizontalLineToRelative(1.197f)
                curveToRelative(0.685f, 0.0f, 1.228f, -0.389f, 1.546f, -0.857f)
                curveToRelative(0.317f, -0.466f, 0.468f, -1.09f, 0.31f, -1.696f)
                curveToRelative(-0.2f, -0.767f, -0.382f, -1.835f, -0.383f, -3.183f)
                curveToRelative(2.394f, 0.086f, 4.177f, 0.577f, 5.378f, 1.057f)
                arcToRelative(9.965f, 9.965f, 0.0f, false, true, 1.463f, 0.719f)
                arcToRelative(5.7f, 5.7f, 0.0f, false, true, 0.421f, 0.28f)
                lineToRelative(0.014f, 0.012f)
                horizontalLineToRelative(0.002f)
                arcTo(0.75f, 0.75f, 0.0f, false, false, 16.0f, 11.75f)
                verticalLineTo(1.25f)
                lineTo(14.777f, 0.668f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, 0.794f, -0.096f)
                close()
                moveTo(4.002f, 10.5f)
                curveToRelative(0.033f, 1.969f, 0.45f, 3.306f, 0.704f, 3.946f)
                curveToRelative(0.004f, 0.01f, 0.01f, 0.02f, 0.027f, 0.03f)
                arcToRelative(0.185f, 0.185f, 0.0f, false, false, 0.097f, 0.024f)
                horizontalLineToRelative(1.197f)
                curveToRelative(0.083f, 0.0f, 0.202f, -0.047f, 0.305f, -0.2f)
                arcToRelative(0.608f, 0.608f, 0.0f, false, false, 0.1f, -0.475f)
                arcToRelative(14.036f, 14.036f, 0.0f, false, true, -0.43f, -3.329f)
                arcToRelative(1.64f, 1.64f, 0.0f, false, true, -0.11f, 0.004f)
                horizontalLineToRelative(-1.89f)
                close()
                moveTo(7.5f, 8.763f)
                curveToRelative(2.601f, 0.087f, 4.573f, 0.62f, 5.935f, 1.166f)
                curveToRelative(0.41f, 0.164f, 0.766f, 0.33f, 1.065f, 0.483f)
                verticalLineTo(2.588f)
                curveToRelative(-0.3f, 0.154f, -0.654f, 0.319f, -1.065f, 0.483f)
                curveTo(12.073f, 3.616f, 10.1f, 4.15f, 7.5f, 4.237f)
                verticalLineToRelative(4.526f)
                close()
                moveTo(14.777f, 0.668f)
                close()
                moveTo(1.5f, 6.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, true, 4.0f, 4.0f)
                horizontalLineToRelative(1.893f)
                curveToRelative(0.059f, 0.0f, 0.107f, 0.048f, 0.107f, 0.107f)
                verticalLineToRelative(4.786f)
                arcTo(0.107f, 0.107f, 0.0f, false, true, 5.893f, 9.0f)
                horizontalLineTo(4.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, -2.5f, -2.5f)
                close()
            }
        }
        .build()
        return _megaphone16!!
    }

private var _megaphone16: ImageVector? = null
