package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.Image: ImageVector
    get() {
        if (_image != null) {
            return _image!!
        }
        _image = Builder(name = "Image", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(464.0f, 448.0f)
                horizontalLineTo(48.0f)
                curveToRelative(-26.51f, 0.0f, -48.0f, -21.49f, -48.0f, -48.0f)
                verticalLineTo(112.0f)
                curveToRelative(0.0f, -26.51f, 21.49f, -48.0f, 48.0f, -48.0f)
                horizontalLineToRelative(416.0f)
                curveToRelative(26.51f, 0.0f, 48.0f, 21.49f, 48.0f, 48.0f)
                verticalLineToRelative(288.0f)
                curveToRelative(0.0f, 26.51f, -21.49f, 48.0f, -48.0f, 48.0f)
                close()
                moveTo(112.0f, 120.0f)
                curveToRelative(-30.93f, 0.0f, -56.0f, 25.07f, -56.0f, 56.0f)
                reflectiveCurveToRelative(25.07f, 56.0f, 56.0f, 56.0f)
                reflectiveCurveToRelative(56.0f, -25.07f, 56.0f, -56.0f)
                reflectiveCurveToRelative(-25.07f, -56.0f, -56.0f, -56.0f)
                close()
                moveTo(64.0f, 384.0f)
                horizontalLineToRelative(384.0f)
                verticalLineTo(272.0f)
                lineToRelative(-87.51f, -87.51f)
                curveToRelative(-4.69f, -4.69f, -12.28f, -4.69f, -16.97f, 0.0f)
                lineTo(208.0f, 320.0f)
                lineToRelative(-55.51f, -55.51f)
                curveToRelative(-4.69f, -4.69f, -12.28f, -4.69f, -16.97f, 0.0f)
                lineTo(64.0f, 336.0f)
                verticalLineToRelative(48.0f)
                close()
            }
        }
        .build()
        return _image!!
    }

private var _image: ImageVector? = null
