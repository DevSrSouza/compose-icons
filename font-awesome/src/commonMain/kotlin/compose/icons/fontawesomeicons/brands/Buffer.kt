package compose.icons.fontawesomeicons.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.BrandsGroup

public val BrandsGroup.Buffer: ImageVector
    get() {
        if (_buffer != null) {
            return _buffer!!
        }
        _buffer = Builder(name = "Buffer", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(427.84f, 380.67f)
                lineToRelative(-196.5f, 97.82f)
                arcToRelative(18.6f, 18.6f, 0.0f, false, true, -14.67f, 0.0f)
                lineTo(20.16f, 380.67f)
                curveToRelative(-4.0f, -2.0f, -4.0f, -5.28f, 0.0f, -7.29f)
                lineTo(67.22f, 350.0f)
                arcToRelative(18.65f, 18.65f, 0.0f, false, true, 14.69f, 0.0f)
                lineToRelative(134.76f, 67.0f)
                arcToRelative(18.51f, 18.51f, 0.0f, false, false, 14.67f, 0.0f)
                lineToRelative(134.76f, -67.0f)
                arcToRelative(18.62f, 18.62f, 0.0f, false, true, 14.68f, 0.0f)
                lineToRelative(47.06f, 23.43f)
                curveToRelative(4.05f, 1.96f, 4.05f, 5.24f, 0.0f, 7.24f)
                close()
                moveTo(427.84f, 244.14f)
                lineToRelative(-47.06f, -23.43f)
                arcToRelative(18.62f, 18.62f, 0.0f, false, false, -14.68f, 0.0f)
                lineToRelative(-134.76f, 67.08f)
                arcToRelative(18.68f, 18.68f, 0.0f, false, true, -14.67f, 0.0f)
                lineTo(81.91f, 220.71f)
                arcToRelative(18.65f, 18.65f, 0.0f, false, false, -14.69f, 0.0f)
                lineToRelative(-47.06f, 23.43f)
                curveToRelative(-4.0f, 2.0f, -4.0f, 5.29f, 0.0f, 7.31f)
                lineToRelative(196.51f, 97.8f)
                arcToRelative(18.6f, 18.6f, 0.0f, false, false, 14.67f, 0.0f)
                lineToRelative(196.5f, -97.8f)
                curveToRelative(4.05f, -2.02f, 4.05f, -5.3f, 0.0f, -7.31f)
                close()
                moveTo(20.16f, 130.42f)
                lineToRelative(196.5f, 90.29f)
                arcToRelative(20.08f, 20.08f, 0.0f, false, false, 14.67f, 0.0f)
                lineToRelative(196.51f, -90.29f)
                curveToRelative(4.0f, -1.86f, 4.0f, -4.89f, 0.0f, -6.74f)
                lineTo(231.33f, 33.4f)
                arcToRelative(19.88f, 19.88f, 0.0f, false, false, -14.67f, 0.0f)
                lineToRelative(-196.5f, 90.28f)
                curveToRelative(-4.05f, 1.85f, -4.05f, 4.88f, 0.0f, 6.74f)
                close()
            }
        }
        .build()
        return _buffer!!
    }

private var _buffer: ImageVector? = null
