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

public val RoundGroup.EditLocation: ImageVector
    get() {
        if (_editLocation != null) {
            return _editLocation!!
        }
        _editLocation = Builder(name = "EditLocation", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 2.0f)
                curveToRelative(-4.2f, 0.0f, -8.0f, 3.22f, -8.0f, 8.2f)
                curveToRelative(0.0f, 3.18f, 2.45f, 6.92f, 7.34f, 11.23f)
                curveToRelative(0.38f, 0.33f, 0.95f, 0.33f, 1.33f, 0.0f)
                curveTo(17.55f, 17.12f, 20.0f, 13.38f, 20.0f, 10.2f)
                curveTo(20.0f, 5.22f, 16.2f, 2.0f, 12.0f, 2.0f)
                close()
                moveTo(9.73f, 13.5f)
                horizontalLineTo(8.5f)
                verticalLineToRelative(-1.44f)
                lineToRelative(3.93f, -3.92f)
                lineToRelative(1.43f, 1.43f)
                lineToRelative(-3.77f, 3.78f)
                curveTo(9.99f, 13.45f, 9.87f, 13.5f, 9.73f, 13.5f)
                close()
                moveTo(15.28f, 8.16f)
                lineToRelative(-0.7f, 0.7f)
                lineToRelative(-1.44f, -1.44f)
                lineToRelative(0.7f, -0.7f)
                curveToRelative(0.15f, -0.15f, 0.39f, -0.15f, 0.54f, 0.0f)
                lineToRelative(0.9f, 0.9f)
                curveTo(15.43f, 7.77f, 15.43f, 8.01f, 15.28f, 8.16f)
                close()
            }
        }
        .build()
        return _editLocation!!
    }

private var _editLocation: ImageVector? = null
