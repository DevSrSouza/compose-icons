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

public val SolidGroup.Cookie: ImageVector
    get() {
        if (_cookie != null) {
            return _cookie!!
        }
        _cookie = Builder(name = "Cookie", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(510.37f, 254.79f)
                lineToRelative(-12.08f, -76.26f)
                arcToRelative(132.49f, 132.49f, 0.0f, false, false, -37.16f, -72.95f)
                lineToRelative(-54.76f, -54.75f)
                curveToRelative(-19.73f, -19.72f, -45.18f, -32.7f, -72.71f, -37.05f)
                lineToRelative(-76.7f, -12.15f)
                curveToRelative(-27.51f, -4.36f, -55.69f, 0.11f, -80.52f, 12.76f)
                lineTo(107.32f, 49.6f)
                arcToRelative(132.25f, 132.25f, 0.0f, false, false, -57.79f, 57.8f)
                lineToRelative(-35.1f, 68.88f)
                arcToRelative(132.6f, 132.6f, 0.0f, false, false, -12.82f, 80.94f)
                lineToRelative(12.08f, 76.27f)
                arcToRelative(132.49f, 132.49f, 0.0f, false, false, 37.16f, 72.95f)
                lineToRelative(54.76f, 54.75f)
                arcToRelative(132.09f, 132.09f, 0.0f, false, false, 72.71f, 37.05f)
                lineToRelative(76.7f, 12.14f)
                curveToRelative(27.51f, 4.36f, 55.69f, -0.11f, 80.52f, -12.75f)
                lineToRelative(69.12f, -35.21f)
                arcToRelative(132.3f, 132.3f, 0.0f, false, false, 57.79f, -57.8f)
                lineToRelative(35.1f, -68.87f)
                curveToRelative(12.71f, -24.96f, 17.2f, -53.3f, 12.82f, -80.96f)
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
        return _cookie!!
    }

private var _cookie: ImageVector? = null
