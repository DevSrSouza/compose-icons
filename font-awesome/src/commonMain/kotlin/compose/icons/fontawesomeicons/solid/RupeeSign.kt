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

public val SolidGroup.RupeeSign: ImageVector
    get() {
        if (_rupeeSign != null) {
            return _rupeeSign!!
        }
        _rupeeSign = Builder(name = "RupeeSign", defaultWidth = 320.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 320.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(308.0f, 96.0f)
                curveToRelative(6.627f, 0.0f, 12.0f, -5.373f, 12.0f, -12.0f)
                verticalLineTo(44.0f)
                curveToRelative(0.0f, -6.627f, -5.373f, -12.0f, -12.0f, -12.0f)
                horizontalLineTo(12.0f)
                curveTo(5.373f, 32.0f, 0.0f, 37.373f, 0.0f, 44.0f)
                verticalLineToRelative(44.748f)
                curveToRelative(0.0f, 6.627f, 5.373f, 12.0f, 12.0f, 12.0f)
                horizontalLineToRelative(85.28f)
                curveToRelative(27.308f, 0.0f, 48.261f, 9.958f, 60.97f, 27.252f)
                horizontalLineTo(12.0f)
                curveToRelative(-6.627f, 0.0f, -12.0f, 5.373f, -12.0f, 12.0f)
                verticalLineToRelative(40.0f)
                curveToRelative(0.0f, 6.627f, 5.373f, 12.0f, 12.0f, 12.0f)
                horizontalLineToRelative(158.757f)
                curveToRelative(-6.217f, 36.086f, -32.961f, 58.632f, -74.757f, 58.632f)
                horizontalLineTo(12.0f)
                curveToRelative(-6.627f, 0.0f, -12.0f, 5.373f, -12.0f, 12.0f)
                verticalLineToRelative(53.012f)
                curveToRelative(0.0f, 3.349f, 1.4f, 6.546f, 3.861f, 8.818f)
                lineToRelative(165.052f, 152.356f)
                arcToRelative(12.001f, 12.001f, 0.0f, false, false, 8.139f, 3.182f)
                horizontalLineToRelative(82.562f)
                curveToRelative(10.924f, 0.0f, 16.166f, -13.408f, 8.139f, -20.818f)
                lineTo(116.871f, 319.906f)
                curveToRelative(76.499f, -2.34f, 131.144f, -53.395f, 138.318f, -127.906f)
                horizontalLineTo(308.0f)
                curveToRelative(6.627f, 0.0f, 12.0f, -5.373f, 12.0f, -12.0f)
                verticalLineToRelative(-40.0f)
                curveToRelative(0.0f, -6.627f, -5.373f, -12.0f, -12.0f, -12.0f)
                horizontalLineToRelative(-58.69f)
                curveToRelative(-3.486f, -11.541f, -8.28f, -22.246f, -14.252f, -32.0f)
                horizontalLineTo(308.0f)
                close()
            }
        }
        .build()
        return _rupeeSign!!
    }

private var _rupeeSign: ImageVector? = null
