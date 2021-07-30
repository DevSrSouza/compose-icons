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

public val SimpleIcons.Xdadevelopers: ImageVector
    get() {
        if (_xdadevelopers != null) {
            return _xdadevelopers!!
        }
        _xdadevelopers = Builder(name = "Xdadevelopers", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.84f, 3.052f)
                verticalLineTo(0.0f)
                horizontalLineToRelative(7.843f)
                verticalLineToRelative(17.583f)
                horizontalLineTo(13.84f)
                verticalLineToRelative(-3.024f)
                horizontalLineToRelative(4.591f)
                verticalLineTo(3.052f)
                close()
                moveTo(5.569f, 14.53f)
                verticalLineTo(3.024f)
                horizontalLineToRelative(4.592f)
                verticalLineTo(0.0f)
                horizontalLineTo(2.318f)
                verticalLineToRelative(17.583f)
                horizontalLineTo(6.98f)
                lineTo(10.16f, 24.0f)
                verticalLineToRelative(-9.483f)
                close()
            }
        }
        .build()
        return _xdadevelopers!!
    }

private var _xdadevelopers: ImageVector? = null
