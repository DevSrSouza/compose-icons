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

public val SimpleIcons.Lbry: ImageVector
    get() {
        if (_lbry != null) {
            return _lbry!!
        }
        _lbry = Builder(name = "Lbry", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.349f, 14.189f)
                lineToRelative(0.169f, -1.065f)
                lineToRelative(-1.031f, -0.177f)
                lineToRelative(0.068f, -0.414f)
                lineToRelative(1.446f, 0.245f)
                lineToRelative(-0.236f, 1.48f)
                close()
                moveTo(23.501f, 8.694f)
                verticalLineToRelative(1.192f)
                lineToRelative(-11.734f, 7.211f)
                lineToRelative(-8.842f, -4.337f)
                lineToRelative(0.017f, -0.668f)
                lineToRelative(8.792f, 4.328f)
                lineToRelative(11.176f, -6.864f)
                verticalLineToRelative(-0.49f)
                lineTo(12.359f, 3.977f)
                lineTo(0.592f, 11.256f)
                verticalLineToRelative(3.255f)
                lineToRelative(11.142f, 5.512f)
                lineToRelative(11.632f, -7.135f)
                lineToRelative(0.33f, 0.507f)
                lineToRelative(-11.928f, 7.304f)
                lineTo(0.0f, 14.883f)
                verticalLineToRelative(-3.956f)
                lineTo(12.325f, 3.301f)
                close()
            }
        }
        .build()
        return _lbry!!
    }

private var _lbry: ImageVector? = null
