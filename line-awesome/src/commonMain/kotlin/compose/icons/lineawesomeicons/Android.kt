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

public val LineAwesomeIcons.Android: ImageVector
    get() {
        if (_android != null) {
            return _android!!
        }
        _android = Builder(name = "Android", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.531f, 3.5f)
                curveTo(10.363f, 3.543f, 10.23f, 3.672f, 10.18f, 3.836f)
                curveTo(10.129f, 4.004f, 10.168f, 4.184f, 10.281f, 4.313f)
                lineTo(11.75f, 6.438f)
                curveTo(10.082f, 7.719f, 9.0f, 9.742f, 9.0f, 12.0f)
                lineTo(9.0f, 22.0f)
                curveTo(9.0f, 22.703f, 9.441f, 23.203f, 10.0f, 23.563f)
                lineTo(10.0f, 26.5f)
                curveTo(10.0f, 27.867f, 11.133f, 29.0f, 12.5f, 29.0f)
                curveTo(13.867f, 29.0f, 15.0f, 27.867f, 15.0f, 26.5f)
                lineTo(15.0f, 24.0f)
                lineTo(17.0f, 24.0f)
                lineTo(17.0f, 26.5f)
                curveTo(17.0f, 27.867f, 18.133f, 29.0f, 19.5f, 29.0f)
                curveTo(20.867f, 29.0f, 22.0f, 27.867f, 22.0f, 26.5f)
                lineTo(22.0f, 23.563f)
                curveTo(22.559f, 23.203f, 23.0f, 22.703f, 23.0f, 22.0f)
                lineTo(23.0f, 12.0f)
                curveTo(23.0f, 9.742f, 21.918f, 7.719f, 20.25f, 6.438f)
                lineTo(21.719f, 4.313f)
                curveTo(21.84f, 4.16f, 21.863f, 3.949f, 21.777f, 3.777f)
                curveTo(21.688f, 3.602f, 21.508f, 3.492f, 21.313f, 3.5f)
                curveTo(21.281f, 3.496f, 21.25f, 3.496f, 21.219f, 3.5f)
                curveTo(21.086f, 3.535f, 20.973f, 3.625f, 20.906f, 3.75f)
                lineTo(19.406f, 5.875f)
                curveTo(18.398f, 5.313f, 17.23f, 5.0f, 16.0f, 5.0f)
                curveTo(14.77f, 5.0f, 13.602f, 5.313f, 12.594f, 5.875f)
                lineTo(11.094f, 3.75f)
                curveTo(11.008f, 3.602f, 10.855f, 3.508f, 10.688f, 3.5f)
                curveTo(10.656f, 3.496f, 10.625f, 3.496f, 10.594f, 3.5f)
                curveTo(10.574f, 3.5f, 10.551f, 3.5f, 10.531f, 3.5f)
                close()
                moveTo(16.0f, 7.0f)
                curveTo(18.426f, 7.0f, 20.441f, 8.715f, 20.906f, 11.0f)
                lineTo(11.094f, 11.0f)
                curveTo(11.559f, 8.715f, 13.574f, 7.0f, 16.0f, 7.0f)
                close()
                moveTo(14.0f, 8.0f)
                curveTo(13.449f, 8.0f, 13.0f, 8.449f, 13.0f, 9.0f)
                curveTo(13.0f, 9.551f, 13.449f, 10.0f, 14.0f, 10.0f)
                curveTo(14.551f, 10.0f, 15.0f, 9.551f, 15.0f, 9.0f)
                curveTo(15.0f, 8.449f, 14.551f, 8.0f, 14.0f, 8.0f)
                close()
                moveTo(18.0f, 8.0f)
                curveTo(17.449f, 8.0f, 17.0f, 8.449f, 17.0f, 9.0f)
                curveTo(17.0f, 9.551f, 17.449f, 10.0f, 18.0f, 10.0f)
                curveTo(18.551f, 10.0f, 19.0f, 9.551f, 19.0f, 9.0f)
                curveTo(19.0f, 8.449f, 18.551f, 8.0f, 18.0f, 8.0f)
                close()
                moveTo(6.0f, 11.0f)
                lineTo(6.0f, 21.0f)
                lineTo(8.0f, 21.0f)
                lineTo(8.0f, 11.0f)
                close()
                moveTo(24.0f, 11.0f)
                lineTo(24.0f, 21.0f)
                lineTo(26.0f, 21.0f)
                lineTo(26.0f, 11.0f)
                close()
                moveTo(11.0f, 13.0f)
                lineTo(21.0f, 13.0f)
                lineTo(21.0f, 22.0f)
                lineTo(20.0f, 22.0f)
                lineTo(20.0f, 26.5f)
                curveTo(20.0f, 26.785f, 19.785f, 27.0f, 19.5f, 27.0f)
                curveTo(19.215f, 27.0f, 19.0f, 26.785f, 19.0f, 26.5f)
                lineTo(19.0f, 22.0f)
                lineTo(13.0f, 22.0f)
                lineTo(13.0f, 26.5f)
                curveTo(13.0f, 26.785f, 12.785f, 27.0f, 12.5f, 27.0f)
                curveTo(12.215f, 27.0f, 12.0f, 26.785f, 12.0f, 26.5f)
                lineTo(12.0f, 22.0f)
                lineTo(11.0f, 22.0f)
                close()
            }
        }
        .build()
        return _android!!
    }

private var _android: ImageVector? = null
