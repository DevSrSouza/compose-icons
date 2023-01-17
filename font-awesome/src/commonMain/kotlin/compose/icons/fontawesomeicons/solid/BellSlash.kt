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

public val SolidGroup.BellSlash: ImageVector
    get() {
        if (_bellSlash != null) {
            return _bellSlash!!
        }
        _bellSlash = Builder(name = "BellSlash", defaultWidth = 640.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(38.8f, 5.1f)
                curveTo(28.4f, -3.1f, 13.3f, -1.2f, 5.1f, 9.2f)
                reflectiveCurveTo(-1.2f, 34.7f, 9.2f, 42.9f)
                lineToRelative(592.0f, 464.0f)
                curveToRelative(10.4f, 8.2f, 25.5f, 6.3f, 33.7f, -4.1f)
                reflectiveCurveToRelative(6.3f, -25.5f, -4.1f, -33.7f)
                lineToRelative(-87.5f, -68.6f)
                curveToRelative(0.5f, -1.7f, 0.7f, -3.5f, 0.7f, -5.4f)
                curveToRelative(0.0f, -27.6f, -11.0f, -54.1f, -30.5f, -73.7f)
                lineTo(512.0f, 320.0f)
                curveToRelative(-20.5f, -20.5f, -32.0f, -48.3f, -32.0f, -77.3f)
                verticalLineTo(208.0f)
                curveToRelative(0.0f, -77.4f, -55.0f, -142.0f, -128.0f, -156.8f)
                verticalLineTo(32.0f)
                curveToRelative(0.0f, -17.7f, -14.3f, -32.0f, -32.0f, -32.0f)
                reflectiveCurveToRelative(-32.0f, 14.3f, -32.0f, 32.0f)
                verticalLineTo(51.2f)
                curveToRelative(-42.6f, 8.6f, -79.0f, 34.2f, -102.0f, 69.3f)
                lineTo(38.8f, 5.1f)
                close()
                moveTo(160.0f, 242.7f)
                curveToRelative(0.0f, 29.0f, -11.5f, 56.8f, -32.0f, 77.3f)
                lineToRelative(-1.5f, 1.5f)
                curveTo(107.0f, 341.0f, 96.0f, 367.5f, 96.0f, 395.2f)
                curveToRelative(0.0f, 11.5f, 9.3f, 20.8f, 20.8f, 20.8f)
                horizontalLineTo(406.2f)
                lineTo(160.0f, 222.1f)
                verticalLineToRelative(20.7f)
                close()
                moveTo(384.0f, 448.0f)
                horizontalLineTo(320.0f)
                horizontalLineTo(256.0f)
                curveToRelative(0.0f, 17.0f, 6.7f, 33.3f, 18.7f, 45.3f)
                reflectiveCurveToRelative(28.3f, 18.7f, 45.3f, 18.7f)
                reflectiveCurveToRelative(33.3f, -6.7f, 45.3f, -18.7f)
                reflectiveCurveToRelative(18.7f, -28.3f, 18.7f, -45.3f)
                close()
            }
        }
        .build()
        return _bellSlash!!
    }

private var _bellSlash: ImageVector? = null
