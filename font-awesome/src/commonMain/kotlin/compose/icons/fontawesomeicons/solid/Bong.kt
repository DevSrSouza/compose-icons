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

public val SolidGroup.Bong: ImageVector
    get() {
        if (_bong != null) {
            return _bong!!
        }
        _bong = Builder(name = "Bong", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(160.0f, 208.5f)
                curveToRelative(0.0f, 29.1f, -15.6f, 53.9f, -37.2f, 67.8f)
                curveToRelative(-17.2f, 11.1f, -31.5f, 26.1f, -41.7f, 43.7f)
                horizontalLineTo(302.9f)
                curveToRelative(-10.2f, -17.6f, -24.5f, -32.6f, -41.7f, -43.7f)
                curveToRelative(-21.6f, -13.9f, -37.2f, -38.7f, -37.2f, -67.8f)
                verticalLineTo(64.0f)
                horizontalLineTo(160.0f)
                verticalLineTo(208.5f)
                close()
                moveTo(288.0f, 64.0f)
                verticalLineTo(208.5f)
                curveToRelative(0.0f, 5.7f, 3.1f, 10.9f, 7.9f, 14.0f)
                curveToRelative(11.2f, 7.2f, 21.5f, 15.5f, 30.9f, 24.8f)
                lineTo(366.1f, 208.0f)
                lineToRelative(-7.0f, -7.0f)
                curveToRelative(-9.4f, -9.4f, -9.4f, -24.6f, 0.0f, -33.9f)
                reflectiveCurveToRelative(24.6f, -9.4f, 33.9f, 0.0f)
                lineToRelative(24.0f, 24.0f)
                lineToRelative(24.0f, 24.0f)
                curveToRelative(9.4f, 9.4f, 9.4f, 24.6f, 0.0f, 33.9f)
                reflectiveCurveToRelative(-24.6f, 9.4f, -33.9f, 0.0f)
                lineToRelative(-7.0f, -7.0f)
                lineToRelative(-43.3f, 43.3f)
                curveTo(374.0f, 314.1f, 384.0f, 347.9f, 384.0f, 384.0f)
                curveToRelative(0.0f, 39.4f, -11.9f, 76.1f, -32.2f, 106.5f)
                curveToRelative(-9.6f, 14.4f, -26.5f, 21.5f, -43.8f, 21.5f)
                horizontalLineTo(76.1f)
                curveToRelative(-17.3f, 0.0f, -34.2f, -7.1f, -43.8f, -21.5f)
                curveTo(11.9f, 460.1f, 0.0f, 423.4f, 0.0f, 384.0f)
                curveToRelative(0.0f, -67.8f, 35.1f, -127.3f, 88.1f, -161.5f)
                curveToRelative(4.8f, -3.1f, 7.9f, -8.3f, 7.9f, -14.0f)
                verticalLineTo(64.0f)
                curveTo(78.3f, 64.0f, 64.0f, 49.7f, 64.0f, 32.0f)
                reflectiveCurveTo(78.3f, 0.0f, 96.0f, 0.0f)
                horizontalLineToRelative(16.0f)
                horizontalLineTo(272.0f)
                horizontalLineToRelative(16.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                reflectiveCurveToRelative(-14.3f, 32.0f, -32.0f, 32.0f)
                close()
            }
        }
        .build()
        return _bong!!
    }

private var _bong: ImageVector? = null
