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

public val RoundGroup.Interests: ImageVector
    get() {
        if (_interests != null) {
            return _interests!!
        }
        _interests = Builder(name = "Interests", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.02f, 13.0f)
                curveToRelative(-2.21f, 0.0f, -4.0f, 1.79f, -4.0f, 4.0f)
                reflectiveCurveToRelative(1.79f, 4.0f, 4.0f, 4.0f)
                reflectiveCurveToRelative(4.0f, -1.79f, 4.0f, -4.0f)
                reflectiveCurveTo(9.23f, 13.0f, 7.02f, 13.0f)
                close()
                moveTo(13.0f, 14.0f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(6.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                verticalLineToRelative(-6.0f)
                curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
                horizontalLineToRelative(-6.0f)
                curveTo(13.45f, 13.0f, 13.0f, 13.45f, 13.0f, 14.0f)
                close()
                moveTo(6.13f, 3.57f)
                lineToRelative(-3.3f, 5.94f)
                curveTo(2.46f, 10.18f, 2.94f, 11.0f, 3.7f, 11.0f)
                horizontalLineToRelative(6.6f)
                curveToRelative(0.76f, 0.0f, 1.24f, -0.82f, 0.87f, -1.49f)
                lineToRelative(-3.3f, -5.94f)
                curveTo(7.49f, 2.89f, 6.51f, 2.89f, 6.13f, 3.57f)
                close()
                moveTo(19.25f, 2.5f)
                curveToRelative(-1.06f, 0.0f, -1.81f, 0.56f, -2.25f, 1.17f)
                curveToRelative(-0.44f, -0.61f, -1.19f, -1.17f, -2.25f, -1.17f)
                curveTo(13.19f, 2.5f, 12.0f, 3.78f, 12.0f, 5.25f)
                curveToRelative(0.0f, 1.83f, 2.03f, 3.17f, 4.35f, 5.18f)
                curveToRelative(0.37f, 0.32f, 0.92f, 0.32f, 1.3f, 0.0f)
                curveTo(19.97f, 8.42f, 22.0f, 7.08f, 22.0f, 5.25f)
                curveTo(22.0f, 3.78f, 20.81f, 2.5f, 19.25f, 2.5f)
                close()
            }
        }
        .build()
        return _interests!!
    }

private var _interests: ImageVector? = null
