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

public val LineAwesomeIcons.TreeSolid: ImageVector
    get() {
        if (_treeSolid != null) {
            return _treeSolid!!
        }
        _treeSolid = Builder(name = "TreeSolid", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 3.594f)
                lineTo(15.281f, 4.281f)
                lineTo(9.344f, 10.25f)
                lineTo(8.344f, 11.219f)
                lineTo(9.625f, 11.844f)
                curveTo(9.625f, 11.844f, 10.641f, 12.211f, 12.063f, 12.531f)
                lineTo(7.656f, 16.938f)
                lineTo(6.656f, 17.906f)
                lineTo(7.906f, 18.531f)
                curveTo(7.906f, 18.531f, 8.984f, 18.836f, 9.531f, 19.031f)
                lineTo(5.938f, 22.625f)
                lineTo(4.969f, 23.625f)
                lineTo(6.219f, 24.25f)
                curveTo(6.219f, 24.25f, 8.656f, 25.426f, 13.0f, 25.844f)
                lineTo(13.0f, 29.0f)
                lineTo(15.0f, 29.0f)
                lineTo(15.0f, 25.969f)
                curveTo(15.336f, 25.98f, 15.648f, 26.0f, 16.0f, 26.0f)
                curveTo(16.352f, 26.0f, 16.664f, 25.98f, 17.0f, 25.969f)
                lineTo(17.0f, 29.0f)
                lineTo(19.0f, 29.0f)
                lineTo(19.0f, 25.844f)
                curveTo(23.352f, 25.426f, 25.813f, 24.25f, 25.813f, 24.25f)
                lineTo(27.031f, 23.625f)
                lineTo(26.063f, 22.625f)
                lineTo(22.469f, 19.031f)
                curveTo(23.016f, 18.836f, 24.094f, 18.531f, 24.094f, 18.531f)
                lineTo(25.344f, 17.906f)
                lineTo(24.344f, 16.938f)
                lineTo(19.938f, 12.531f)
                curveTo(21.359f, 12.211f, 22.375f, 11.844f, 22.375f, 11.844f)
                lineTo(23.656f, 11.219f)
                lineTo(22.656f, 10.25f)
                lineTo(16.719f, 4.281f)
                close()
                moveTo(16.0f, 6.438f)
                lineTo(20.0f, 10.406f)
                curveTo(19.406f, 10.605f, 19.285f, 10.762f, 17.813f, 10.906f)
                lineTo(16.0f, 11.094f)
                lineTo(14.188f, 10.906f)
                curveTo(12.715f, 10.762f, 12.594f, 10.605f, 12.0f, 10.406f)
                close()
                moveTo(16.0f, 11.438f)
                lineTo(17.188f, 12.594f)
                lineTo(21.781f, 17.188f)
                curveTo(21.316f, 17.352f, 21.328f, 17.406f, 20.375f, 17.594f)
                lineTo(18.531f, 17.969f)
                lineTo(19.875f, 19.281f)
                lineTo(23.531f, 22.938f)
                curveTo(22.258f, 23.395f, 20.078f, 24.0f, 16.0f, 24.0f)
                curveTo(11.961f, 24.0f, 9.789f, 23.395f, 8.5f, 22.938f)
                lineTo(12.125f, 19.281f)
                lineTo(13.469f, 17.969f)
                lineTo(11.625f, 17.594f)
                curveTo(10.672f, 17.406f, 10.684f, 17.352f, 10.219f, 17.188f)
                lineTo(14.813f, 12.594f)
                close()
            }
        }
        .build()
        return _treeSolid!!
    }

private var _treeSolid: ImageVector? = null
