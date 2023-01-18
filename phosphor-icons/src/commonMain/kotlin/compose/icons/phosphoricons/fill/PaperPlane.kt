package compose.icons.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.FillGroup

public val FillGroup.PaperPlane: ImageVector
    get() {
        if (_paperPlane != null) {
            return _paperPlane!!
        }
        _paperPlane = Builder(name = "PaperPlane", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(236.4f, 201.5f)
                lineTo(141.8f, 32.6f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -27.9f, 0.0f)
                lineTo(19.3f, 201.5f)
                arcToRelative(15.7f, 15.7f, 0.0f, false, false, 1.8f, 18.1f)
                arcToRelative(15.9f, 15.9f, 0.0f, false, false, 17.6f, 4.8f)
                lineToRelative(78.5f, -28.1f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, false, 2.7f, -3.8f)
                verticalLineTo(120.3f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, true, 7.4f, -8.3f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.6f, 8.0f)
                verticalLineToRelative(72.5f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.6f, 3.8f)
                lineToRelative(78.6f, 28.1f)
                arcToRelative(17.0f, 17.0f, 0.0f, false, false, 5.4f, 0.9f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 13.9f, -23.8f)
                close()
            }
        }
        .build()
        return _paperPlane!!
    }

private var _paperPlane: ImageVector? = null
