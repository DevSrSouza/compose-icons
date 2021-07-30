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

public val SolidGroup.LaughSquint: ImageVector
    get() {
        if (_laughSquint != null) {
            return _laughSquint!!
        }
        _laughSquint = Builder(name = "LaughSquint", defaultWidth = 496.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 496.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(248.0f, 8.0f)
                curveTo(111.0f, 8.0f, 0.0f, 119.0f, 0.0f, 256.0f)
                reflectiveCurveToRelative(111.0f, 248.0f, 248.0f, 248.0f)
                reflectiveCurveToRelative(248.0f, -111.0f, 248.0f, -248.0f)
                reflectiveCurveTo(385.0f, 8.0f, 248.0f, 8.0f)
                close()
                moveTo(281.8f, 169.7f)
                lineToRelative(80.0f, -48.0f)
                curveToRelative(11.6f, -6.9f, 24.0f, 7.7f, 15.4f, 18.0f)
                lineTo(343.6f, 180.0f)
                lineToRelative(33.6f, 40.3f)
                curveToRelative(8.7f, 10.4f, -3.9f, 24.8f, -15.4f, 18.0f)
                lineToRelative(-80.0f, -48.0f)
                curveToRelative(-7.7f, -4.7f, -7.7f, -15.9f, 0.0f, -20.6f)
                close()
                moveTo(118.8f, 139.7f)
                curveToRelative(-8.6f, -10.3f, 3.8f, -24.9f, 15.4f, -18.0f)
                lineToRelative(80.0f, 48.0f)
                curveToRelative(7.8f, 4.7f, 7.8f, 15.9f, 0.0f, 20.6f)
                lineToRelative(-80.0f, 48.0f)
                curveToRelative(-11.5f, 6.8f, -24.0f, -7.6f, -15.4f, -18.0f)
                lineToRelative(33.6f, -40.3f)
                lineToRelative(-33.6f, -40.3f)
                close()
                moveTo(398.9f, 306.0f)
                curveTo(390.0f, 377.0f, 329.4f, 432.0f, 256.0f, 432.0f)
                horizontalLineToRelative(-16.0f)
                curveToRelative(-73.4f, 0.0f, -134.0f, -55.0f, -142.9f, -126.0f)
                curveToRelative(-1.2f, -9.5f, 6.3f, -18.0f, 15.9f, -18.0f)
                horizontalLineToRelative(270.0f)
                curveToRelative(9.6f, 0.0f, 17.1f, 8.4f, 15.9f, 18.0f)
                close()
            }
        }
        .build()
        return _laughSquint!!
    }

private var _laughSquint: ImageVector? = null
