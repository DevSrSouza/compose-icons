package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Zhihu: ImageVector
    get() {
        if (_zhihu != null) {
            return _zhihu!!
        }
        _zhihu = Builder(name = "Zhihu", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.721f, 0.0f)
                curveTo(2.251f, 0.0f, 0.0f, 2.25f, 0.0f, 5.719f)
                lineTo(0.0f, 18.28f)
                curveTo(0.0f, 21.751f, 2.252f, 24.0f, 5.721f, 24.0f)
                horizontalLineToRelative(12.56f)
                curveTo(21.751f, 24.0f, 24.0f, 21.75f, 24.0f, 18.281f)
                lineTo(24.0f, 5.72f)
                curveTo(24.0f, 2.249f, 21.75f, 0.0f, 18.281f, 0.0f)
                close()
                moveTo(7.685f, 4.078f)
                curveToRelative(-0.271f, 0.73f, -0.5f, 1.434f, -0.68f, 2.11f)
                horizontalLineToRelative(4.587f)
                curveToRelative(0.545f, -0.006f, 0.445f, 1.168f, 0.445f, 1.171f)
                lineTo(9.384f, 7.359f)
                arcToRelative(58.104f, 58.104f, 0.0f, false, true, -0.112f, 3.797f)
                horizontalLineToRelative(2.712f)
                curveToRelative(0.388f, 0.023f, 0.393f, 1.251f, 0.393f, 1.266f)
                lineTo(9.183f, 12.422f)
                arcToRelative(9.223f, 9.223f, 0.0f, false, true, -0.408f, 2.102f)
                lineToRelative(0.757f, -0.604f)
                curveToRelative(0.452f, 0.456f, 1.512f, 1.712f, 1.906f, 2.177f)
                curveToRelative(0.473f, 0.681f, 0.063f, 2.081f, 0.063f, 2.081f)
                lineToRelative(-2.794f, -3.382f)
                curveToRelative(-0.653f, 2.518f, -1.845f, 3.607f, -1.845f, 3.607f)
                curveToRelative(-0.523f, 0.468f, -1.58f, 0.82f, -2.64f, 0.516f)
                curveToRelative(2.218f, -1.73f, 3.44f, -3.917f, 3.667f, -6.497f)
                lineTo(4.491f, 12.422f)
                curveToRelative(0.0f, -0.015f, 0.197f, -1.243f, 0.806f, -1.266f)
                horizontalLineToRelative(2.71f)
                curveToRelative(0.024f, -0.32f, 0.086f, -3.254f, 0.086f, -3.797f)
                lineTo(6.598f, 7.359f)
                curveToRelative(-0.136f, 0.406f, -0.158f, 0.447f, -0.268f, 0.753f)
                curveToRelative(-0.594f, 1.095f, -1.603f, 1.122f, -1.907f, 1.155f)
                curveToRelative(0.906f, -1.821f, 1.416f, -3.6f, 1.591f, -4.064f)
                curveToRelative(0.425f, -1.124f, 1.671f, -1.125f, 1.671f, -1.125f)
                close()
                moveTo(13.078f, 6.0f)
                horizontalLineToRelative(6.377f)
                verticalLineToRelative(11.33f)
                horizontalLineToRelative(-2.573f)
                lineToRelative(-2.184f, 1.373f)
                lineToRelative(-0.401f, -1.373f)
                horizontalLineToRelative(-1.219f)
                close()
                moveTo(14.391f, 7.219f)
                verticalLineToRelative(8.86f)
                horizontalLineToRelative(0.623f)
                lineToRelative(0.263f, 0.937f)
                lineToRelative(1.455f, -0.938f)
                horizontalLineToRelative(1.456f)
                verticalLineToRelative(-8.86f)
                close()
            }
        }
        .build()
        return _zhihu!!
    }

private var _zhihu: ImageVector? = null
