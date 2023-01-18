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

public val IonIcons.Funnel: ImageVector
    get() {
        if (_funnel != null) {
            return _funnel!!
        }
        _funnel = Builder(name = "Funnel", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(296.0f, 464.0f)
                arcToRelative(23.88f, 23.88f, 0.0f, false, true, -7.55f, -1.23f)
                lineToRelative(-80.15f, -26.67f)
                arcTo(23.92f, 23.92f, 0.0f, false, true, 192.0f, 413.32f)
                verticalLineTo(294.11f)
                arcToRelative(0.44f, 0.44f, 0.0f, false, false, -0.09f, -0.13f)
                lineTo(23.26f, 97.54f)
                arcTo(30.0f, 30.0f, 0.0f, false, true, 46.05f, 48.0f)
                horizontalLineTo(466.0f)
                arcToRelative(30.0f, 30.0f, 0.0f, false, true, 22.79f, 49.54f)
                lineTo(320.09f, 294.0f)
                arcToRelative(0.77f, 0.77f, 0.0f, false, false, -0.09f, 0.13f)
                verticalLineTo(440.0f)
                arcToRelative(23.93f, 23.93f, 0.0f, false, true, -24.0f, 24.0f)
                close()
            }
        }
        .build()
        return _funnel!!
    }

private var _funnel: ImageVector? = null
