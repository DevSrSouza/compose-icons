package compose.icons.studioicons.round

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.RoundGroup

public val RoundGroup.Cookie: ImageVector
    get() {
        if (_cookie != null) {
            return _cookie!!
        }
        _cookie = Builder(name = "Cookie", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.27f, 10.9f)
                curveToRelative(-1.21f, -0.33f, -2.31f, -1.46f, -2.29f, -2.89f)
                curveToRelative(0.01f, -0.56f, -0.4f, -1.02f, -0.96f, -1.01f)
                curveTo(15.83f, 7.03f, 14.0f, 5.22f, 14.0f, 3.02f)
                curveToRelative(0.0f, -0.49f, -0.35f, -0.9f, -0.84f, -0.96f)
                curveTo(6.53f, 1.22f, 2.0f, 6.81f, 2.0f, 12.0f)
                curveToRelative(0.0f, 5.52f, 4.48f, 10.0f, 10.0f, 10.0f)
                curveToRelative(5.61f, 0.0f, 10.11f, -4.62f, 10.0f, -10.18f)
                curveTo(21.99f, 11.38f, 21.69f, 11.01f, 21.27f, 10.9f)
                close()
                moveTo(8.5f, 15.0f)
                curveTo(7.67f, 15.0f, 7.0f, 14.33f, 7.0f, 13.5f)
                reflectiveCurveTo(7.67f, 12.0f, 8.5f, 12.0f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveTo(9.33f, 15.0f, 8.5f, 15.0f)
                close()
                moveTo(10.5f, 10.0f)
                curveTo(9.67f, 10.0f, 9.0f, 9.33f, 9.0f, 8.5f)
                reflectiveCurveTo(9.67f, 7.0f, 10.5f, 7.0f)
                reflectiveCurveTo(12.0f, 7.67f, 12.0f, 8.5f)
                reflectiveCurveTo(11.33f, 10.0f, 10.5f, 10.0f)
                close()
                moveTo(15.0f, 16.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f)
                curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f)
                curveTo(16.0f, 15.55f, 15.55f, 16.0f, 15.0f, 16.0f)
                close()
            }
        }
        .build()
        return _cookie!!
    }

private var _cookie: ImageVector? = null
