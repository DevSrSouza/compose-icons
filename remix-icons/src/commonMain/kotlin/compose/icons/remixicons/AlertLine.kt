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

public val RemixIcons.AlertLine: ImageVector
    get() {
        if (_alertLine != null) {
            return _alertLine!!
        }
        _alertLine = Builder(name = "AlertLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.866f, 3.0f)
                lineToRelative(9.526f, 16.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.866f, 1.5f)
                lineTo(2.474f, 21.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -0.866f, -1.5f)
                lineTo(11.134f, 3.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.732f, 0.0f)
                close()
                moveTo(4.206f, 19.0f)
                horizontalLineToRelative(15.588f)
                lineTo(12.0f, 5.5f)
                lineTo(4.206f, 19.0f)
                close()
                moveTo(11.0f, 16.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                close()
                moveTo(11.0f, 9.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(-2.0f)
                lineTo(11.0f, 9.0f)
                close()
            }
        }
        .build()
        return _alertLine!!
    }

private var _alertLine: ImageVector? = null
