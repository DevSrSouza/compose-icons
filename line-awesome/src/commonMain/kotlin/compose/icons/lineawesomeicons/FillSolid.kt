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

public val LineAwesomeIcons.FillSolid: ImageVector
    get() {
        if (_fillSolid != null) {
            return _fillSolid!!
        }
        _fillSolid = Builder(name = "FillSolid", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.313f, 3.281f)
                lineTo(9.906f, 4.719f)
                lineTo(11.688f, 6.5f)
                lineTo(4.781f, 13.406f)
                curveTo(3.598f, 14.59f, 3.598f, 16.535f, 4.781f, 17.719f)
                lineTo(4.844f, 17.781f)
                lineTo(11.188f, 24.094f)
                curveTo(12.371f, 25.277f, 14.316f, 25.277f, 15.5f, 24.094f)
                lineTo(23.094f, 16.5f)
                lineTo(23.813f, 15.813f)
                lineTo(14.094f, 6.094f)
                lineTo(13.313f, 5.281f)
                lineTo(13.094f, 5.094f)
                close()
                moveTo(13.125f, 7.938f)
                lineTo(21.0f, 15.813f)
                lineTo(14.094f, 22.688f)
                curveTo(13.676f, 23.105f, 13.012f, 23.105f, 12.594f, 22.688f)
                lineTo(6.219f, 16.281f)
                curveTo(5.801f, 15.863f, 5.801f, 15.23f, 6.219f, 14.813f)
                close()
                moveTo(25.0f, 19.25f)
                lineTo(24.188f, 20.438f)
                curveTo(24.188f, 20.438f, 23.648f, 21.191f, 23.125f, 22.094f)
                curveTo(22.863f, 22.547f, 22.617f, 23.02f, 22.406f, 23.5f)
                curveTo(22.195f, 23.98f, 22.0f, 24.422f, 22.0f, 25.0f)
                curveTo(22.0f, 26.645f, 23.355f, 28.0f, 25.0f, 28.0f)
                curveTo(26.645f, 28.0f, 28.0f, 26.645f, 28.0f, 25.0f)
                curveTo(28.0f, 24.422f, 27.805f, 23.98f, 27.594f, 23.5f)
                curveTo(27.383f, 23.02f, 27.137f, 22.547f, 26.875f, 22.094f)
                curveTo(26.352f, 21.191f, 25.813f, 20.438f, 25.813f, 20.438f)
                close()
                moveTo(25.0f, 22.875f)
                curveTo(25.066f, 22.984f, 25.059f, 22.977f, 25.125f, 23.094f)
                curveTo(25.363f, 23.504f, 25.617f, 23.941f, 25.781f, 24.313f)
                curveTo(25.945f, 24.684f, 26.0f, 25.027f, 26.0f, 25.0f)
                curveTo(26.0f, 25.555f, 25.555f, 26.0f, 25.0f, 26.0f)
                curveTo(24.445f, 26.0f, 24.0f, 25.555f, 24.0f, 25.0f)
                curveTo(24.0f, 25.027f, 24.055f, 24.684f, 24.219f, 24.313f)
                curveTo(24.383f, 23.941f, 24.637f, 23.504f, 24.875f, 23.094f)
                curveTo(24.941f, 22.977f, 24.934f, 22.984f, 25.0f, 22.875f)
                close()
            }
        }
        .build()
        return _fillSolid!!
    }

private var _fillSolid: ImageVector? = null
