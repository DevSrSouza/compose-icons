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

public val BaselineGroup.Style: ImageVector
    get() {
        if (_style != null) {
            return _style!!
        }
        _style = Builder(name = "Style", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.53f, 19.65f)
                lineToRelative(1.34f, 0.56f)
                verticalLineToRelative(-9.03f)
                lineToRelative(-2.43f, 5.86f)
                curveToRelative(-0.41f, 1.02f, 0.08f, 2.19f, 1.09f, 2.61f)
                close()
                moveTo(22.03f, 15.95f)
                lineTo(17.07f, 3.98f)
                curveToRelative(-0.31f, -0.75f, -1.04f, -1.21f, -1.81f, -1.23f)
                curveToRelative(-0.26f, 0.0f, -0.53f, 0.04f, -0.79f, 0.15f)
                lineTo(7.1f, 5.95f)
                curveToRelative(-0.75f, 0.31f, -1.21f, 1.03f, -1.23f, 1.8f)
                curveToRelative(-0.01f, 0.27f, 0.04f, 0.54f, 0.15f, 0.8f)
                lineToRelative(4.96f, 11.97f)
                curveToRelative(0.31f, 0.76f, 1.05f, 1.22f, 1.83f, 1.23f)
                curveToRelative(0.26f, 0.0f, 0.52f, -0.05f, 0.77f, -0.15f)
                lineToRelative(7.36f, -3.05f)
                curveToRelative(1.02f, -0.42f, 1.51f, -1.59f, 1.09f, -2.6f)
                close()
                moveTo(7.88f, 8.75f)
                curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f)
                reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f)
                reflectiveCurveToRelative(-0.45f, 1.0f, -1.0f, 1.0f)
                close()
                moveTo(5.88f, 19.75f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(1.45f)
                lineToRelative(-3.45f, -8.34f)
                verticalLineToRelative(6.34f)
                close()
            }
        }
        .build()
        return _style!!
    }

private var _style: ImageVector? = null
