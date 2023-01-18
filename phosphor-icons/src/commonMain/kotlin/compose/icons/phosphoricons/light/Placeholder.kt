package compose.icons.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.LightGroup

public val LightGroup.Placeholder: ImageVector
    get() {
        if (_placeholder != null) {
            return _placeholder!!
        }
        _placeholder = Builder(name = "Placeholder", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(222.0f, 48.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -14.0f, -14.0f)
                lineTo(48.0f, 34.0f)
                arcToRelative(13.8f, 13.8f, 0.0f, false, false, -9.8f, 4.0f)
                arcToRelative(0.1f, 0.1f, 0.0f, false, true, -0.1f, 0.1f)
                arcToRelative(0.1f, 0.1f, 0.0f, false, true, -0.1f, 0.1f)
                arcTo(13.8f, 13.8f, 0.0f, false, false, 34.0f, 48.0f)
                lineTo(34.0f, 208.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f)
                lineTo(208.0f, 222.0f)
                arcToRelative(13.8f, 13.8f, 0.0f, false, false, 9.8f, -4.0f)
                horizontalLineToRelative(0.2f)
                arcToRelative(13.8f, 13.8f, 0.0f, false, false, 4.0f, -9.8f)
                close()
                moveTo(210.0f, 48.0f)
                lineTo(210.0f, 201.5f)
                lineTo(54.5f, 46.0f)
                lineTo(208.0f, 46.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 210.0f, 48.0f)
                close()
                moveTo(46.0f, 208.0f)
                lineTo(46.0f, 54.5f)
                lineTo(201.5f, 210.0f)
                lineTo(48.0f, 210.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 46.0f, 208.0f)
                close()
            }
        }
        .build()
        return _placeholder!!
    }

private var _placeholder: ImageVector? = null
