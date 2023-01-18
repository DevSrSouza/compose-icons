package compose.icons.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.ThinGroup

public val ThinGroup.NumberNine: ImageVector
    get() {
        if (_numberNine != null) {
            return _numberNine!!
        }
        _numberNine = Builder(name = "NumberNine", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(179.9f, 118.1f)
                arcToRelative(0.4f, 0.4f, 0.0f, false, false, 0.1f, -0.3f)
                arcTo(59.0f, 59.0f, 0.0f, false, false, 188.0f, 88.0f)
                arcToRelative(60.0f, 60.0f, 0.0f, true, false, -30.8f, 52.4f)
                lineToRelative(-48.9f, 81.5f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 1.4f, 5.5f)
                arcToRelative(3.6f, 3.6f, 0.0f, false, false, 2.0f, 0.6f)
                arcToRelative(4.2f, 4.2f, 0.0f, false, false, 3.5f, -1.9f)
                lineToRelative(64.1f, -106.9f)
                curveToRelative(0.0f, -0.1f, 0.0f, -0.2f, 0.1f, -0.2f)
                close()
                moveTo(128.0f, 140.0f)
                arcToRelative(52.0f, 52.0f, 0.0f, true, true, 52.0f, -52.0f)
                arcToRelative(51.5f, 51.5f, 0.0f, false, true, -7.4f, 26.7f)
                lineToRelative(-0.2f, 0.4f)
                arcTo(52.1f, 52.1f, 0.0f, false, true, 128.0f, 140.0f)
                close()
            }
        }
        .build()
        return _numberNine!!
    }

private var _numberNine: ImageVector? = null
