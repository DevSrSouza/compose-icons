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

public val BoldGroup.PaperPlaneTilt: ImageVector
    get() {
        if (_paperPlaneTilt != null) {
            return _paperPlaneTilt!!
        }
        _paperPlaneTilt = Builder(name = "PaperPlaneTilt", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(226.6f, 29.4f)
                arcTo(20.2f, 20.2f, 0.0f, false, false, 207.0f, 24.3f)
                horizontalLineToRelative(0.0f)
                lineTo(20.7f, 76.9f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -3.2f, 37.3f)
                lineToRelative(84.4f, 39.9f)
                lineToRelative(39.9f, 84.4f)
                arcToRelative(19.7f, 19.7f, 0.0f, false, false, 18.0f, 11.4f)
                horizontalLineToRelative(1.7f)
                arcToRelative(19.9f, 19.9f, 0.0f, false, false, 17.6f, -14.5f)
                lineTo(231.7f, 49.0f)
                arcTo(20.2f, 20.2f, 0.0f, false, false, 226.6f, 29.4f)
                close()
                moveTo(158.9f, 218.5f)
                lineToRelative(-33.6f, -70.9f)
                lineToRelative(39.3f, -39.2f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -17.0f, -17.0f)
                lineToRelative(-39.2f, 39.3f)
                lineTo(37.5f, 97.1f)
                lineTo(206.6f, 49.4f)
                close()
            }
        }
        .build()
        return _paperPlaneTilt!!
    }

private var _paperPlaneTilt: ImageVector? = null
