package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.Share: ImageVector
    get() {
        if (_share != null) {
            return _share!!
        }
        _share = Builder(name = "Share", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(503.691f, 189.836f)
                lineTo(327.687f, 37.851f)
                curveTo(312.281f, 24.546f, 288.0f, 35.347f, 288.0f, 56.015f)
                verticalLineToRelative(80.053f)
                curveTo(127.371f, 137.907f, 0.0f, 170.1f, 0.0f, 322.326f)
                curveToRelative(0.0f, 61.441f, 39.581f, 122.309f, 83.333f, 154.132f)
                curveToRelative(13.653f, 9.931f, 33.111f, -2.533f, 28.077f, -18.631f)
                curveTo(66.066f, 312.814f, 132.917f, 274.316f, 288.0f, 272.085f)
                verticalLineTo(360.0f)
                curveToRelative(0.0f, 20.7f, 24.3f, 31.453f, 39.687f, 18.164f)
                lineToRelative(176.004f, -152.0f)
                curveToRelative(11.071f, -9.562f, 11.086f, -26.753f, 0.0f, -36.328f)
                close()
            }
        }
        .build()
        return _share!!
    }

private var _share: ImageVector? = null
