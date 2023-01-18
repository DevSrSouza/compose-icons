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

public val DuotoneGroup.Intersect: ImageVector
    get() {
        if (_intersect != null) {
            return _intersect!!
        }
        _intersect = Builder(name = "Intersect", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(88.0f, 160.0f)
                curveToRelative(0.0f, 2.5f, 0.5f, 4.8f, 0.7f, 7.3f)
                curveToRelative(2.5f, 0.2f, 4.8f, 0.7f, 7.3f, 0.7f)
                arcToRelative(72.0f, 72.0f, 0.0f, false, false, 72.0f, -72.0f)
                curveToRelative(0.0f, -2.5f, -0.5f, -4.8f, -0.7f, -7.3f)
                curveToRelative(-2.5f, -0.2f, -4.8f, -0.7f, -7.3f, -0.7f)
                arcTo(72.0f, 72.0f, 0.0f, false, false, 88.0f, 160.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(174.6f, 81.4f)
                arcToRelative(80.0f, 80.0f, 0.0f, true, false, -93.2f, 93.2f)
                arcToRelative(80.0f, 80.0f, 0.0f, true, false, 93.2f, -93.2f)
                close()
                moveTo(32.0f, 96.0f)
                arcTo(64.0f, 64.0f, 0.0f, false, true, 158.0f, 80.1f)
                arcTo(79.9f, 79.9f, 0.0f, false, false, 80.1f, 158.0f)
                arcTo(64.2f, 64.2f, 0.0f, false, true, 32.0f, 96.0f)
                close()
                moveTo(160.0f, 96.0f)
                arcToRelative(64.1f, 64.1f, 0.0f, false, true, -64.0f, 64.0f)
                arcTo(64.1f, 64.1f, 0.0f, false, true, 160.0f, 96.0f)
                close()
                moveTo(160.0f, 224.0f)
                arcToRelative(64.2f, 64.2f, 0.0f, false, true, -62.0f, -48.1f)
                arcTo(79.9f, 79.9f, 0.0f, false, false, 175.9f, 98.0f)
                arcTo(64.0f, 64.0f, 0.0f, false, true, 160.0f, 224.0f)
                close()
            }
        }
        .build()
        return _intersect!!
    }

private var _intersect: ImageVector? = null
