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

public val SolidGroup.Y: ImageVector
    get() {
        if (_y != null) {
            return _y!!
        }
        _y = Builder(name = "Y", defaultWidth = 384.0.dp, defaultHeight = 512.0.dp, viewportWidth =
                384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(58.0f, 45.4f)
                curveTo(47.8f, 31.0f, 27.8f, 27.7f, 13.4f, 38.0f)
                reflectiveCurveTo(-4.3f, 68.2f, 6.0f, 82.6f)
                lineTo(160.0f, 298.3f)
                verticalLineTo(448.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                reflectiveCurveToRelative(32.0f, -14.3f, 32.0f, -32.0f)
                verticalLineTo(298.3f)
                lineTo(378.0f, 82.6f)
                curveToRelative(10.3f, -14.4f, 6.9f, -34.4f, -7.4f, -44.6f)
                reflectiveCurveTo(336.2f, 31.0f, 326.0f, 45.4f)
                lineTo(192.0f, 232.9f)
                lineTo(58.0f, 45.4f)
                close()
            }
        }
        .build()
        return _y!!
    }

private var _y: ImageVector? = null
