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

public val ThinGroup.Horse: ImageVector
    get() {
        if (_horse != null) {
            return _horse!!
        }
        _horse = Builder(name = "Horse", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(199.2f, 57.8f)
                arcTo(99.2f, 99.2f, 0.0f, false, false, 128.0f, 28.0f)
                horizontalLineToRelative(-8.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                verticalLineTo(61.8f)
                lineTo(13.9f, 124.6f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -1.8f, 2.6f)
                arcToRelative(3.8f, 3.8f, 0.0f, false, false, 0.7f, 3.1f)
                lineToRelative(13.7f, 19.2f)
                arcTo(28.0f, 28.0f, 0.0f, false, false, 54.0f, 160.7f)
                curveToRelative(15.0f, -2.6f, 43.1f, -4.6f, 68.2f, 8.6f)
                lineTo(91.4f, 212.4f)
                arcToRelative(92.0f, 92.0f, 0.0f, false, true, -24.7f, -15.8f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, -5.4f, 5.9f)
                arcTo(99.5f, 99.5f, 0.0f, false, false, 128.0f, 228.0f)
                horizontalLineToRelative(2.0f)
                arcToRelative(100.5f, 100.5f, 0.0f, false, false, 98.0f, -98.6f)
                arcTo(99.3f, 99.3f, 0.0f, false, false, 199.2f, 57.8f)
                close()
                moveTo(220.0f, 129.3f)
                arcTo(92.2f, 92.2f, 0.0f, false, true, 129.9f, 220.0f)
                arcToRelative(93.5f, 93.5f, 0.0f, false, true, -30.8f, -4.6f)
                lineToRelative(31.0f, -43.5f)
                arcTo(52.0f, 52.0f, 0.0f, false, false, 180.0f, 120.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -8.0f, 0.0f)
                arcToRelative(44.1f, 44.1f, 0.0f, false, true, -43.0f, 44.0f)
                curveToRelative(-27.9f, -16.3f, -59.7f, -14.0f, -76.4f, -11.2f)
                arcToRelative(19.9f, 19.9f, 0.0f, false, true, -19.6f, -8.0f)
                lineTo(21.8f, 129.2f)
                lineTo(122.1f, 67.4f)
                arcTo(3.9f, 3.9f, 0.0f, false, false, 124.0f, 64.0f)
                verticalLineTo(36.0f)
                horizontalLineToRelative(4.0f)
                arcToRelative(92.0f, 92.0f, 0.0f, false, true, 92.0f, 93.3f)
                close()
                moveTo(132.0f, 100.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -8.0f, -8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 132.0f, 100.0f)
                close()
            }
        }
        .build()
        return _horse!!
    }

private var _horse: ImageVector? = null
