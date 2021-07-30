package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.S7airlines: ImageVector
    get() {
        if (_s7airlines != null) {
            return _s7airlines!!
        }
        _s7airlines = Builder(name = "S7airlines", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.004f, 0.0f)
                curveTo(5.375f, 0.0f, 0.0f, 5.373f, 0.0f, 12.002f)
                curveTo(0.0f, 18.632f, 5.375f, 24.0f, 12.004f, 24.0f)
                curveTo(18.63f, 24.0f, 24.0f, 18.632f, 24.0f, 12.002f)
                curveTo(24.0f, 5.373f, 18.631f, 0.0f, 12.004f, 0.0f)
                close()
                moveTo(11.129f, 5.739f)
                horizontalLineToRelative(1.705f)
                lineTo(12.0f, 7.825f)
                horizontalLineToRelative(-1.168f)
                curveToRelative(-1.255f, 0.0f, -2.061f, 0.004f, -2.496f, 0.148f)
                curveToRelative(-0.423f, 0.132f, -0.735f, 0.29f, -0.906f, 0.54f)
                curveToRelative(-0.157f, 0.202f, -0.21f, 0.477f, -0.21f, 0.716f)
                curveToRelative(0.0f, 0.25f, 0.027f, 0.487f, 0.275f, 0.806f)
                curveToRelative(0.305f, 0.305f, 0.809f, 0.699f, 1.797f, 1.307f)
                curveToRelative(1.97f, 1.229f, 2.552f, 2.204f, 2.552f, 3.487f)
                curveToRelative(0.0f, 2.09f, -1.97f, 4.084f, -5.272f, 4.084f)
                curveToRelative(-0.992f, 0.0f, -2.377f, -0.146f, -2.961f, -0.332f)
                lineToRelative(-0.307f, -0.09f)
                curveToRelative(0.12f, -0.397f, 0.512f, -1.493f, 0.685f, -1.956f)
                lineToRelative(0.31f, 0.078f)
                curveToRelative(0.648f, 0.16f, 1.664f, 0.252f, 2.338f, 0.252f)
                curveToRelative(1.932f, 0.0f, 2.682f, -0.872f, 2.682f, -1.638f)
                curveToRelative(0.0f, -0.7f, -0.382f, -1.084f, -2.299f, -2.246f)
                curveToRelative(-1.796f, -1.11f, -2.417f, -2.076f, -2.417f, -3.409f)
                curveToRelative(0.0f, -1.6f, 1.03f, -2.818f, 2.522f, -3.399f)
                curveToRelative(0.888f, -0.33f, 2.114f, -0.434f, 4.004f, -0.434f)
                close()
                moveTo(14.088f, 5.739f)
                horizontalLineToRelative(5.871f)
                curveToRelative(0.276f, 0.0f, 0.329f, 0.195f, 0.223f, 0.407f)
                curveToRelative(-0.384f, 0.952f, -4.007f, 10.028f, -4.007f, 10.028f)
                horizontalLineToRelative(-2.421f)
                reflectiveCurveToRelative(2.861f, -7.291f, 3.336f, -8.377f)
                curveToRelative(-0.33f, 0.0f, -0.581f, 0.028f, -1.89f, 0.028f)
                horizontalLineToRelative(-1.947f)
                close()
            }
        }
        .build()
        return _s7airlines!!
    }

private var _s7airlines: ImageVector? = null
