package compose.icons.studioicons.round

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.RoundGroup

public val RoundGroup.Rocket: ImageVector
    get() {
        if (_rocket != null) {
            return _rocket!!
        }
        _rocket = Builder(name = "Rocket", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.41f, 2.87f)
                curveToRelative(0.35f, -0.26f, 0.82f, -0.26f, 1.18f, 0.0f)
                curveTo(13.81f, 3.75f, 16.5f, 6.46f, 16.5f, 13.0f)
                curveToRelative(0.0f, 2.16f, -0.78f, 4.76f, -1.36f, 6.35f)
                curveTo(15.0f, 19.74f, 14.63f, 20.0f, 14.21f, 20.0f)
                lineToRelative(-4.41f, 0.0f)
                curveToRelative(-0.42f, 0.0f, -0.8f, -0.26f, -0.94f, -0.65f)
                curveTo(8.28f, 17.76f, 7.5f, 15.16f, 7.5f, 13.0f)
                curveTo(7.5f, 6.46f, 10.19f, 3.75f, 11.41f, 2.87f)
                close()
                moveTo(14.0f, 11.0f)
                curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f)
                reflectiveCurveToRelative(-2.0f, 0.9f, -2.0f, 2.0f)
                reflectiveCurveToRelative(0.9f, 2.0f, 2.0f, 2.0f)
                reflectiveCurveTo(14.0f, 12.1f, 14.0f, 11.0f)
                close()
                moveTo(7.69f, 20.52f)
                curveToRelative(-0.48f, -1.23f, -1.52f, -4.17f, -1.67f, -6.87f)
                lineToRelative(-1.13f, 0.75f)
                curveTo(4.33f, 14.78f, 4.0f, 15.4f, 4.0f, 16.07f)
                verticalLineToRelative(4.45f)
                curveToRelative(0.0f, 0.71f, 0.71f, 1.19f, 1.37f, 0.93f)
                lineTo(7.69f, 20.52f)
                close()
                moveTo(20.0f, 20.52f)
                verticalLineToRelative(-4.45f)
                curveToRelative(0.0f, -0.67f, -0.33f, -1.29f, -0.89f, -1.66f)
                lineToRelative(-1.13f, -0.75f)
                curveToRelative(-0.15f, 2.69f, -1.2f, 5.64f, -1.67f, 6.87f)
                lineToRelative(2.32f, 0.93f)
                curveTo(19.29f, 21.71f, 20.0f, 21.23f, 20.0f, 20.52f)
                close()
            }
        }
        .build()
        return _rocket!!
    }

private var _rocket: ImageVector? = null
