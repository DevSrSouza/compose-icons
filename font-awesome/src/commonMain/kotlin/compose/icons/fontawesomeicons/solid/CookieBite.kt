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

public val SolidGroup.CookieBite: ImageVector
    get() {
        if (_cookieBite != null) {
            return _cookieBite!!
        }
        _cookieBite = Builder(name = "CookieBite", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(510.52f, 255.82f)
                curveToRelative(-69.97f, -0.85f, -126.47f, -57.69f, -126.47f, -127.86f)
                curveToRelative(-70.17f, 0.0f, -127.0f, -56.49f, -127.86f, -126.45f)
                curveToRelative(-27.26f, -4.14f, -55.13f, 0.3f, -79.72f, 12.82f)
                lineToRelative(-69.13f, 35.22f)
                arcToRelative(132.221f, 132.221f, 0.0f, false, false, -57.79f, 57.81f)
                lineToRelative(-35.1f, 68.88f)
                arcToRelative(132.645f, 132.645f, 0.0f, false, false, -12.82f, 80.95f)
                lineToRelative(12.08f, 76.27f)
                arcToRelative(132.521f, 132.521f, 0.0f, false, false, 37.16f, 72.96f)
                lineToRelative(54.77f, 54.76f)
                arcToRelative(132.036f, 132.036f, 0.0f, false, false, 72.71f, 37.06f)
                lineToRelative(76.71f, 12.15f)
                curveToRelative(27.51f, 4.36f, 55.7f, -0.11f, 80.53f, -12.76f)
                lineToRelative(69.13f, -35.21f)
                arcToRelative(132.273f, 132.273f, 0.0f, false, false, 57.79f, -57.81f)
                lineToRelative(35.1f, -68.88f)
                curveToRelative(12.56f, -24.64f, 17.01f, -52.58f, 12.91f, -79.91f)
                close()
                moveTo(176.0f, 368.0f)
                curveToRelative(-17.67f, 0.0f, -32.0f, -14.33f, -32.0f, -32.0f)
                reflectiveCurveToRelative(14.33f, -32.0f, 32.0f, -32.0f)
                reflectiveCurveToRelative(32.0f, 14.33f, 32.0f, 32.0f)
                reflectiveCurveToRelative(-14.33f, 32.0f, -32.0f, 32.0f)
                close()
                moveTo(208.0f, 208.0f)
                curveToRelative(-17.67f, 0.0f, -32.0f, -14.33f, -32.0f, -32.0f)
                reflectiveCurveToRelative(14.33f, -32.0f, 32.0f, -32.0f)
                reflectiveCurveToRelative(32.0f, 14.33f, 32.0f, 32.0f)
                reflectiveCurveToRelative(-14.33f, 32.0f, -32.0f, 32.0f)
                close()
                moveTo(368.0f, 336.0f)
                curveToRelative(-17.67f, 0.0f, -32.0f, -14.33f, -32.0f, -32.0f)
                reflectiveCurveToRelative(14.33f, -32.0f, 32.0f, -32.0f)
                reflectiveCurveToRelative(32.0f, 14.33f, 32.0f, 32.0f)
                reflectiveCurveToRelative(-14.33f, 32.0f, -32.0f, 32.0f)
                close()
            }
        }
        .build()
        return _cookieBite!!
    }

private var _cookieBite: ImageVector? = null
