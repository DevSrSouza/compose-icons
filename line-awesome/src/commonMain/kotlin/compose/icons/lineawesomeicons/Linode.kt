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

public val LineAwesomeIcons.Linode: ImageVector
    get() {
        if (_linode != null) {
            return _linode!!
        }
        _linode = Builder(name = "Linode", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.5f, 3.0f)
                lineTo(5.531f, 4.906f)
                lineTo(9.875f, 7.563f)
                lineTo(16.25f, 5.156f)
                lineTo(11.875f, 3.063f)
                curveTo(11.77f, 3.008f, 11.605f, 3.0f, 11.5f, 3.0f)
                close()
                moveTo(5.0f, 5.844f)
                lineTo(6.313f, 12.188f)
                curveTo(6.313f, 12.293f, 6.426f, 12.395f, 6.531f, 12.5f)
                lineTo(10.344f, 15.5f)
                lineTo(9.313f, 8.469f)
                close()
                moveTo(16.719f, 6.094f)
                lineTo(10.406f, 8.469f)
                lineTo(11.469f, 15.438f)
                lineTo(16.719f, 12.719f)
                curveTo(16.875f, 12.664f, 16.969f, 12.461f, 16.969f, 12.25f)
                close()
                moveTo(22.969f, 12.219f)
                curveTo(22.875f, 12.219f, 22.766f, 12.262f, 22.688f, 12.313f)
                lineTo(19.719f, 14.188f)
                lineTo(23.188f, 16.344f)
                lineTo(26.375f, 14.031f)
                lineTo(23.219f, 12.313f)
                curveTo(23.141f, 12.262f, 23.063f, 12.219f, 22.969f, 12.219f)
                close()
                moveTo(6.719f, 13.969f)
                lineTo(7.844f, 19.531f)
                curveTo(7.844f, 19.637f, 7.895f, 19.758f, 8.0f, 19.813f)
                lineTo(11.469f, 23.063f)
                lineTo(10.625f, 17.063f)
                close()
                moveTo(17.031f, 13.969f)
                lineTo(11.781f, 16.969f)
                lineTo(12.5f, 23.063f)
                lineTo(17.031f, 20.031f)
                curveTo(17.188f, 19.926f, 17.305f, 19.742f, 17.25f, 19.531f)
                close()
                moveTo(27.0f, 14.875f)
                lineTo(26.906f, 14.969f)
                curveTo(26.852f, 15.023f, 26.863f, 15.094f, 26.813f, 15.094f)
                lineTo(23.594f, 17.281f)
                lineTo(23.438f, 20.656f)
                lineTo(23.438f, 20.844f)
                lineTo(26.313f, 18.594f)
                curveTo(26.418f, 18.488f, 26.48f, 18.387f, 26.531f, 18.281f)
                close()
                moveTo(18.594f, 14.938f)
                curveTo(18.496f, 14.938f, 18.387f, 14.98f, 18.281f, 15.031f)
                lineTo(18.188f, 15.094f)
                lineTo(18.344f, 19.531f)
                curveTo(18.344f, 19.637f, 18.336f, 19.801f, 18.281f, 19.906f)
                lineTo(22.063f, 17.125f)
                lineTo(18.875f, 15.031f)
                curveTo(18.797f, 14.98f, 18.691f, 14.938f, 18.594f, 14.938f)
                close()
                moveTo(22.656f, 17.969f)
                lineTo(18.438f, 20.906f)
                lineTo(18.563f, 24.531f)
                lineTo(18.563f, 24.813f)
                lineTo(22.219f, 21.906f)
                curveTo(22.324f, 21.801f, 22.438f, 21.688f, 22.438f, 21.531f)
                close()
                moveTo(8.313f, 21.219f)
                lineTo(9.094f, 25.438f)
                curveTo(9.094f, 25.543f, 9.145f, 25.582f, 9.25f, 25.688f)
                lineTo(12.406f, 29.0f)
                lineTo(12.313f, 28.781f)
                lineTo(11.625f, 24.438f)
                close()
                moveTo(17.438f, 21.281f)
                lineTo(12.719f, 24.313f)
                lineTo(13.344f, 28.688f)
                lineTo(13.406f, 29.0f)
                lineTo(17.344f, 25.844f)
                curveTo(17.5f, 25.738f, 17.563f, 25.594f, 17.563f, 25.438f)
                close()
            }
        }
        .build()
        return _linode!!
    }

private var _linode: ImageVector? = null
