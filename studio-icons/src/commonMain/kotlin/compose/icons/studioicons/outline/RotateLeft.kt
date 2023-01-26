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

public val OutlineGroup.RotateLeft: ImageVector
    get() {
        if (_rotateLeft != null) {
            return _rotateLeft!!
        }
        _rotateLeft = Builder(name = "RotateLeft", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.11f, 8.53f)
                lineTo(5.7f, 7.11f)
                curveTo(4.8f, 8.27f, 4.24f, 9.61f, 4.07f, 11.0f)
                horizontalLineToRelative(2.02f)
                curveToRelative(0.14f, -0.87f, 0.49f, -1.72f, 1.02f, -2.47f)
                close()
                moveTo(6.09f, 13.0f)
                lineTo(4.07f, 13.0f)
                curveToRelative(0.17f, 1.39f, 0.72f, 2.73f, 1.62f, 3.89f)
                lineToRelative(1.41f, -1.42f)
                curveToRelative(-0.52f, -0.75f, -0.87f, -1.59f, -1.01f, -2.47f)
                close()
                moveTo(7.1f, 18.32f)
                curveToRelative(1.16f, 0.9f, 2.51f, 1.44f, 3.9f, 1.61f)
                lineTo(11.0f, 17.9f)
                curveToRelative(-0.87f, -0.15f, -1.71f, -0.49f, -2.46f, -1.03f)
                lineTo(7.1f, 18.32f)
                close()
                moveTo(13.0f, 4.07f)
                lineTo(13.0f, 1.0f)
                lineTo(8.45f, 5.55f)
                lineTo(13.0f, 10.0f)
                lineTo(13.0f, 6.09f)
                curveToRelative(2.84f, 0.48f, 5.0f, 2.94f, 5.0f, 5.91f)
                reflectiveCurveToRelative(-2.16f, 5.43f, -5.0f, 5.91f)
                verticalLineToRelative(2.02f)
                curveToRelative(3.95f, -0.49f, 7.0f, -3.85f, 7.0f, -7.93f)
                reflectiveCurveToRelative(-3.05f, -7.44f, -7.0f, -7.93f)
                close()
            }
        }
        .build()
        return _rotateLeft!!
    }

private var _rotateLeft: ImageVector? = null
