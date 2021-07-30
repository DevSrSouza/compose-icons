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

public val SimpleIcons.Kirby: ImageVector
    get() {
        if (_kirby != null) {
            return _kirby!!
        }
        _kirby = Builder(name = "Kirby", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.571f, 12.0f)
                lineToRelative(-2.857f, 1.48f)
                verticalLineToRelative(0.234f)
                horizontalLineToRelative(2.857f)
                verticalLineTo(16.0f)
                horizontalLineTo(7.43f)
                verticalLineToRelative(-2.286f)
                horizontalLineToRelative(2.857f)
                verticalLineToRelative(-0.25f)
                lineTo(7.429f, 12.0f)
                verticalLineTo(9.143f)
                lineTo(12.0f, 11.598f)
                lineToRelative(4.571f, -2.455f)
                moveTo(12.0f, 0.0f)
                lineToRelative(10.286f, 5.999f)
                verticalLineTo(18.0f)
                lineTo(12.0f, 24.0f)
                lineTo(1.714f, 18.001f)
                verticalLineTo(6.0f)
                close()
                moveTo(2.857f, 6.682f)
                verticalLineToRelative(10.636f)
                lineTo(12.0f, 22.651f)
                lineToRelative(9.143f, -5.333f)
                verticalLineTo(6.682f)
                lineTo(12.0f, 1.349f)
                close()
            }
        }
        .build()
        return _kirby!!
    }

private var _kirby: ImageVector? = null
