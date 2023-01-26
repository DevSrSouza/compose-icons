package compose.icons.studioicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.SharpGroup

public val SharpGroup.CropRotate: ImageVector
    get() {
        if (_cropRotate != null) {
            return _cropRotate!!
        }
        _cropRotate = Builder(name = "CropRotate", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.47f, 21.49f)
                curveTo(4.2f, 19.93f, 1.86f, 16.76f, 1.5f, 13.0f)
                lineTo(0.0f, 13.0f)
                curveToRelative(0.51f, 6.16f, 5.66f, 11.0f, 11.95f, 11.0f)
                curveToRelative(0.23f, 0.0f, 0.44f, -0.02f, 0.66f, -0.03f)
                lineTo(8.8f, 20.15f)
                lineToRelative(-1.33f, 1.34f)
                close()
                moveTo(12.05f, 0.0f)
                curveToRelative(-0.23f, 0.0f, -0.44f, 0.02f, -0.66f, 0.04f)
                lineToRelative(3.81f, 3.81f)
                lineToRelative(1.33f, -1.33f)
                curveTo(19.8f, 4.07f, 22.14f, 7.24f, 22.5f, 11.0f)
                lineTo(24.0f, 11.0f)
                curveToRelative(-0.51f, -6.16f, -5.66f, -11.0f, -11.95f, -11.0f)
                close()
                moveTo(16.0f, 14.0f)
                horizontalLineToRelative(2.0f)
                lineTo(18.0f, 6.0f)
                horizontalLineToRelative(-8.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(6.0f)
                close()
                moveTo(8.0f, 16.0f)
                lineTo(8.0f, 4.0f)
                lineTo(6.0f, 4.0f)
                verticalLineToRelative(2.0f)
                lineTo(4.0f, 6.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(10.0f)
                horizontalLineToRelative(10.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(-2.0f)
                lineTo(8.0f, 16.0f)
                close()
            }
        }
        .build()
        return _cropRotate!!
    }

private var _cropRotate: ImageVector? = null
