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

public val RemixIcons.GooglePlayLine: ImageVector
    get() {
        if (_googlePlayLine != null) {
            return _googlePlayLine!!
        }
        _googlePlayLine = Builder(name = "GooglePlayLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 1.734f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.501f, 0.135f)
                lineToRelative(16.004f, 9.266f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 0.0f, 1.73f)
                lineTo(4.501f, 22.131f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 3.0f, 21.266f)
                lineTo(3.0f, 2.734f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, true, 1.0f, -1.0f)
                close()
                moveTo(12.292f, 13.414f)
                lineToRelative(-4.498f, 4.498f)
                lineToRelative(5.699f, -3.299f)
                lineToRelative(-1.2f, -1.2f)
                close()
                moveTo(5.0f, 6.118f)
                verticalLineToRelative(11.76f)
                lineToRelative(5.88f, -5.88f)
                lineToRelative(-5.88f, -5.88f)
                close()
                moveTo(15.284f, 10.42f)
                lineTo(13.706f, 12.0f)
                lineToRelative(1.578f, 1.577f)
                lineTo(18.008f, 12.0f)
                lineToRelative(-2.725f, -1.579f)
                close()
                moveTo(7.794f, 6.084f)
                lineToRelative(4.5f, 4.5f)
                lineToRelative(1.199f, -1.2f)
                lineToRelative(-5.699f, -3.3f)
                close()
            }
        }
        .build()
        return _googlePlayLine!!
    }

private var _googlePlayLine: ImageVector? = null
