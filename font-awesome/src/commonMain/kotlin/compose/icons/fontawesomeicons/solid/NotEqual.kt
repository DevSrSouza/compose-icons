package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.NotEqual: ImageVector
    get() {
        if (_notEqual != null) {
            return _notEqual!!
        }
        _notEqual = Builder(name = "NotEqual", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(416.0f, 208.0f)
                curveToRelative(17.67f, 0.0f, 32.0f, -14.33f, 32.0f, -32.0f)
                verticalLineToRelative(-32.0f)
                curveToRelative(0.0f, -17.67f, -14.33f, -32.0f, -32.0f, -32.0f)
                horizontalLineToRelative(-23.88f)
                lineToRelative(51.87f, -66.81f)
                curveToRelative(5.37f, -7.02f, 4.04f, -17.06f, -2.97f, -22.43f)
                lineTo(415.61f, 3.3f)
                curveToRelative(-7.02f, -5.38f, -17.06f, -4.04f, -22.44f, 2.97f)
                lineTo(311.09f, 112.0f)
                horizontalLineTo(32.0f)
                curveToRelative(-17.67f, 0.0f, -32.0f, 14.33f, -32.0f, 32.0f)
                verticalLineToRelative(32.0f)
                curveToRelative(0.0f, 17.67f, 14.33f, 32.0f, 32.0f, 32.0f)
                horizontalLineToRelative(204.56f)
                lineToRelative(-74.53f, 96.0f)
                horizontalLineTo(32.0f)
                curveToRelative(-17.67f, 0.0f, -32.0f, 14.33f, -32.0f, 32.0f)
                verticalLineToRelative(32.0f)
                curveToRelative(0.0f, 17.67f, 14.33f, 32.0f, 32.0f, 32.0f)
                horizontalLineToRelative(55.49f)
                lineToRelative(-51.87f, 66.81f)
                curveToRelative(-5.37f, 7.01f, -4.04f, 17.05f, 2.97f, 22.43f)
                lineTo(64.0f, 508.7f)
                curveToRelative(7.02f, 5.38f, 17.06f, 4.04f, 22.43f, -2.97f)
                lineTo(168.52f, 400.0f)
                horizontalLineTo(416.0f)
                curveToRelative(17.67f, 0.0f, 32.0f, -14.33f, 32.0f, -32.0f)
                verticalLineToRelative(-32.0f)
                curveToRelative(0.0f, -17.67f, -14.33f, -32.0f, -32.0f, -32.0f)
                horizontalLineTo(243.05f)
                lineToRelative(74.53f, -96.0f)
                horizontalLineTo(416.0f)
                close()
            }
        }
        .build()
        return _notEqual!!
    }

private var _notEqual: ImageVector? = null
