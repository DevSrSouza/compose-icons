package compose.icons.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.FillGroup

public val FillGroup.Pill: ImageVector
    get() {
        if (_pill != null) {
            return _pill!!
        }
        _pill = Builder(name = "Pill", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(190.2f, 82.9f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, true, -0.2f, 11.3f)
                lineToRelative(-24.4f, 23.6f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, true, -11.3f, -0.2f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, true, 0.2f, -11.3f)
                lineToRelative(24.4f, -23.6f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 190.2f, 82.9f)
                close()
                moveTo(213.7f, 117.7f)
                lineTo(117.7f, 213.7f)
                arcToRelative(53.3f, 53.3f, 0.0f, false, true, -75.4f, -75.4f)
                lineToRelative(96.0f, -96.0f)
                arcToRelative(53.3f, 53.3f, 0.0f, false, true, 75.4f, 75.4f)
                close()
                moveTo(202.3f, 53.7f)
                arcToRelative(36.9f, 36.9f, 0.0f, false, false, -52.6f, 0.0f)
                lineTo(107.3f, 96.0f)
                lineTo(160.0f, 148.7f)
                lineToRelative(42.3f, -42.4f)
                arcTo(37.1f, 37.1f, 0.0f, false, false, 202.3f, 53.7f)
                close()
            }
        }
        .build()
        return _pill!!
    }

private var _pill: ImageVector? = null
