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

public val SimpleIcons.Kick: ImageVector
    get() {
        if (_kick != null) {
            return _kick!!
        }
        _kick = Builder(name = "Kick", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.333f, 0.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(5.333f)
                horizontalLineTo(12.0f)
                verticalLineTo(2.667f)
                horizontalLineToRelative(2.667f)
                verticalLineTo(0.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(8.0f)
                horizontalLineTo(20.0f)
                verticalLineToRelative(2.667f)
                horizontalLineToRelative(-2.667f)
                verticalLineToRelative(2.666f)
                horizontalLineTo(20.0f)
                verticalLineTo(16.0f)
                horizontalLineToRelative(2.667f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(-8.0f)
                verticalLineToRelative(-2.667f)
                horizontalLineTo(12.0f)
                verticalLineToRelative(-2.666f)
                horizontalLineTo(9.333f)
                verticalLineTo(24.0f)
                horizontalLineToRelative(-8.0f)
                close()
            }
        }
        .build()
        return _kick!!
    }

private var _kick: ImageVector? = null
