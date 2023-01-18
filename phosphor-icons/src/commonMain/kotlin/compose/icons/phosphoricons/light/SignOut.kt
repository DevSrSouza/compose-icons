package compose.icons.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.LightGroup

public val LightGroup.SignOut: ImageVector
    get() {
        if (_signOut != null) {
            return _signOut!!
        }
        _signOut = Builder(name = "SignOut", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(220.5f, 131.9f)
                lineToRelative(-0.3f, 0.3f)
                lineToRelative(-41.9f, 42.0f)
                arcTo(6.1f, 6.1f, 0.0f, false, true, 174.0f, 176.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -4.2f, -10.2f)
                lineTo(201.5f, 134.0f)
                horizontalLineTo(104.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                horizontalLineToRelative(97.5f)
                lineTo(169.8f, 90.2f)
                arcToRelative(5.8f, 5.8f, 0.0f, false, true, 0.0f, -8.4f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, true, 8.5f, 0.0f)
                lineToRelative(41.9f, 42.0f)
                lineToRelative(0.3f, 0.3f)
                lineToRelative(0.2f, 0.2f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, 0.5f, 0.8f)
                horizontalLineToRelative(0.1f)
                arcToRelative(6.1f, 6.1f, 0.0f, false, true, 0.0f, 5.6f)
                horizontalLineToRelative(-0.1f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, -0.5f, 0.8f)
                close()
                moveTo(104.0f, 210.0f)
                horizontalLineTo(48.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                verticalLineTo(48.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                horizontalLineToRelative(56.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                horizontalLineTo(48.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 34.0f, 48.0f)
                verticalLineTo(208.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f)
                horizontalLineToRelative(56.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                close()
            }
        }
        .build()
        return _signOut!!
    }

private var _signOut: ImageVector? = null
