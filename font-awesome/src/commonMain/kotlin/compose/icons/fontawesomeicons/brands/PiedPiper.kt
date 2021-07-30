package compose.icons.fontawesomeicons.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.BrandsGroup

public val BrandsGroup.PiedPiper: ImageVector
    get() {
        if (_piedPiper != null) {
            return _piedPiper!!
        }
        _piedPiper = Builder(name = "PiedPiper", defaultWidth = 480.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 480.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(455.93f, 23.2f)
                curveTo(429.23f, 30.0f, 387.79f, 51.69f, 341.35f, 90.66f)
                arcTo(206.0f, 206.0f, 0.0f, false, false, 240.0f, 64.0f)
                curveTo(125.13f, 64.0f, 32.0f, 157.12f, 32.0f, 272.0f)
                reflectiveCurveToRelative(93.13f, 208.0f, 208.0f, 208.0f)
                reflectiveCurveToRelative(208.0f, -93.13f, 208.0f, -208.0f)
                arcToRelative(207.25f, 207.25f, 0.0f, false, false, -58.75f, -144.81f)
                arcToRelative(155.35f, 155.35f, 0.0f, false, false, -17.0f, 27.4f)
                arcTo(176.16f, 176.16f, 0.0f, false, true, 417.1f, 272.0f)
                curveToRelative(0.0f, 97.66f, -79.44f, 177.11f, -177.09f, 177.11f)
                arcToRelative(175.81f, 175.81f, 0.0f, false, true, -87.63f, -23.4f)
                curveToRelative(82.94f, -107.33f, 150.79f, -37.77f, 184.31f, -226.65f)
                curveToRelative(5.79f, -32.62f, 28.0f, -94.26f, 126.23f, -160.18f)
                curveTo(471.0f, 33.45f, 465.35f, 20.8f, 455.93f, 23.2f)
                close()
                moveTo(125.0f, 406.4f)
                arcTo(176.66f, 176.66f, 0.0f, false, true, 62.9f, 272.0f)
                curveTo(62.9f, 174.34f, 142.35f, 94.9f, 240.0f, 94.9f)
                arcToRelative(174.0f, 174.0f, 0.0f, false, true, 76.63f, 17.75f)
                curveTo(250.64f, 174.76f, 189.77f, 265.52f, 125.0f, 406.4f)
                close()
            }
        }
        .build()
        return _piedPiper!!
    }

private var _piedPiper: ImageVector? = null
