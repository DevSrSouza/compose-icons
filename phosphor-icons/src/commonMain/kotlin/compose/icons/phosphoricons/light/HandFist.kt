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

public val LightGroup.HandFist: ImageVector
    get() {
        if (_handFist != null) {
            return _handFist!!
        }
        _handFist = Builder(name = "HandFist", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(200.0f, 82.0f)
                lineTo(182.0f, 82.0f)
                lineTo(182.0f, 64.0f)
                arcToRelative(30.0f, 30.0f, 0.0f, false, false, -54.0f, -18.0f)
                arcTo(30.0f, 30.0f, 0.0f, false, false, 74.0f, 64.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(29.7f, 29.7f, 0.0f, false, false, -18.0f, -6.0f)
                arcTo(30.1f, 30.1f, 0.0f, false, false, 26.0f, 88.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(102.0f, 102.0f, 0.0f, false, false, 204.0f, 0.0f)
                lineTo(230.0f, 112.0f)
                arcTo(30.1f, 30.1f, 0.0f, false, false, 200.0f, 82.0f)
                close()
                moveTo(152.0f, 46.0f)
                arcToRelative(18.1f, 18.1f, 0.0f, false, true, 18.0f, 18.0f)
                lineTo(170.0f, 82.0f)
                lineTo(136.0f, 82.0f)
                lineToRelative(-2.0f, 0.2f)
                lineTo(134.0f, 64.0f)
                arcTo(18.1f, 18.1f, 0.0f, false, true, 152.0f, 46.0f)
                close()
                moveTo(86.0f, 64.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, false, true, 36.0f, 0.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, false, true, -36.0f, 0.0f)
                lineTo(86.0f, 64.0f)
                close()
                moveTo(38.0f, 88.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, false, true, 36.0f, 0.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, false, true, -36.0f, 0.0f)
                close()
                moveTo(218.0f, 128.0f)
                arcToRelative(90.0f, 90.0f, 0.0f, false, true, -180.0f, 0.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(30.0f, 30.0f, 0.0f, false, false, 42.0f, -6.0f)
                arcToRelative(30.0f, 30.0f, 0.0f, false, false, 45.1f, 3.3f)
                arcTo(30.3f, 30.3f, 0.0f, false, false, 140.0f, 139.5f)
                arcTo(46.1f, 46.1f, 0.0f, false, false, 122.0f, 176.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                arcToRelative(34.1f, 34.1f, 0.0f, false, true, 34.0f, -34.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                lineTo(152.0f, 130.0f)
                arcToRelative(18.1f, 18.1f, 0.0f, false, true, -18.0f, -18.0f)
                lineTo(134.0f, 96.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(18.1f, 18.1f, 0.0f, false, true, 18.0f, 18.0f)
                close()
            }
        }
        .build()
        return _handFist!!
    }

private var _handFist: ImageVector? = null
