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

public val SolidGroup.Leaf: ImageVector
    get() {
        if (_leaf != null) {
            return _leaf!!
        }
        _leaf = Builder(name = "Leaf", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(272.0f, 96.0f)
                curveToRelative(-78.6f, 0.0f, -145.1f, 51.5f, -167.7f, 122.5f)
                curveToRelative(33.6f, -17.0f, 71.5f, -26.5f, 111.7f, -26.5f)
                horizontalLineToRelative(88.0f)
                curveToRelative(8.8f, 0.0f, 16.0f, 7.2f, 16.0f, 16.0f)
                reflectiveCurveToRelative(-7.2f, 16.0f, -16.0f, 16.0f)
                horizontalLineTo(288.0f)
                horizontalLineTo(216.0f)
                reflectiveCurveToRelative(0.0f, 0.0f, 0.0f, 0.0f)
                curveToRelative(-16.6f, 0.0f, -32.7f, 1.9f, -48.3f, 5.4f)
                curveToRelative(-25.9f, 5.9f, -49.9f, 16.4f, -71.4f, 30.7f)
                curveToRelative(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f)
                curveTo(38.3f, 298.8f, 0.0f, 364.9f, 0.0f, 440.0f)
                verticalLineToRelative(16.0f)
                curveToRelative(0.0f, 13.3f, 10.7f, 24.0f, 24.0f, 24.0f)
                reflectiveCurveToRelative(24.0f, -10.7f, 24.0f, -24.0f)
                verticalLineTo(440.0f)
                curveToRelative(0.0f, -48.7f, 20.7f, -92.5f, 53.8f, -123.2f)
                curveTo(121.6f, 392.3f, 190.3f, 448.0f, 272.0f, 448.0f)
                lineToRelative(1.0f, 0.0f)
                curveToRelative(132.1f, -0.7f, 239.0f, -130.9f, 239.0f, -291.4f)
                curveToRelative(0.0f, -42.6f, -7.5f, -83.1f, -21.1f, -119.6f)
                curveToRelative(-2.6f, -6.9f, -12.7f, -6.6f, -16.2f, -0.1f)
                curveTo(455.9f, 72.1f, 418.7f, 96.0f, 376.0f, 96.0f)
                lineTo(272.0f, 96.0f)
                close()
            }
        }
        .build()
        return _leaf!!
    }

private var _leaf: ImageVector? = null
