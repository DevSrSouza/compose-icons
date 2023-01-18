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

public val LightGroup.Boat: ImageVector
    get() {
        if (_boat != null) {
            return _boat!!
        }
        _boat = Builder(name = "Boat", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(220.4f, 112.5f)
                lineTo(206.0f, 107.7f)
                verticalLineTo(56.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -14.0f, -14.0f)
                horizontalLineTo(134.0f)
                verticalLineTo(24.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -12.0f, 0.0f)
                verticalLineTo(42.0f)
                horizontalLineTo(64.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 50.0f, 56.0f)
                verticalLineToRelative(51.7f)
                lineToRelative(-14.4f, 4.8f)
                arcTo(13.9f, 13.9f, 0.0f, false, false, 26.0f, 125.8f)
                verticalLineTo(160.0f)
                arcToRelative(7.8f, 7.8f, 0.0f, false, false, 0.2f, 1.6f)
                curveToRelative(15.4f, 54.0f, 84.9f, 72.7f, 98.6f, 75.8f)
                arcToRelative(13.0f, 13.0f, 0.0f, false, false, 6.4f, 0.0f)
                curveToRelative(13.7f, -3.1f, 83.2f, -21.8f, 98.6f, -75.8f)
                arcToRelative(7.8f, 7.8f, 0.0f, false, false, 0.2f, -1.6f)
                verticalLineTo(125.8f)
                arcTo(13.9f, 13.9f, 0.0f, false, false, 220.4f, 112.5f)
                close()
                moveTo(62.0f, 56.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                horizontalLineTo(192.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                verticalLineToRelative(47.7f)
                lineTo(132.4f, 83.2f)
                arcToRelative(10.9f, 10.9f, 0.0f, false, false, -4.0f, -0.7f)
                horizontalLineToRelative(-0.8f)
                arcToRelative(10.9f, 10.9f, 0.0f, false, false, -4.0f, 0.7f)
                lineTo(62.0f, 103.7f)
                close()
                moveTo(218.0f, 159.1f)
                curveToRelative(-5.9f, 19.6f, -21.0f, 36.3f, -45.0f, 49.5f)
                arcToRelative(183.5f, 183.5f, 0.0f, false, true, -44.5f, 17.2f)
                horizontalLineToRelative(-1.0f)
                arcTo(183.5f, 183.5f, 0.0f, false, true, 83.0f, 208.6f)
                curveToRelative(-24.0f, -13.2f, -39.1f, -29.9f, -45.0f, -49.5f)
                verticalLineTo(125.8f)
                arcToRelative(1.8f, 1.8f, 0.0f, false, true, 1.4f, -1.9f)
                lineToRelative(18.4f, -6.2f)
                horizontalLineToRelative(0.0f)
                lineTo(122.0f, 96.3f)
                verticalLineTo(168.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                verticalLineTo(96.3f)
                lineToRelative(64.2f, 21.4f)
                horizontalLineToRelative(0.0f)
                lineToRelative(18.4f, 6.2f)
                arcToRelative(1.8f, 1.8f, 0.0f, false, true, 1.4f, 1.9f)
                close()
            }
        }
        .build()
        return _boat!!
    }

private var _boat: ImageVector? = null
