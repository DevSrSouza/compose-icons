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

public val LineAwesomeIcons.ToggleOffSolid: ImageVector
    get() {
        if (_toggleOffSolid != null) {
            return _toggleOffSolid!!
        }
        _toggleOffSolid = Builder(name = "ToggleOffSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 7.0f)
                curveTo(8.379f, 7.0f, 7.773f, 7.066f, 7.188f, 7.188f)
                curveTo(6.895f, 7.246f, 6.594f, 7.32f, 6.313f, 7.406f)
                curveTo(3.793f, 8.203f, 1.742f, 10.086f, 0.719f, 12.5f)
                curveTo(0.605f, 12.77f, 0.492f, 13.031f, 0.406f, 13.313f)
                curveTo(0.137f, 14.164f, 0.0f, 15.059f, 0.0f, 16.0f)
                curveTo(0.0f, 16.93f, 0.145f, 17.813f, 0.406f, 18.656f)
                curveTo(0.41f, 18.664f, 0.402f, 18.68f, 0.406f, 18.688f)
                curveTo(1.203f, 21.207f, 3.086f, 23.258f, 5.5f, 24.281f)
                curveTo(5.77f, 24.395f, 6.031f, 24.508f, 6.313f, 24.594f)
                curveTo(7.164f, 24.863f, 8.059f, 25.0f, 9.0f, 25.0f)
                lineTo(23.0f, 25.0f)
                curveTo(27.957f, 25.0f, 32.0f, 20.957f, 32.0f, 16.0f)
                curveTo(32.0f, 11.043f, 27.957f, 7.0f, 23.0f, 7.0f)
                close()
                moveTo(9.0f, 9.0f)
                curveTo(12.879f, 9.0f, 16.0f, 12.121f, 16.0f, 16.0f)
                curveTo(16.0f, 19.879f, 12.879f, 23.0f, 9.0f, 23.0f)
                curveTo(5.121f, 23.0f, 2.0f, 19.879f, 2.0f, 16.0f)
                curveTo(2.0f, 15.758f, 2.008f, 15.516f, 2.031f, 15.281f)
                curveTo(2.387f, 11.742f, 5.363f, 9.0f, 9.0f, 9.0f)
                close()
                moveTo(14.625f, 9.0f)
                lineTo(23.0f, 9.0f)
                curveTo(26.879f, 9.0f, 30.0f, 12.121f, 30.0f, 16.0f)
                curveTo(30.0f, 19.879f, 26.879f, 23.0f, 23.0f, 23.0f)
                lineTo(14.625f, 23.0f)
                curveTo(16.676f, 21.348f, 18.0f, 18.828f, 18.0f, 16.0f)
                curveTo(18.0f, 13.172f, 16.676f, 10.652f, 14.625f, 9.0f)
                close()
            }
        }
        .build()
        return _toggleOffSolid!!
    }

private var _toggleOffSolid: ImageVector? = null
