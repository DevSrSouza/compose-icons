package compose.icons.studioicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.OutlineGroup

public val OutlineGroup.AllInclusive: ImageVector
    get() {
        if (_allInclusive != null) {
            return _allInclusive!!
        }
        _allInclusive = Builder(name = "AllInclusive", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.6f, 6.62f)
                curveToRelative(-1.44f, 0.0f, -2.8f, 0.56f, -3.77f, 1.53f)
                lineTo(7.8f, 14.39f)
                curveToRelative(-0.64f, 0.64f, -1.49f, 0.99f, -2.4f, 0.99f)
                curveToRelative(-1.87f, 0.0f, -3.39f, -1.51f, -3.39f, -3.38f)
                reflectiveCurveTo(3.53f, 8.62f, 5.4f, 8.62f)
                curveToRelative(0.91f, 0.0f, 1.76f, 0.35f, 2.44f, 1.03f)
                lineToRelative(1.13f, 1.0f)
                lineToRelative(1.51f, -1.34f)
                lineTo(9.22f, 8.2f)
                curveTo(8.2f, 7.18f, 6.84f, 6.62f, 5.4f, 6.62f)
                curveTo(2.42f, 6.62f, 0.0f, 9.04f, 0.0f, 12.0f)
                reflectiveCurveToRelative(2.42f, 5.38f, 5.4f, 5.38f)
                curveToRelative(1.44f, 0.0f, 2.8f, -0.56f, 3.77f, -1.53f)
                lineToRelative(7.03f, -6.24f)
                curveToRelative(0.64f, -0.64f, 1.49f, -0.99f, 2.4f, -0.99f)
                curveToRelative(1.87f, 0.0f, 3.39f, 1.51f, 3.39f, 3.38f)
                reflectiveCurveToRelative(-1.52f, 3.38f, -3.39f, 3.38f)
                curveToRelative(-0.9f, 0.0f, -1.76f, -0.35f, -2.44f, -1.03f)
                lineToRelative(-1.14f, -1.01f)
                lineToRelative(-1.51f, 1.34f)
                lineToRelative(1.27f, 1.12f)
                curveToRelative(1.02f, 1.01f, 2.37f, 1.57f, 3.82f, 1.57f)
                curveToRelative(2.98f, 0.0f, 5.4f, -2.41f, 5.4f, -5.38f)
                reflectiveCurveToRelative(-2.42f, -5.37f, -5.4f, -5.37f)
                close()
            }
        }
        .build()
        return _allInclusive!!
    }

private var _allInclusive: ImageVector? = null
