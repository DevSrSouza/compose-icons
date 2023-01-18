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

public val RemixIcons.AppsFill: ImageVector
    get() {
        if (_appsFill != null) {
            return _appsFill!!
        }
        _appsFill = Builder(name = "AppsFill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.75f, 2.5f)
                arcTo(4.25f, 4.25f, 0.0f, false, true, 11.0f, 6.75f)
                lineTo(11.0f, 11.0f)
                lineTo(6.75f, 11.0f)
                arcToRelative(4.25f, 4.25f, 0.0f, true, true, 0.0f, -8.5f)
                close()
                moveTo(6.75f, 13.0f)
                lineTo(11.0f, 13.0f)
                verticalLineToRelative(4.25f)
                arcTo(4.25f, 4.25f, 0.0f, true, true, 6.75f, 13.0f)
                close()
                moveTo(17.25f, 2.5f)
                arcToRelative(4.25f, 4.25f, 0.0f, true, true, 0.0f, 8.5f)
                lineTo(13.0f, 11.0f)
                lineTo(13.0f, 6.75f)
                arcToRelative(4.25f, 4.25f, 0.0f, false, true, 4.25f, -4.25f)
                close()
                moveTo(13.0f, 13.0f)
                horizontalLineToRelative(4.25f)
                arcTo(4.25f, 4.25f, 0.0f, true, true, 13.0f, 17.25f)
                lineTo(13.0f, 13.0f)
                close()
            }
        }
        .build()
        return _appsFill!!
    }

private var _appsFill: ImageVector? = null
