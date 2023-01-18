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

public val ThinGroup.Wheelchair: ImageVector
    get() {
        if (_wheelchair != null) {
            return _wheelchair!!
        }
        _wheelchair = Builder(name = "Wheelchair", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(243.8f, 186.7f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.1f, -2.5f)
                lineTo(218.0f, 191.1f)
                lineToRelative(-30.4f, -60.9f)
                arcTo(4.2f, 4.2f, 0.0f, false, false, 184.0f, 128.0f)
                horizontalLineTo(100.0f)
                verticalLineTo(100.1f)
                horizontalLineToRelative(60.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                horizontalLineTo(100.0f)
                verticalLineTo(63.7f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, false, -8.0f, 0.0f)
                verticalLineTo(93.1f)
                arcToRelative(68.0f, 68.0f, 0.0f, true, false, 79.9f, 71.1f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -3.8f, -4.2f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.2f, 3.8f)
                arcTo(60.0f, 60.0f, 0.0f, true, true, 92.0f, 101.2f)
                verticalLineTo(132.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f)
                horizontalLineToRelative(85.5f)
                lineToRelative(30.9f, 61.8f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 216.0f, 200.0f)
                lineToRelative(1.3f, -0.2f)
                lineToRelative(24.0f, -8.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 243.8f, 186.7f)
                close()
                moveTo(80.0f, 40.0f)
                arcTo(16.0f, 16.0f, 0.0f, true, true, 96.0f, 56.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 80.0f, 40.0f)
                close()
            }
        }
        .build()
        return _wheelchair!!
    }

private var _wheelchair: ImageVector? = null
