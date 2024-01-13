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

public val SimpleIcons.Socialblade: ImageVector
    get() {
        if (_socialblade != null) {
            return _socialblade!!
        }
        _socialblade = Builder(name = "Socialblade", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.323f, 16.688f)
                horizontalLineTo(0.0f)
                verticalLineToRelative(1.893f)
                horizontalLineToRelative(2.323f)
                verticalLineToRelative(-1.893f)
                close()
                moveTo(5.935f, 13.591f)
                horizontalLineTo(3.613f)
                verticalLineToRelative(4.99f)
                horizontalLineToRelative(2.322f)
                verticalLineToRelative(-4.99f)
                close()
                moveTo(9.548f, 14.796f)
                horizontalLineTo(7.226f)
                verticalLineToRelative(3.785f)
                horizontalLineToRelative(2.322f)
                verticalLineToRelative(-3.785f)
                close()
                moveTo(13.161f, 13.935f)
                horizontalLineTo(10.84f)
                verticalLineToRelative(4.646f)
                horizontalLineToRelative(2.322f)
                verticalLineToRelative(-4.646f)
                close()
                moveTo(16.774f, 12.043f)
                horizontalLineToRelative(-2.322f)
                verticalLineToRelative(6.538f)
                horizontalLineToRelative(2.322f)
                verticalLineToRelative(-6.538f)
                close()
                moveTo(20.387f, 10.065f)
                horizontalLineToRelative(-2.323f)
                verticalLineToRelative(8.516f)
                horizontalLineToRelative(2.323f)
                verticalLineToRelative(-8.516f)
                close()
                moveTo(24.0f, 5.42f)
                horizontalLineToRelative(-2.323f)
                verticalLineToRelative(13.16f)
                horizontalLineTo(24.0f)
                verticalLineTo(5.42f)
                close()
            }
        }
        .build()
        return _socialblade!!
    }

private var _socialblade: ImageVector? = null
