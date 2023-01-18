package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.SafariLine: ImageVector
    get() {
        if (_safariLine != null) {
            return _safariLine!!
        }
        _safariLine = Builder(name = "SafariLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.812f, 6.503f)
                lineToRelative(-4.398f, 6.911f)
                lineToRelative(-6.911f, 4.398f)
                arcTo(7.973f, 7.973f, 0.0f, false, false, 11.0f, 19.938f)
                lineTo(11.0f, 18.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(1.938f)
                arcToRelative(7.96f, 7.96f, 0.0f, false, false, 3.906f, -1.618f)
                lineToRelative(-1.37f, -1.37f)
                lineToRelative(1.414f, -1.414f)
                lineToRelative(1.37f, 1.37f)
                arcTo(7.96f, 7.96f, 0.0f, false, false, 19.938f, 13.0f)
                lineTo(18.0f, 13.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(1.938f)
                arcToRelative(7.973f, 7.973f, 0.0f, false, false, -2.126f, -4.497f)
                close()
                moveTo(17.497f, 6.188f)
                arcTo(7.973f, 7.973f, 0.0f, false, false, 13.0f, 4.062f)
                lineTo(13.0f, 6.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(11.0f, 4.062f)
                arcTo(7.96f, 7.96f, 0.0f, false, false, 7.094f, 5.68f)
                lineToRelative(1.37f, 1.37f)
                lineTo(7.05f, 8.464f)
                lineToRelative(-1.37f, -1.37f)
                arcTo(7.96f, 7.96f, 0.0f, false, false, 4.062f, 11.0f)
                lineTo(6.0f, 11.0f)
                verticalLineToRelative(2.0f)
                lineTo(4.062f, 13.0f)
                arcToRelative(7.973f, 7.973f, 0.0f, false, false, 2.126f, 4.497f)
                lineToRelative(4.398f, -6.911f)
                lineToRelative(6.911f, -4.398f)
                close()
                moveTo(12.0f, 22.0f)
                curveTo(6.477f, 22.0f, 2.0f, 17.523f, 2.0f, 12.0f)
                reflectiveCurveTo(6.477f, 2.0f, 12.0f, 2.0f)
                reflectiveCurveToRelative(10.0f, 4.477f, 10.0f, 10.0f)
                reflectiveCurveToRelative(-4.477f, 10.0f, -10.0f, 10.0f)
                close()
            }
        }
        .build()
        return _safariLine!!
    }

private var _safariLine: ImageVector? = null
