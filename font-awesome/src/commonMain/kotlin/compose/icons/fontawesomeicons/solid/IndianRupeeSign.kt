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

public val SolidGroup.IndianRupeeSign: ImageVector
    get() {
        if (_indianRupeeSign != null) {
            return _indianRupeeSign!!
        }
        _indianRupeeSign = Builder(name = "IndianRupeeSign", defaultWidth = 320.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 320.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 64.0f)
                curveTo(0.0f, 46.3f, 14.3f, 32.0f, 32.0f, 32.0f)
                horizontalLineTo(96.0f)
                horizontalLineToRelative(16.0f)
                horizontalLineTo(288.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                reflectiveCurveToRelative(-14.3f, 32.0f, -32.0f, 32.0f)
                horizontalLineTo(231.8f)
                curveToRelative(9.6f, 14.4f, 16.7f, 30.6f, 20.7f, 48.0f)
                horizontalLineTo(288.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                reflectiveCurveToRelative(-14.3f, 32.0f, -32.0f, 32.0f)
                horizontalLineTo(252.4f)
                curveToRelative(-13.2f, 58.3f, -61.9f, 103.2f, -122.2f, 110.9f)
                lineTo(274.6f, 422.0f)
                curveToRelative(14.4f, 10.3f, 17.7f, 30.3f, 7.4f, 44.6f)
                reflectiveCurveToRelative(-30.3f, 17.7f, -44.6f, 7.4f)
                lineTo(13.4f, 314.0f)
                curveTo(2.1f, 306.0f, -2.7f, 291.5f, 1.5f, 278.2f)
                reflectiveCurveTo(18.1f, 256.0f, 32.0f, 256.0f)
                horizontalLineToRelative(80.0f)
                curveToRelative(32.8f, 0.0f, 61.0f, -19.7f, 73.3f, -48.0f)
                horizontalLineTo(32.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                reflectiveCurveToRelative(14.3f, -32.0f, 32.0f, -32.0f)
                horizontalLineTo(185.3f)
                curveTo(173.0f, 115.7f, 144.8f, 96.0f, 112.0f, 96.0f)
                horizontalLineTo(96.0f)
                horizontalLineTo(32.0f)
                curveTo(14.3f, 96.0f, 0.0f, 81.7f, 0.0f, 64.0f)
                close()
            }
        }
        .build()
        return _indianRupeeSign!!
    }

private var _indianRupeeSign: ImageVector? = null
