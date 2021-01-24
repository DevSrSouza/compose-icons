package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.ChevronCircleRight: ImageVector
    get() {
        if (_chevronCircleRight != null) {
            return _chevronCircleRight!!
        }
        _chevronCircleRight = Builder(name = "ChevronCircleRight", defaultWidth = 512.0.dp,
                defaultHeight = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 8.0f)
                curveToRelative(137.0f, 0.0f, 248.0f, 111.0f, 248.0f, 248.0f)
                reflectiveCurveTo(393.0f, 504.0f, 256.0f, 504.0f)
                reflectiveCurveTo(8.0f, 393.0f, 8.0f, 256.0f)
                reflectiveCurveTo(119.0f, 8.0f, 256.0f, 8.0f)
                close()
                moveTo(369.9f, 239.0f)
                lineTo(234.4f, 103.5f)
                curveToRelative(-9.4f, -9.4f, -24.6f, -9.4f, -33.9f, 0.0f)
                lineToRelative(-17.0f, 17.0f)
                curveToRelative(-9.4f, 9.4f, -9.4f, 24.6f, 0.0f, 33.9f)
                lineTo(285.1f, 256.0f)
                lineTo(183.5f, 357.6f)
                curveToRelative(-9.4f, 9.4f, -9.4f, 24.6f, 0.0f, 33.9f)
                lineToRelative(17.0f, 17.0f)
                curveToRelative(9.4f, 9.4f, 24.6f, 9.4f, 33.9f, 0.0f)
                lineTo(369.9f, 273.0f)
                curveToRelative(9.4f, -9.4f, 9.4f, -24.6f, 0.0f, -34.0f)
                close()
            }
        }
        .build()
        return _chevronCircleRight!!
    }

private var _chevronCircleRight: ImageVector? = null
