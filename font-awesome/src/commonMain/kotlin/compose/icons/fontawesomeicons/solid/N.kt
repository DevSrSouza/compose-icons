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

public val SolidGroup.N: ImageVector
    get() {
        if (_n != null) {
            return _n!!
        }
        _n = Builder(name = "N", defaultWidth = 384.0.dp, defaultHeight = 512.0.dp, viewportWidth =
                384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.1f, 33.9f)
                curveToRelative(12.7f, -4.6f, 26.9f, -0.7f, 35.5f, 9.6f)
                lineTo(320.0f, 359.6f)
                verticalLineTo(64.0f)
                curveToRelative(0.0f, -17.7f, 14.3f, -32.0f, 32.0f, -32.0f)
                reflectiveCurveToRelative(32.0f, 14.3f, 32.0f, 32.0f)
                verticalLineTo(448.0f)
                curveToRelative(0.0f, 13.5f, -8.4f, 25.5f, -21.1f, 30.1f)
                reflectiveCurveToRelative(-26.9f, 0.7f, -35.5f, -9.6f)
                lineTo(64.0f, 152.4f)
                verticalLineTo(448.0f)
                curveToRelative(0.0f, 17.7f, -14.3f, 32.0f, -32.0f, 32.0f)
                reflectiveCurveToRelative(-32.0f, -14.3f, -32.0f, -32.0f)
                verticalLineTo(64.0f)
                curveTo(0.0f, 50.5f, 8.4f, 38.5f, 21.1f, 33.9f)
                close()
            }
        }
        .build()
        return _n!!
    }

private var _n: ImageVector? = null
