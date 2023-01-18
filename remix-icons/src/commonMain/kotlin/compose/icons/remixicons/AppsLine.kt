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

public val RemixIcons.AppsLine: ImageVector
    get() {
        if (_appsLine != null) {
            return _appsLine!!
        }
        _appsLine = Builder(name = "AppsLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
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
                moveTo(9.0f, 9.0f)
                lineTo(9.0f, 6.75f)
                arcTo(2.25f, 2.25f, 0.0f, true, false, 6.75f, 9.0f)
                lineTo(9.0f, 9.0f)
                close()
                moveTo(6.75f, 13.0f)
                lineTo(11.0f, 13.0f)
                verticalLineToRelative(4.25f)
                arcTo(4.25f, 4.25f, 0.0f, true, true, 6.75f, 13.0f)
                close()
                moveTo(6.75f, 15.0f)
                arcTo(2.25f, 2.25f, 0.0f, true, false, 9.0f, 17.25f)
                lineTo(9.0f, 15.0f)
                lineTo(6.75f, 15.0f)
                close()
                moveTo(17.25f, 2.5f)
                arcToRelative(4.25f, 4.25f, 0.0f, true, true, 0.0f, 8.5f)
                lineTo(13.0f, 11.0f)
                lineTo(13.0f, 6.75f)
                arcToRelative(4.25f, 4.25f, 0.0f, false, true, 4.25f, -4.25f)
                close()
                moveTo(17.25f, 9.0f)
                arcTo(2.25f, 2.25f, 0.0f, true, false, 15.0f, 6.75f)
                lineTo(15.0f, 9.0f)
                horizontalLineToRelative(2.25f)
                close()
                moveTo(13.0f, 13.0f)
                horizontalLineToRelative(4.25f)
                arcTo(4.25f, 4.25f, 0.0f, true, true, 13.0f, 17.25f)
                lineTo(13.0f, 13.0f)
                close()
                moveTo(15.0f, 15.0f)
                verticalLineToRelative(2.25f)
                arcTo(2.25f, 2.25f, 0.0f, true, false, 17.25f, 15.0f)
                lineTo(15.0f, 15.0f)
                close()
            }
        }
        .build()
        return _appsLine!!
    }

private var _appsLine: ImageVector? = null
