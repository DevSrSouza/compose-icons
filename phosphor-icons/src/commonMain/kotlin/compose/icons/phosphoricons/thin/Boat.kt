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

public val ThinGroup.Boat: ImageVector
    get() {
        if (_boat != null) {
            return _boat!!
        }
        _boat = Builder(name = "Boat", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(219.8f, 114.4f)
                lineTo(204.0f, 109.1f)
                verticalLineTo(56.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, -12.0f)
                horizontalLineTo(132.0f)
                verticalLineTo(24.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -8.0f, 0.0f)
                verticalLineTo(44.0f)
                horizontalLineTo(64.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 52.0f, 56.0f)
                verticalLineToRelative(53.1f)
                lineToRelative(-15.8f, 5.3f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 28.0f, 125.8f)
                verticalLineTo(160.0f)
                arcToRelative(4.3f, 4.3f, 0.0f, false, false, 0.2f, 1.1f)
                curveToRelative(15.1f, 52.9f, 83.5f, 71.2f, 97.1f, 74.4f)
                lineToRelative(2.7f, 0.3f)
                lineToRelative(2.7f, -0.3f)
                curveToRelative(13.6f, -3.2f, 82.0f, -21.5f, 97.1f, -74.4f)
                arcToRelative(4.3f, 4.3f, 0.0f, false, false, 0.2f, -1.1f)
                verticalLineTo(125.8f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 219.8f, 114.4f)
                close()
                moveTo(60.0f, 56.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                horizontalLineTo(192.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                verticalLineToRelative(50.5f)
                lineTo(131.8f, 85.0f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, false, -3.7f, -0.6f)
                horizontalLineToRelative(-0.2f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, false, -3.7f, 0.6f)
                lineTo(60.0f, 106.5f)
                close()
                moveTo(220.0f, 159.4f)
                curveToRelative(-6.0f, 20.3f, -21.4f, 37.4f, -46.0f, 51.0f)
                arcToRelative(185.0f, 185.0f, 0.0f, false, true, -45.1f, 17.3f)
                arcToRelative(5.4f, 5.4f, 0.0f, false, true, -1.8f, 0.0f)
                arcTo(185.0f, 185.0f, 0.0f, false, true, 82.0f, 210.4f)
                curveToRelative(-24.6f, -13.6f, -40.0f, -30.7f, -46.0f, -51.0f)
                verticalLineTo(125.8f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, 2.7f, -3.8f)
                lineTo(124.0f, 93.5f)
                verticalLineTo(168.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                verticalLineTo(93.5f)
                lineTo(217.3f, 122.0f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, 2.7f, 3.8f)
                close()
            }
        }
        .build()
        return _boat!!
    }

private var _boat: ImageVector? = null
