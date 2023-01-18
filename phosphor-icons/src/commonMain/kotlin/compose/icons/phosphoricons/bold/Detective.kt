package compose.icons.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.BoldGroup

public val BoldGroup.Detective: ImageVector
    get() {
        if (_detective != null) {
            return _detective!!
        }
        _detective = Builder(name = "Detective", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(182.0f, 144.0f)
                arcToRelative(37.9f, 37.9f, 0.0f, false, false, -36.0f, 26.0f)
                lineTo(110.0f, 170.0f)
                arcToRelative(38.0f, 38.0f, 0.0f, true, false, 0.0f, 24.0f)
                horizontalLineToRelative(36.0f)
                arcToRelative(38.0f, 38.0f, 0.0f, true, false, 36.0f, -50.0f)
                close()
                moveTo(74.0f, 196.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, true, true, 14.0f, -14.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 74.0f, 196.0f)
                close()
                moveTo(182.0f, 196.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, true, true, 14.0f, -14.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 182.0f, 196.0f)
                close()
                moveTo(244.0f, 108.0f)
                lineTo(222.2f, 108.0f)
                lineTo(176.5f, 42.7f)
                arcToRelative(19.8f, 19.8f, 0.0f, false, false, -16.6f, -8.5f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, -16.4f, 8.9f)
                lineTo(128.0f, 66.4f)
                lineTo(112.5f, 43.1f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, -16.4f, -8.9f)
                arcToRelative(19.7f, 19.7f, 0.0f, false, false, -16.6f, 8.5f)
                lineTo(33.8f, 108.0f)
                lineTo(12.0f, 108.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                lineTo(244.0f, 132.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                close()
                moveTo(95.8f, 61.3f)
                lineToRelative(15.6f, 23.4f)
                arcToRelative(19.9f, 19.9f, 0.0f, false, false, 33.2f, 0.0f)
                lineToRelative(15.6f, -23.4f)
                lineTo(193.0f, 108.0f)
                lineTo(63.0f, 108.0f)
                close()
            }
        }
        .build()
        return _detective!!
    }

private var _detective: ImageVector? = null
