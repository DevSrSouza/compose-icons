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

public val OutlineGroup.Policy: ImageVector
    get() {
        if (_policy != null) {
            return _policy!!
        }
        _policy = Builder(name = "Policy", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 1.0f)
                lineTo(3.0f, 5.0f)
                verticalLineToRelative(6.0f)
                curveToRelative(0.0f, 5.55f, 3.84f, 10.74f, 9.0f, 12.0f)
                curveToRelative(5.16f, -1.26f, 9.0f, -6.45f, 9.0f, -12.0f)
                verticalLineTo(5.0f)
                lineTo(12.0f, 1.0f)
                close()
                moveTo(19.0f, 11.0f)
                curveToRelative(0.0f, 1.85f, -0.51f, 3.65f, -1.38f, 5.21f)
                lineToRelative(-1.45f, -1.45f)
                curveToRelative(1.29f, -1.94f, 1.07f, -4.58f, -0.64f, -6.29f)
                curveToRelative(-1.95f, -1.95f, -5.12f, -1.95f, -7.07f, 0.0f)
                curveToRelative(-1.95f, 1.95f, -1.95f, 5.12f, 0.0f, 7.07f)
                curveToRelative(1.71f, 1.71f, 4.35f, 1.92f, 6.29f, 0.64f)
                lineToRelative(1.72f, 1.72f)
                curveToRelative(-1.19f, 1.42f, -2.73f, 2.51f, -4.47f, 3.04f)
                curveTo(7.98f, 19.69f, 5.0f, 15.52f, 5.0f, 11.0f)
                verticalLineTo(6.3f)
                lineToRelative(7.0f, -3.11f)
                lineToRelative(7.0f, 3.11f)
                verticalLineTo(11.0f)
                close()
                moveTo(12.0f, 15.0f)
                curveToRelative(-1.66f, 0.0f, -3.0f, -1.34f, -3.0f, -3.0f)
                reflectiveCurveToRelative(1.34f, -3.0f, 3.0f, -3.0f)
                reflectiveCurveToRelative(3.0f, 1.34f, 3.0f, 3.0f)
                reflectiveCurveTo(13.66f, 15.0f, 12.0f, 15.0f)
                close()
            }
        }
        .build()
        return _policy!!
    }

private var _policy: ImageVector? = null
