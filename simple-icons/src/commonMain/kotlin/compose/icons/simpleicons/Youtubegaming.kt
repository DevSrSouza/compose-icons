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

public val SimpleIcons.Youtubegaming: ImageVector
    get() {
        if (_youtubegaming != null) {
            return _youtubegaming!!
        }
        _youtubegaming = Builder(name = "Youtubegaming", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(24.0f, 13.2f)
                verticalLineToRelative(-6.0f)
                lineToRelative(-6.0f, -3.6f)
                lineToRelative(-6.0f, 3.6f)
                lineToRelative(-6.0f, -3.6f)
                lineToRelative(-6.0f, 3.6f)
                verticalLineToRelative(6.0f)
                lineToRelative(12.0f, 7.2f)
                close()
                moveTo(8.4f, 10.8f)
                lineTo(6.0f, 10.8f)
                verticalLineToRelative(2.4f)
                lineTo(4.8f, 13.2f)
                verticalLineToRelative(-2.4f)
                lineTo(2.4f, 10.8f)
                lineTo(2.4f, 9.6f)
                horizontalLineToRelative(2.4f)
                lineTo(4.8f, 7.2f)
                lineTo(6.0f, 7.2f)
                verticalLineToRelative(2.4f)
                horizontalLineToRelative(2.4f)
                close()
                moveTo(15.6f, 13.2f)
                arcToRelative(1.2f, 1.2f, 0.0f, false, true, -1.2f, -1.2f)
                curveToRelative(0.0f, -0.66f, 0.54f, -1.2f, 1.2f, -1.2f)
                curveToRelative(0.66f, 0.0f, 1.2f, 0.54f, 1.2f, 1.2f)
                curveToRelative(0.0f, 0.66f, -0.54f, 1.2f, -1.2f, 1.2f)
                close()
                moveTo(19.2f, 10.8f)
                arcTo(1.2f, 1.2f, 0.0f, false, true, 18.0f, 9.6f)
                curveToRelative(0.0f, -0.66f, 0.54f, -1.2f, 1.2f, -1.2f)
                curveToRelative(0.66f, 0.0f, 1.2f, 0.54f, 1.2f, 1.2f)
                curveToRelative(0.0f, 0.66f, -0.54f, 1.2f, -1.2f, 1.2f)
                close()
            }
        }
        .build()
        return _youtubegaming!!
    }

private var _youtubegaming: ImageVector? = null
