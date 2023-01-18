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

public val FillGroup.PaperPlaneTilt: ImageVector
    get() {
        if (_paperPlaneTilt != null) {
            return _paperPlaneTilt!!
        }
        _paperPlaneTilt = Builder(name = "PaperPlaneTilt", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(227.7f, 48.3f)
                lineTo(175.3f, 234.2f)
                arcToRelative(15.9f, 15.9f, 0.0f, false, true, -14.1f, 11.6f)
                horizontalLineToRelative(-1.4f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -14.4f, -9.1f)
                lineToRelative(-35.7f, -75.4f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, true, 0.8f, -4.6f)
                lineToRelative(51.3f, -51.3f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, -11.3f, -11.3f)
                lineTo(99.2f, 145.5f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, true, -4.6f, 0.8f)
                lineToRelative(-75.0f, -35.5f)
                arcToRelative(16.6f, 16.6f, 0.0f, false, true, -9.5f, -15.6f)
                arcTo(15.9f, 15.9f, 0.0f, false, true, 21.8f, 80.7f)
                lineTo(208.1f, 28.2f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 17.7f, 6.5f)
                arcTo(16.7f, 16.7f, 0.0f, false, true, 227.7f, 48.3f)
                close()
            }
        }
        .build()
        return _paperPlaneTilt!!
    }

private var _paperPlaneTilt: ImageVector? = null
