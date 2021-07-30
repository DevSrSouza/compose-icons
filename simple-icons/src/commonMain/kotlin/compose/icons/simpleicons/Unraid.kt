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

public val SimpleIcons.Unraid: ImageVector
    get() {
        if (_unraid != null) {
            return _unraid!!
        }
        _unraid = Builder(name = "Unraid", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.406f, 8.528f)
                horizontalLineToRelative(1.17f)
                verticalLineToRelative(6.926f)
                horizontalLineToRelative(-1.17f)
                close()
                moveTo(1.17f, 15.454f)
                lineTo(0.0f, 15.454f)
                lineTo(0.0f, 8.528f)
                horizontalLineToRelative(1.17f)
                close()
                moveTo(5.704f, 16.282f)
                horizontalLineToRelative(1.17f)
                verticalLineToRelative(2.645f)
                horizontalLineToRelative(-1.17f)
                close()
                moveTo(2.844f, 13.313f)
                horizontalLineToRelative(1.169f)
                verticalLineToRelative(4.282f)
                horizontalLineToRelative(-1.17f)
                close()
                moveTo(8.547f, 13.313f)
                horizontalLineToRelative(1.17f)
                verticalLineToRelative(4.282f)
                horizontalLineToRelative(-1.17f)
                close()
                moveTo(22.83f, 8.528f)
                lineTo(24.0f, 8.528f)
                verticalLineToRelative(6.926f)
                horizontalLineToRelative(-1.17f)
                close()
                moveTo(18.296f, 7.718f)
                horizontalLineToRelative(-1.17f)
                lineTo(17.126f, 5.073f)
                horizontalLineToRelative(1.17f)
                close()
                moveTo(21.156f, 10.668f)
                horizontalLineToRelative(-1.169f)
                lineTo(19.987f, 6.406f)
                horizontalLineToRelative(1.17f)
                close()
                moveTo(15.436f, 10.668f)
                horizontalLineToRelative(-1.17f)
                lineTo(14.266f, 6.406f)
                horizontalLineToRelative(1.17f)
                close()
            }
        }
        .build()
        return _unraid!!
    }

private var _unraid: ImageVector? = null
