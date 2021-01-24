package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.Bold: ImageVector
    get() {
        if (_bold != null) {
            return _bold!!
        }
        _bold = Builder(name = "Bold", defaultWidth = 384.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(333.49f, 238.0f)
                arcToRelative(122.0f, 122.0f, 0.0f, false, false, 27.0f, -65.21f)
                curveTo(367.87f, 96.49f, 308.0f, 32.0f, 233.42f, 32.0f)
                lineTo(34.0f, 32.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, 16.0f)
                verticalLineToRelative(48.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                horizontalLineToRelative(31.87f)
                verticalLineToRelative(288.0f)
                lineTo(34.0f, 400.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, 16.0f)
                verticalLineToRelative(48.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                horizontalLineToRelative(209.32f)
                curveToRelative(70.8f, 0.0f, 134.14f, -51.75f, 141.0f, -122.4f)
                curveToRelative(4.74f, -48.45f, -16.39f, -92.06f, -50.83f, -119.6f)
                close()
                moveTo(145.66f, 112.0f)
                horizontalLineToRelative(87.76f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, true, 0.0f, 96.0f)
                horizontalLineToRelative(-87.76f)
                close()
                moveTo(233.42f, 400.0f)
                horizontalLineToRelative(-87.76f)
                lineTo(145.66f, 288.0f)
                horizontalLineToRelative(87.76f)
                arcToRelative(56.0f, 56.0f, 0.0f, false, true, 0.0f, 112.0f)
                close()
            }
        }
        .build()
        return _bold!!
    }

private var _bold: ImageVector? = null
