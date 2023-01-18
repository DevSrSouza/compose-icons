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

public val DuotoneGroup.Tag: ImageVector
    get() {
        if (_tag != null) {
            return _tag!!
        }
        _tag = Builder(name = "Tag", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(122.7f, 25.9f)
                lineTo(42.0f, 42.0f)
                lineTo(25.9f, 122.7f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 2.2f, 7.2f)
                lineTo(132.5f, 234.3f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, false, 11.3f, 0.0f)
                lineToRelative(90.5f, -90.5f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, false, 0.0f, -11.3f)
                lineTo(129.9f, 28.1f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 122.7f, 25.9f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(240.0f, 126.9f)
                lineTo(135.6f, 22.4f)
                arcTo(16.2f, 16.2f, 0.0f, false, false, 121.1f, 18.0f)
                lineTo(40.4f, 34.2f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, false, -6.2f, 6.2f)
                lineTo(18.0f, 121.1f)
                arcToRelative(15.9f, 15.9f, 0.0f, false, false, 4.4f, 14.4f)
                lineTo(126.9f, 240.0f)
                arcToRelative(15.9f, 15.9f, 0.0f, false, false, 22.6f, 0.0f)
                lineTo(240.0f, 149.5f)
                arcToRelative(15.9f, 15.9f, 0.0f, false, false, 0.0f, -22.6f)
                close()
                moveTo(138.2f, 228.7f)
                lineTo(33.7f, 124.2f)
                lineTo(48.8f, 48.8f)
                lineToRelative(75.4f, -15.1f)
                horizontalLineToRelative(0.0f)
                lineTo(228.7f, 138.2f)
                close()
                moveTo(96.0f, 84.0f)
                arcTo(12.0f, 12.0f, 0.0f, true, true, 84.0f, 72.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 96.0f, 84.0f)
                close()
            }
        }
        .build()
        return _tag!!
    }

private var _tag: ImageVector? = null
