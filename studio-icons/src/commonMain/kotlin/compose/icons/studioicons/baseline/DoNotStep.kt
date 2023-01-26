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

public val BaselineGroup.DoNotStep: ImageVector
    get() {
        if (_doNotStep != null) {
            return _doNotStep!!
        }
        _doNotStep = Builder(name = "DoNotStep", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.39f, 4.22f)
                lineToRelative(7.9f, 7.9f)
                curveToRelative(0.18f, 0.2f, 0.18f, 0.5f, -0.01f, 0.7f)
                curveToRelative(-0.1f, 0.1f, -0.23f, 0.15f, -0.35f, 0.15f)
                reflectiveCurveToRelative(-0.26f, -0.05f, -0.35f, -0.15f)
                lineTo(6.87f, 11.1f)
                curveToRelative(-0.11f, 0.4f, -0.26f, 0.78f, -0.45f, 1.12f)
                lineToRelative(1.4f, 1.4f)
                curveToRelative(0.2f, 0.2f, 0.2f, 0.51f, 0.0f, 0.71f)
                curveToRelative(-0.1f, 0.1f, -0.23f, 0.15f, -0.35f, 0.15f)
                reflectiveCurveToRelative(-0.26f, -0.05f, -0.35f, -0.15f)
                lineToRelative(-1.27f, -1.27f)
                curveToRelative(-0.24f, 0.29f, -0.5f, 0.56f, -0.77f, 0.8f)
                lineToRelative(1.28f, 1.28f)
                curveToRelative(0.2f, 0.2f, 0.2f, 0.51f, 0.0f, 0.71f)
                curveTo(6.26f, 15.95f, 6.13f, 16.0f, 6.0f, 16.0f)
                reflectiveCurveToRelative(-0.26f, -0.05f, -0.35f, -0.15f)
                lineToRelative(-1.38f, -1.38f)
                curveToRelative(-0.69f, 0.46f, -1.39f, 0.79f, -1.97f, 1.02f)
                curveTo(1.52f, 15.8f, 1.0f, 16.53f, 1.0f, 17.37f)
                verticalLineTo(20.0f)
                horizontalLineToRelative(9.5f)
                lineToRelative(3.33f, -3.33f)
                lineToRelative(5.94f, 5.94f)
                lineToRelative(1.41f, -1.41f)
                lineTo(2.81f, 2.81f)
                lineTo(1.39f, 4.22f)
                close()
                moveTo(18.51f, 15.68f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(4.48f, -4.48f)
                lineTo(23.0f, 11.2f)
                lineTo(18.51f, 15.68f)
                close()
                moveTo(20.88f, 9.08f)
                lineToRelative(-4.48f, 4.48f)
                lineTo(9.3f, 6.47f)
                lineTo(13.8f, 2.0f)
                lineTo(20.88f, 9.08f)
                close()
            }
        }
        .build()
        return _doNotStep!!
    }

private var _doNotStep: ImageVector? = null
