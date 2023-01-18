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

public val RemixIcons.GlobalLine: ImageVector
    get() {
        if (_globalLine != null) {
            return _globalLine!!
        }
        _globalLine = Builder(name = "GlobalLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 22.0f)
                curveTo(6.477f, 22.0f, 2.0f, 17.523f, 2.0f, 12.0f)
                reflectiveCurveTo(6.477f, 2.0f, 12.0f, 2.0f)
                reflectiveCurveToRelative(10.0f, 4.477f, 10.0f, 10.0f)
                reflectiveCurveToRelative(-4.477f, 10.0f, -10.0f, 10.0f)
                close()
                moveTo(9.71f, 19.667f)
                arcTo(17.9f, 17.9f, 0.0f, false, true, 8.027f, 13.0f)
                lineTo(4.062f, 13.0f)
                arcToRelative(8.008f, 8.008f, 0.0f, false, false, 5.648f, 6.667f)
                close()
                moveTo(10.03f, 13.0f)
                curveToRelative(0.151f, 2.439f, 0.848f, 4.73f, 1.97f, 6.752f)
                arcTo(15.905f, 15.905f, 0.0f, false, false, 13.97f, 13.0f)
                horizontalLineToRelative(-3.94f)
                close()
                moveTo(19.938f, 13.0f)
                horizontalLineToRelative(-3.965f)
                arcToRelative(17.9f, 17.9f, 0.0f, false, true, -1.683f, 6.667f)
                arcTo(8.008f, 8.008f, 0.0f, false, false, 19.938f, 13.0f)
                close()
                moveTo(4.062f, 11.0f)
                horizontalLineToRelative(3.965f)
                arcTo(17.9f, 17.9f, 0.0f, false, true, 9.71f, 4.333f)
                arcTo(8.008f, 8.008f, 0.0f, false, false, 4.062f, 11.0f)
                close()
                moveTo(10.031f, 11.0f)
                horizontalLineToRelative(3.938f)
                arcTo(15.905f, 15.905f, 0.0f, false, false, 12.0f, 4.248f)
                arcTo(15.905f, 15.905f, 0.0f, false, false, 10.03f, 11.0f)
                close()
                moveTo(14.29f, 4.333f)
                arcTo(17.9f, 17.9f, 0.0f, false, true, 15.973f, 11.0f)
                horizontalLineToRelative(3.965f)
                arcToRelative(8.008f, 8.008f, 0.0f, false, false, -5.648f, -6.667f)
                close()
            }
        }
        .build()
        return _globalLine!!
    }

private var _globalLine: ImageVector? = null
