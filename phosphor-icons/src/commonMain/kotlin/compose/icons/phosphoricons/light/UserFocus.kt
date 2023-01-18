package compose.icons.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.LightGroup

public val LightGroup.UserFocus: ImageVector
    get() {
        if (_userFocus != null) {
            return _userFocus!!
        }
        _userFocus = Builder(name = "UserFocus", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(222.0f, 48.0f)
                lineTo(222.0f, 76.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                lineTo(210.0f, 48.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, -2.0f)
                lineTo(180.0f, 46.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                horizontalLineToRelative(28.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 222.0f, 48.0f)
                close()
                moveTo(216.0f, 174.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f)
                verticalLineToRelative(28.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                lineTo(180.0f, 210.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                horizontalLineToRelative(28.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f)
                lineTo(222.0f, 180.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 216.0f, 174.0f)
                close()
                moveTo(76.0f, 210.0f)
                lineTo(48.0f, 210.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                lineTo(46.0f, 180.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -12.0f, 0.0f)
                verticalLineToRelative(28.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f)
                lineTo(76.0f, 222.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                close()
                moveTo(40.0f, 82.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, -6.0f)
                lineTo(46.0f, 48.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                lineTo(76.0f, 46.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                lineTo(48.0f, 34.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 34.0f, 48.0f)
                lineTo(34.0f, 76.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 40.0f, 82.0f)
                close()
                moveTo(175.8f, 178.8f)
                arcToRelative(54.1f, 54.1f, 0.0f, false, false, -95.6f, 0.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -8.1f, 2.5f)
                arcToRelative(6.1f, 6.1f, 0.0f, false, true, -2.5f, -8.1f)
                arcToRelative(65.7f, 65.7f, 0.0f, false, true, 35.3f, -31.0f)
                arcToRelative(38.0f, 38.0f, 0.0f, true, true, 46.2f, 0.0f)
                arcToRelative(65.7f, 65.7f, 0.0f, false, true, 35.3f, 31.0f)
                arcToRelative(6.1f, 6.1f, 0.0f, false, true, -2.5f, 8.1f)
                arcToRelative(5.8f, 5.8f, 0.0f, false, true, -2.8f, 0.7f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 175.8f, 178.8f)
                close()
                moveTo(128.0f, 138.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, true, false, -26.0f, -26.0f)
                arcTo(26.1f, 26.1f, 0.0f, false, false, 128.0f, 138.0f)
                close()
            }
        }
        .build()
        return _userFocus!!
    }

private var _userFocus: ImageVector? = null
