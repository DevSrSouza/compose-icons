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

public val LightGroup.Detective: ImageVector
    get() {
        if (_detective != null) {
            return _detective!!
        }
        _detective = Builder(name = "Detective", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(180.0f, 146.0f)
                arcToRelative(34.1f, 34.1f, 0.0f, false, false, -33.5f, 28.0f)
                horizontalLineToRelative(-37.0f)
                arcToRelative(34.0f, 34.0f, 0.0f, true, false, 0.0f, 12.0f)
                horizontalLineToRelative(37.0f)
                arcTo(34.0f, 34.0f, 0.0f, true, false, 180.0f, 146.0f)
                close()
                moveTo(76.0f, 202.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, true, true, 22.0f, -22.0f)
                arcTo(22.1f, 22.1f, 0.0f, false, true, 76.0f, 202.0f)
                close()
                moveTo(180.0f, 202.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, true, true, 22.0f, -22.0f)
                arcTo(22.1f, 22.1f, 0.0f, false, true, 180.0f, 202.0f)
                close()
                moveTo(248.0f, 114.0f)
                lineTo(219.1f, 114.0f)
                lineTo(171.6f, 46.2f)
                arcToRelative(13.8f, 13.8f, 0.0f, false, false, -11.6f, -6.0f)
                arcToRelative(14.1f, 14.1f, 0.0f, false, false, -11.5f, 6.2f)
                lineTo(129.7f, 74.7f)
                arcToRelative(2.1f, 2.1f, 0.0f, false, true, -3.4f, 0.0f)
                lineTo(107.5f, 46.4f)
                arcTo(14.1f, 14.1f, 0.0f, false, false, 96.0f, 40.2f)
                arcToRelative(13.8f, 13.8f, 0.0f, false, false, -11.6f, 6.0f)
                lineTo(36.9f, 114.0f)
                lineTo(8.0f, 114.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                lineTo(248.0f, 126.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                close()
                moveTo(94.2f, 53.0f)
                arcToRelative(2.1f, 2.1f, 0.0f, false, true, 1.7f, -0.8f)
                arcToRelative(1.8f, 1.8f, 0.0f, false, true, 1.6f, 0.9f)
                lineToRelative(18.9f, 28.2f)
                arcToRelative(13.8f, 13.8f, 0.0f, false, false, 23.2f, 0.0f)
                lineToRelative(18.9f, -28.2f)
                arcToRelative(1.8f, 1.8f, 0.0f, false, true, 1.6f, -0.9f)
                arcToRelative(2.1f, 2.1f, 0.0f, false, true, 1.7f, 0.8f)
                lineToRelative(42.7f, 61.0f)
                lineTo(51.5f, 114.0f)
                close()
            }
        }
        .build()
        return _detective!!
    }

private var _detective: ImageVector? = null
