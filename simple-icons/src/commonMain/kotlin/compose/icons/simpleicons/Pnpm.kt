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

public val SimpleIcons.Pnpm: ImageVector
    get() {
        if (_pnpm != null) {
            return _pnpm!!
        }
        _pnpm = Builder(name = "Pnpm", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 0.0f)
                verticalLineToRelative(7.5f)
                horizontalLineToRelative(7.5f)
                lineTo(7.5f, 0.0f)
                close()
                moveTo(8.25f, 0.0f)
                verticalLineToRelative(7.5f)
                horizontalLineToRelative(7.498f)
                lineTo(15.748f, 0.0f)
                close()
                moveTo(16.5f, 0.0f)
                verticalLineToRelative(7.5f)
                lineTo(24.0f, 7.5f)
                lineTo(24.0f, 0.0f)
                close()
                moveTo(8.25f, 8.25f)
                verticalLineToRelative(7.5f)
                horizontalLineToRelative(7.498f)
                verticalLineToRelative(-7.5f)
                close()
                moveTo(16.5f, 8.25f)
                verticalLineToRelative(7.5f)
                lineTo(24.0f, 15.75f)
                verticalLineToRelative(-7.5f)
                close()
                moveTo(0.0f, 16.5f)
                lineTo(0.0f, 24.0f)
                horizontalLineToRelative(7.5f)
                verticalLineToRelative(-7.5f)
                close()
                moveTo(8.25f, 16.5f)
                lineTo(8.25f, 24.0f)
                horizontalLineToRelative(7.498f)
                verticalLineToRelative(-7.5f)
                close()
                moveTo(16.5f, 16.5f)
                lineTo(16.5f, 24.0f)
                lineTo(24.0f, 24.0f)
                verticalLineToRelative(-7.5f)
                close()
            }
        }
        .build()
        return _pnpm!!
    }

private var _pnpm: ImageVector? = null
