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

public val ThinGroup.TennisBall: ImageVector
    get() {
        if (_tennisBall != null) {
            return _tennisBall!!
        }
        _tennisBall = Builder(name = "TennisBall", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(227.9f, 128.7f)
                arcToRelative(0.9f, 0.9f, 0.0f, false, false, 0.1f, -0.5f)
                arcToRelative(0.7f, 0.7f, 0.0f, false, false, -0.1f, -0.5f)
                arcTo(99.9f, 99.9f, 0.0f, false, false, 128.0f, 28.0f)
                horizontalLineToRelative(-0.2f)
                arcToRelative(99.9f, 99.9f, 0.0f, false, false, -99.7f, 99.3f)
                arcToRelative(1.1f, 1.1f, 0.0f, false, false, -0.1f, 0.5f)
                arcToRelative(0.7f, 0.7f, 0.0f, false, false, 0.1f, 0.5f)
                arcTo(99.9f, 99.9f, 0.0f, false, false, 128.0f, 228.0f)
                horizontalLineToRelative(0.2f)
                arcToRelative(99.9f, 99.9f, 0.0f, false, false, 99.7f, -99.3f)
                close()
                moveTo(62.9f, 62.9f)
                arcToRelative(91.7f, 91.7f, 0.0f, false, true, 60.8f, -26.8f)
                arcToRelative(91.8f, 91.8f, 0.0f, false, true, -87.6f, 87.6f)
                arcTo(92.4f, 92.4f, 0.0f, false, true, 62.9f, 62.9f)
                close()
                moveTo(36.1f, 131.7f)
                arcToRelative(98.7f, 98.7f, 0.0f, false, false, 66.4f, -29.2f)
                arcToRelative(98.7f, 98.7f, 0.0f, false, false, 29.2f, -66.4f)
                arcToRelative(91.7f, 91.7f, 0.0f, false, true, 88.2f, 88.2f)
                arcToRelative(100.0f, 100.0f, 0.0f, false, false, -95.6f, 95.6f)
                arcToRelative(91.7f, 91.7f, 0.0f, false, true, -88.2f, -88.2f)
                close()
                moveTo(132.3f, 219.9f)
                arcToRelative(91.8f, 91.8f, 0.0f, false, true, 87.6f, -87.6f)
                arcToRelative(91.8f, 91.8f, 0.0f, false, true, -87.6f, 87.6f)
                close()
            }
        }
        .build()
        return _tennisBall!!
    }

private var _tennisBall: ImageVector? = null
