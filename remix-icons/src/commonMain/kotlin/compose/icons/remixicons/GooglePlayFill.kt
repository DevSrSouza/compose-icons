package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.GooglePlayFill: ImageVector
    get() {
        if (_googlePlayFill != null) {
            return _googlePlayFill!!
        }
        _googlePlayFill = Builder(name = "GooglePlayFill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.609f, 1.814f)
                lineTo(13.792f, 12.0f)
                lineTo(3.61f, 22.186f)
                arcToRelative(0.996f, 0.996f, 0.0f, false, true, -0.61f, -0.92f)
                lineTo(3.0f, 2.734f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.609f, -0.92f)
                close()
                moveTo(14.499f, 12.707f)
                lineToRelative(2.302f, 2.302f)
                lineToRelative(-10.937f, 6.333f)
                lineToRelative(8.635f, -8.635f)
                close()
                moveTo(17.698f, 9.509f)
                lineToRelative(2.807f, 1.626f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 1.73f)
                lineToRelative(-2.808f, 1.626f)
                lineTo(15.206f, 12.0f)
                lineToRelative(2.492f, -2.491f)
                close()
                moveTo(5.864f, 2.658f)
                lineTo(16.802f, 8.99f)
                lineToRelative(-2.303f, 2.303f)
                lineToRelative(-8.635f, -8.635f)
                close()
            }
        }
        .build()
        return _googlePlayFill!!
    }

private var _googlePlayFill: ImageVector? = null
