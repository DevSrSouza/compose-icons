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

public val SolidGroup.V: ImageVector
    get() {
        if (_v != null) {
            return _v!!
        }
        _v = Builder(name = "V", defaultWidth = 384.0.dp, defaultHeight = 512.0.dp, viewportWidth =
                384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.7f, 34.5f)
                curveToRelative(16.3f, -6.8f, 35.0f, 0.9f, 41.8f, 17.2f)
                lineTo(192.0f, 364.8f)
                lineTo(322.5f, 51.7f)
                curveToRelative(6.8f, -16.3f, 25.5f, -24.0f, 41.8f, -17.2f)
                reflectiveCurveToRelative(24.0f, 25.5f, 17.2f, 41.8f)
                lineToRelative(-160.0f, 384.0f)
                curveToRelative(-5.0f, 11.9f, -16.6f, 19.7f, -29.5f, 19.7f)
                reflectiveCurveToRelative(-24.6f, -7.8f, -29.5f, -19.7f)
                lineTo(2.5f, 76.3f)
                curveToRelative(-6.8f, -16.3f, 0.9f, -35.0f, 17.2f, -41.8f)
                close()
            }
        }
        .build()
        return _v!!
    }

private var _v: ImageVector? = null
