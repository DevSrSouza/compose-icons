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

public val SimpleIcons.Htmlacademy: ImageVector
    get() {
        if (_htmlacademy != null) {
            return _htmlacademy!!
        }
        _htmlacademy = Builder(name = "Htmlacademy", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                lineTo(2.524f, 0.994f)
                verticalLineToRelative(17.368f)
                lineTo(12.0f, 24.0f)
                lineToRelative(9.476f, -5.638f)
                lineTo(21.476f, 0.994f)
                lineTo(12.099f, 0.01f)
                lineTo(12.0f, 0.0f)
                close()
                moveTo(20.236f, 17.657f)
                lineTo(12.0f, 22.557f)
                lineToRelative(-8.236f, -4.9f)
                verticalLineToRelative(-7.119f)
                lineToRelative(8.2f, 4.881f)
                lineToRelative(0.014f, 0.885f)
                lineToRelative(-5.626f, -3.349f)
                lineToRelative(-0.008f, 0.86f)
                lineToRelative(5.648f, 3.394f)
                lineToRelative(0.015f, 0.908f)
                lineToRelative(-5.647f, -3.36f)
                lineToRelative(-0.008f, 0.86f)
                lineTo(12.0f, 19.01f)
                lineToRelative(5.703f, -3.412f)
                verticalLineToRelative(-0.862f)
                lineToRelative(-0.008f, 0.004f)
                verticalLineToRelative(-2.805f)
                lineToRelative(2.54f, -1.517f)
                verticalLineToRelative(7.238f)
                close()
                moveTo(20.23f, 9.495f)
                lineToRelative(-2.254f, 1.328f)
                lineToRelative(-1.04f, 0.613f)
                lineToRelative(-4.96f, -2.951f)
                lineToRelative(-0.009f, 0.858f)
                lineToRelative(4.24f, 2.521f)
                lineToRelative(-0.037f, 0.023f)
                lineToRelative(-0.092f, 0.054f)
                lineToRelative(-0.602f, 0.355f)
                lineToRelative(-3.5f, -2.083f)
                lineToRelative(-0.009f, 0.859f)
                lineToRelative(2.763f, 1.643f)
                lineToRelative(-0.652f, 0.436f)
                lineToRelative(-0.015f, 0.01f)
                lineToRelative(-2.088f, -1.23f)
                lineToRelative(-0.008f, 0.858f)
                lineToRelative(1.37f, 0.807f)
                lineToRelative(-1.395f, 0.837f)
                lineToRelative(-8.16f, -4.85f)
                lineToRelative(8.172f, -4.912f)
                verticalLineToRelative(0.001f)
                lineToRelative(8.276f, 4.823f)
                close()
                moveTo(20.236f, 8.631f)
                lineToRelative(-8.28f, -4.882f)
                horizontalLineToRelative(-0.002f)
                lineToRelative(-8.19f, 4.877f)
                lineTo(3.764f, 2.11f)
                lineTo(12.0f, 1.246f)
                lineToRelative(8.237f, 0.864f)
                verticalLineToRelative(6.52f)
                close()
            }
        }
        .build()
        return _htmlacademy!!
    }

private var _htmlacademy: ImageVector? = null
