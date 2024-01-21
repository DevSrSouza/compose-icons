package compose.icons.fontawesomeicons.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.BrandsGroup

public val BrandsGroup.FontAwesome: ImageVector
    get() {
        if (_fontAwesome != null) {
            return _fontAwesome!!
        }
        _fontAwesome = Builder(name = "FontAwesome", defaultWidth = 448.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(448.0f, 48.0f)
                verticalLineTo(384.0f)
                curveTo(385.0f, 407.0f, 366.0f, 416.0f, 329.0f, 416.0f)
                curveTo(266.0f, 416.0f, 242.0f, 384.0f, 179.0f, 384.0f)
                curveTo(159.0f, 384.0f, 143.0f, 388.0f, 128.0f, 392.0f)
                verticalLineTo(328.0f)
                curveTo(143.0f, 324.0f, 159.0f, 320.0f, 179.0f, 320.0f)
                curveTo(242.0f, 320.0f, 266.0f, 352.0f, 329.0f, 352.0f)
                curveTo(349.0f, 352.0f, 364.0f, 349.0f, 384.0f, 343.0f)
                verticalLineTo(135.0f)
                curveTo(364.0f, 141.0f, 349.0f, 144.0f, 329.0f, 144.0f)
                curveTo(266.0f, 144.0f, 242.0f, 112.0f, 179.0f, 112.0f)
                curveTo(128.0f, 112.0f, 104.0f, 133.0f, 64.0f, 141.0f)
                verticalLineTo(448.0f)
                curveTo(64.0f, 466.0f, 50.0f, 480.0f, 32.0f, 480.0f)
                reflectiveCurveTo(0.0f, 466.0f, 0.0f, 448.0f)
                verticalLineTo(64.0f)
                curveTo(0.0f, 46.0f, 14.0f, 32.0f, 32.0f, 32.0f)
                reflectiveCurveTo(64.0f, 46.0f, 64.0f, 64.0f)
                verticalLineTo(77.0f)
                curveTo(104.0f, 69.0f, 128.0f, 48.0f, 179.0f, 48.0f)
                curveTo(242.0f, 48.0f, 266.0f, 80.0f, 329.0f, 80.0f)
                curveTo(366.0f, 80.0f, 385.0f, 71.0f, 448.0f, 48.0f)
                close()
            }
        }
        .build()
        return _fontAwesome!!
    }

private var _fontAwesome: ImageVector? = null
