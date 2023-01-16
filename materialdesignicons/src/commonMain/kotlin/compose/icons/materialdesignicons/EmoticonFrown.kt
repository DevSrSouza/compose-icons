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

public val MaterialDesignIcons.EmoticonFrown: ImageVector
    get() {
        if (_emoticonFrown != null) {
            return _emoticonFrown!!
        }
        _emoticonFrown = Builder(name = "EmoticonFrown", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveTo(6.47f, 2.0f, 2.0f, 6.5f, 2.0f, 12.0f)
                reflectiveCurveTo(6.47f, 22.0f, 12.0f, 22.0f)
                curveTo(17.5f, 22.0f, 22.0f, 17.5f, 22.0f, 12.0f)
                reflectiveCurveTo(17.5f, 2.0f, 12.0f, 2.0f)
                moveTo(15.5f, 8.0f)
                curveTo(16.33f, 8.0f, 17.0f, 8.67f, 17.0f, 9.5f)
                reflectiveCurveTo(16.33f, 11.0f, 15.5f, 11.0f)
                reflectiveCurveTo(14.0f, 10.33f, 14.0f, 9.5f)
                reflectiveCurveTo(14.67f, 8.0f, 15.5f, 8.0f)
                moveTo(8.5f, 8.0f)
                curveTo(9.33f, 8.0f, 10.0f, 8.67f, 10.0f, 9.5f)
                reflectiveCurveTo(9.33f, 11.0f, 8.5f, 11.0f)
                reflectiveCurveTo(7.0f, 10.33f, 7.0f, 9.5f)
                reflectiveCurveTo(7.67f, 8.0f, 8.5f, 8.0f)
                moveTo(6.89f, 17.0f)
                curveTo(7.69f, 14.96f, 9.67f, 13.5f, 12.0f, 13.5f)
                reflectiveCurveTo(16.31f, 14.96f, 17.11f, 17.0f)
                horizontalLineTo(6.89f)
                close()
            }
        }
        .build()
        return _emoticonFrown!!
    }

private var _emoticonFrown: ImageVector? = null
