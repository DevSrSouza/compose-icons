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

public val RemixIcons.Compasses2Fill: ImageVector
    get() {
        if (_compasses2Fill != null) {
            return _compasses2Fill!!
        }
        _compasses2Fill = Builder(name = "Compasses2Fill", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.33f, 13.5f)
                arcTo(6.988f, 6.988f, 0.0f, false, false, 19.0f, 8.0f)
                horizontalLineToRelative(2.0f)
                arcToRelative(8.987f, 8.987f, 0.0f, false, true, -3.662f, 7.246f)
                lineToRelative(2.528f, 4.378f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -0.732f, 2.732f)
                lineToRelative(-3.527f, -6.108f)
                arcTo(8.97f, 8.97f, 0.0f, false, true, 12.0f, 17.0f)
                arcToRelative(8.97f, 8.97f, 0.0f, false, true, -3.607f, -0.752f)
                lineToRelative(-3.527f, 6.108f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -0.732f, -2.732f)
                lineToRelative(5.063f, -8.77f)
                arcTo(4.002f, 4.002f, 0.0f, false, true, 11.0f, 4.126f)
                verticalLineTo(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.126f)
                arcToRelative(4.002f, 4.002f, 0.0f, false, true, 1.803f, 6.728f)
                lineTo(16.33f, 13.5f)
                close()
                moveTo(14.6f, 14.502f)
                lineToRelative(-1.528f, -2.647f)
                arcToRelative(4.004f, 4.004f, 0.0f, false, true, -2.142f, 0.0f)
                lineToRelative(-1.528f, 2.647f)
                curveToRelative(0.804f, 0.321f, 1.68f, 0.498f, 2.599f, 0.498f)
                curveToRelative(0.918f, 0.0f, 1.795f, -0.177f, 2.599f, -0.498f)
                close()
                moveTo(12.0f, 9.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, -2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                close()
            }
        }
        .build()
        return _compasses2Fill!!
    }

private var _compasses2Fill: ImageVector? = null
