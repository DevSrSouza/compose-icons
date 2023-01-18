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

public val RemixIcons.RobotLine: ImageVector
    get() {
        if (_robotLine != null) {
            return _robotLine!!
        }
        _robotLine = Builder(name = "RobotLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 4.055f)
                curveToRelative(4.5f, 0.497f, 8.0f, 4.312f, 8.0f, 8.945f)
                verticalLineToRelative(9.0f)
                lineTo(3.0f, 22.0f)
                verticalLineToRelative(-9.0f)
                curveToRelative(0.0f, -4.633f, 3.5f, -8.448f, 8.0f, -8.945f)
                lineTo(11.0f, 1.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(3.055f)
                close()
                moveTo(19.0f, 20.0f)
                verticalLineToRelative(-7.0f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, false, -14.0f, 0.0f)
                verticalLineToRelative(7.0f)
                horizontalLineToRelative(14.0f)
                close()
                moveTo(12.0f, 18.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, true, true, 0.0f, -10.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, 0.0f, 10.0f)
                close()
                moveTo(12.0f, 16.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, true, false, 0.0f, -6.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 0.0f, 6.0f)
                close()
                moveTo(12.0f, 14.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, true, 0.0f, -2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 2.0f)
                close()
            }
        }
        .build()
        return _robotLine!!
    }

private var _robotLine: ImageVector? = null
