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

public val BrandsGroup.Ello: ImageVector
    get() {
        if (_ello != null) {
            return _ello!!
        }
        _ello = Builder(name = "Ello", defaultWidth = 496.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 496.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(248.0f, 8.0f)
                curveTo(111.03f, 8.0f, 0.0f, 119.03f, 0.0f, 256.0f)
                reflectiveCurveToRelative(111.03f, 248.0f, 248.0f, 248.0f)
                reflectiveCurveToRelative(248.0f, -111.03f, 248.0f, -248.0f)
                reflectiveCurveTo(384.97f, 8.0f, 248.0f, 8.0f)
                close()
                moveTo(391.84f, 293.2f)
                curveTo(375.31f, 358.51f, 315.79f, 404.8f, 248.0f, 404.8f)
                reflectiveCurveToRelative(-127.31f, -46.29f, -143.84f, -111.6f)
                curveToRelative(-1.65f, -7.44f, 2.48f, -15.71f, 9.92f, -17.36f)
                curveToRelative(7.44f, -1.65f, 15.71f, 2.48f, 17.36f, 9.92f)
                curveToRelative(14.05f, 52.91f, 62.0f, 90.11f, 116.56f, 90.11f)
                reflectiveCurveToRelative(102.51f, -37.2f, 116.56f, -90.11f)
                curveToRelative(1.65f, -7.44f, 9.92f, -12.4f, 17.36f, -9.92f)
                curveToRelative(7.44f, 1.65f, 12.4f, 9.92f, 9.92f, 17.36f)
                close()
            }
        }
        .build()
        return _ello!!
    }

private var _ello: ImageVector? = null
