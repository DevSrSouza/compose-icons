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

public val FillGroup.SkipForwardCircle: ImageVector
    get() {
        if (_skipForwardCircle != null) {
            return _skipForwardCircle!!
        }
        _skipForwardCircle = Builder(name = "SkipForwardCircle", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 24.0f)
                arcTo(104.0f, 104.0f, 0.0f, true, false, 232.0f, 128.0f)
                arcTo(104.2f, 104.2f, 0.0f, false, false, 128.0f, 24.0f)
                close()
                moveTo(164.0f, 160.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                lineTo(148.0f, 137.6f)
                lineToRelative(-43.6f, 29.1f)
                arcTo(8.7f, 8.7f, 0.0f, false, true, 100.0f, 168.0f)
                arcToRelative(8.5f, 8.5f, 0.0f, false, true, -3.8f, -0.9f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 92.0f, 160.0f)
                lineTo(92.0f, 96.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 4.2f, -7.1f)
                arcToRelative(8.3f, 8.3f, 0.0f, false, true, 8.2f, 0.4f)
                lineTo(148.0f, 118.4f)
                lineTo(148.0f, 96.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                close()
            }
        }
        .build()
        return _skipForwardCircle!!
    }

private var _skipForwardCircle: ImageVector? = null
