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

public val BaselineGroup.TouchApp: ImageVector
    get() {
        if (_touchApp != null) {
            return _touchApp!!
        }
        _touchApp = Builder(name = "TouchApp", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 11.24f)
                verticalLineTo(7.5f)
                curveTo(9.0f, 6.12f, 10.12f, 5.0f, 11.5f, 5.0f)
                reflectiveCurveTo(14.0f, 6.12f, 14.0f, 7.5f)
                verticalLineToRelative(3.74f)
                curveToRelative(1.21f, -0.81f, 2.0f, -2.18f, 2.0f, -3.74f)
                curveTo(16.0f, 5.01f, 13.99f, 3.0f, 11.5f, 3.0f)
                reflectiveCurveTo(7.0f, 5.01f, 7.0f, 7.5f)
                curveTo(7.0f, 9.06f, 7.79f, 10.43f, 9.0f, 11.24f)
                close()
                moveTo(18.84f, 15.87f)
                lineToRelative(-4.54f, -2.26f)
                curveToRelative(-0.17f, -0.07f, -0.35f, -0.11f, -0.54f, -0.11f)
                horizontalLineTo(13.0f)
                verticalLineToRelative(-6.0f)
                curveTo(13.0f, 6.67f, 12.33f, 6.0f, 11.5f, 6.0f)
                reflectiveCurveTo(10.0f, 6.67f, 10.0f, 7.5f)
                verticalLineToRelative(10.74f)
                curveToRelative(-3.6f, -0.76f, -3.54f, -0.75f, -3.67f, -0.75f)
                curveToRelative(-0.31f, 0.0f, -0.59f, 0.13f, -0.79f, 0.33f)
                lineToRelative(-0.79f, 0.8f)
                lineToRelative(4.94f, 4.94f)
                curveTo(9.96f, 23.83f, 10.34f, 24.0f, 10.75f, 24.0f)
                horizontalLineToRelative(6.79f)
                curveToRelative(0.75f, 0.0f, 1.33f, -0.55f, 1.44f, -1.28f)
                lineToRelative(0.75f, -5.27f)
                curveToRelative(0.01f, -0.07f, 0.02f, -0.14f, 0.02f, -0.2f)
                curveTo(19.75f, 16.63f, 19.37f, 16.09f, 18.84f, 15.87f)
                close()
            }
        }
        .build()
        return _touchApp!!
    }

private var _touchApp: ImageVector? = null
