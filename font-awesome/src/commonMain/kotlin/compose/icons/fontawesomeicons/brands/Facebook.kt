package compose.icons.fontawesomeicons.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.BrandsGroup

public val BrandsGroup.Facebook: ImageVector
    get() {
        if (_facebook != null) {
            return _facebook!!
        }
        _facebook = Builder(name = "Facebook", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(504.0f, 256.0f)
                curveTo(504.0f, 119.0f, 393.0f, 8.0f, 256.0f, 8.0f)
                reflectiveCurveTo(8.0f, 119.0f, 8.0f, 256.0f)
                curveToRelative(0.0f, 123.78f, 90.69f, 226.38f, 209.25f, 245.0f)
                verticalLineTo(327.69f)
                horizontalLineToRelative(-63.0f)
                verticalLineTo(256.0f)
                horizontalLineToRelative(63.0f)
                verticalLineToRelative(-54.64f)
                curveToRelative(0.0f, -62.15f, 37.0f, -96.48f, 93.67f, -96.48f)
                curveToRelative(27.14f, 0.0f, 55.52f, 4.84f, 55.52f, 4.84f)
                verticalLineToRelative(61.0f)
                horizontalLineToRelative(-31.28f)
                curveToRelative(-30.8f, 0.0f, -40.41f, 19.12f, -40.41f, 38.73f)
                verticalLineTo(256.0f)
                horizontalLineToRelative(68.78f)
                lineToRelative(-11.0f, 71.69f)
                horizontalLineToRelative(-57.78f)
                verticalLineTo(501.0f)
                curveTo(413.31f, 482.38f, 504.0f, 379.78f, 504.0f, 256.0f)
                close()
            }
        }
        .build()
        return _facebook!!
    }

private var _facebook: ImageVector? = null
