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

public val SolidGroup.G: ImageVector
    get() {
        if (_g != null) {
            return _g!!
        }
        _g = Builder(name = "G", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp, viewportWidth =
                448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 96.0f)
                curveTo(135.6f, 96.0f, 64.0f, 167.6f, 64.0f, 256.0f)
                reflectiveCurveToRelative(71.6f, 160.0f, 160.0f, 160.0f)
                curveToRelative(77.4f, 0.0f, 142.0f, -55.0f, 156.8f, -128.0f)
                horizontalLineTo(256.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                reflectiveCurveToRelative(14.3f, -32.0f, 32.0f, -32.0f)
                horizontalLineTo(400.0f)
                curveToRelative(25.8f, 0.0f, 49.6f, 21.4f, 47.2f, 50.6f)
                curveTo(437.8f, 389.6f, 341.4f, 480.0f, 224.0f, 480.0f)
                curveTo(100.3f, 480.0f, 0.0f, 379.7f, 0.0f, 256.0f)
                reflectiveCurveTo(100.3f, 32.0f, 224.0f, 32.0f)
                curveToRelative(57.4f, 0.0f, 109.7f, 21.6f, 149.3f, 57.0f)
                curveToRelative(13.2f, 11.8f, 14.3f, 32.0f, 2.5f, 45.2f)
                reflectiveCurveToRelative(-32.0f, 14.3f, -45.2f, 2.5f)
                curveTo(302.3f, 111.4f, 265.0f, 96.0f, 224.0f, 96.0f)
                close()
            }
        }
        .build()
        return _g!!
    }

private var _g: ImageVector? = null
