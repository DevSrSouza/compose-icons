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

public val ThinGroup.HandFist: ImageVector
    get() {
        if (_handFist != null) {
            return _handFist!!
        }
        _handFist = Builder(name = "HandFist", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(200.0f, 84.0f)
                lineTo(180.0f, 84.0f)
                lineTo(180.0f, 64.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, -52.0f, -14.4f)
                arcTo(28.0f, 28.0f, 0.0f, false, false, 76.0f, 64.0f)
                verticalLineToRelative(4.4f)
                arcTo(28.0f, 28.0f, 0.0f, false, false, 28.0f, 88.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(100.0f, 100.0f, 0.0f, false, false, 200.0f, 0.0f)
                lineTo(228.0f, 112.0f)
                arcTo(28.1f, 28.1f, 0.0f, false, false, 200.0f, 84.0f)
                close()
                moveTo(152.0f, 44.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, true, 20.0f, 20.0f)
                lineTo(172.0f, 84.0f)
                lineTo(136.0f, 84.0f)
                arcToRelative(13.4f, 13.4f, 0.0f, false, false, -4.0f, 0.7f)
                lineTo(132.0f, 64.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, true, 152.0f, 44.0f)
                close()
                moveTo(84.0f, 64.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, 40.0f, 0.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, -40.0f, 0.0f)
                lineTo(84.0f, 64.0f)
                close()
                moveTo(36.0f, 88.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, 40.0f, 0.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, -40.0f, 0.0f)
                close()
                moveTo(220.0f, 128.0f)
                arcToRelative(92.0f, 92.0f, 0.0f, false, true, -184.0f, 0.0f)
                verticalLineToRelative(-4.4f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, 44.0f, -5.2f)
                arcTo(28.1f, 28.1f, 0.0f, false, false, 104.0f, 132.0f)
                arcToRelative(27.6f, 27.6f, 0.0f, false, false, 21.7f, -10.4f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, 18.6f, 17.3f)
                arcTo(44.2f, 44.2f, 0.0f, false, false, 124.0f, 176.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, true, 36.0f, -36.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                lineTo(152.0f, 132.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, true, -20.0f, -20.0f)
                lineTo(132.0f, 96.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, true, 20.0f, 20.0f)
                close()
            }
        }
        .build()
        return _handFist!!
    }

private var _handFist: ImageVector? = null
