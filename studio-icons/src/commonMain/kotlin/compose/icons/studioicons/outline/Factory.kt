package compose.icons.studioicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.OutlineGroup

public val OutlineGroup.Factory: ImageVector
    get() {
        if (_factory != null) {
            return _factory!!
        }
        _factory = Builder(name = "Factory", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 22.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(10.0f)
                lineToRelative(7.0f, -3.0f)
                verticalLineToRelative(2.0f)
                lineToRelative(5.0f, -2.0f)
                lineToRelative(0.0f, 3.0f)
                horizontalLineToRelative(3.0f)
                lineToRelative(1.0f, -8.0f)
                horizontalLineToRelative(3.0f)
                lineToRelative(1.0f, 8.0f)
                verticalLineTo(22.0f)
                close()
                moveTo(12.0f, 9.95f)
                lineToRelative(-5.0f, 2.0f)
                verticalLineTo(10.0f)
                lineToRelative(-3.0f, 1.32f)
                verticalLineTo(20.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(-8.0f)
                lineTo(12.0f, 9.95f)
                close()
                moveTo(11.0f, 18.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineTo(18.0f)
                close()
                moveTo(7.0f, 18.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-4.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(18.0f)
                close()
                moveTo(17.0f, 14.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(14.0f)
                close()
            }
        }
        .build()
        return _factory!!
    }

private var _factory: ImageVector? = null
