package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.ArrowCircleRight: ImageVector
    get() {
        if (_arrowCircleRight != null) {
            return _arrowCircleRight!!
        }
        _arrowCircleRight = Builder(name = "ArrowCircleRight", defaultWidth = 512.0.dp,
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
                moveTo(227.1f, 151.6f)
                lineToRelative(75.5f, 72.4f)
                lineTo(120.0f, 224.0f)
                curveToRelative(-13.3f, 0.0f, -24.0f, 10.7f, -24.0f, 24.0f)
                verticalLineToRelative(16.0f)
                curveToRelative(0.0f, 13.3f, 10.7f, 24.0f, 24.0f, 24.0f)
                horizontalLineToRelative(182.6f)
                lineToRelative(-75.5f, 72.4f)
                curveToRelative(-9.7f, 9.3f, -9.9f, 24.8f, -0.4f, 34.3f)
                lineToRelative(11.0f, 10.9f)
                curveToRelative(9.4f, 9.4f, 24.6f, 9.4f, 33.9f, 0.0f)
                lineTo(404.3f, 273.0f)
                curveToRelative(9.4f, -9.4f, 9.4f, -24.6f, 0.0f, -33.9f)
                lineTo(271.6f, 106.3f)
                curveToRelative(-9.4f, -9.4f, -24.6f, -9.4f, -33.9f, 0.0f)
                lineToRelative(-11.0f, 10.9f)
                curveToRelative(-9.5f, 9.6f, -9.3f, 25.1f, 0.4f, 34.4f)
                close()
            }
        }
        .build()
        return _arrowCircleRight!!
    }

private var _arrowCircleRight: ImageVector? = null
