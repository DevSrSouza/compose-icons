package compose.icons.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.RegularGroup

public val RegularGroup.Pill: ImageVector
    get() {
        if (_pill != null) {
            return _pill!!
        }
        _pill = Builder(name = "Pill", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(213.7f, 42.3f)
                arcToRelative(53.4f, 53.4f, 0.0f, false, false, -75.4f, 0.0f)
                lineToRelative(-96.0f, 96.0f)
                arcToRelative(53.3f, 53.3f, 0.0f, false, false, 75.4f, 75.4f)
                lineToRelative(48.0f, -48.0f)
                horizontalLineToRelative(0.0f)
                lineToRelative(48.0f, -48.0f)
                arcTo(53.5f, 53.5f, 0.0f, false, false, 213.7f, 42.3f)
                close()
                moveTo(106.3f, 202.3f)
                arcToRelative(36.9f, 36.9f, 0.0f, false, true, -52.6f, 0.0f)
                arcToRelative(37.1f, 37.1f, 0.0f, false, true, 0.0f, -52.6f)
                lineTo(96.0f, 107.3f)
                lineTo(148.7f, 160.0f)
                close()
                moveTo(202.3f, 106.3f)
                lineTo(160.0f, 148.7f)
                lineTo(107.3f, 96.0f)
                lineToRelative(42.4f, -42.3f)
                arcToRelative(36.9f, 36.9f, 0.0f, false, true, 52.6f, 0.0f)
                arcTo(37.1f, 37.1f, 0.0f, false, true, 202.3f, 106.3f)
                close()
                moveTo(190.2f, 82.9f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, true, -0.2f, 11.3f)
                lineToRelative(-24.4f, 23.6f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, true, -11.3f, -0.2f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, true, 0.2f, -11.3f)
                lineToRelative(24.4f, -23.6f)
                arcTo(8.1f, 8.1f, 0.0f, false, true, 190.2f, 82.9f)
                close()
            }
        }
        .build()
        return _pill!!
    }

private var _pill: ImageVector? = null
