package compose.icons.phosphoricons.duotone

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
import compose.icons.phosphoricons.DuotoneGroup

public val DuotoneGroup.Play: ImageVector
    get() {
        if (_play != null) {
            return _play!!
        }
        _play = Builder(name = "Play", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(228.1f, 121.2f)
                lineTo(84.2f, 33.2f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 72.0f, 40.0f)
                verticalLineTo(216.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 12.2f, 6.8f)
                lineToRelative(143.9f, -88.0f)
                arcTo(7.9f, 7.9f, 0.0f, false, false, 228.1f, 121.2f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(80.0f, 232.0f)
                arcToRelative(15.5f, 15.5f, 0.0f, false, true, -7.8f, -2.1f)
                arcTo(15.8f, 15.8f, 0.0f, false, true, 64.0f, 216.0f)
                verticalLineTo(40.0f)
                arcToRelative(15.8f, 15.8f, 0.0f, false, true, 8.2f, -13.9f)
                arcToRelative(15.5f, 15.5f, 0.0f, false, true, 16.1f, 0.3f)
                lineToRelative(144.0f, 87.9f)
                horizontalLineToRelative(0.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 0.0f, 27.4f)
                lineToRelative(-144.0f, 87.9f)
                arcTo(15.4f, 15.4f, 0.0f, false, true, 80.0f, 232.0f)
                close()
                moveTo(80.0f, 40.0f)
                verticalLineTo(216.0f)
                lineToRelative(144.0f, -88.0f)
                close()
            }
        }
        .build()
        return _play!!
    }

private var _play: ImageVector? = null
