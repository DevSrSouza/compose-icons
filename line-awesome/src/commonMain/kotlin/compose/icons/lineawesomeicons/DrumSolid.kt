package compose.icons.lineawesomeicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.LineAwesomeIcons

public val LineAwesomeIcons.DrumSolid: ImageVector
    get() {
        if (_drumSolid != null) {
            return _drumSolid!!
        }
        _drumSolid = Builder(name = "DrumSolid", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(27.188f, 5.094f)
                lineTo(16.125f, 10.344f)
                curveTo(15.805f, 10.129f, 15.414f, 10.0f, 15.0f, 10.0f)
                curveTo(13.895f, 10.0f, 13.0f, 10.895f, 13.0f, 12.0f)
                curveTo(13.0f, 13.105f, 13.895f, 14.0f, 15.0f, 14.0f)
                curveTo(16.051f, 14.0f, 16.922f, 13.188f, 17.0f, 12.156f)
                lineTo(23.063f, 9.281f)
                curveTo(24.879f, 10.047f, 26.0f, 11.047f, 26.0f, 12.0f)
                curveTo(26.0f, 13.887f, 21.723f, 16.0f, 16.0f, 16.0f)
                curveTo(10.277f, 16.0f, 6.0f, 13.887f, 6.0f, 12.0f)
                curveTo(6.0f, 10.113f, 10.277f, 8.0f, 16.0f, 8.0f)
                curveTo(16.172f, 8.0f, 16.328f, 7.996f, 16.5f, 8.0f)
                lineTo(20.031f, 6.344f)
                curveTo(18.777f, 6.133f, 17.434f, 6.0f, 16.0f, 6.0f)
                curveTo(9.16f, 6.0f, 4.0f, 8.578f, 4.0f, 12.0f)
                lineTo(4.0f, 22.0f)
                curveTo(4.0f, 22.988f, 4.445f, 23.895f, 5.125f, 24.625f)
                curveTo(5.805f, 25.355f, 6.73f, 25.945f, 7.813f, 26.438f)
                curveTo(9.977f, 27.422f, 12.84f, 28.0f, 16.0f, 28.0f)
                curveTo(19.16f, 28.0f, 22.023f, 27.422f, 24.188f, 26.438f)
                curveTo(25.27f, 25.945f, 26.195f, 25.355f, 26.875f, 24.625f)
                curveTo(27.555f, 23.895f, 28.0f, 22.988f, 28.0f, 22.0f)
                lineTo(28.0f, 12.0f)
                curveTo(28.0f, 10.523f, 27.023f, 9.211f, 25.375f, 8.188f)
                lineTo(28.031f, 6.906f)
                close()
                moveTo(6.0f, 15.406f)
                curveTo(7.016f, 16.172f, 8.379f, 16.801f, 10.0f, 17.25f)
                lineTo(10.0f, 25.156f)
                curveTo(9.5f, 25.0f, 9.043f, 24.816f, 8.625f, 24.625f)
                curveTo(7.719f, 24.211f, 7.027f, 23.715f, 6.594f, 23.25f)
                curveTo(6.16f, 22.785f, 6.0f, 22.395f, 6.0f, 22.0f)
                close()
                moveTo(26.0f, 15.406f)
                lineTo(26.0f, 22.0f)
                curveTo(26.0f, 22.395f, 25.84f, 22.785f, 25.406f, 23.25f)
                curveTo(24.973f, 23.715f, 24.281f, 24.211f, 23.375f, 24.625f)
                curveTo(22.957f, 24.816f, 22.5f, 25.0f, 22.0f, 25.156f)
                lineTo(22.0f, 17.25f)
                curveTo(23.621f, 16.801f, 24.984f, 16.172f, 26.0f, 15.406f)
                close()
                moveTo(12.0f, 17.688f)
                curveTo(13.242f, 17.895f, 14.582f, 18.0f, 16.0f, 18.0f)
                curveTo(17.418f, 18.0f, 18.758f, 17.895f, 20.0f, 17.688f)
                lineTo(20.0f, 25.625f)
                curveTo(18.77f, 25.855f, 17.422f, 26.0f, 16.0f, 26.0f)
                curveTo(14.578f, 26.0f, 13.23f, 25.855f, 12.0f, 25.625f)
                close()
            }
        }
        .build()
        return _drumSolid!!
    }

private var _drumSolid: ImageVector? = null
