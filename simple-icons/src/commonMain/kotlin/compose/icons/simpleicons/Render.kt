package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Render: ImageVector
    get() {
        if (_render != null) {
            return _render!!
        }
        _render = Builder(name = "Render", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.586f, 0.0f)
                verticalLineToRelative(3.172f)
                lineTo(7.523f, 3.172f)
                arcToRelative(4.528f, 4.528f, 0.0f, false, false, -3.018f, 1.305f)
                arcToRelative(4.498f, 4.498f, 0.0f, false, false, -1.333f, 2.99f)
                verticalLineToRelative(11.326f)
                lineTo(0.0f, 18.793f)
                lineTo(0.0f, 7.509f)
                arcToRelative(7.472f, 7.472f, 0.0f, false, true, 2.204f, -5.305f)
                arcTo(7.471f, 7.471f, 0.0f, false, true, 4.588f, 0.589f)
                arcTo(7.432f, 7.432f, 0.0f, false, true, 7.51f, 0.0f)
                close()
                moveTo(18.793f, 0.0f)
                verticalLineToRelative(3.158f)
                lineTo(15.62f, 3.158f)
                lineTo(15.62f, 0.0f)
                close()
                moveTo(24.0f, 0.0f)
                verticalLineToRelative(3.158f)
                horizontalLineToRelative(-3.172f)
                lineTo(20.828f, 0.0f)
                close()
                moveTo(24.0f, 5.207f)
                verticalLineToRelative(3.172f)
                horizontalLineToRelative(-3.172f)
                lineTo(20.828f, 5.207f)
                close()
                moveTo(24.0f, 10.414f)
                verticalLineToRelative(3.172f)
                horizontalLineToRelative(-3.172f)
                verticalLineToRelative(-3.172f)
                close()
                moveTo(24.0f, 15.621f)
                verticalLineToRelative(3.172f)
                horizontalLineToRelative(-3.172f)
                lineTo(20.828f, 15.62f)
                close()
                moveTo(24.0f, 20.828f)
                lineTo(24.0f, 24.0f)
                horizontalLineToRelative(-3.172f)
                verticalLineToRelative(-3.172f)
                close()
                moveTo(18.793f, 20.828f)
                lineTo(18.793f, 24.0f)
                lineTo(15.62f, 24.0f)
                verticalLineToRelative(-3.172f)
                close()
                moveTo(13.586f, 20.828f)
                lineTo(13.586f, 24.0f)
                horizontalLineToRelative(-3.172f)
                verticalLineToRelative(-3.172f)
                close()
                moveTo(8.379f, 20.828f)
                lineTo(8.379f, 24.0f)
                lineTo(5.207f, 24.0f)
                verticalLineToRelative(-3.172f)
                close()
                moveTo(3.158f, 20.828f)
                lineTo(3.158f, 24.0f)
                lineTo(0.0f, 24.0f)
                verticalLineToRelative(-3.172f)
                close()
            }
        }
        .build()
        return _render!!
    }

private var _render: ImageVector? = null
