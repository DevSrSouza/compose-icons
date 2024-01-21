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

public val SimpleIcons.Materialformkdocs: ImageVector
    get() {
        if (_materialformkdocs != null) {
            return _materialformkdocs!!
        }
        _materialformkdocs = Builder(name = "Materialformkdocs", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(17.029f, 18.772f)
                lineToRelative(0.777f, 1.166f)
                lineToRelative(-5.417f, 2.709f)
                lineTo(0.0f, 16.451f)
                lineTo(0.0f, 4.063f)
                lineToRelative(5.417f, -2.709f)
                lineToRelative(5.298f, 7.948f)
                lineToRelative(7.867f, -5.24f)
                lineTo(24.0f, 1.354f)
                lineTo(24.0f, 16.84f)
                lineToRelative(-5.417f, 2.709f)
                close()
                moveTo(19.052f, 4.945f)
                verticalLineToRelative(13.253f)
                lineToRelative(3.949f, -1.975f)
                lineTo(23.001f, 2.97f)
                close()
                moveTo(5.076f, 2.642f)
                lineTo(1.458f, 4.45f)
                lineTo(12.73f, 21.358f)
                lineToRelative(3.618f, -1.809f)
                close()
            }
        }
        .build()
        return _materialformkdocs!!
    }

private var _materialformkdocs: ImageVector? = null
