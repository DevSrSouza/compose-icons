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

public val SimpleIcons.Quicktime: ImageVector
    get() {
        if (_quicktime != null) {
            return _quicktime!!
        }
        _quicktime = Builder(name = "Quicktime", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.002f, 0.0f)
                arcToRelative(11.998f, 12.0f, 0.0f, true, false, 6.629f, 22.0f)
                lineToRelative(1.98f, 1.97f)
                horizontalLineToRelative(3.139f)
                lineToRelative(0.25f, -0.25f)
                verticalLineToRelative(-3.15f)
                lineToRelative(-2.0f, -1.98f)
                arcTo(11.938f, 11.94f, 0.0f, false, false, 24.0f, 12.0f)
                arcTo(11.998f, 12.0f, 0.0f, false, false, 12.002f, 0.0f)
                moveToRelative(0.0f, 4.2f)
                arcToRelative(7.799f, 7.8f, 0.0f, false, true, 6.949f, 11.33f)
                lineToRelative(-5.25f, -5.26f)
                arcToRelative(2.404f, 2.404f, 0.0f, true, false, -3.4f, 3.4f)
                lineToRelative(5.27f, 5.26f)
                arcToRelative(7.759f, 7.76f, 0.0f, false, true, -3.57f, 0.87f)
                arcToRelative(7.799f, 7.8f, 0.0f, false, true, 0.0f, -15.6f)
                close()
            }
        }
        .build()
        return _quicktime!!
    }

private var _quicktime: ImageVector? = null
