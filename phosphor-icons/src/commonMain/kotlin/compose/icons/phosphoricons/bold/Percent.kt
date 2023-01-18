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

public val BoldGroup.Percent: ImageVector
    get() {
        if (_percent != null) {
            return _percent!!
        }
        _percent = Builder(name = "Percent", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.5f, 64.5f)
                lineToRelative(-144.0f, 144.0f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, true, -17.0f, 0.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -17.0f)
                lineToRelative(144.0f, -144.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 17.0f, 17.0f)
                close()
                moveTo(47.7f, 104.3f)
                arcTo(40.1f, 40.1f, 0.0f, true, true, 76.0f, 116.0f)
                arcTo(40.0f, 40.0f, 0.0f, false, true, 47.7f, 104.3f)
                close()
                moveTo(60.0f, 76.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, false, 4.7f, -11.3f)
                arcTo(15.9f, 15.9f, 0.0f, false, false, 60.0f, 76.0f)
                close()
                moveTo(220.0f, 180.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, true, -11.7f, -28.3f)
                arcTo(40.0f, 40.0f, 0.0f, false, true, 220.0f, 180.0f)
                close()
                moveTo(196.0f, 180.0f)
                arcToRelative(15.9f, 15.9f, 0.0f, false, false, -4.7f, -11.3f)
                horizontalLineToRelative(0.0f)
                arcTo(15.9f, 15.9f, 0.0f, true, false, 196.0f, 180.0f)
                close()
            }
        }
        .build()
        return _percent!!
    }

private var _percent: ImageVector? = null
