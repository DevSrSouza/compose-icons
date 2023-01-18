package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.Map: ImageVector
    get() {
        if (_map != null) {
            return _map!!
        }
        _map = Builder(name = "Map", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(48.17f, 113.34f)
                arcTo(32.0f, 32.0f, 0.0f, false, false, 32.0f, 141.24f)
                verticalLineTo(438.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, 47.0f, 28.37f)
                curveToRelative(0.43f, -0.23f, 0.85f, -0.47f, 1.26f, -0.74f)
                lineToRelative(84.14f, -55.05f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 3.63f, -6.72f)
                verticalLineTo(46.45f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -12.51f, -6.63f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(212.36f, 39.31f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 200.0f, 46.0f)
                verticalLineTo(403.56f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 3.63f, 6.72f)
                lineToRelative(96.0f, 62.42f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 312.0f, 466.0f)
                verticalLineTo(108.67f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -3.64f, -6.73f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(464.53f, 46.47f)
                arcToRelative(31.64f, 31.64f, 0.0f, false, false, -31.5f, -0.88f)
                arcToRelative(12.07f, 12.07f, 0.0f, false, false, -1.25f, 0.74f)
                lineToRelative(-84.15f, 55.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -3.63f, 6.72f)
                verticalLineTo(465.51f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 12.52f, 6.63f)
                lineToRelative(107.07f, -73.46f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, 16.41f, -28.0f)
                verticalLineToRelative(-296.0f)
                arcTo(32.76f, 32.76f, 0.0f, false, false, 464.53f, 46.47f)
                close()
            }
        }
        .build()
        return _map!!
    }

private var _map: ImageVector? = null
