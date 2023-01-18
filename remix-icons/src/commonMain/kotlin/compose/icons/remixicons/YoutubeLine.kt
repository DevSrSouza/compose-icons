package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.YoutubeLine: ImageVector
    get() {
        if (_youtubeLine != null) {
            return _youtubeLine!!
        }
        _youtubeLine = Builder(name = "YoutubeLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.606f, 6.995f)
                curveToRelative(-0.076f, -0.298f, -0.292f, -0.523f, -0.539f, -0.592f)
                curveTo(18.63f, 6.28f, 16.5f, 6.0f, 12.0f, 6.0f)
                reflectiveCurveToRelative(-6.628f, 0.28f, -7.069f, 0.403f)
                curveToRelative(-0.244f, 0.068f, -0.46f, 0.293f, -0.537f, 0.592f)
                curveTo(4.285f, 7.419f, 4.0f, 9.196f, 4.0f, 12.0f)
                reflectiveCurveToRelative(0.285f, 4.58f, 0.394f, 5.006f)
                curveToRelative(0.076f, 0.297f, 0.292f, 0.522f, 0.538f, 0.59f)
                curveTo(5.372f, 17.72f, 7.5f, 18.0f, 12.0f, 18.0f)
                reflectiveCurveToRelative(6.629f, -0.28f, 7.069f, -0.403f)
                curveToRelative(0.244f, -0.068f, 0.46f, -0.293f, 0.537f, -0.592f)
                curveTo(19.715f, 16.581f, 20.0f, 14.8f, 20.0f, 12.0f)
                reflectiveCurveToRelative(-0.285f, -4.58f, -0.394f, -5.005f)
                close()
                moveTo(21.543f, 6.498f)
                curveTo(22.0f, 8.28f, 22.0f, 12.0f, 22.0f, 12.0f)
                reflectiveCurveToRelative(0.0f, 3.72f, -0.457f, 5.502f)
                curveToRelative(-0.254f, 0.985f, -0.997f, 1.76f, -1.938f, 2.022f)
                curveTo(17.896f, 20.0f, 12.0f, 20.0f, 12.0f, 20.0f)
                reflectiveCurveToRelative(-5.893f, 0.0f, -7.605f, -0.476f)
                curveToRelative(-0.945f, -0.266f, -1.687f, -1.04f, -1.938f, -2.022f)
                curveTo(2.0f, 15.72f, 2.0f, 12.0f, 2.0f, 12.0f)
                reflectiveCurveToRelative(0.0f, -3.72f, 0.457f, -5.502f)
                curveToRelative(0.254f, -0.985f, 0.997f, -1.76f, 1.938f, -2.022f)
                curveTo(6.107f, 4.0f, 12.0f, 4.0f, 12.0f, 4.0f)
                reflectiveCurveToRelative(5.896f, 0.0f, 7.605f, 0.476f)
                curveToRelative(0.945f, 0.266f, 1.687f, 1.04f, 1.938f, 2.022f)
                close()
                moveTo(10.0f, 15.5f)
                verticalLineToRelative(-7.0f)
                lineToRelative(6.0f, 3.5f)
                lineToRelative(-6.0f, 3.5f)
                close()
            }
        }
        .build()
        return _youtubeLine!!
    }

private var _youtubeLine: ImageVector? = null
