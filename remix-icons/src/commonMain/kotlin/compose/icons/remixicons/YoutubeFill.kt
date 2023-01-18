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

public val RemixIcons.YoutubeFill: ImageVector
    get() {
        if (_youtubeFill != null) {
            return _youtubeFill!!
        }
        _youtubeFill = Builder(name = "YoutubeFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
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
                lineToRelative(6.0f, -3.5f)
                lineToRelative(-6.0f, -3.5f)
                verticalLineToRelative(7.0f)
                close()
            }
        }
        .build()
        return _youtubeFill!!
    }

private var _youtubeFill: ImageVector? = null
