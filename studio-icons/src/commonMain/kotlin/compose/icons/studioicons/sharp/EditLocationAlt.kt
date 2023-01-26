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

public val SharpGroup.EditLocationAlt: ImageVector
    get() {
        if (_editLocationAlt != null) {
            return _editLocationAlt!!
        }
        _editLocationAlt = Builder(name = "EditLocationAlt", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.95f, 13.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(8.05f)
                lineToRelative(5.61f, -5.61f)
                curveTo(13.78f, 2.16f, 12.9f, 2.0f, 12.0f, 2.0f)
                curveToRelative(-4.2f, 0.0f, -8.0f, 3.22f, -8.0f, 8.2f)
                curveToRelative(0.0f, 3.32f, 2.67f, 7.25f, 8.0f, 11.8f)
                curveToRelative(5.33f, -4.55f, 8.0f, -8.48f, 8.0f, -11.8f)
                curveToRelative(0.0f, -1.01f, -0.16f, -1.94f, -0.45f, -2.8f)
                lineTo(13.95f, 13.0f)
                close()
                moveTo(11.0f, 11.0f)
                horizontalLineToRelative(2.12f)
                lineToRelative(6.16f, -6.16f)
                lineToRelative(-2.12f, -2.12f)
                lineTo(11.0f, 8.88f)
                verticalLineTo(11.0f)
                close()
                moveTo(19.29f, 0.59f)
                lineToRelative(-1.42f, 1.42f)
                lineToRelative(2.12f, 2.12f)
                lineToRelative(1.42f, -1.42f)
                lineTo(19.29f, 0.59f)
                close()
            }
        }
        .build()
        return _editLocationAlt!!
    }

private var _editLocationAlt: ImageVector? = null
