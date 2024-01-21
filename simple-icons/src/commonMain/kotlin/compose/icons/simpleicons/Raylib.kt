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

public val SimpleIcons.Raylib: ImageVector
    get() {
        if (_raylib != null) {
            return _raylib!!
        }
        _raylib = Builder(name = "Raylib", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 0.0f)
                verticalLineToRelative(24.0f)
                horizontalLineToRelative(24.0f)
                lineTo(24.0f, 0.0f)
                lineTo(0.0f, 0.0f)
                close()
                moveTo(1.5f, 1.5f)
                horizontalLineToRelative(21.0f)
                verticalLineToRelative(21.0f)
                horizontalLineToRelative(-21.0f)
                verticalLineToRelative(-21.0f)
                close()
                moveTo(16.313f, 16.969f)
                verticalLineToRelative(3.281f)
                horizontalLineToRelative(0.937f)
                verticalLineToRelative(-0.469f)
                horizontalLineToRelative(-0.469f)
                lineTo(16.781f, 16.97f)
                horizontalLineToRelative(-0.468f)
                close()
                moveTo(17.719f, 16.969f)
                verticalLineToRelative(0.468f)
                horizontalLineToRelative(0.468f)
                verticalLineToRelative(-0.468f)
                horizontalLineToRelative(-0.468f)
                close()
                moveTo(18.656f, 16.969f)
                verticalLineToRelative(3.281f)
                lineTo(21.0f, 20.25f)
                verticalLineToRelative(-2.344f)
                horizontalLineToRelative(-1.875f)
                verticalLineToRelative(-0.937f)
                horizontalLineToRelative(-0.469f)
                close()
                moveTo(7.875f, 17.906f)
                verticalLineToRelative(2.344f)
                horizontalLineToRelative(0.469f)
                verticalLineToRelative(-1.875f)
                horizontalLineToRelative(1.875f)
                verticalLineToRelative(-0.469f)
                lineTo(7.875f, 17.906f)
                close()
                moveTo(10.688f, 17.906f)
                verticalLineToRelative(0.469f)
                horizontalLineToRelative(1.874f)
                verticalLineToRelative(0.469f)
                horizontalLineToRelative(-1.874f)
                verticalLineToRelative(1.406f)
                horizontalLineToRelative(2.343f)
                verticalLineToRelative(-2.344f)
                horizontalLineToRelative(-2.344f)
                close()
                moveTo(13.5f, 17.906f)
                verticalLineToRelative(2.344f)
                horizontalLineToRelative(1.875f)
                verticalLineToRelative(0.469f)
                lineTo(13.5f, 20.719f)
                verticalLineToRelative(0.468f)
                horizontalLineToRelative(2.344f)
                verticalLineToRelative(-3.28f)
                horizontalLineToRelative(-0.469f)
                verticalLineToRelative(1.874f)
                horizontalLineToRelative(-1.406f)
                verticalLineToRelative(-1.875f)
                lineTo(13.5f, 17.906f)
                close()
                moveTo(17.719f, 17.906f)
                verticalLineToRelative(2.344f)
                horizontalLineToRelative(0.468f)
                verticalLineToRelative(-2.344f)
                horizontalLineToRelative(-0.468f)
                close()
                moveTo(19.125f, 18.375f)
                horizontalLineToRelative(1.406f)
                verticalLineToRelative(1.406f)
                horizontalLineToRelative(-1.406f)
                verticalLineToRelative(-1.406f)
                close()
                moveTo(11.156f, 19.313f)
                horizontalLineToRelative(1.406f)
                verticalLineToRelative(0.468f)
                horizontalLineToRelative(-1.406f)
                verticalLineToRelative(-0.468f)
                close()
            }
        }
        .build()
        return _raylib!!
    }

private var _raylib: ImageVector? = null
