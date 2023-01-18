package compose.icons.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.BoldGroup

public val BoldGroup.Pill: ImageVector
    get() {
        if (_pill != null) {
            return _pill!!
        }
        _pill = Builder(name = "Pill", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.5f, 39.5f)
                arcToRelative(57.2f, 57.2f, 0.0f, false, false, -81.0f, 0.0f)
                lineToRelative(-96.0f, 96.0f)
                arcToRelative(57.3f, 57.3f, 0.0f, true, false, 81.0f, 81.0f)
                lineToRelative(96.0f, -96.0f)
                arcTo(57.4f, 57.4f, 0.0f, false, false, 216.5f, 39.5f)
                close()
                moveTo(103.5f, 199.5f)
                arcToRelative(33.2f, 33.2f, 0.0f, false, true, -47.0f, -47.0f)
                lineTo(96.0f, 113.0f)
                lineToRelative(47.0f, 47.0f)
                close()
                moveTo(199.5f, 103.5f)
                lineTo(160.0f, 143.0f)
                lineTo(113.0f, 96.0f)
                lineToRelative(39.5f, -39.5f)
                arcToRelative(33.2f, 33.2f, 0.0f, false, true, 47.0f, 47.0f)
                close()
                moveTo(185.2f, 80.2f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, true, -0.5f, 17.0f)
                lineToRelative(-16.4f, 15.6f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -16.5f, -17.4f)
                lineToRelative(16.4f, -15.6f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 185.2f, 80.2f)
                close()
            }
        }
        .build()
        return _pill!!
    }

private var _pill: ImageVector? = null
