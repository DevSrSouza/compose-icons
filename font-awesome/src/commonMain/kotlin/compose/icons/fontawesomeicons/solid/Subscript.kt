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

public val SolidGroup.Subscript: ImageVector
    get() {
        if (_subscript != null) {
            return _subscript!!
        }
        _subscript = Builder(name = "Subscript", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(32.0f, 64.0f)
                curveTo(14.3f, 64.0f, 0.0f, 78.3f, 0.0f, 96.0f)
                reflectiveCurveToRelative(14.3f, 32.0f, 32.0f, 32.0f)
                horizontalLineTo(47.3f)
                lineToRelative(89.6f, 128.0f)
                lineTo(47.3f, 384.0f)
                horizontalLineTo(32.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, 14.3f, -32.0f, 32.0f)
                reflectiveCurveToRelative(14.3f, 32.0f, 32.0f, 32.0f)
                horizontalLineTo(64.0f)
                curveToRelative(10.4f, 0.0f, 20.2f, -5.1f, 26.2f, -13.6f)
                lineTo(176.0f, 311.8f)
                lineToRelative(85.8f, 122.6f)
                curveToRelative(6.0f, 8.6f, 15.8f, 13.6f, 26.2f, 13.6f)
                horizontalLineToRelative(32.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                reflectiveCurveToRelative(-14.3f, -32.0f, -32.0f, -32.0f)
                horizontalLineTo(304.7f)
                lineTo(215.1f, 256.0f)
                lineToRelative(89.6f, -128.0f)
                horizontalLineTo(320.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                reflectiveCurveToRelative(-14.3f, -32.0f, -32.0f, -32.0f)
                horizontalLineTo(288.0f)
                curveToRelative(-10.4f, 0.0f, -20.2f, 5.1f, -26.2f, 13.6f)
                lineTo(176.0f, 200.2f)
                lineTo(90.2f, 77.6f)
                curveTo(84.2f, 69.1f, 74.4f, 64.0f, 64.0f, 64.0f)
                horizontalLineTo(32.0f)
                close()
                moveTo(480.0f, 320.0f)
                curveToRelative(0.0f, -11.1f, -5.7f, -21.4f, -15.2f, -27.2f)
                reflectiveCurveToRelative(-21.2f, -6.4f, -31.1f, -1.4f)
                lineToRelative(-32.0f, 16.0f)
                curveToRelative(-15.8f, 7.9f, -22.2f, 27.1f, -14.3f, 42.9f)
                curveTo(393.0f, 361.5f, 404.3f, 368.0f, 416.0f, 368.0f)
                verticalLineToRelative(80.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, 14.3f, -32.0f, 32.0f)
                reflectiveCurveToRelative(14.3f, 32.0f, 32.0f, 32.0f)
                horizontalLineToRelative(32.0f)
                horizontalLineToRelative(32.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                reflectiveCurveToRelative(-14.3f, -32.0f, -32.0f, -32.0f)
                verticalLineTo(320.0f)
                close()
            }
        }
        .build()
        return _subscript!!
    }

private var _subscript: ImageVector? = null
