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

public val LightGroup.HandPalm: ImageVector
    get() {
        if (_handPalm != null) {
            return _handPalm!!
        }
        _handPalm = Builder(name = "HandPalm", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(188.0f, 86.0f)
                arcToRelative(25.6f, 25.6f, 0.0f, false, false, -14.0f, 4.1f)
                lineTo(174.0f, 52.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, false, -40.6f, -21.5f)
                arcTo(26.0f, 26.0f, 0.0f, false, false, 82.0f, 36.0f)
                lineTo(82.0f, 46.1f)
                arcTo(25.6f, 25.6f, 0.0f, false, false, 68.0f, 42.0f)
                arcTo(26.1f, 26.1f, 0.0f, false, false, 42.0f, 68.0f)
                verticalLineToRelative(84.0f)
                arcToRelative(86.0f, 86.0f, 0.0f, false, false, 172.0f, 0.0f)
                lineTo(214.0f, 112.0f)
                arcTo(26.1f, 26.1f, 0.0f, false, false, 188.0f, 86.0f)
                close()
                moveTo(202.0f, 152.0f)
                arcToRelative(74.0f, 74.0f, 0.0f, false, true, -148.0f, 0.0f)
                lineTo(54.0f, 68.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, 28.0f, 0.0f)
                verticalLineToRelative(44.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                lineTo(94.0f, 36.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, 28.0f, 0.0f)
                verticalLineToRelative(68.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                lineTo(134.0f, 52.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, 28.0f, 0.0f)
                verticalLineToRelative(74.4f)
                arcTo(46.1f, 46.1f, 0.0f, false, false, 122.0f, 172.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                arcToRelative(34.1f, 34.1f, 0.0f, false, true, 34.0f, -34.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, -6.0f)
                lineTo(174.0f, 112.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, 28.0f, 0.0f)
                close()
            }
        }
        .build()
        return _handPalm!!
    }

private var _handPalm: ImageVector? = null
