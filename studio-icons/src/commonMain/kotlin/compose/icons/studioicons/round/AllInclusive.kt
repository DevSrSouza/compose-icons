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

public val RoundGroup.AllInclusive: ImageVector
    get() {
        if (_allInclusive != null) {
            return _allInclusive!!
        }
        _allInclusive = Builder(name = "AllInclusive", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.22f, 6.86f)
                curveToRelative(-2.0f, -0.6f, -4.06f, -0.04f, -5.39f, 1.29f)
                lineTo(12.0f, 10.66f)
                lineTo(10.48f, 12.0f)
                horizontalLineToRelative(0.01f)
                lineTo(7.8f, 14.39f)
                curveToRelative(-0.81f, 0.81f, -1.95f, 1.15f, -3.12f, 0.92f)
                curveToRelative(-1.25f, -0.25f, -2.28f, -1.25f, -2.57f, -2.49f)
                curveToRelative(-0.52f, -2.23f, 1.16f, -4.2f, 3.29f, -4.2f)
                curveToRelative(0.91f, 0.0f, 1.76f, 0.35f, 2.44f, 1.03f)
                lineToRelative(0.47f, 0.41f)
                curveToRelative(0.38f, 0.34f, 0.95f, 0.34f, 1.33f, 0.0f)
                curveToRelative(0.45f, -0.4f, 0.45f, -1.1f, 0.0f, -1.5f)
                lineToRelative(-0.42f, -0.36f)
                curveTo(8.2f, 7.18f, 6.84f, 6.62f, 5.4f, 6.62f)
                curveTo(2.42f, 6.62f, 0.0f, 9.04f, 0.0f, 12.0f)
                reflectiveCurveToRelative(2.42f, 5.38f, 5.4f, 5.38f)
                curveToRelative(1.44f, 0.0f, 2.8f, -0.56f, 3.77f, -1.53f)
                lineToRelative(2.83f, -2.5f)
                lineToRelative(0.01f, 0.01f)
                lineTo(13.52f, 12.0f)
                horizontalLineToRelative(-0.01f)
                lineToRelative(2.69f, -2.39f)
                curveToRelative(0.81f, -0.81f, 1.95f, -1.15f, 3.12f, -0.92f)
                curveToRelative(1.25f, 0.25f, 2.28f, 1.25f, 2.57f, 2.49f)
                curveToRelative(0.52f, 2.23f, -1.16f, 4.2f, -3.29f, 4.2f)
                curveToRelative(-0.9f, 0.0f, -1.76f, -0.35f, -2.44f, -1.03f)
                lineToRelative(-0.48f, -0.42f)
                curveToRelative(-0.38f, -0.34f, -0.95f, -0.34f, -1.33f, 0.0f)
                curveToRelative(-0.45f, 0.4f, -0.45f, 1.1f, 0.0f, 1.5f)
                lineToRelative(0.42f, 0.37f)
                curveToRelative(1.02f, 1.01f, 2.37f, 1.57f, 3.82f, 1.57f)
                curveToRelative(3.27f, 0.0f, 5.86f, -2.9f, 5.33f, -6.25f)
                curveToRelative(-0.3f, -1.99f, -1.77f, -3.69f, -3.7f, -4.26f)
                close()
            }
        }
        .build()
        return _allInclusive!!
    }

private var _allInclusive: ImageVector? = null
