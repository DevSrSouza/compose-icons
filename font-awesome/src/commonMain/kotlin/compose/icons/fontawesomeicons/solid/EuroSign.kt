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

public val SolidGroup.EuroSign: ImageVector
    get() {
        if (_euroSign != null) {
            return _euroSign!!
        }
        _euroSign = Builder(name = "EuroSign", defaultWidth = 320.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 320.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(48.1f, 240.0f)
                curveToRelative(-0.1f, 2.7f, -0.1f, 5.3f, -0.1f, 8.0f)
                verticalLineToRelative(16.0f)
                curveToRelative(0.0f, 2.7f, 0.0f, 5.3f, 0.1f, 8.0f)
                horizontalLineTo(32.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, 14.3f, -32.0f, 32.0f)
                reflectiveCurveToRelative(14.3f, 32.0f, 32.0f, 32.0f)
                horizontalLineTo(60.3f)
                curveTo(89.9f, 419.9f, 170.0f, 480.0f, 264.0f, 480.0f)
                horizontalLineToRelative(24.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                reflectiveCurveToRelative(-14.3f, -32.0f, -32.0f, -32.0f)
                horizontalLineTo(264.0f)
                curveToRelative(-57.9f, 0.0f, -108.2f, -32.4f, -133.9f, -80.0f)
                horizontalLineTo(256.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                reflectiveCurveToRelative(-14.3f, -32.0f, -32.0f, -32.0f)
                horizontalLineTo(112.2f)
                curveToRelative(-0.1f, -2.6f, -0.2f, -5.3f, -0.2f, -8.0f)
                verticalLineTo(248.0f)
                curveToRelative(0.0f, -2.7f, 0.1f, -5.4f, 0.2f, -8.0f)
                horizontalLineTo(256.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                reflectiveCurveToRelative(-14.3f, -32.0f, -32.0f, -32.0f)
                horizontalLineTo(130.1f)
                curveToRelative(25.7f, -47.6f, 76.0f, -80.0f, 133.9f, -80.0f)
                horizontalLineToRelative(24.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                reflectiveCurveToRelative(-14.3f, -32.0f, -32.0f, -32.0f)
                horizontalLineTo(264.0f)
                curveTo(170.0f, 32.0f, 89.9f, 92.1f, 60.3f, 176.0f)
                horizontalLineTo(32.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, 14.3f, -32.0f, 32.0f)
                reflectiveCurveToRelative(14.3f, 32.0f, 32.0f, 32.0f)
                horizontalLineTo(48.1f)
                close()
            }
        }
        .build()
        return _euroSign!!
    }

private var _euroSign: ImageVector? = null
