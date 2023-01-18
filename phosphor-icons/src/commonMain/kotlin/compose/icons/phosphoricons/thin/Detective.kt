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

public val ThinGroup.Detective: ImageVector
    get() {
        if (_detective != null) {
            return _detective!!
        }
        _detective = Builder(name = "Detective", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(180.0f, 148.0f)
                arcToRelative(31.9f, 31.9f, 0.0f, false, false, -31.7f, 28.0f)
                lineTo(107.7f, 176.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, 0.0f, 8.0f)
                horizontalLineToRelative(40.6f)
                arcTo(32.0f, 32.0f, 0.0f, true, false, 180.0f, 148.0f)
                close()
                moveTo(76.0f, 204.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, 24.0f, -24.0f)
                arcTo(24.1f, 24.1f, 0.0f, false, true, 76.0f, 204.0f)
                close()
                moveTo(180.0f, 204.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, 24.0f, -24.0f)
                arcTo(24.1f, 24.1f, 0.0f, false, true, 180.0f, 204.0f)
                close()
                moveTo(248.0f, 116.0f)
                lineTo(218.1f, 116.0f)
                lineTo(170.0f, 47.3f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -9.8f, -5.1f)
                lineTo(160.0f, 42.2f)
                arcToRelative(11.8f, 11.8f, 0.0f, false, false, -9.8f, 5.3f)
                lineTo(131.3f, 75.8f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, -6.6f, 0.0f)
                lineTo(105.8f, 47.5f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 86.0f, 47.3f)
                lineTo(37.9f, 116.0f)
                lineTo(8.0f, 116.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                lineTo(248.0f, 124.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                close()
                moveTo(92.6f, 51.9f)
                arcToRelative(3.8f, 3.8f, 0.0f, false, true, 3.3f, -1.7f)
                arcTo(3.9f, 3.9f, 0.0f, false, true, 99.2f, 52.0f)
                lineTo(118.0f, 80.2f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 20.0f, 0.0f)
                lineTo(156.8f, 52.0f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, 3.3f, -1.8f)
                arcToRelative(3.8f, 3.8f, 0.0f, false, true, 3.3f, 1.7f)
                lineTo(208.3f, 116.0f)
                lineTo(47.7f, 116.0f)
                close()
            }
        }
        .build()
        return _detective!!
    }

private var _detective: ImageVector? = null
