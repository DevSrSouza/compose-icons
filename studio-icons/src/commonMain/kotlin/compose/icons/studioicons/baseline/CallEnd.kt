package compose.icons.studioicons.baseline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.BaselineGroup

public val BaselineGroup.CallEnd: ImageVector
    get() {
        if (_callEnd != null) {
            return _callEnd!!
        }
        _callEnd = Builder(name = "CallEnd", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 9.0f)
                curveToRelative(-1.6f, 0.0f, -3.15f, 0.25f, -4.6f, 0.72f)
                verticalLineToRelative(3.1f)
                curveToRelative(0.0f, 0.39f, -0.23f, 0.74f, -0.56f, 0.9f)
                curveToRelative(-0.98f, 0.49f, -1.87f, 1.12f, -2.66f, 1.85f)
                curveToRelative(-0.18f, 0.18f, -0.43f, 0.28f, -0.7f, 0.28f)
                curveToRelative(-0.28f, 0.0f, -0.53f, -0.11f, -0.71f, -0.29f)
                lineTo(0.29f, 13.08f)
                curveToRelative(-0.18f, -0.17f, -0.29f, -0.42f, -0.29f, -0.7f)
                curveToRelative(0.0f, -0.28f, 0.11f, -0.53f, 0.29f, -0.71f)
                curveTo(3.34f, 8.78f, 7.46f, 7.0f, 12.0f, 7.0f)
                reflectiveCurveToRelative(8.66f, 1.78f, 11.71f, 4.67f)
                curveToRelative(0.18f, 0.18f, 0.29f, 0.43f, 0.29f, 0.71f)
                curveToRelative(0.0f, 0.28f, -0.11f, 0.53f, -0.29f, 0.71f)
                lineToRelative(-2.48f, 2.48f)
                curveToRelative(-0.18f, 0.18f, -0.43f, 0.29f, -0.71f, 0.29f)
                curveToRelative(-0.27f, 0.0f, -0.52f, -0.11f, -0.7f, -0.28f)
                curveToRelative(-0.79f, -0.74f, -1.69f, -1.36f, -2.67f, -1.85f)
                curveToRelative(-0.33f, -0.16f, -0.56f, -0.5f, -0.56f, -0.9f)
                verticalLineToRelative(-3.1f)
                curveTo(15.15f, 9.25f, 13.6f, 9.0f, 12.0f, 9.0f)
                close()
            }
        }
        .build()
        return _callEnd!!
    }

private var _callEnd: ImageVector? = null
