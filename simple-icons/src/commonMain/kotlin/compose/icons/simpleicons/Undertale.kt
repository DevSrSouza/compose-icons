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

public val SimpleIcons.Undertale: ImageVector
    get() {
        if (_undertale != null) {
            return _undertale!!
        }
        _undertale = Builder(name = "Undertale", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 0.0f)
                verticalLineToRelative(1.5f)
                horizontalLineTo(1.5f)
                verticalLineTo(3.0f)
                horizontalLineTo(0.0f)
                verticalLineToRelative(12.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(3.0f)
                verticalLineTo(3.0f)
                horizontalLineToRelative(-1.5f)
                verticalLineTo(1.5f)
                horizontalLineTo(21.0f)
                verticalLineTo(0.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(-3.0f)
                verticalLineTo(3.0f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(1.5f)
                horizontalLineTo(6.0f)
                verticalLineTo(0.0f)
                close()
            }
        }
        .build()
        return _undertale!!
    }

private var _undertale: ImageVector? = null
