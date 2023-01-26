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

public val SharpGroup.EditLocation: ImageVector
    get() {
        if (_editLocation != null) {
            return _editLocation!!
        }
        _editLocation = Builder(name = "EditLocation", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.11f, 1.77f)
                lineTo(19.78f, 0.1f)
                lineToRelative(2.12f, 2.12f)
                lineToRelative(-1.67f, 1.67f)
                lineToRelative(-2.12f, -2.12f)
                close()
                moveTo(17.11f, 2.77f)
                lineToRelative(2.12f, 2.12f)
                lineTo(13.12f, 11.0f)
                lineTo(11.0f, 11.0f)
                lineTo(11.0f, 8.89f)
                lineToRelative(6.11f, -6.12f)
                close()
                moveTo(15.13f, 2.64f)
                lineTo(9.5f, 8.27f)
                verticalLineToRelative(4.24f)
                horizontalLineToRelative(4.24f)
                lineToRelative(5.62f, -5.62f)
                curveToRelative(0.41f, 0.99f, 0.64f, 2.1f, 0.64f, 3.32f)
                curveToRelative(0.0f, 3.32f, -2.67f, 7.25f, -8.0f, 11.8f)
                curveToRelative(-5.33f, -4.55f, -8.0f, -8.48f, -8.0f, -11.8f)
                curveToRelative(0.0f, -4.98f, 3.8f, -8.2f, 8.0f, -8.2f)
                curveToRelative(1.09f, 0.0f, 2.16f, 0.22f, 3.13f, 0.63f)
                close()
            }
        }
        .build()
        return _editLocation!!
    }

private var _editLocation: ImageVector? = null
