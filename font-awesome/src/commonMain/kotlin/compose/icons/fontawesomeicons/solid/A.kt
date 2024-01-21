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

public val SolidGroup.A: ImageVector
    get() {
        if (_a != null) {
            return _a!!
        }
        _a = Builder(name = "A", defaultWidth = 384.0.dp, defaultHeight = 512.0.dp, viewportWidth =
                384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(221.5f, 51.7f)
                curveTo(216.6f, 39.8f, 204.9f, 32.0f, 192.0f, 32.0f)
                reflectiveCurveToRelative(-24.6f, 7.8f, -29.5f, 19.7f)
                lineToRelative(-120.0f, 288.0f)
                lineToRelative(-40.0f, 96.0f)
                curveToRelative(-6.8f, 16.3f, 0.9f, 35.0f, 17.2f, 41.8f)
                reflectiveCurveToRelative(35.0f, -0.9f, 41.8f, -17.2f)
                lineTo(93.3f, 384.0f)
                horizontalLineTo(290.7f)
                lineToRelative(31.8f, 76.3f)
                curveToRelative(6.8f, 16.3f, 25.5f, 24.0f, 41.8f, 17.2f)
                reflectiveCurveToRelative(24.0f, -25.5f, 17.2f, -41.8f)
                lineToRelative(-40.0f, -96.0f)
                lineToRelative(-120.0f, -288.0f)
                close()
                moveTo(264.0f, 320.0f)
                horizontalLineTo(120.0f)
                lineToRelative(72.0f, -172.8f)
                lineTo(264.0f, 320.0f)
                close()
            }
        }
        .build()
        return _a!!
    }

private var _a: ImageVector? = null
