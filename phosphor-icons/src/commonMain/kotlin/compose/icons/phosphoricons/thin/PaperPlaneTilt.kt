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

public val ThinGroup.PaperPlaneTilt: ImageVector
    get() {
        if (_paperPlaneTilt != null) {
            return _paperPlaneTilt!!
        }
        _paperPlaneTilt = Builder(name = "PaperPlaneTilt", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(220.9f, 35.1f)
                arcTo(11.8f, 11.8f, 0.0f, false, false, 209.2f, 32.0f)
                lineTo(22.8f, 84.6f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 21.0f, 107.0f)
                lineToRelative(85.6f, 40.5f)
                arcToRelative(4.4f, 4.4f, 0.0f, false, true, 1.9f, 1.9f)
                lineTo(149.0f, 235.0f)
                arcToRelative(11.8f, 11.8f, 0.0f, false, false, 10.8f, 6.9f)
                horizontalLineToRelative(1.1f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, false, 10.5f, -8.7f)
                lineTo(224.0f, 46.8f)
                arcTo(11.8f, 11.8f, 0.0f, false, false, 220.9f, 35.1f)
                close()
                moveTo(216.3f, 44.7f)
                lineTo(163.7f, 231.0f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, -3.5f, 2.9f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.9f, -2.3f)
                lineTo(115.7f, 146.0f)
                horizontalLineToRelative(0.0f)
                lineToRelative(43.2f, -43.3f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, -5.6f, -5.6f)
                lineTo(110.0f, 140.3f)
                horizontalLineToRelative(0.0f)
                lineTo(24.4f, 99.7f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -2.3f, -3.9f)
                arcTo(3.9f, 3.9f, 0.0f, false, true, 25.0f, 92.3f)
                lineTo(211.3f, 39.7f)
                horizontalLineToRelative(1.2f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, true, 2.8f, 1.1f)
                arcTo(4.5f, 4.5f, 0.0f, false, true, 216.3f, 44.7f)
                close()
            }
        }
        .build()
        return _paperPlaneTilt!!
    }

private var _paperPlaneTilt: ImageVector? = null
