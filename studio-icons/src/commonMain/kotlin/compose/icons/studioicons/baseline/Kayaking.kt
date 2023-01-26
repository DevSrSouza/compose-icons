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

public val BaselineGroup.Kayaking: ImageVector
    get() {
        if (_kayaking != null) {
            return _kayaking!!
        }
        _kayaking = Builder(name = "Kayaking", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 23.0f)
                curveToRelative(-1.03f, 0.0f, -2.06f, -0.25f, -3.0f, -0.75f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-1.89f, 1.0f, -4.11f, 1.0f, -6.0f, 0.0f)
                curveToRelative(-1.89f, 1.0f, -4.11f, 1.0f, -6.0f, 0.0f)
                curveTo(5.05f, 22.75f, 4.03f, 23.0f, 3.0f, 23.0f)
                horizontalLineTo(2.0f)
                lineToRelative(0.0f, -2.0f)
                horizontalLineToRelative(1.0f)
                curveToRelative(1.04f, 0.0f, 2.08f, -0.35f, 3.0f, -1.0f)
                curveToRelative(1.83f, 1.3f, 4.17f, 1.3f, 6.0f, 0.0f)
                curveToRelative(1.83f, 1.3f, 4.17f, 1.3f, 6.0f, 0.0f)
                curveToRelative(0.91f, 0.65f, 1.96f, 1.0f, 3.0f, 1.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(21.0f)
                close()
                moveTo(12.0f, 5.5f)
                curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f)
                reflectiveCurveToRelative(0.9f, 2.0f, 2.0f, 2.0f)
                reflectiveCurveToRelative(2.0f, -0.9f, 2.0f, -2.0f)
                reflectiveCurveTo(13.1f, 5.5f, 12.0f, 5.5f)
                close()
                moveTo(24.0f, 17.5f)
                curveToRelative(0.0f, 0.0f, -1.52f, 0.71f, -3.93f, 1.37f)
                curveToRelative(-0.82f, -0.23f, -1.53f, -0.75f, -2.07f, -1.37f)
                curveToRelative(-0.73f, 0.84f, -1.8f, 1.5f, -3.0f, 1.5f)
                reflectiveCurveToRelative(-2.27f, -0.66f, -3.0f, -1.5f)
                curveToRelative(-0.73f, 0.84f, -1.8f, 1.5f, -3.0f, 1.5f)
                reflectiveCurveToRelative(-2.27f, -0.66f, -3.0f, -1.5f)
                curveToRelative(-0.54f, 0.61f, -1.25f, 1.13f, -2.07f, 1.37f)
                curveTo(1.52f, 18.21f, 0.0f, 17.5f, 0.0f, 17.5f)
                reflectiveCurveToRelative(2.93f, -1.36f, 7.13f, -2.08f)
                lineToRelative(1.35f, -4.17f)
                curveToRelative(0.31f, -0.95f, 1.32f, -1.47f, 2.27f, -1.16f)
                curveToRelative(0.09f, 0.03f, 0.19f, 0.07f, 0.27f, 0.11f)
                lineToRelative(0.0f, 0.0f)
                lineToRelative(2.47f, 1.3f)
                lineToRelative(2.84f, -1.5f)
                lineToRelative(1.65f, -3.71f)
                lineToRelative(-0.51f, -1.32f)
                lineTo(18.8f, 2.0f)
                lineTo(22.0f, 3.43f)
                lineTo(20.67f, 6.4f)
                lineToRelative(-1.31f, 0.5f)
                lineToRelative(-3.72f, 8.34f)
                curveTo(20.49f, 15.87f, 24.0f, 17.5f, 24.0f, 17.5f)
                close()
                moveTo(15.02f, 12.96f)
                lineToRelative(-1.52f, 0.8f)
                lineToRelative(-1.75f, -0.92f)
                lineToRelative(-0.71f, 2.17f)
                curveTo(11.36f, 15.01f, 11.68f, 15.0f, 12.0f, 15.0f)
                curveToRelative(0.71f, 0.0f, 1.4f, 0.03f, 2.07f, 0.08f)
                lineTo(15.02f, 12.96f)
                close()
            }
        }
        .build()
        return _kayaking!!
    }

private var _kayaking: ImageVector? = null
