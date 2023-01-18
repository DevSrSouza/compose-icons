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

public val RemixIcons.Settings2Line: ImageVector
    get() {
        if (_settings2Line != null) {
            return _settings2Line!!
        }
        _settings2Line = Builder(name = "Settings2Line", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.686f, 4.0f)
                lineToRelative(2.607f, -2.607f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.414f, 0.0f)
                lineTo(15.314f, 4.0f)
                lineTo(19.0f, 4.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, 1.0f)
                verticalLineToRelative(3.686f)
                lineToRelative(2.607f, 2.607f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 1.414f)
                lineTo(20.0f, 15.314f)
                lineTo(20.0f, 19.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, 1.0f)
                horizontalLineToRelative(-3.686f)
                lineToRelative(-2.607f, 2.607f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.414f, 0.0f)
                lineTo(8.686f, 20.0f)
                lineTo(5.0f, 20.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, -1.0f, -1.0f)
                verticalLineToRelative(-3.686f)
                lineToRelative(-2.607f, -2.607f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, -1.414f)
                lineTo(4.0f, 8.686f)
                lineTo(4.0f, 5.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                horizontalLineToRelative(3.686f)
                close()
                moveTo(6.0f, 6.0f)
                verticalLineToRelative(3.515f)
                lineTo(3.515f, 12.0f)
                lineTo(6.0f, 14.485f)
                lineTo(6.0f, 18.0f)
                horizontalLineToRelative(3.515f)
                lineTo(12.0f, 20.485f)
                lineTo(14.485f, 18.0f)
                lineTo(18.0f, 18.0f)
                verticalLineToRelative(-3.515f)
                lineTo(20.485f, 12.0f)
                lineTo(18.0f, 9.515f)
                lineTo(18.0f, 6.0f)
                horizontalLineToRelative(-3.515f)
                lineTo(12.0f, 3.515f)
                lineTo(9.515f, 6.0f)
                lineTo(6.0f, 6.0f)
                close()
                moveTo(12.0f, 16.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 0.0f, -8.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 8.0f)
                close()
                moveTo(12.0f, 14.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, 0.0f, -4.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.0f, 4.0f)
                close()
            }
        }
        .build()
        return _settings2Line!!
    }

private var _settings2Line: ImageVector? = null
