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

public val FillGroup.Horse: ImageVector
    get() {
        if (_horse != null) {
            return _horse!!
        }
        _horse = Builder(name = "Horse", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(202.1f, 55.0f)
                arcTo(103.2f, 103.2f, 0.0f, false, false, 128.0f, 24.0f)
                horizontalLineToRelative(-8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                verticalLineTo(59.5f)
                lineTo(11.8f, 121.2f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -3.6f, 5.2f)
                arcToRelative(7.8f, 7.8f, 0.0f, false, false, 1.3f, 6.3f)
                lineToRelative(13.8f, 19.1f)
                arcToRelative(31.6f, 31.6f, 0.0f, false, false, 31.3f, 12.8f)
                curveToRelative(13.7f, -2.3f, 38.6f, -4.2f, 61.6f, 6.2f)
                lineTo(90.0f, 207.4f)
                arcToRelative(91.1f, 91.1f, 0.0f, false, true, -20.7f, -13.8f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.3f, 0.6f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.7f, 11.3f)
                arcTo(103.5f, 103.5f, 0.0f, false, false, 128.0f, 232.0f)
                horizontalLineToRelative(2.1f)
                arcToRelative(104.0f, 104.0f, 0.0f, false, false, 72.0f, -177.0f)
                close()
                moveTo(124.0f, 112.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 124.0f, 112.0f)
                close()
            }
        }
        .build()
        return _horse!!
    }

private var _horse: ImageVector? = null
