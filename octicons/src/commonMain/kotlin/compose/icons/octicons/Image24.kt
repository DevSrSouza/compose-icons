package compose.icons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.Octicons

public val Octicons.Image24: ImageVector
    get() {
        if (_image24 != null) {
            return _image24!!
        }
        _image24 = Builder(name = "Image24", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.75f, 3.0f)
                horizontalLineToRelative(14.5f)
                curveToRelative(0.966f, 0.0f, 1.75f, 0.784f, 1.75f, 1.75f)
                verticalLineToRelative(14.5f)
                arcTo(1.75f, 1.75f, 0.0f, false, true, 19.25f, 21.0f)
                lineTo(4.75f, 21.0f)
                arcTo(1.75f, 1.75f, 0.0f, false, true, 3.0f, 19.25f)
                lineTo(3.0f, 4.75f)
                curveTo(3.0f, 3.784f, 3.784f, 3.0f, 4.75f, 3.0f)
                close()
                moveTo(19.25f, 4.5f)
                lineTo(4.75f, 4.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, 0.25f)
                verticalLineToRelative(14.5f)
                curveToRelative(0.0f, 0.138f, 0.112f, 0.25f, 0.25f, 0.25f)
                horizontalLineToRelative(0.19f)
                lineToRelative(9.823f, -9.823f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, true, 2.475f, 0.0f)
                lineToRelative(2.262f, 2.262f)
                lineTo(19.5f, 4.75f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.25f, -0.25f)
                close()
                moveTo(19.5f, 14.06f)
                lineTo(16.177f, 10.737f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, -0.354f, 0.0f)
                lineTo(7.061f, 19.5f)
                lineTo(19.25f, 19.5f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, false, 0.25f, -0.25f)
                close()
                moveTo(8.5f, 11.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, 0.0f, -5.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, false, true, 0.0f, 5.0f)
                close()
                moveTo(8.5f, 9.5f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 0.0f, -2.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 2.0f)
                close()
            }
        }
        .build()
        return _image24!!
    }

private var _image24: ImageVector? = null
