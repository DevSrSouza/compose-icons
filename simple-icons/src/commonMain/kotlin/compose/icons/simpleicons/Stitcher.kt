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

public val SimpleIcons.Stitcher: ImageVector
    get() {
        if (_stitcher != null) {
            return _stitcher!!
        }
        _stitcher = Builder(name = "Stitcher", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.59f, 8.516f)
                lineTo(24.0f, 8.516f)
                verticalLineToRelative(6.928f)
                horizontalLineToRelative(-4.41f)
                close()
                moveTo(0.0f, 8.854f)
                horizontalLineToRelative(4.41f)
                verticalLineToRelative(7.803f)
                lineTo(0.0f, 16.657f)
                close()
                moveTo(4.914f, 7.526f)
                horizontalLineToRelative(4.388f)
                verticalLineToRelative(8.572f)
                lineTo(4.914f, 16.098f)
                close()
                moveTo(9.806f, 8.251f)
                horizontalLineToRelative(4.388f)
                verticalLineToRelative(8.81f)
                lineTo(9.806f, 17.061f)
                close()
                moveTo(14.698f, 6.939f)
                horizontalLineToRelative(4.388f)
                verticalLineToRelative(9.158f)
                horizontalLineToRelative(-4.388f)
                close()
            }
        }
        .build()
        return _stitcher!!
    }

private var _stitcher: ImageVector? = null
