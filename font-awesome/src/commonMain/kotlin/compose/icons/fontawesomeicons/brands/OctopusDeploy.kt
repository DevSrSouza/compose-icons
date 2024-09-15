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

public val BrandsGroup.OctopusDeploy: ImageVector
    get() {
        if (_octopusDeploy != null) {
            return _octopusDeploy!!
        }
        _octopusDeploy = Builder(name = "OctopusDeploy", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(455.6f, 349.2f)
                curveToRelative(-45.89f, -39.09f, -36.67f, -77.88f, -16.09f, -128.11f)
                curveTo(475.16f, 134.04f, 415.97f, 34.14f, 329.93f, 8.3f)
                curveTo(237.04f, -19.6f, 134.25f, 24.34f, 99.68f, 117.15f)
                arcToRelative(180.86f, 180.86f, 0.0f, false, false, -10.99f, 73.54f)
                curveToRelative(1.73f, 29.54f, 14.72f, 52.97f, 24.09f, 80.3f)
                curveToRelative(17.2f, 50.16f, -28.1f, 92.74f, -66.66f, 117.58f)
                curveToRelative(-46.81f, 30.2f, -36.32f, 39.86f, -8.43f, 41.86f)
                curveToRelative(23.38f, 1.68f, 44.48f, -4.55f, 65.26f, -15.05f)
                curveToRelative(9.2f, -4.65f, 40.69f, -18.93f, 45.13f, -28.59f)
                curveTo(135.9f, 413.39f, 111.12f, 459.5f, 126.62f, 488.9f)
                curveToRelative(19.1f, 36.23f, 67.11f, -31.77f, 76.71f, -45.81f)
                curveToRelative(8.59f, -12.57f, 42.96f, -81.28f, 63.63f, -46.93f)
                curveToRelative(18.86f, 31.36f, 8.6f, 76.39f, 35.74f, 104.62f)
                curveToRelative(32.85f, 34.2f, 51.15f, -18.31f, 51.41f, -44.22f)
                curveToRelative(0.16f, -16.41f, -6.1f, -95.85f, 29.9f, -59.94f)
                curveTo(405.43f, 418.0f, 436.91f, 467.8f, 472.57f, 463.64f)
                curveToRelative(38.74f, -4.52f, -22.12f, -67.97f, -28.26f, -78.69f)
                curveToRelative(5.39f, 4.28f, 53.67f, 34.13f, 53.82f, 9.52f)
                curveTo(498.23f, 375.68f, 468.04f, 359.8f, 455.6f, 349.2f)
                close()
            }
        }
        .build()
        return _octopusDeploy!!
    }

private var _octopusDeploy: ImageVector? = null
