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

public val RoundGroup.FilterVintage: ImageVector
    get() {
        if (_filterVintage != null) {
            return _filterVintage!!
        }
        _filterVintage = Builder(name = "FilterVintage", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.7f, 12.4f)
                curveToRelative(-0.28f, -0.16f, -0.57f, -0.29f, -0.86f, -0.4f)
                curveToRelative(0.29f, -0.11f, 0.58f, -0.24f, 0.86f, -0.4f)
                curveToRelative(1.92f, -1.11f, 2.99f, -3.12f, 3.0f, -5.19f)
                curveToRelative(-1.79f, -1.03f, -4.07f, -1.11f, -6.0f, 0.0f)
                curveToRelative(-0.28f, 0.16f, -0.54f, 0.35f, -0.78f, 0.54f)
                curveToRelative(0.05f, -0.31f, 0.08f, -0.63f, 0.08f, -0.95f)
                curveToRelative(0.0f, -2.22f, -1.21f, -4.15f, -3.0f, -5.19f)
                curveTo(10.21f, 1.85f, 9.0f, 3.78f, 9.0f, 6.0f)
                curveToRelative(0.0f, 0.32f, 0.03f, 0.64f, 0.08f, 0.95f)
                curveToRelative(-0.24f, -0.2f, -0.5f, -0.39f, -0.78f, -0.55f)
                curveToRelative(-1.92f, -1.11f, -4.2f, -1.03f, -6.0f, 0.0f)
                curveToRelative(0.0f, 2.07f, 1.07f, 4.08f, 3.0f, 5.19f)
                curveToRelative(0.28f, 0.16f, 0.57f, 0.29f, 0.86f, 0.4f)
                curveToRelative(-0.29f, 0.11f, -0.58f, 0.24f, -0.86f, 0.4f)
                curveToRelative(-1.92f, 1.11f, -2.99f, 3.12f, -3.0f, 5.19f)
                curveToRelative(1.79f, 1.03f, 4.07f, 1.11f, 6.0f, 0.0f)
                curveToRelative(0.28f, -0.16f, 0.54f, -0.35f, 0.78f, -0.54f)
                curveToRelative(-0.05f, 0.32f, -0.08f, 0.64f, -0.08f, 0.96f)
                curveToRelative(0.0f, 2.22f, 1.21f, 4.15f, 3.0f, 5.19f)
                curveToRelative(1.79f, -1.04f, 3.0f, -2.97f, 3.0f, -5.19f)
                curveToRelative(0.0f, -0.32f, -0.03f, -0.64f, -0.08f, -0.95f)
                curveToRelative(0.24f, 0.2f, 0.5f, 0.38f, 0.78f, 0.54f)
                curveToRelative(1.92f, 1.11f, 4.2f, 1.03f, 6.0f, 0.0f)
                curveToRelative(-0.01f, -2.07f, -1.08f, -4.08f, -3.0f, -5.19f)
                close()
                moveTo(12.0f, 16.0f)
                curveToRelative(-2.21f, 0.0f, -4.0f, -1.79f, -4.0f, -4.0f)
                reflectiveCurveToRelative(1.79f, -4.0f, 4.0f, -4.0f)
                reflectiveCurveToRelative(4.0f, 1.79f, 4.0f, 4.0f)
                reflectiveCurveToRelative(-1.79f, 4.0f, -4.0f, 4.0f)
                close()
            }
        }
        .build()
        return _filterVintage!!
    }

private var _filterVintage: ImageVector? = null
