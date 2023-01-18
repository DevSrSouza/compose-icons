package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.Analytics: ImageVector
    get() {
        if (_analytics != null) {
            return _analytics!!
        }
        _analytics = Builder(name = "Analytics", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(456.0f, 128.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, false, -37.23f, 54.6f)
                lineTo(334.6f, 266.77f)
                arcToRelative(39.86f, 39.86f, 0.0f, false, false, -29.2f, 0.0f)
                lineTo(245.23f, 206.6f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, false, -74.46f, 0.0f)
                lineTo(70.6f, 306.77f)
                arcTo(40.0f, 40.0f, 0.0f, true, false, 93.23f, 329.4f)
                lineTo(193.4f, 229.23f)
                arcToRelative(39.86f, 39.86f, 0.0f, false, false, 29.2f, 0.0f)
                lineToRelative(60.17f, 60.17f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, false, 74.46f, 0.0f)
                lineToRelative(84.17f, -84.17f)
                arcTo(40.0f, 40.0f, 0.0f, true, false, 456.0f, 128.0f)
                close()
            }
        }
        .build()
        return _analytics!!
    }

private var _analytics: ImageVector? = null
