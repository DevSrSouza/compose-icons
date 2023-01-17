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

public val SolidGroup.HelmetSafety: ImageVector
    get() {
        if (_helmetSafety != null) {
            return _helmetSafety!!
        }
        _helmetSafety = Builder(name = "HelmetSafety", defaultWidth = 576.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 32.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, 14.3f, -32.0f, 32.0f)
                verticalLineToRelative(2.3f)
                verticalLineToRelative(99.6f)
                curveToRelative(0.0f, 5.6f, -4.5f, 10.1f, -10.1f, 10.1f)
                curveToRelative(-3.6f, 0.0f, -7.0f, -1.9f, -8.8f, -5.1f)
                lineTo(157.1f, 87.0f)
                curveTo(83.0f, 123.5f, 32.0f, 199.8f, 32.0f, 288.0f)
                verticalLineToRelative(64.0f)
                horizontalLineTo(544.0f)
                lineToRelative(0.0f, -66.4f)
                curveToRelative(-0.9f, -87.2f, -51.7f, -162.4f, -125.1f, -198.6f)
                lineToRelative(-48.0f, 83.9f)
                curveToRelative(-1.8f, 3.2f, -5.2f, 5.1f, -8.8f, 5.1f)
                curveToRelative(-5.6f, 0.0f, -10.1f, -4.5f, -10.1f, -10.1f)
                verticalLineTo(66.3f)
                verticalLineTo(64.0f)
                curveToRelative(0.0f, -17.7f, -14.3f, -32.0f, -32.0f, -32.0f)
                horizontalLineTo(256.0f)
                close()
                moveTo(16.6f, 384.0f)
                curveTo(7.4f, 384.0f, 0.0f, 391.4f, 0.0f, 400.6f)
                curveToRelative(0.0f, 4.7f, 2.0f, 9.2f, 5.8f, 11.9f)
                curveTo(27.5f, 428.4f, 111.8f, 480.0f, 288.0f, 480.0f)
                reflectiveCurveToRelative(260.5f, -51.6f, 282.2f, -67.5f)
                curveToRelative(3.8f, -2.8f, 5.8f, -7.2f, 5.8f, -11.9f)
                curveToRelative(0.0f, -9.2f, -7.4f, -16.6f, -16.6f, -16.6f)
                horizontalLineTo(16.6f)
                close()
            }
        }
        .build()
        return _helmetSafety!!
    }

private var _helmetSafety: ImageVector? = null
