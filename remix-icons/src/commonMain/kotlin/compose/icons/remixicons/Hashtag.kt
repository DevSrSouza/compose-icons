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

public val RemixIcons.Hashtag: ImageVector
    get() {
        if (_hashtag != null) {
            return _hashtag!!
        }
        _hashtag = Builder(name = "Hashtag", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.784f, 14.0f)
                lineToRelative(0.42f, -4.0f)
                lineTo(4.0f, 10.0f)
                lineTo(4.0f, 8.0f)
                horizontalLineToRelative(4.415f)
                lineToRelative(0.525f, -5.0f)
                horizontalLineToRelative(2.011f)
                lineToRelative(-0.525f, 5.0f)
                horizontalLineToRelative(3.989f)
                lineToRelative(0.525f, -5.0f)
                horizontalLineToRelative(2.011f)
                lineToRelative(-0.525f, 5.0f)
                lineTo(20.0f, 8.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-3.784f)
                lineToRelative(-0.42f, 4.0f)
                lineTo(20.0f, 14.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-4.415f)
                lineToRelative(-0.525f, 5.0f)
                horizontalLineToRelative(-2.011f)
                lineToRelative(0.525f, -5.0f)
                lineTo(9.585f, 16.0f)
                lineToRelative(-0.525f, 5.0f)
                lineTo(7.049f, 21.0f)
                lineToRelative(0.525f, -5.0f)
                lineTo(4.0f, 16.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(3.784f)
                close()
                moveTo(9.795f, 14.0f)
                horizontalLineToRelative(3.99f)
                lineToRelative(0.42f, -4.0f)
                horizontalLineToRelative(-3.99f)
                lineToRelative(-0.42f, 4.0f)
                close()
            }
        }
        .build()
        return _hashtag!!
    }

private var _hashtag: ImageVector? = null
