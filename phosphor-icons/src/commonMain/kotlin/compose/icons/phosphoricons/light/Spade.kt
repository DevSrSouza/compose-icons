package compose.icons.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.LightGroup

public val LightGroup.Spade: ImageVector
    get() {
        if (_spade != null) {
            return _spade!!
        }
        _spade = Builder(name = "Spade", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(160.0f, 238.0f)
                lineTo(96.0f, 238.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -5.7f, -7.9f)
                lineToRelative(12.2f, -36.7f)
                arcTo(57.9f, 57.9f, 0.0f, false, true, 22.0f, 140.0f)
                curveTo(22.0f, 85.3f, 120.6f, 21.6f, 124.8f, 18.9f)
                arcToRelative(6.1f, 6.1f, 0.0f, false, true, 6.4f, 0.0f)
                curveTo(135.4f, 21.6f, 234.0f, 85.3f, 234.0f, 140.0f)
                arcToRelative(57.9f, 57.9f, 0.0f, false, true, -80.5f, 53.4f)
                lineToRelative(12.2f, 36.7f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 160.0f, 238.0f)
                close()
                moveTo(104.3f, 226.0f)
                horizontalLineToRelative(47.4f)
                lineToRelative(-14.8f, -44.2f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 9.6f, -6.5f)
                arcTo(46.0f, 46.0f, 0.0f, false, false, 222.0f, 140.0f)
                curveToRelative(0.0f, -19.5f, -16.6f, -44.7f, -47.9f, -72.9f)
                arcTo(431.8f, 431.8f, 0.0f, false, false, 128.0f, 31.2f)
                arcTo(431.8f, 431.8f, 0.0f, false, false, 81.9f, 67.1f)
                curveTo(50.6f, 95.3f, 34.0f, 120.5f, 34.0f, 140.0f)
                arcToRelative(46.0f, 46.0f, 0.0f, false, false, 75.5f, 35.3f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 9.6f, 6.5f)
                close()
            }
        }
        .build()
        return _spade!!
    }

private var _spade: ImageVector? = null
