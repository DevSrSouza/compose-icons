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

public val SolidGroup._4: ImageVector
    get() {
        if (__4 != null) {
            return __4!!
        }
        __4 = Builder(name = "_4", defaultWidth = 384.0.dp, defaultHeight = 512.0.dp, viewportWidth
                = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(189.0f, 77.6f)
                curveToRelative(7.5f, -16.0f, 0.7f, -35.1f, -15.3f, -42.6f)
                reflectiveCurveToRelative(-35.1f, -0.7f, -42.6f, 15.3f)
                lineTo(3.0f, 322.4f)
                curveToRelative(-4.7f, 9.9f, -3.9f, 21.5f, 1.9f, 30.8f)
                reflectiveCurveTo(21.0f, 368.0f, 32.0f, 368.0f)
                horizontalLineTo(256.0f)
                verticalLineToRelative(80.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                reflectiveCurveToRelative(32.0f, -14.3f, 32.0f, -32.0f)
                verticalLineTo(368.0f)
                horizontalLineToRelative(32.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                reflectiveCurveToRelative(-14.3f, -32.0f, -32.0f, -32.0f)
                horizontalLineTo(320.0f)
                verticalLineTo(160.0f)
                curveToRelative(0.0f, -17.7f, -14.3f, -32.0f, -32.0f, -32.0f)
                reflectiveCurveToRelative(-32.0f, 14.3f, -32.0f, 32.0f)
                verticalLineTo(304.0f)
                horizontalLineTo(82.4f)
                lineTo(189.0f, 77.6f)
                close()
            }
        }
        .build()
        return __4!!
    }

private var __4: ImageVector? = null
