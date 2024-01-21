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

public val SolidGroup.M: ImageVector
    get() {
        if (_m != null) {
            return _m!!
        }
        _m = Builder(name = "M", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp, viewportWidth =
                448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.7f, 33.4f)
                curveToRelative(13.5f, -4.1f, 28.1f, 1.1f, 35.9f, 12.9f)
                lineTo(224.0f, 294.3f)
                lineTo(389.4f, 46.2f)
                curveToRelative(7.8f, -11.7f, 22.4f, -17.0f, 35.9f, -12.9f)
                reflectiveCurveTo(448.0f, 49.9f, 448.0f, 64.0f)
                verticalLineTo(448.0f)
                curveToRelative(0.0f, 17.7f, -14.3f, 32.0f, -32.0f, 32.0f)
                reflectiveCurveToRelative(-32.0f, -14.3f, -32.0f, -32.0f)
                verticalLineTo(169.7f)
                lineTo(250.6f, 369.8f)
                curveToRelative(-5.9f, 8.9f, -15.9f, 14.2f, -26.6f, 14.2f)
                reflectiveCurveToRelative(-20.7f, -5.3f, -26.6f, -14.2f)
                lineTo(64.0f, 169.7f)
                verticalLineTo(448.0f)
                curveToRelative(0.0f, 17.7f, -14.3f, 32.0f, -32.0f, 32.0f)
                reflectiveCurveToRelative(-32.0f, -14.3f, -32.0f, -32.0f)
                verticalLineTo(64.0f)
                curveTo(0.0f, 49.9f, 9.2f, 37.5f, 22.7f, 33.4f)
                close()
            }
        }
        .build()
        return _m!!
    }

private var _m: ImageVector? = null
