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

public val MaterialDesignIcons.AudioInputXlr: ImageVector
    get() {
        if (_audioInputXlr != null) {
            return _audioInputXlr!!
        }
        _audioInputXlr = Builder(name = "AudioInputXlr", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 4.0f)
                curveTo(16.41f, 4.0f, 20.0f, 7.59f, 20.0f, 12.0f)
                reflectiveCurveTo(16.41f, 20.0f, 12.0f, 20.0f)
                reflectiveCurveTo(4.0f, 16.41f, 4.0f, 12.0f)
                reflectiveCurveTo(7.59f, 4.0f, 12.0f, 4.0f)
                moveTo(12.0f, 2.0f)
                curveTo(6.5f, 2.0f, 2.0f, 6.5f, 2.0f, 12.0f)
                reflectiveCurveTo(6.5f, 22.0f, 12.0f, 22.0f)
                reflectiveCurveTo(22.0f, 17.5f, 22.0f, 12.0f)
                reflectiveCurveTo(17.5f, 2.0f, 12.0f, 2.0f)
                moveTo(13.5f, 16.5f)
                curveTo(13.5f, 15.67f, 12.83f, 15.0f, 12.0f, 15.0f)
                reflectiveCurveTo(10.5f, 15.67f, 10.5f, 16.5f)
                curveTo(10.5f, 17.33f, 11.17f, 18.0f, 12.0f, 18.0f)
                reflectiveCurveTo(13.5f, 17.33f, 13.5f, 16.5f)
                moveTo(9.0f, 12.0f)
                curveTo(9.0f, 11.17f, 8.33f, 10.5f, 7.5f, 10.5f)
                reflectiveCurveTo(6.0f, 11.17f, 6.0f, 12.0f)
                reflectiveCurveTo(6.67f, 13.5f, 7.5f, 13.5f)
                reflectiveCurveTo(9.0f, 12.83f, 9.0f, 12.0f)
                moveTo(18.0f, 12.0f)
                curveTo(18.0f, 11.17f, 17.33f, 10.5f, 16.5f, 10.5f)
                curveTo(15.67f, 10.5f, 15.0f, 11.17f, 15.0f, 12.0f)
                reflectiveCurveTo(15.67f, 13.5f, 16.5f, 13.5f)
                curveTo(17.33f, 13.5f, 18.0f, 12.83f, 18.0f, 12.0f)
                close()
            }
        }
        .build()
        return _audioInputXlr!!
    }

private var _audioInputXlr: ImageVector? = null
