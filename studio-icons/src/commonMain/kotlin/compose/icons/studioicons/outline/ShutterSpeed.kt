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

public val OutlineGroup.ShutterSpeed: ImageVector
    get() {
        if (_shutterSpeed != null) {
            return _shutterSpeed!!
        }
        _shutterSpeed = Builder(name = "ShutterSpeed", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 1.0f)
                lineTo(9.0f, 1.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(6.0f)
                lineTo(15.0f, 1.0f)
                close()
                moveTo(19.03f, 7.39f)
                lineToRelative(1.42f, -1.42f)
                curveToRelative(-0.43f, -0.51f, -0.9f, -0.99f, -1.41f, -1.41f)
                lineToRelative(-1.42f, 1.42f)
                curveTo(16.07f, 4.74f, 14.12f, 4.0f, 12.0f, 4.0f)
                curveToRelative(-4.97f, 0.0f, -9.0f, 4.03f, -9.0f, 9.0f)
                reflectiveCurveToRelative(4.02f, 9.0f, 9.0f, 9.0f)
                reflectiveCurveToRelative(9.0f, -4.03f, 9.0f, -9.0f)
                curveToRelative(0.0f, -2.12f, -0.74f, -4.07f, -1.97f, -5.61f)
                close()
                moveTo(12.0f, 20.0f)
                curveToRelative(-3.87f, 0.0f, -7.0f, -3.13f, -7.0f, -7.0f)
                reflectiveCurveToRelative(3.13f, -7.0f, 7.0f, -7.0f)
                reflectiveCurveToRelative(7.0f, 3.13f, 7.0f, 7.0f)
                reflectiveCurveToRelative(-3.13f, 7.0f, -7.0f, 7.0f)
                close()
                moveTo(11.68f, 15.0f)
                lineTo(6.35f, 15.0f)
                curveToRelative(0.57f, 1.62f, 1.82f, 2.92f, 3.41f, 3.56f)
                lineToRelative(-0.11f, -0.06f)
                lineToRelative(2.03f, -3.5f)
                close()
                moveTo(17.65f, 11.0f)
                curveToRelative(-0.57f, -1.6f, -1.78f, -2.89f, -3.34f, -3.54f)
                lineTo(12.26f, 11.0f)
                horizontalLineToRelative(5.39f)
                close()
                moveTo(10.61f, 18.83f)
                curveToRelative(0.45f, 0.11f, 0.91f, 0.17f, 1.39f, 0.17f)
                curveToRelative(1.34f, 0.0f, 2.57f, -0.45f, 3.57f, -1.19f)
                lineToRelative(-2.11f, -3.9f)
                lineToRelative(-2.85f, 4.92f)
                close()
                moveTo(7.55f, 8.99f)
                curveTo(6.59f, 10.05f, 6.0f, 11.46f, 6.0f, 13.0f)
                curveToRelative(0.0f, 0.34f, 0.04f, 0.67f, 0.09f, 1.0f)
                horizontalLineToRelative(4.72f)
                lineTo(7.55f, 8.99f)
                close()
                moveTo(16.34f, 17.13f)
                curveTo(17.37f, 16.06f, 18.0f, 14.6f, 18.0f, 13.0f)
                curveToRelative(0.0f, -0.34f, -0.04f, -0.67f, -0.09f, -1.0f)
                horizontalLineToRelative(-4.34f)
                lineToRelative(2.77f, 5.13f)
                close()
                moveTo(13.33f, 7.15f)
                curveTo(12.9f, 7.06f, 12.46f, 7.0f, 12.0f, 7.0f)
                curveToRelative(-1.4f, 0.0f, -2.69f, 0.49f, -3.71f, 1.29f)
                lineToRelative(2.32f, 3.56f)
                lineToRelative(2.72f, -4.7f)
                close()
            }
        }
        .build()
        return _shutterSpeed!!
    }

private var _shutterSpeed: ImageVector? = null
