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

public val SolidGroup.Helicopter: ImageVector
    get() {
        if (_helicopter != null) {
            return _helicopter!!
        }
        _helicopter = Builder(name = "Helicopter", defaultWidth = 640.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 32.0f)
                curveToRelative(0.0f, -17.7f, 14.3f, -32.0f, 32.0f, -32.0f)
                horizontalLineTo(544.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                reflectiveCurveToRelative(-14.3f, 32.0f, -32.0f, 32.0f)
                horizontalLineTo(384.0f)
                verticalLineToRelative(64.0f)
                horizontalLineToRelative(32.0f)
                curveToRelative(88.4f, 0.0f, 160.0f, 71.6f, 160.0f, 160.0f)
                verticalLineToRelative(64.0f)
                curveToRelative(0.0f, 17.7f, -14.3f, 32.0f, -32.0f, 32.0f)
                horizontalLineTo(384.0f)
                horizontalLineTo(320.0f)
                curveToRelative(-20.1f, 0.0f, -39.1f, -9.5f, -51.2f, -25.6f)
                lineToRelative(-71.4f, -95.2f)
                curveToRelative(-3.5f, -4.7f, -8.3f, -8.3f, -13.7f, -10.5f)
                lineTo(47.2f, 198.1f)
                curveToRelative(-9.5f, -3.8f, -16.7f, -12.0f, -19.2f, -22.0f)
                lineTo(5.0f, 83.9f)
                curveTo(2.4f, 73.8f, 10.1f, 64.0f, 20.5f, 64.0f)
                horizontalLineTo(48.0f)
                curveToRelative(10.1f, 0.0f, 19.6f, 4.7f, 25.6f, 12.8f)
                lineTo(112.0f, 128.0f)
                horizontalLineTo(320.0f)
                verticalLineTo(64.0f)
                horizontalLineTo(160.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                close()
                moveTo(384.0f, 320.0f)
                horizontalLineTo(512.0f)
                verticalLineTo(288.0f)
                curveToRelative(0.0f, -53.0f, -43.0f, -96.0f, -96.0f, -96.0f)
                horizontalLineTo(384.0f)
                verticalLineTo(320.0f)
                close()
                moveTo(630.6f, 425.4f)
                curveToRelative(12.5f, 12.5f, 12.5f, 32.8f, 0.0f, 45.3f)
                lineToRelative(-3.9f, 3.9f)
                curveToRelative(-24.0f, 24.0f, -56.6f, 37.5f, -90.5f, 37.5f)
                horizontalLineTo(256.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                reflectiveCurveToRelative(14.3f, -32.0f, 32.0f, -32.0f)
                horizontalLineTo(536.2f)
                curveToRelative(17.0f, 0.0f, 33.3f, -6.7f, 45.3f, -18.7f)
                lineToRelative(3.9f, -3.9f)
                curveToRelative(12.5f, -12.5f, 32.8f, -12.5f, 45.3f, 0.0f)
                close()
            }
        }
        .build()
        return _helicopter!!
    }

private var _helicopter: ImageVector? = null
