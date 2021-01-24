package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.Tooth: ImageVector
    get() {
        if (_tooth != null) {
            return _tooth!!
        }
        _tooth = Builder(name = "Tooth", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(443.98f, 96.25f)
                curveToRelative(-11.01f, -45.22f, -47.11f, -82.06f, -92.01f, -93.72f)
                curveToRelative(-32.19f, -8.36f, -63.0f, 5.1f, -89.14f, 24.33f)
                curveToRelative(-3.25f, 2.39f, -6.96f, 3.73f, -10.5f, 5.48f)
                lineToRelative(28.32f, 18.21f)
                curveToRelative(7.42f, 4.77f, 9.58f, 14.67f, 4.8f, 22.11f)
                curveToRelative(-4.46f, 6.95f, -14.27f, 9.86f, -22.11f, 4.8f)
                lineTo(162.83f, 12.84f)
                curveToRelative(-20.7f, -10.85f, -43.38f, -16.4f, -66.81f, -10.31f)
                curveToRelative(-44.9f, 11.67f, -81.0f, 48.5f, -92.01f, 93.72f)
                curveToRelative(-10.13f, 41.62f, -0.42f, 80.81f, 21.5f, 110.43f)
                curveToRelative(23.36f, 31.57f, 32.68f, 68.66f, 36.29f, 107.35f)
                curveToRelative(4.4f, 47.16f, 10.33f, 94.16f, 20.94f, 140.32f)
                lineToRelative(7.8f, 33.95f)
                curveToRelative(3.19f, 13.87f, 15.49f, 23.7f, 29.67f, 23.7f)
                curveToRelative(13.97f, 0.0f, 26.15f, -9.55f, 29.54f, -23.16f)
                lineToRelative(34.47f, -138.42f)
                curveToRelative(4.56f, -18.32f, 20.96f, -31.16f, 39.76f, -31.16f)
                reflectiveCurveToRelative(35.2f, 12.85f, 39.76f, 31.16f)
                lineToRelative(34.47f, 138.42f)
                curveToRelative(3.39f, 13.61f, 15.57f, 23.16f, 29.54f, 23.16f)
                curveToRelative(14.18f, 0.0f, 26.48f, -9.83f, 29.67f, -23.7f)
                lineToRelative(7.8f, -33.95f)
                curveToRelative(10.61f, -46.15f, 16.53f, -93.16f, 20.94f, -140.32f)
                curveToRelative(3.61f, -38.7f, 12.93f, -75.78f, 36.29f, -107.35f)
                curveToRelative(21.95f, -29.61f, 31.66f, -68.8f, 21.53f, -110.43f)
                close()
            }
        }
        .build()
        return _tooth!!
    }

private var _tooth: ImageVector? = null
