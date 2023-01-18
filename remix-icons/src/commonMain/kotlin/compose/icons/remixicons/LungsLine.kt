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

public val RemixIcons.LungsLine: ImageVector
    get() {
        if (_lungsLine != null) {
            return _lungsLine!!
        }
        _lungsLine = Builder(name = "LungsLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.001f, 17.0f)
                curveToRelative(-0.001f, 4.0f, -0.001f, 4.0f, -4.0f, 4.0f)
                curveToRelative(-4.0f, 0.0f, -5.0f, -3.0f, -5.0f, -6.0f)
                curveToRelative(0.0f, -0.378f, -0.018f, -0.918f, -0.026f, -1.55f)
                lineToRelative(2.023f, 1.169f)
                lineTo(15.0f, 15.0f)
                curveToRelative(0.0f, 2.776f, 0.816f, 4.0f, 3.0f, 4.0f)
                curveToRelative(1.14f, 0.0f, 1.61f, -0.007f, 1.963f, -0.038f)
                curveToRelative(0.03f, -0.351f, 0.037f, -0.822f, 0.037f, -1.962f)
                curveToRelative(0.0f, -3.205f, -0.703f, -6.033f, -1.835f, -7.9f)
                curveToRelative(-0.838f, -1.382f, -1.613f, -1.843f, -2.032f, -1.703f)
                curveToRelative(-0.293f, 0.098f, -0.605f, 0.65f, -0.831f, 1.623f)
                lineToRelative(-1.79f, -1.033f)
                curveToRelative(0.369f, -1.197f, 0.982f, -2.151f, 1.988f, -2.487f)
                curveToRelative(3.0f, -1.0f, 6.503f, 4.0f, 6.5f, 11.5f)
                close()
                moveTo(8.5f, 5.5f)
                curveToRelative(1.007f, 0.336f, 1.62f, 1.29f, 1.989f, 2.487f)
                lineTo(8.699f, 9.02f)
                curveToRelative(-0.226f, -0.973f, -0.539f, -1.525f, -0.831f, -1.623f)
                curveToRelative(-0.42f, -0.14f, -1.195f, 0.32f, -2.032f, 1.702f)
                curveTo(4.703f, 10.967f, 4.0f, 13.795f, 4.0f, 17.0f)
                curveToRelative(0.0f, 1.14f, 0.007f, 1.61f, 0.038f, 1.962f)
                curveToRelative(0.351f, 0.031f, 0.822f, 0.038f, 1.962f, 0.038f)
                curveToRelative(2.184f, 0.0f, 3.0f, -1.224f, 3.0f, -4.0f)
                lineToRelative(0.004f, -0.382f)
                lineToRelative(2.023f, -1.168f)
                curveToRelative(-0.01f, 0.633f, -0.027f, 1.172f, -0.027f, 1.55f)
                curveToRelative(0.0f, 3.0f, -1.0f, 6.0f, -5.0f, 6.0f)
                reflectiveCurveToRelative(-4.0f, 0.0f, -4.0f, -4.0f)
                curveTo(2.0f, 9.5f, 5.5f, 4.5f, 8.5f, 5.5f)
                close()
                moveTo(13.0f, 2.0f)
                verticalLineToRelative(7.422f)
                lineToRelative(4.696f, 2.712f)
                lineToRelative(-1.0f, 1.732f)
                lineTo(12.0f, 11.155f)
                lineToRelative(-4.696f, 2.711f)
                lineToRelative(-1.0f, -1.732f)
                lineTo(11.0f, 9.422f)
                verticalLineTo(2.0f)
                horizontalLineToRelative(2.0f)
                close()
            }
        }
        .build()
        return _lungsLine!!
    }

private var _lungsLine: ImageVector? = null
