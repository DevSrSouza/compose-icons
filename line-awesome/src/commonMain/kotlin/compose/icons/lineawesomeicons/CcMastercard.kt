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

public val LineAwesomeIcons.CcMastercard: ImageVector
    get() {
        if (_ccMastercard != null) {
            return _ccMastercard!!
        }
        _ccMastercard = Builder(name = "CcMastercard", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 6.0f)
                curveTo(3.355f, 6.0f, 2.0f, 7.355f, 2.0f, 9.0f)
                lineTo(2.0f, 23.0f)
                curveTo(2.0f, 24.645f, 3.355f, 26.0f, 5.0f, 26.0f)
                lineTo(27.0f, 26.0f)
                curveTo(28.645f, 26.0f, 30.0f, 24.645f, 30.0f, 23.0f)
                lineTo(30.0f, 9.0f)
                curveTo(30.0f, 7.355f, 28.645f, 6.0f, 27.0f, 6.0f)
                close()
                moveTo(5.0f, 8.0f)
                lineTo(27.0f, 8.0f)
                curveTo(27.566f, 8.0f, 28.0f, 8.434f, 28.0f, 9.0f)
                lineTo(28.0f, 23.0f)
                curveTo(28.0f, 23.566f, 27.566f, 24.0f, 27.0f, 24.0f)
                lineTo(5.0f, 24.0f)
                curveTo(4.434f, 24.0f, 4.0f, 23.566f, 4.0f, 23.0f)
                lineTo(4.0f, 9.0f)
                curveTo(4.0f, 8.434f, 4.434f, 8.0f, 5.0f, 8.0f)
                close()
                moveTo(12.0f, 9.0f)
                curveTo(8.145f, 9.0f, 5.0f, 12.145f, 5.0f, 16.0f)
                curveTo(5.0f, 19.855f, 8.145f, 23.0f, 12.0f, 23.0f)
                curveTo(13.484f, 23.0f, 14.863f, 22.547f, 16.0f, 21.75f)
                curveTo(17.133f, 22.543f, 18.512f, 23.0f, 20.0f, 23.0f)
                curveTo(23.855f, 23.0f, 27.0f, 19.855f, 27.0f, 16.0f)
                curveTo(27.0f, 12.145f, 23.855f, 9.0f, 20.0f, 9.0f)
                curveTo(18.512f, 9.0f, 17.133f, 9.457f, 16.0f, 10.25f)
                curveTo(14.863f, 9.453f, 13.484f, 9.0f, 12.0f, 9.0f)
                close()
                moveTo(12.0f, 11.0f)
                curveTo(13.281f, 11.0f, 14.43f, 11.496f, 15.313f, 12.281f)
                curveTo(14.902f, 12.793f, 14.566f, 13.371f, 14.344f, 14.0f)
                lineTo(16.563f, 14.0f)
                curveTo(16.703f, 14.32f, 16.836f, 14.652f, 16.906f, 15.0f)
                lineTo(14.094f, 15.0f)
                curveTo(14.039f, 15.324f, 14.0f, 15.656f, 14.0f, 16.0f)
                curveTo(14.0f, 16.344f, 14.039f, 16.676f, 14.094f, 17.0f)
                lineTo(16.906f, 17.0f)
                curveTo(16.836f, 17.348f, 16.703f, 17.68f, 16.563f, 18.0f)
                lineTo(14.344f, 18.0f)
                curveTo(14.566f, 18.629f, 14.902f, 19.207f, 15.313f, 19.719f)
                curveTo(14.43f, 20.504f, 13.281f, 21.0f, 12.0f, 21.0f)
                curveTo(9.227f, 21.0f, 7.0f, 18.773f, 7.0f, 16.0f)
                curveTo(7.0f, 13.227f, 9.227f, 11.0f, 12.0f, 11.0f)
                close()
                moveTo(20.0f, 11.0f)
                curveTo(22.773f, 11.0f, 25.0f, 13.227f, 25.0f, 16.0f)
                curveTo(25.0f, 18.773f, 22.773f, 21.0f, 20.0f, 21.0f)
                curveTo(19.086f, 21.0f, 18.238f, 20.742f, 17.5f, 20.313f)
                curveTo(18.441f, 19.121f, 19.0f, 17.629f, 19.0f, 16.0f)
                curveTo(19.0f, 14.371f, 18.441f, 12.879f, 17.5f, 11.688f)
                curveTo(18.238f, 11.258f, 19.086f, 11.0f, 20.0f, 11.0f)
                close()
            }
        }
        .build()
        return _ccMastercard!!
    }

private var _ccMastercard: ImageVector? = null
