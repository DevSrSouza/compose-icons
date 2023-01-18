package compose.icons.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.LightGroup

public val LightGroup.PaperPlaneTilt: ImageVector
    get() {
        if (_paperPlaneTilt != null) {
            return _paperPlaneTilt!!
        }
        _paperPlaneTilt = Builder(name = "PaperPlaneTilt", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(222.3f, 33.7f)
                arcToRelative(13.6f, 13.6f, 0.0f, false, false, -13.7f, -3.6f)
                lineTo(22.3f, 82.7f)
                arcTo(13.9f, 13.9f, 0.0f, false, false, 12.1f, 95.0f)
                arcToRelative(14.1f, 14.1f, 0.0f, false, false, 8.0f, 13.8f)
                lineToRelative(85.6f, 40.5f)
                arcToRelative(2.4f, 2.4f, 0.0f, false, true, 1.0f, 1.0f)
                lineToRelative(40.5f, 85.6f)
                arcToRelative(13.8f, 13.8f, 0.0f, false, false, 12.6f, 8.0f)
                lineTo(161.0f, 243.9f)
                arcToRelative(13.9f, 13.9f, 0.0f, false, false, 12.3f, -10.2f)
                lineTo(225.9f, 47.4f)
                arcTo(13.6f, 13.6f, 0.0f, false, false, 222.3f, 33.7f)
                close()
                moveTo(214.3f, 44.1f)
                lineTo(161.8f, 230.4f)
                arcToRelative(1.8f, 1.8f, 0.0f, false, true, -1.8f, 1.5f)
                arcToRelative(1.8f, 1.8f, 0.0f, false, true, -1.9f, -1.1f)
                lineToRelative(-40.0f, -84.4f)
                lineToRelative(42.3f, -42.3f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -8.5f, -8.5f)
                lineToRelative(-42.3f, 42.3f)
                lineToRelative(-84.4f, -40.0f)
                arcTo(1.8f, 1.8f, 0.0f, false, true, 24.1f, 96.0f)
                arcToRelative(1.8f, 1.8f, 0.0f, false, true, 1.5f, -1.8f)
                lineTo(211.9f, 41.7f)
                horizontalLineToRelative(0.6f)
                arcToRelative(1.6f, 1.6f, 0.0f, false, true, 1.3f, 0.6f)
                arcTo(1.8f, 1.8f, 0.0f, false, true, 214.3f, 44.1f)
                close()
            }
        }
        .build()
        return _paperPlaneTilt!!
    }

private var _paperPlaneTilt: ImageVector? = null
