package compose.icons.studioicons.round

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.RoundGroup

public val RoundGroup.CropRotate: ImageVector
    get() {
        if (_cropRotate != null) {
            return _cropRotate!!
        }
        _cropRotate = Builder(name = "CropRotate", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 9.0f)
                verticalLineToRelative(5.0f)
                horizontalLineToRelative(2.0f)
                lineTo(18.0f, 8.0f)
                curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(5.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f)
                close()
                moveTo(19.0f, 16.0f)
                lineTo(9.0f, 16.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f)
                lineTo(8.0f, 5.0f)
                curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
                reflectiveCurveToRelative(-1.0f, 0.45f, -1.0f, 1.0f)
                verticalLineToRelative(1.0f)
                lineTo(5.0f, 6.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f)
                reflectiveCurveToRelative(0.45f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(1.0f)
                verticalLineToRelative(8.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                reflectiveCurveToRelative(1.0f, -0.45f, 1.0f, -1.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(1.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                reflectiveCurveToRelative(-0.45f, -1.0f, -1.0f, -1.0f)
                close()
                moveTo(17.66f, 1.4f)
                curveTo(15.99f, 0.51f, 13.83f, -0.11f, 11.39f, 0.04f)
                lineToRelative(3.81f, 3.81f)
                lineToRelative(1.33f, -1.33f)
                curveToRelative(3.09f, 1.46f, 5.34f, 4.37f, 5.89f, 7.86f)
                curveToRelative(0.06f, 0.41f, 0.44f, 0.69f, 0.86f, 0.62f)
                curveToRelative(0.41f, -0.06f, 0.69f, -0.45f, 0.62f, -0.86f)
                curveToRelative(-0.6f, -3.8f, -2.96f, -7.0f, -6.24f, -8.74f)
                close()
                moveTo(7.47f, 21.49f)
                curveToRelative(-3.09f, -1.46f, -5.34f, -4.37f, -5.89f, -7.86f)
                curveToRelative(-0.06f, -0.41f, -0.44f, -0.69f, -0.86f, -0.62f)
                curveToRelative(-0.41f, 0.06f, -0.69f, 0.45f, -0.62f, 0.86f)
                curveToRelative(0.6f, 3.81f, 2.96f, 7.01f, 6.24f, 8.75f)
                curveToRelative(1.67f, 0.89f, 3.83f, 1.51f, 6.27f, 1.36f)
                lineTo(8.8f, 20.16f)
                lineToRelative(-1.33f, 1.33f)
                close()
            }
        }
        .build()
        return _cropRotate!!
    }

private var _cropRotate: ImageVector? = null
