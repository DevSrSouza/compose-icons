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

public val MaterialDesignIcons.ShareCircle: ImageVector
    get() {
        if (_shareCircle != null) {
            return _shareCircle!!
        }
        _shareCircle = Builder(name = "ShareCircle", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(6.5f, 2.0f, 2.0f, 6.5f, 2.0f, 12.0f)
                reflectiveCurveTo(6.5f, 22.0f, 12.0f, 22.0f)
                reflectiveCurveTo(22.0f, 17.5f, 22.0f, 12.0f)
                reflectiveCurveTo(17.5f, 2.0f, 12.0f, 2.0f)
                moveTo(14.0f, 16.0f)
                verticalLineTo(13.0f)
                curveTo(10.39f, 13.0f, 7.81f, 14.43f, 6.0f, 17.0f)
                curveTo(6.72f, 13.33f, 8.94f, 9.73f, 14.0f, 9.0f)
                verticalLineTo(6.0f)
                lineTo(19.0f, 11.0f)
                lineTo(14.0f, 16.0f)
                close()
            }
        }
        .build()
        return _shareCircle!!
    }

private var _shareCircle: ImageVector? = null
