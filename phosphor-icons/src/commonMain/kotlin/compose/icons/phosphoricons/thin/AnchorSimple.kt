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

public val ThinGroup.AnchorSimple: ImageVector
    get() {
        if (_anchorSimple != null) {
            return _anchorSimple!!
        }
        _anchorSimple = Builder(name = "AnchorSimple", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 116.0f)
                horizontalLineTo(200.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                horizontalLineToRelative(19.9f)
                arcTo(92.0f, 92.0f, 0.0f, false, true, 132.0f, 211.9f)
                verticalLineTo(91.7f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, false, -8.0f, 0.0f)
                verticalLineTo(211.9f)
                arcTo(92.0f, 92.0f, 0.0f, false, true, 36.1f, 124.0f)
                horizontalLineTo(56.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                horizontalLineTo(32.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                arcToRelative(100.0f, 100.0f, 0.0f, false, false, 200.0f, 0.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 224.0f, 116.0f)
                close()
                moveTo(108.0f, 64.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, 20.0f, 20.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, true, 108.0f, 64.0f)
                close()
            }
        }
        .build()
        return _anchorSimple!!
    }

private var _anchorSimple: ImageVector? = null
