package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.AncientGateLine: ImageVector
    get() {
        if (_ancientGateLine != null) {
            return _ancientGateLine!!
        }
        _ancientGateLine = Builder(name = "AncientGateLine", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.901f, 10.0f)
                arcToRelative(2.999f, 2.999f, 0.0f, false, false, 4.075f, 1.113f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, -1.975f, 3.55f)
                lineTo(21.0f, 21.0f)
                horizontalLineToRelative(-7.0f)
                verticalLineToRelative(-2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -1.85f, -1.995f)
                lineTo(12.0f, 17.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -1.995f, 1.85f)
                lineTo(10.0f, 19.0f)
                verticalLineToRelative(2.0f)
                lineTo(3.0f, 21.0f)
                verticalLineToRelative(-6.336f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, -1.979f, -3.553f)
                arcTo(2.999f, 2.999f, 0.0f, false, false, 5.098f, 10.0f)
                horizontalLineToRelative(13.803f)
                close()
                moveTo(17.93f, 12.0f)
                lineTo(6.069f, 12.0f)
                lineToRelative(-0.076f, 0.079f)
                curveToRelative(-0.431f, 0.42f, -0.935f, 0.76f, -1.486f, 1.002f)
                lineToRelative(-0.096f, 0.039f)
                lineToRelative(0.589f, 0.28f)
                lineToRelative(-0.001f, 5.6f)
                lineToRelative(3.002f, -0.001f)
                verticalLineToRelative(-0.072f)
                lineToRelative(0.01f, -0.223f)
                curveToRelative(0.149f, -2.016f, 1.78f, -3.599f, 3.854f, -3.698f)
                lineToRelative(0.208f, -0.005f)
                lineToRelative(0.223f, 0.01f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 3.699f, 3.787f)
                lineToRelative(0.004f, 0.201f)
                lineTo(19.0f, 19.0f)
                lineToRelative(0.001f, -5.6f)
                lineToRelative(0.587f, -0.28f)
                lineToRelative(-0.095f, -0.04f)
                arcToRelative(5.002f, 5.002f, 0.0f, false, true, -1.486f, -1.001f)
                lineTo(17.93f, 12.0f)
                close()
                moveTo(17.036f, 3.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 4.446f, 2.86f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, -3.29f, 3.135f)
                lineTo(18.0f, 9.0f)
                lineTo(6.0f, 9.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, true, -3.482f, -3.14f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 6.964f, 3.0f)
                horizontalLineToRelative(10.072f)
                close()
                moveTo(15.6f, 5.0f)
                lineTo(8.399f, 5.0f)
                arcToRelative(5.507f, 5.507f, 0.0f, false, true, -1.49f, 1.816f)
                lineTo(6.661f, 7.0f)
                horizontalLineToRelative(10.677f)
                lineToRelative(-0.012f, -0.008f)
                arcToRelative(5.518f, 5.518f, 0.0f, false, true, -1.579f, -1.722f)
                lineTo(15.6f, 5.0f)
                close()
            }
        }
        .build()
        return _ancientGateLine!!
    }

private var _ancientGateLine: ImageVector? = null
