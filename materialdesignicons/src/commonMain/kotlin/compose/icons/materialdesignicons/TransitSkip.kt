package compose.icons.materialdesignicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.MaterialDesignIcons

public val MaterialDesignIcons.TransitSkip: ImageVector
    get() {
        if (_transitSkip != null) {
            return _transitSkip!!
        }
        _transitSkip = Builder(name = "TransitSkip", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 12.0f)
                curveTo(21.0f, 8.0f, 18.5f, 4.7f, 15.0f, 3.5f)
                curveTo(14.7f, 2.1f, 13.5f, 1.0f, 12.0f, 1.0f)
                curveTo(10.3f, 1.0f, 9.0f, 2.3f, 9.0f, 4.0f)
                reflectiveCurveTo(10.3f, 7.0f, 12.0f, 7.0f)
                curveTo(13.1f, 7.0f, 14.1f, 6.4f, 14.6f, 5.5f)
                curveTo(17.2f, 6.5f, 19.0f, 9.0f, 19.0f, 12.0f)
                curveTo(19.0f, 14.9f, 17.2f, 17.5f, 14.6f, 18.5f)
                curveTo(14.1f, 17.6f, 13.1f, 17.0f, 12.0f, 17.0f)
                curveTo(10.3f, 17.0f, 9.0f, 18.3f, 9.0f, 20.0f)
                reflectiveCurveTo(10.3f, 23.0f, 12.0f, 23.0f)
                curveTo(13.5f, 23.0f, 14.7f, 21.9f, 15.0f, 20.5f)
                curveTo(18.5f, 19.3f, 21.0f, 15.9f, 21.0f, 12.0f)
                moveTo(12.0f, 5.0f)
                curveTo(11.4f, 5.0f, 11.0f, 4.6f, 11.0f, 4.0f)
                reflectiveCurveTo(11.4f, 3.0f, 12.0f, 3.0f)
                reflectiveCurveTo(13.0f, 3.4f, 13.0f, 4.0f)
                reflectiveCurveTo(12.6f, 5.0f, 12.0f, 5.0f)
                moveTo(12.0f, 21.0f)
                curveTo(11.4f, 21.0f, 11.0f, 20.6f, 11.0f, 20.0f)
                reflectiveCurveTo(11.4f, 19.0f, 12.0f, 19.0f)
                reflectiveCurveTo(13.0f, 19.4f, 13.0f, 20.0f)
                reflectiveCurveTo(12.6f, 21.0f, 12.0f, 21.0f)
                moveTo(12.0f, 9.0f)
                curveTo(13.7f, 9.0f, 15.0f, 10.3f, 15.0f, 12.0f)
                reflectiveCurveTo(13.7f, 15.0f, 12.0f, 15.0f)
                reflectiveCurveTo(9.0f, 13.7f, 9.0f, 12.0f)
                reflectiveCurveTo(10.3f, 9.0f, 12.0f, 9.0f)
                close()
            }
        }
        .build()
        return _transitSkip!!
    }

private var _transitSkip: ImageVector? = null
