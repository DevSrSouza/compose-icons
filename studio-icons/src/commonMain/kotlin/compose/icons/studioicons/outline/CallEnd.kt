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

public val OutlineGroup.CallEnd: ImageVector
    get() {
        if (_callEnd != null) {
            return _callEnd!!
        }
        _callEnd = Builder(name = "CallEnd", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.59f, 10.52f)
                curveToRelative(1.05f, 0.51f, 2.04f, 1.15f, 2.96f, 1.91f)
                lineToRelative(-1.07f, 1.07f)
                curveToRelative(-0.58f, -0.47f, -1.21f, -0.89f, -1.88f, -1.27f)
                verticalLineToRelative(-1.71f)
                moveToRelative(-13.2f, 0.0f)
                verticalLineToRelative(1.7f)
                curveToRelative(-0.65f, 0.37f, -1.28f, 0.79f, -1.87f, 1.27f)
                lineToRelative(-1.07f, -1.07f)
                curveToRelative(0.91f, -0.75f, 1.9f, -1.38f, 2.94f, -1.9f)
                moveTo(12.0f, 7.0f)
                curveTo(7.46f, 7.0f, 3.34f, 8.78f, 0.29f, 11.67f)
                curveToRelative(-0.18f, 0.18f, -0.29f, 0.43f, -0.29f, 0.71f)
                reflectiveCurveToRelative(0.11f, 0.53f, 0.29f, 0.7f)
                lineToRelative(2.48f, 2.48f)
                curveToRelative(0.18f, 0.18f, 0.43f, 0.29f, 0.71f, 0.29f)
                curveToRelative(0.27f, 0.0f, 0.52f, -0.1f, 0.7f, -0.28f)
                curveToRelative(0.79f, -0.73f, 1.68f, -1.36f, 2.66f, -1.85f)
                curveToRelative(0.33f, -0.16f, 0.56f, -0.51f, 0.56f, -0.9f)
                verticalLineToRelative(-3.1f)
                curveTo(8.85f, 9.25f, 10.4f, 9.0f, 12.0f, 9.0f)
                reflectiveCurveToRelative(3.15f, 0.25f, 4.59f, 0.73f)
                verticalLineToRelative(3.1f)
                curveToRelative(0.0f, 0.4f, 0.23f, 0.74f, 0.56f, 0.9f)
                curveToRelative(0.98f, 0.49f, 1.88f, 1.11f, 2.67f, 1.85f)
                curveToRelative(0.18f, 0.17f, 0.43f, 0.28f, 0.7f, 0.28f)
                curveToRelative(0.28f, 0.0f, 0.53f, -0.11f, 0.71f, -0.29f)
                lineToRelative(2.48f, -2.48f)
                curveToRelative(0.18f, -0.18f, 0.29f, -0.43f, 0.29f, -0.71f)
                reflectiveCurveToRelative(-0.11f, -0.53f, -0.29f, -0.71f)
                curveTo(20.66f, 8.78f, 16.54f, 7.0f, 12.0f, 7.0f)
                close()
            }
        }
        .build()
        return _callEnd!!
    }

private var _callEnd: ImageVector? = null
